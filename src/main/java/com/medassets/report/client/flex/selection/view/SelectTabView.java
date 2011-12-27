package com.medassets.report.client.flex.selection.view;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

import com.google.gwt.cell.client.AbstractSafeHtmlCell;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.text.shared.SafeHtmlRenderer;
import com.google.gwt.text.shared.SimpleSafeHtmlRenderer;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiConstructor;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.CellTable.Resources;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.ColumnSortEvent.ListHandler;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.CellPreviewEvent;
import com.google.gwt.view.client.DefaultSelectionEventManager;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.MultiSelectionModel;
import com.google.gwt.view.client.SelectionChangeEvent;
import com.google.gwt.view.client.SingleSelectionModel;
import com.medassets.report.client.flex.selection.presenter.SelectTabPresenter;
import com.medassets.report.client.flex.selection.widgets.AvailableParameterListBox;
import com.medassets.report.shared.FlexSelectSelectionAllDTO;
import com.medassets.report.shared.FlexSelectSelectionExceptionDTO;
import com.medassets.report.shared.FlexSelectSelectionMatchDTO;
import com.medassets.report.shared.FlexSelectionParamItemDTO;
import com.medassets.report.shared.ParamAvailableItemValue;

public class SelectTabView implements SelectTabPresenter.MyView {

	private final Widget widget;
	
	CellTableResource resource = GWT.create(CellTableResource.class);

	public interface Binder extends UiBinder<Widget, SelectTabView> {
	}

	private static final Binder binder = GWT.create(Binder.class);

	@UiField
	AvailableParameterListBox leftSideParametersListBox;

	@UiField
	AbsolutePanel leftSideParameterCodesListPanel;

	@UiField(provided = true)
	CellTable<ParamAvailableItemValue> leftSideParameterCodesTable = new CellTable<ParamAvailableItemValue>(10, resource);

	@UiField
	Button returnBtn;

	@UiField
	Button rightMoveBtn;

	@UiField
	Button leftMoveBtn;

	@UiField
	Button andOrBtn;

	@UiField
	Button matchBtn;

	@UiField(provided = true)
	CellTable<String> rightSideInclusionsListTable = new CellTable<String>(10, (Resources) GWT.create(RightCellTableResource.class));

	@UiField
	Label parameterLbl;

	@UiField
	Button searchBtn;

	private TextColumn<ParamAvailableItemValue> codeColumn;

	// Create a data provider.
	private ListDataProvider<ParamAvailableItemValue> leftSideParamCodesTableDataProvider;

	// TODO - Keyboard selection must be fixed for codes list as it is not working after migrated to MultiSelectionModel
	private MultiSelectionModel<ParamAvailableItemValue> leftSideParamCodesRowSelectionModel;

	private Map<String, String> rightSideInclusionsStringMap = new HashMap<String, String>();

	private Map<String, String> rightSideInclusionCodeNameMap = new HashMap<String, String>();

	private SingleSelectionModel<String> rightSideInclusionsRowSelectionModel;

	private ListDataProvider<String> rightSideInclusionsTableDataProvider;
	
	private SortedMap<String, FlexSelectionParamItemDTO> availableParamListMap;

	private Map<String, FlexSelectionParamItemDTO> selectedParamItemDTOMap;
	
	private String selectedParameterKeyName;
	
	private Map<String, List<ParamAvailableItemValue>> paramCodesMap;
	
	private String OPTION_TYPE = "AND";

	protected AndOrDialog andOrDialog;
	
	protected MatchDialogView matchDialog;
	
	private int index;
	
	private boolean multiForUP, multiForDown;

	private FlexSelectionParamItemDTO selectedFieldDTO;

	@UiConstructor
	public SelectTabView() {
		super();
		widget = binder.createAndBindUi(this);
	}

	public Widget asWidget() {
		buildWidget();
		return widget;
	}

	public void buildWidget() {
		buildLeftSideListCodesTable();

		buildRightPanelSelectedCellTable();
		
		buildDialog();

		buildEvents();

		disableButton();
	}

	public void enableMatchButton() {
		matchBtn.setEnabled(true);
	}
	
	private void buildDialog() {
		andOrDialog = new AndOrDialog();
	}

