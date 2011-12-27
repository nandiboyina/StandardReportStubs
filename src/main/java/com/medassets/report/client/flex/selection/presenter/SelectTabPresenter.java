package com.medassets.report.client.flex.selection.presenter;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ListDataProvider;
import com.medassets.report.client.component.MAWindowAlert;
import com.medassets.report.client.flex.selection.widgets.AvailableParameterListBox;
import com.medassets.report.client.service.FlexService;
import com.medassets.report.client.service.FlexServiceAsync;
import com.medassets.report.shared.FlexGlobalSettingsParamItemDTO;
import com.medassets.report.shared.FlexSelectSelectionAllDTO;
import com.medassets.report.shared.FlexSelectSelectionExceptionDTO;
import com.medassets.report.shared.FlexSelectSelectionMatchDTO;
import com.medassets.report.shared.FlexSelectionParamItemDTO;
import com.medassets.report.shared.ParamAvailableItemValue;
import com.medassets.report.shared.ReportItemDTO;

public class SelectTabPresenter {

	private final FlexServiceAsync selectTabService = GWT.create(FlexService.class);
	
	private ReportItemDTO report;

	public interface MyView {
		Widget asWidget();
		
		void manipulateViewControls();	
		
		AvailableParameterListBox leftSideParametersListBox_eventBox();
		
		void setSelectedParamItemDTOMapObj(Map<String, FlexSelectionParamItemDTO> selectedParamItemDTOMap);
		
		void setSelectedParameterKeyNameObj(String selectedParameterKeyName);

		Map<String, String> getRightSideInclusionCodeNameMapObj();

		Button getReturnBtn();
		
		void setLeftSideParamCodesTableDataProvider(ListDataProvider<ParamAvailableItemValue> leftSideParamCodesTableDataProvider);
		
		void prepareSelectedInclusions(Map<String, String> codeNameMap, String parameterKeyName);
		
		void setRightSideInclusionsTableDataProvider(ListDataProvider<String> rightSideInclusionsTableDataProvider);
		
		AbsolutePanel getLeftSideParameterCodesListPanel();

		void setParamCodesMap(Map<String, List<ParamAvailableItemValue>> paramCodesMap);

		void setAvailableParamListMapObj(SortedMap<String, FlexSelectionParamItemDTO> availableParamListMap);

		void initiateMatchDialog();

		void makeMatchDialogEvent();

		void enableMatchButton();
	}
	
	private MyView view = null;

	private SortedMap<String, FlexSelectionParamItemDTO> availableParamListMap;
	
	private Map<String, FlexSelectionParamItemDTO> selectedParamItemDTOMap;
	
	public String selectedParameterKeyName;
	
	private ListDataProvider<String> rightSideInclusionsTableDataProvider;
	
	private List<FlexSelectionParamItemDTO> savedSelectionInclusionList;

	private ListDataProvider<ParamAvailableItemValue> leftSideParamCodesTableDataProvider;

	private Map<String, List<ParamAvailableItemValue>> paramCodesMap;
	
	public SelectTabPresenter() {
	}

	public SelectTabPresenter(final MyView view, ReportItemDTO report) {
		this.view = view;
		this.report = report;
		
		leftSideParamCodesTableDataProvider = new ListDataProvider<ParamAvailableItemValue>();
		getView().setLeftSideParamCodesTableDataProvider(leftSideParamCodesTableDataProvider);
		
		rightSideInclusionsTableDataProvider = new ListDataProvider<String>();
		getView().setRightSideInclusionsTableDataProvider(rightSideInclusionsTableDataProvider);
	}

	public void reveal() {
		addComponentEventsforServiceResults();
		
		initialize();
	}
	
	private void initialize() {
		availableParamListMap = new TreeMap<String, FlexSelectionParamItemDTO>();
		setSelectedParamItemDTOMap(new LinkedHashMap<String, FlexSelectionParamItemDTO>());

		getView().setAvailableParamListMapObj(availableParamListMap);
		getView().setSelectedParamItemDTOMapObj(getSelectedParamItemDTOMap());
		
		boolean isNotSavedInstance = (report.getReportInstanceId() == null);
		if (isNotSavedInstance) {
			buildReportTemplate();
		} else {
			buildReportInstance();
		}
	}