	private void buildRightPanelSelectedCellTable() {
		TextColumn<String> selectedStringColumn = new TextColumn<String>() {
			@Override
			public String getValue(String item) {
				return item;
			}
		};
		rightSideInclusionsListTable.setStyleName("RightCellTable");

		rightSideInclusionsListTable.addColumn(selectedStringColumn);

		// Connect the table to the data provider.
		rightSideInclusionsTableDataProvider.addDataDisplay(rightSideInclusionsListTable);

		// Add a selection model to handle user selection.
		rightSideInclusionsRowSelectionModel = new SingleSelectionModel<String>();
		rightSideInclusionsListTable.setSelectionModel(rightSideInclusionsRowSelectionModel);
	}

	private void disableButton() {
		rightMoveBtn.setEnabled(false);
		leftMoveBtn.setEnabled(false);
		andOrBtn.setEnabled(false);
		matchBtn.setEnabled(false);
		returnBtn.setEnabled(false);
		searchBtn.setEnabled(false);
	}

	private void buildEvents() {
		returnBtn.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				leftSideParametersListBox.setVisible(true);
				leftSideParameterCodesListPanel.setVisible(false);
				leftSideParamCodesTableDataProvider.getList().clear();
				
				returnBtn.setEnabled(false);
				andOrBtn.setEnabled(false);
				matchBtn.setEnabled(false);
				andOrDialog.setData("");
				
				selectedParameterKeyName = null;
				leftMoveBtn.setEnabled(false);
				rightMoveBtn.setEnabled(false);
			}
		});
		
		leftSideParameterCodesTable.addCellPreviewHandler(new CellPreviewEvent.Handler<ParamAvailableItemValue>() {
			@Override
			public void onCellPreview(CellPreviewEvent<ParamAvailableItemValue> event) {
				if (event.getNativeEvent().getType().equals("click") || event.getNativeEvent().getType().equals("keyup")) {
					index = event.getIndex();
				}
			}
		});

		leftSideParamCodesRowSelectionModel.addSelectionChangeHandler(new SelectionChangeEvent.Handler() {
			public void onSelectionChange(SelectionChangeEvent event) {
				Set<ParamAvailableItemValue> selectedCodeObjSet = leftSideParamCodesRowSelectionModel.getSelectedSet();
				andOrBtn.setEnabled(true);
				for (ParamAvailableItemValue selectedCodeObj : selectedCodeObjSet) {
					if (selectedCodeObj.getCode() != null && !selectedCodeObj.getCode().contains("Loading")) {
						rightMoveBtn.setEnabled(true);
						break;
					}
				}
			}
		});

		rightMoveBtn.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				moveToRightSideInclusion();
			}
		});
		 
		leftSideParameterCodesTable.addHandler(new KeyDownHandler() {
          @Override
	      public void onKeyDown(KeyDownEvent event) {
	            int key = event.getNativeEvent().getKeyCode();
	            switch (key) {
		            case 37:
		            case 38:
		            case 39:
		            case 40:
		            	leftSideParamCodesRowSelectionModel.setSelected(leftSideParameterCodesTable.getVisibleItem(index), false);
		            }
              }
        }, KeyDownEvent.getType());

		leftSideParameterCodesTable.addHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				rightMoveBtn.setEnabled(true);
			}
		}, ClickEvent.getType());
		
		rightSideInclusionsListTable.addHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				leftMoveBtn.setEnabled(true);
				andOrBtn.setEnabled(true);
				matchBtn.setEnabled(true);
			}
		}, ClickEvent.getType());
		

		rightSideInclusionsRowSelectionModel.addSelectionChangeHandler(new SelectionChangeEvent.Handler() {
			public void onSelectionChange(SelectionChangeEvent event) {
				leftMoveBtn.setEnabled(true);
			}
		});

		leftMoveBtn.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				String rightPanelSelectedRow = rightSideInclusionsRowSelectionModel.getSelectedObject();

				for (String paramItemStringKey : rightSideInclusionsStringMap.keySet()) {
					if (rightSideInclusionsStringMap.get(paramItemStringKey).equals(rightPanelSelectedRow)) {
						if (paramItemStringKey.equals(selectedParameterKeyName)) {
							leftSideParamCodesTableDataProvider.getList().clear();
							leftSideParamCodesTableDataProvider.getList().addAll(paramCodesMap.get(selectedParameterKeyName));
						}
						if(selectedParamItemDTOMap.get(paramItemStringKey)!= null) {
							FlexSelectionParamItemDTO selectedParamItemDTO = selectedParamItemDTOMap.get(paramItemStringKey);
							FlexSelectSelectionAllDTO codeSelectionsDTO = selectedParamItemDTO.getItemSelections();
							codeSelectionsDTO.removeSelections();
							selectedParamItemDTOMap.remove(paramItemStringKey);
						}
					}
				}
				rightSideInclusionsStringMap.values().remove(rightPanelSelectedRow);
				rightSideInclusionsTableDataProvider.getList().clear();
				rightSideInclusionsTableDataProvider.getList().addAll(new ArrayList<String>(rightSideInclusionsStringMap.values()));
				leftMoveBtn.setEnabled(false);
				andOrBtn.setEnabled(false);
			}
		});
		
		andOrBtn.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				andOrDialog.mainPanel.setVisible(true);
				andOrDialog.mainPanel.center();
				andOrBtn.setEnabled(false);
				andOrDialog.okBtn.addClickHandler(new ClickHandler() {

					@Override
					public void onClick(ClickEvent event) {
						andOrDialog.mainPanel.hide();
						OPTION_TYPE = andOrDialog.getOptionType();
						 
						// method for moving parameters to the rightside list
						// box.
						moveToRightSideInclusion();
						andOrBtn.setEnabled(false);
					}
				});

			}
		});
		
		matchBtn.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				makeMatchDialogEvent();
			}
		});
	}
	
	public void makeMatchDialogEvent() {
		matchDialog = new MatchDialogView();
		initiateMatchDialog();
		matchDialog.okButton.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				matchDialog.prepareOkButtonEventProcessiong();
				moveToRightSideInclusion();
				matchDialog = null;
			}
		});		
	}

	private void moveToRightSideInclusion() {
		putSelectedParamItemDTO();
		
		Map<String, String> codeNameMap = null;
		FlexSelectionParamItemDTO selectedParamItemDTO = selectedParamItemDTOMap.get(selectedParameterKeyName);
		FlexSelectSelectionAllDTO codeSelectionsDTO = selectedParamItemDTO.getItemSelections();
		
		if (selectedParamItemDTO.getFieldType().equals("C")) {
			SortedMap<Integer, ParamAvailableItemValue> paramCodeIndexMap = codeSelectionsDTO.getParamCodeIndexMap();
			Set<ParamAvailableItemValue> selectedCodeObjSet = leftSideParamCodesRowSelectionModel.getSelectedSet();
			codeNameMap = new LinkedHashMap<String, String>();
			for (ParamAvailableItemValue selectedCodeObj : selectedCodeObjSet) {
				paramCodeIndexMap.put(selectedCodeObj.getIndex(), selectedCodeObj);
				codeNameMap.put(selectedCodeObj.getCode(), selectedCodeObj.getName());
				leftSideParamCodesTableDataProvider.getList().remove(selectedCodeObj);
			}
		}
		prepareSelectedInclusions(codeNameMap, selectedParameterKeyName);
	}
	
	protected void putSelectedParamItemDTO() {
		selectedParamItemDTOMap.put(selectedParameterKeyName, availableParamListMap.get(selectedParameterKeyName));
	}
	
	protected void removeSelectedParamItemDTO() {
		selectedParamItemDTOMap.remove(selectedParameterKeyName);
	}

	public void prepareSelectedInclusions(Map<String, String> codeNameMap, String parameterKeyName) {
		FlexSelectionParamItemDTO selectedParamItemDTO = selectedParamItemDTOMap.get(parameterKeyName);
		FlexSelectSelectionAllDTO codeSelectionsDTO = selectedParamItemDTO.getItemSelections();
		FlexSelectSelectionMatchDTO alphaNumericSelectionsDTO = selectedParamItemDTO.getMatchSelections();
		FlexSelectSelectionExceptionDTO dateOrNumericMatchDTO = selectedParamItemDTO.getValueSelections();

		
		if (selectedParamItemDTO.getFieldType().equals("C")) {
			// TODO - must be handling the following
			if (codeNameMap == null && alphaNumericSelectionsDTO != null && alphaNumericSelectionsDTO.getCboThats() != null && alphaNumericSelectionsDTO.getCboThats().size() > 0) {
				if (matchDialog != null && matchDialog.getSelectedFieldDTO() != null) {
					alphaNumericSelectionsDTO = matchDialog.getSelectedFieldDTO().getMatchSelections();
				}
				
				for (String option : alphaNumericSelectionsDTO.getCboThats()) {
					rightSideInclusionsStringMap.put(parameterKeyName + option, alphaNumericSelectionsDTO.getOptionTypeMap().get(option));
				}
			} 
			if (codeNameMap != null) {
				selectedParamItemDTO.setAllowNullSelection(false);
				selectedParamItemDTO.setIsRequiredForExists(false);
				
				codeSelectionsDTO.addSelection(OPTION_TYPE, selectedParamItemDTO.getFieldName(), 
						selectedParamItemDTO.getKeyName(), new ArrayList<String>(codeNameMap.keySet()), 
						false, false, selectedParamItemDTO.getAllowNullSelection(), 
						selectedParamItemDTO.getIsRequiredForExists(), codeNameMap);
				rightSideInclusionsStringMap.put(parameterKeyName, codeSelectionsDTO.getAliasFormulas().get(0));
			}

		} else if (selectedParamItemDTO.getFieldType().equals("D") || selectedParamItemDTO.getFieldType().equals("N")) {
			if (matchDialog != null && matchDialog.getSelectedFieldDTO() != null) {
				dateOrNumericMatchDTO = matchDialog.getSelectedFieldDTO().getValueSelections();
			}
			
			for (String option : dateOrNumericMatchDTO.getCboIs()) {
				if (option.contains("\n")) {
					option.replace("\\", "");
					option.replace("n", "");
				}
				rightSideInclusionsStringMap.put(parameterKeyName + option, dateOrNumericMatchDTO.getOptionTypeMap().get(option));
			}
			
		} /*TODO TO REMOVE AFTER D AND N WORKS FINE WITH ABOVE CONDITION else if (selectedParamItemDTO.getFieldType().equals("N")) {
			dateOrNumericMatchDTO = matchDialog.getSelectedFieldDTO().getValueSelections();
			rightSideInclusionsStringMap.put(parameterKeyName + matchDialog.matchOptionType, dateOrNumericMatchDTO.getOptionTypeMap().get(matchDialog.matchOptionType));
		}*/
		
		
		rightSideInclusionsTableDataProvider.getList().clear();
		rightSideInclusionsTableDataProvider.getList().addAll(new ArrayList<String>(rightSideInclusionsStringMap.values()));
		rightMoveBtn.setEnabled(false);
	}

	/**
	 * 
	 */
	private void buildLeftSideListCodesTable() {
		// Create code column.
		codeColumn = new TextColumn<ParamAvailableItemValue>() {
			@Override
			public String getValue(ParamAvailableItemValue item) {
				return item.getCode();
			}
		};

		// Create description column.
		TextColumn<ParamAvailableItemValue> nameColumn = new TextColumn<ParamAvailableItemValue>() {
			@Override
			public String getValue(ParamAvailableItemValue item) {
				return item.getName();
			}
		};

		// Make the name column sortable.
		codeColumn.setSortable(true);
		nameColumn.setSortable(true);

		leftSideParameterCodesTable.setHeight("10PX");
		leftSideParameterCodesTable.setStyleName("CellTable");

		leftSideParameterCodesTable.addColumn(codeColumn, "Code");
		leftSideParameterCodesTable.addColumn(nameColumn, "Name");

		// Connect the table to the data provider.
		leftSideParamCodesTableDataProvider.addDataDisplay(leftSideParameterCodesTable);
		
		// Add a ColumnSortEvent.ListHandler to connect sorting to the java.util.List.
		ListHandler<ParamAvailableItemValue> codeColumnSortHandler = new ListHandler<ParamAvailableItemValue>(leftSideParamCodesTableDataProvider.getList());
		codeColumnSortHandler.setComparator(codeColumn, new Comparator<ParamAvailableItemValue>() {
			public int compare(ParamAvailableItemValue o1, ParamAvailableItemValue o2) {

				return compare1(o1, o2);
			}
		});

		// Add a ColumnSortEvent.ListHandler to connect sorting to the java.util.List.
		ListHandler<ParamAvailableItemValue> nameColumnSortHandler = new ListHandler<ParamAvailableItemValue>(
				leftSideParamCodesTableDataProvider.getList());
		nameColumnSortHandler.setComparator(nameColumn, new Comparator<ParamAvailableItemValue>() {
			public int compare(ParamAvailableItemValue o1, ParamAvailableItemValue o2) {

				return compare1(o1, o2);
			}
		});

		leftSideParameterCodesTable.addColumnSortHandler(codeColumnSortHandler);
		leftSideParameterCodesTable.addColumnSortHandler(nameColumnSortHandler);

		// We know that the data is sorted alphabetically by default.
		leftSideParameterCodesTable.getColumnSortList().push(codeColumn);
		leftSideParameterCodesTable.getColumnSortList().push(nameColumn);

		// Add a selection model to handle user selection.
		leftSideParamCodesRowSelectionModel = new MultiSelectionModel<ParamAvailableItemValue>();
		leftSideParameterCodesTable.setSelectionModel(leftSideParamCodesRowSelectionModel);

		leftSideParameterCodesListPanel.setVisible(false);
	}

	@Override
	public AvailableParameterListBox leftSideParametersListBox_eventBox() {
		return leftSideParametersListBox;
	}

	@Override
	public void manipulateViewControls() {
		int selectedIndex = leftSideParametersListBox.getSelectedIndex();

		if (selectedIndex > -1) {
			selectedParameterKeyName = leftSideParametersListBox.getValue(selectedIndex);
		}
		parameterLbl.setText(selectedParameterKeyName);
		selectedFieldDTO = availableParamListMap.get(selectedParameterKeyName);
		
		if (selectedFieldDTO.getFieldType().equals("C")) {
			// TODO - NEED TO SET OPTION TYPE TO DIALOG ACCORDINGLY FROM ALREADY INCLUDED OPTION TYPES 
			andOrDialog.setData(selectedParameterKeyName);
			leftSideParametersListBox.setVisible(false);
			leftSideParameterCodesListPanel.setVisible(true);
			leftSideParamCodesTableDataProvider.getList().clear();
			ParamAvailableItemValue defaultValue = new ParamAvailableItemValue();
			defaultValue.setCode("Loading....");
			leftSideParamCodesTableDataProvider.getList().add(defaultValue);
			returnBtn.setEnabled(true);
		}
	}

	@Override
	public void setSelectedParamItemDTOMapObj(Map<String, FlexSelectionParamItemDTO> pSelectedParamItemDTOMap) {
		this.selectedParamItemDTOMap = pSelectedParamItemDTOMap;
	}

	@Override
	public void setSelectedParameterKeyNameObj(String selectedParameterKeyName) {
		this.selectedParameterKeyName = selectedParameterKeyName;
	}

	@Override
	public Map<String, String> getRightSideInclusionCodeNameMapObj() {
		return rightSideInclusionCodeNameMap;
	}

	@Override
	public Button getReturnBtn() {
		return returnBtn;
	}

	public int compare1(ParamAvailableItemValue o1, ParamAvailableItemValue o2) {
		String s1 = null;
		String s2 = null;

		s1 = (String) o1.toString();
		s2 = (String) o2.toString();

		int thisMarker = 0;
		int thisNumericChunk = 0;
		String thisChunk = new String();
		int thatMarker = 0;
		int thatNumericChunk = 0;
		String thatChunk = new String();

		while ((thisMarker < s1.length()) && (thatMarker < s2.length())) {
			char thisCh = s1.charAt(thisMarker);
			char thatCh = s2.charAt(thatMarker);

			thisChunk = "";
			thatChunk = "";

			while ((thisMarker < s1.length()) && inChunk(thisCh, thisChunk)) {
				thisChunk = thisChunk + thisCh;
				thisMarker++;
				if (thisMarker < s1.length()) {
					thisCh = s1.charAt(thisMarker);
				}
			}

			while ((thatMarker < s2.length()) && inChunk(thatCh, thatChunk)) {
				thatChunk = thatChunk + thatCh;
				thatMarker++;
				if (thatMarker < s2.length()) {
					thatCh = s2.charAt(thatMarker);
				}
			}

			int thisChunkType = isIn(thisChunk.charAt(0), numbers) ? 1 : 0;
			int thatChunkType = isIn(thatChunk.charAt(0), numbers) ? 1 : 0;

			// If both chunks contain numeric characters, sort them
			// numerically
			int result = 0;

			if ((thisChunkType == 1) && (thatChunkType == 1)) {
				thisNumericChunk = Integer.parseInt(thisChunk);
				thatNumericChunk = Integer.parseInt(thatChunk);
				if (thisNumericChunk < thatNumericChunk) {
					result = -1;
				}
				if (thisNumericChunk > thatNumericChunk) {
					result = 1;
				}
			} else {
				result = thisChunk.compareTo(thatChunk);
			}

			if (result != 0) {
				return result;
			}
		}

		return 0;
	}

	char[] numbers = { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };

	private boolean isIn(char ch, char[] chars) {
		for (int i = 0; i < chars.length; i++) {
			if (ch == chars[i]) {
				return true;
			}
		}
		return false;
	}

	private boolean inChunk(char ch, String s) {
		if (s.length() == 0) {
			return true;
		}

		char s0 = s.charAt(0);
		int chunkType = 0;
		// 0 = alphabetic, 1 = numeric

		if (isIn(s0, numbers)) {
			chunkType = 1;
		}

		if ((chunkType == 0) && (isIn(ch, numbers))) {
			return false;
		}
		if ((chunkType == 1) && (!isIn(ch, numbers))) {
			return false;
		}

		return true;
	}

	class TextCell extends AbstractSafeHtmlCell<String> {

		/**
		 * Constructs a TextCell that uses a {@link SimpleSafeHtmlRenderer} to
		 * render its text.
		 */
		public TextCell() {
			super(SimpleSafeHtmlRenderer.getInstance());
		}

		/**
		 * Constructs a TextCell that uses the provided {@link SafeHtmlRenderer}
		 * to render its text.
		 * 
		 * @param renderer
		 *            a {@link SafeHtmlRenderer SafeHtmlRenderer<String>}
		 *            instance
		 */
		public TextCell(SafeHtmlRenderer<String> renderer) {
			super(renderer);
		}

		@Override
		public void render(Context context, SafeHtml value, SafeHtmlBuilder sb) {
			if (value != null) {
				String str = value.asString();
					str = str.replace("\n", "<br/>");
					str = str.replace("\t", "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
					SafeHtml value1 = SafeHtmlUtils
							.fromSafeConstant(str);
				sb.append(value1);
				/*String str = value.asString();
				if (str.contains("\n")) {
					String temp[] = str.split("\n");
					for (int i = 0; i < temp.length; i++) {
						SafeHtml value1 = SafeHtmlUtils.fromSafeConstant(temp[i]);
						sb.append(value1);
						
						if (i > 0 && i+1 < temp.length && !(temp[i].contains("between") || temp[i-1].contains("between") || temp[i-1].endsWith("and"))) {
							sb.appendHtmlConstant(",");
						}
						
						if (i+1 < temp.length) {
							sb.appendHtmlConstant("<br/>");
						}
						
					}
				} else {
					sb.append(value);
				}*/
			}
		}

	}

	public abstract class TextColumn<T> extends Column<T, String> {

		/**
		 * Construct a new TextColumn.
		 */
		public TextColumn() {
			super(new TextCell());
		}
	}

	public void setLeftSideParamCodesTableDataProvider(ListDataProvider<ParamAvailableItemValue> pLeftSideParamCodesTableDataProvider) {
		leftSideParamCodesTableDataProvider = pLeftSideParamCodesTableDataProvider;
	}
	
	public void setRightSideInclusionsTableDataProvider(ListDataProvider<String> rightSideInclusionsTableDataProvider) {
		this.rightSideInclusionsTableDataProvider = rightSideInclusionsTableDataProvider;
	}
	
	public AbsolutePanel getLeftSideParameterCodesListPanel() {
		return leftSideParameterCodesListPanel;
	}

	@Override
	public void setParamCodesMap(Map<String, List<ParamAvailableItemValue>> pParamCodesMap) {
		this.paramCodesMap = pParamCodesMap;		
	}

	@Override
	public void setAvailableParamListMapObj(SortedMap<String, FlexSelectionParamItemDTO> pAvailableParamListMap) {
		this.availableParamListMap = pAvailableParamListMap;
	}

	@Override
	public void initiateMatchDialog() {
		if (paramCodesMap != null && paramCodesMap.get(selectedParameterKeyName) != null) {
			for (ParamAvailableItemValue fieldValue : paramCodesMap.get(selectedParameterKeyName)) {
				if (fieldValue.getName() != null && !fieldValue.getName().equals("")) {
					selectedFieldDTO.getItemSelections().setIsNameAvailable(true);
					break;
				}
			}
		}
		matchDialog.assignFlexSelectDTO(availableParamListMap.get(selectedParameterKeyName));
		matchDialog.dialogWindow.setVisible(true);
		matchDialog.dialogWindow.center();
	}
}
 