	private void buildReportInstance() {
		selectTabService.getSelectTabAvailableParamList(report.getReportTemplateId(), new AsyncCallback<List<FlexSelectionParamItemDTO>>() {

            public void onFailure(Throwable caught) {
                GWT.log(caught.getMessage(), caught);
                new MAWindowAlert("Error", caught.getMessage() + ": failed while fetching available parameters.", null, "Ok").center();
            }

            public void onSuccess(List<FlexSelectionParamItemDTO> result) {
            	buildLeftSideParametersListView(result);
            	
            	
            	/*TODO - THIS CODE WILL BE REMOVED ONCE SAVED INSTANCE FIXES DONE
            	 * getView().leftSideParametersListBox_eventBox().setVisible(false);
            	getView().getLeftSideParameterCodesListPanel().setVisible(true);
            	leftSideParamCodesTableDataProvider.getList().clear();
        		ParamAvailableItemValue defaultValue = new ParamAvailableItemValue();
        		defaultValue.setCode("Loading....");
        		leftSideParamCodesTableDataProvider.getList().add(defaultValue);*/
            	
            	selectTabService.fetchSavedSelections(report.getReportTemplateId(), report.getReportInstanceId(), new AsyncCallback<List<FlexSelectionParamItemDTO>>() {
        			
        			public void onSuccess(List<FlexSelectionParamItemDTO> result) {
        				savedSelectionInclusionList = result;
        				for (FlexSelectionParamItemDTO paramObj : result) {
        					if (paramObj.getPopulated()) {
        						selectedParameterKeyName = paramObj.getKeyName();; 
        						getView().setSelectedParameterKeyNameObj(selectedParameterKeyName);
        						getView().manipulateViewControls();
    							intiateFieldValues();
        						break;
        					}
        				}
        			}
        			
        			public void onFailure(Throwable caught) {
        				GWT.log(caught.getMessage(), caught);
        				leftSideParamCodesTableDataProvider.getList().clear();
						new MAWindowAlert("Error", caught.getMessage() + ": failed while fetching saved selections", null, "Ok").center();
        			}
        		});
            }
        });
	}

	protected void prepareInclusions() {
		FlexSelectionParamItemDTO populatedParamObj = availableParamListMap.get(selectedParameterKeyName);
		for (FlexSelectionParamItemDTO savedParamObj : savedSelectionInclusionList) {
			FlexSelectSelectionAllDTO itemSelections = savedParamObj.getItemSelections();
			FlexSelectSelectionMatchDTO alphaNumericSelections = savedParamObj.getMatchSelections();
			FlexSelectSelectionExceptionDTO dateOrNumericSelections = savedParamObj.getValueSelections();
			
			if (savedParamObj.getFieldType().equals("C")) {
				List<Map<String, String>> codeNameMapList = itemSelections.getCodeNameMapList();
				if (codeNameMapList != null && codeNameMapList.size() > 0) {
					Map<String, String> codeNameMap = codeNameMapList.get(0);
					SortedMap<Integer, ParamAvailableItemValue> paramCodeIndexMap = itemSelections.getParamCodeIndexMap();

					for (ParamAvailableItemValue paramCodeObj : leftSideParamCodesTableDataProvider.getList()) {
						if (savedParamObj.getKeyName().equals(populatedParamObj.getKeyName()) && codeNameMap.keySet().contains(paramCodeObj.getCode())) {
							paramCodeIndexMap.put(paramCodeObj.getIndex(), paramCodeObj);
						}
					}
					
					int i = 0 ;
					for (String option : alphaNumericSelections.getCboThats()) {
						/*TODO ALPHA NUMERIC MATCH PENDING...if (alphaNumericSelections.getAliasFormulas() != null &&  (alphaNumericSelections.getAliasFormulas().size() == 0 ||
								alphaNumericSelections.getAliasFormulas().get(i) == null)) {
							alphaNumericSelections.getAliasFormulas().add(alphaNumericSelections.generateAliasFormula(alphaNumericSelections.getOptionTypes().get(i), 
								alphaNumericSelections.getCboCodeNames().get(i), option, alphaNumericSelections.getTxtTheChars().get(i), 
								alphaNumericSelections.getIgnoreCapits().get(i), alphaNumericSelections.getDbFields().get(i), alphaNumericSelections.getKeys().get(i)));
						}*/
						i++;								
					}
					
					availableParamListMap.get(savedParamObj.getKeyName()).setItemSelections(itemSelections);
					availableParamListMap.get(savedParamObj.getKeyName()).setMatchSelections(alphaNumericSelections);
					getSelectedParamItemDTOMap().put(savedParamObj.getKeyName(), availableParamListMap.get(savedParamObj.getKeyName()));
					
					getView().prepareSelectedInclusions(codeNameMap, savedParamObj.getKeyName());
				}
				if (savedParamObj.getKeyName().equals(populatedParamObj.getKeyName())) {
					populateListCodes(paramCodesMap.get(selectedParameterKeyName));
				}
			} else if (savedParamObj.getFieldType().equals("D") || savedParamObj.getFieldType().equals("N")) {
				int i = 0;
				for (String option : dateOrNumericSelections.getCboIs()) {
					if (dateOrNumericSelections.getAliasFormulas() != null && (dateOrNumericSelections.getAliasFormulas().size() == 0 || 
							dateOrNumericSelections.getAliasFormulas().get(i) == null)) {
						dateOrNumericSelections.getAliasFormulas().add(dateOrNumericSelections.generateAliasFormula(dateOrNumericSelections.getOptionTypes().get(i), 
							option, dateOrNumericSelections.getCriteria2s().get(i), dateOrNumericSelections.getCriteria3s().get(i), 
							dateOrNumericSelections.getDbFields().get(i), dateOrNumericSelections.getKeys().get(i)));
					}
					i++;
				}
				
				availableParamListMap.get(savedParamObj.getKeyName()).setValueSelections(dateOrNumericSelections);
				getSelectedParamItemDTOMap().put(savedParamObj.getKeyName(), availableParamListMap.get(savedParamObj.getKeyName()));
				
				getView().prepareSelectedInclusions(null, savedParamObj.getKeyName());
			}
		}
		savedSelectionInclusionList = null;
	}

	private void buildReportTemplate() {
		selectTabService.getSelectTabAvailableParamList(report.getReportTemplateId(), new AsyncCallback<List<FlexSelectionParamItemDTO>>() {

            public void onFailure(Throwable caught) {
                GWT.log(caught.getMessage(), caught);
                if (report.getReportInstanceId() != null) {
					new MAWindowAlert("Error", caught.getMessage() + ": failed while fetching saved available parameters", null, "Ok").center();
				} else {
					new MAWindowAlert("Error", caught.getMessage() + ": failed while fetching available parameters", null, "Ok").center();
				}
            }

            public void onSuccess(List<FlexSelectionParamItemDTO> result) {
            	buildLeftSideParametersListView(result);
            }
        });		
	}
	
	public void buildLeftSideParametersListView(List<FlexSelectionParamItemDTO> result) {
		TreeMap<String, String> availListSortedMap = new TreeMap<String, String>();
		for (FlexSelectionParamItemDTO paramObj : result) {
			if (paramObj != null && paramObj.getFieldName() != null && paramObj.getDescription() != null && paramObj.getDescription().trim().length() != 0) {
				availableParamListMap.put(paramObj.getKeyName(), paramObj);
				availListSortedMap.put(paramObj.getDescription(), paramObj.getKeyName());
			}
		}

		Iterator<String> iterator = availListSortedMap.keySet().iterator();
		while (iterator.hasNext()) {
			Object key = iterator.next();
			getView().leftSideParametersListBox_eventBox().addItem((String) key, availListSortedMap.get(key));
		}
	}

	private void addComponentEventsforServiceResults() {
		getView().leftSideParametersListBox_eventBox().setSelectTabPresenter(this);
	}

	public void intiateFieldValues() {
		FlexSelectionParamItemDTO selectedParameter = availableParamListMap.get(selectedParameterKeyName);
		String fieldType = selectedParameter.getFieldType();
		if (fieldType != null) {
			getView().manipulateViewControls();
			if (fieldType.equalsIgnoreCase("N") || fieldType.equalsIgnoreCase("D")) {
				if (savedSelectionInclusionList != null) {
					prepareInclusions();
				} else if (savedSelectionInclusionList == null) {
					getView().makeMatchDialogEvent();
				}
			} else if (fieldType.equalsIgnoreCase("C")) {
				if (paramCodesMap != null && paramCodesMap.containsKey(selectedParameterKeyName)) {
					prepareCodesPopulation(paramCodesMap.get(selectedParameterKeyName));
				} else {
					fetchPrameterCodeList();
				}
			} 
		}
	}

	/**
	 * @return the view
	 */
	public Widget getWidget() {
		return view.asWidget();
	}
	
	public MyView getView() {
		return view;
	}

	public void fetchPrameterCodeList() {
		GWT.log("SelectTabPresenter.fetchParameterCodeList() - Begin");
		FlexSelectionParamItemDTO selectedParameter = availableParamListMap.get(selectedParameterKeyName);
		// TODO REFACTORING WILL BE THERE WEHN INTEGRATING SELECTION TAB WITH GLOBAL SETTINGS TAB
		List<FlexGlobalSettingsParamItemDTO> globalSettingsTabDtoList = null;
		String[] statusMsg = new String[] { " " };
		selectTabService.getSelectTabParamCodeList(selectedParameter, globalSettingsTabDtoList, statusMsg , new AsyncCallback<List<ParamAvailableItemValue>>() {
			
			public void onSuccess(List<ParamAvailableItemValue> result) {
				// map parameter name to param code list
				getParamCodesMap().put(selectedParameterKeyName, result);
				getView().setParamCodesMap(getParamCodesMap());
				
				prepareCodesPopulation(result);
				GWT.log("SelectTabPresenter.fetchParameterCodeList() - End");
			}
			
			public void onFailure(Throwable caught) {
				GWT.log(caught.getMessage(), caught);
				leftSideParamCodesTableDataProvider.getList().clear();
				
				if (report.getReportInstanceId() != null) {
					new MAWindowAlert("Error", caught.getMessage() + ": failed while fetching saved parameter codes", null, "Ok").center();
				} else {
					new MAWindowAlert("Error", caught.getMessage() + ": failed while fetching parameter codes", null, "Ok").center();
				}
			}
		});
	}
	
	protected Map<String, List<ParamAvailableItemValue>> getParamCodesMap() {
		if (paramCodesMap == null) {
			paramCodesMap = new LinkedHashMap<String, List<ParamAvailableItemValue>>();
		}
		return paramCodesMap;
	}

	protected void prepareCodesPopulation(List<ParamAvailableItemValue> result) {
		populateListCodes(result);
		getView().getReturnBtn().setEnabled(true);
		if (savedSelectionInclusionList != null) {
			prepareInclusions();
		}
	}

	/**
	 * Prepares display data with the different codes as rows into the left panel to the user.
	 * It sets all the list data into dataProvider object of the CellTable
	 * 
	 * @param paramCodeList List<ParamAvailableItemValue>
	 */
	protected void populateListCodes(List<ParamAvailableItemValue> paramCodeList) {
		// Add the data to the data provider, which automatically pushes it to the
	    // widget.
		leftSideParamCodesTableDataProvider.getList().clear();
	    List<ParamAvailableItemValue> list = leftSideParamCodesTableDataProvider.getList();
	    list.clear();
	    
	    int index = 1;
		for (ParamAvailableItemValue paramCodeObject : paramCodeList) {
			paramCodeObject.setIndex(index++);
			
			boolean includedAlready = isCodeIncludedAlready(paramCodeObject);
			
			// it disables to add duplicate code selection into the left panel list
			if (!includedAlready) {
				list.add(paramCodeObject);
			}
		}
	}
	
	/**
	 * Verify the code is already included in right panel or not. if so, it does not require
	 * to populate in the left panel.
	 * 
	 * @param paramCodeObject ParamAvailableItemValue
	 * @return boolean
	 */
	private boolean isCodeIncludedAlready(ParamAvailableItemValue paramCodeObject) {
		FlexSelectionParamItemDTO paramItemDTO = getSelectedParamItemDTOMap().get(selectedParameterKeyName);
		if (paramItemDTO != null) {
			FlexSelectSelectionAllDTO codeSelectionDTO = paramItemDTO.getItemSelections();
			List<String> selectedItems = codeSelectionDTO.getSelectedItems();
			if (selectedItems != null && selectedItems.size() > 0) {
				String selectedCodeString = selectedItems.get(0);
				if (selectedCodeString.contains(paramCodeObject.getCode())) {
					return true;
				}
			}
		}
		return false;
	}

	public Map<String, FlexSelectionParamItemDTO> getSelectedParamItemDTOMap() {
		return selectedParamItemDTOMap;
	}

	public void setSelectedParamItemDTOMap(Map<String, FlexSelectionParamItemDTO> selectedParamItemDTOMap) {
		this.selectedParamItemDTOMap = selectedParamItemDTOMap;
	}
	
}
