package com.medassets.report.client.flex.selection.view;

import java.util.Date;
import java.util.Map;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.FocusEvent;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.RadioButton;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.datepicker.client.DatePicker;
import com.medassets.report.shared.FlexSelectSelectionAllDTO;
import com.medassets.report.shared.FlexSelectSelectionExceptionDTO;
import com.medassets.report.shared.FlexSelectSelectionMatchDTO;
import com.medassets.report.shared.FlexSelectionParamItemDTO;

public class MatchDialogView extends DialogBox {

	private static final Binder binder = GWT.create(Binder.class);
	
	interface Binder extends UiBinder<Widget, MatchDialogView> {
	}
	
	@UiField Label fieldNameLbl;
	
	@UiField Label matchDialogTitle;
	
	@UiField RadioButton codeRadioBtn;
	
	@UiField RadioButton nameRadioBtn;
	
	@UiField Label fieldReferenceLbl;
	
	@UiField ListBox matchOptionCmbBox;
	
	@UiField AbsolutePanel characterMatchPanel;
	
	@UiField TextBox matchTxtBox;
	
	@UiField CheckBox ignoreCapsChkBox;
	
	@UiField DatePicker startDatePicker;
	
	@UiField DatePicker endDatePicker;
	
	@UiField TextBox startDateBox;
	
	@UiField TextBox endDateBox;
	
	@UiField TextBox rangeEndNbrBox;
	
	@UiField TextBox rangeStartNbrBox;
	
	@UiField AbsolutePanel dateOrNumericMatchPanel;
	
	@UiField RadioButton andRadioBtn;
	
	@UiField RadioButton orRadioBtn;
	
	@UiField RadioButton andNotRadioBtn;
	
	@UiField RadioButton orNotRadioBtn;
	
	@UiField DialogBox dialogWindow;
	
	@UiField Button okButton;
	
	@UiField AbsolutePanel codeNamePanel;
	
	@UiField Button cancelBtn;
	@UiField AbsolutePanel andRangePanel;
	
	@UiHandler("andRadioBtn")
	void onAndRadioSelection(ClickEvent e) {
		setOptionType("AND");
	}

	@UiHandler("orRadioBtn")
	void onOrRadioRadioSelection(ClickEvent e) {
		setOptionType("OR");
	}

	@UiHandler("andNotRadioBtn")
	void onAndNotRadioSelection(ClickEvent e) {
		setOptionType("AND NOT");
	}
	
	@UiHandler("orNotRadioBtn")
	void onOrNotRadioSelection(ClickEvent event) {
		setOptionType("OR NOT");
	}
	
	@UiHandler("matchOptionCmbBox")
	void onMatchOptionCmbBoxChange(ChangeEvent event) {
		matchOptionType = matchOptionCmbBox.getValue(matchOptionCmbBox.getSelectedIndex());
		if (fieldType == 'D' || fieldType == 'N') {
			if ((matchOptionType.equals("between including") || matchOptionType.equals("between excluding") || matchOptionType.equals("outside"))){
				andRangePanel.setVisible(true);
			} else {
				andRangePanel.setVisible(false);
			}
		}
	}
	
	@UiHandler("startDateBox")
	void onStartDateBoxFocus(FocusEvent event) {
		startDatePicker.setVisible(true);
	}
	
	@UiHandler("endDateBox")
	void onEndDateBoxFocus(FocusEvent event) {
		endDatePicker.setVisible(true);
	}
	
	@UiHandler("startDateBox")
	void onStartDateBoxBlur(BlurEvent event) {
//		startDatePicker.setVisible(false);
		if (startDateBox.getValue() != null && !startDateBox.getValue().equals("")) {
			okButton.setEnabled(true);
		} else {
			okButton.setEnabled(false);
		}
	}
	@UiHandler("endDateBox")
	void onEndDateBoxBlur(BlurEvent event) {
//		endDatePicker.setVisible(false);
		if (endDateBox.getValue() != null && !endDateBox.getValue().equals("")) {
			okButton.setEnabled(true);
		} else {
			okButton.setEnabled(false);
		}
	}

	@UiHandler("rangeStartNbrBox")
	void onRangeStartNbrBoxKeyPress(KeyPressEvent event) {
		okButton.setEnabled(true);
	}
	
	@UiHandler("rangeStartNbrBox")
	void onRangeStartNbrBoxBlur(BlurEvent event) {
		if (rangeStartNbrBox.getValue() != null && !rangeStartNbrBox.getValue().equals("")) {
			okButton.setEnabled(true);
		} else {
			okButton.setEnabled(false);
		}
	}

	@UiHandler("rangeEndNbrBox")
	void onRangeEndNbrBoxKeyPress(KeyPressEvent event) {
			okButton.setEnabled(true);
	}
	
	@UiHandler("rangeEndNbrBox")
	void onRangeEndNbrBoxBlur(BlurEvent event) {
		if (rangeEndNbrBox.getValue() != null && !rangeEndNbrBox.getValue().equals("")) {
			okButton.setEnabled(true);
		} else {
			okButton.setEnabled(false);
		}
	}

	@UiHandler("matchTxtBox")
	void onMatchTxtBoxKeyPress(KeyPressEvent event) {
		okButton.setEnabled(true);
	}
	
	@UiHandler("matchTxtBox")
	void onMatchTxtBoxBlur(BlurEvent event) {
		if (matchTxtBox.getValue() != null && !matchTxtBox.getValue().equals("")) {
			okButton.setEnabled(true);
		} else {
			okButton.setEnabled(false);
		}
	}

	
	@UiHandler("ignoreCapsChkBox")
	void onIgnoreCapsChkBoxClick(ClickEvent event) {
		
	}
	
	@UiHandler("cancelBtn")
	void onCancelButtonClick(ClickEvent event) {
		dialogWindow.hide();
	}
	
	private String optionType = "AND";
	
	private FlexSelectionParamItemDTO selectedFieldDTO;

	private char fieldType;

	protected String matchOptionType;

	private FlexSelectSelectionMatchDTO charactersMatchDTO;

	private FlexSelectSelectionExceptionDTO matchDateNumericDTO;

	private FlexSelectSelectionAllDTO characterFieldSelections;
	
	public MatchDialogView() {
		setWidget(binder.createAndBindUi(this));
		setUp();
	}
	
	private void setUp() {
		startDatePicker.setVisible(false);
		endDatePicker.setVisible(false);
		startDateBox.setVisible(false);
		endDateBox.setVisible(false);
		rangeStartNbrBox.setVisible(false);
		rangeEndNbrBox.setVisible(false);
		dateOrNumericMatchPanel.setVisible(false);
		codeNamePanel.setVisible(false);
		characterMatchPanel.setVisible(false);
		andRangePanel.setVisible(false);
		andRadioBtn.setValue(true);
		fieldType = ' ';
		matchDialogTitle.setText("Select by");
		matchOptionCmbBox.clear();
		startDateBox.setText("");
		endDateBox.setText("");
		rangeStartNbrBox.setText("");
		rangeEndNbrBox.setText("");
		matchTxtBox.setText("");
		ignoreCapsChkBox.setVisible(false);
		okButton.setEnabled(false);
	}
	
	public String getOptionType() {
		return optionType;
	}

	public void setOptionType(String optionType) {
		this.optionType = optionType;
	}
	
	public void assignFlexSelectDTO(FlexSelectionParamItemDTO selectedDTO) {
		setUp();
		this.selectedFieldDTO = selectedDTO;
		fieldType = selectedFieldDTO.getFieldType().charAt(0);
		characterFieldSelections = selectedFieldDTO.getItemSelections();
		charactersMatchDTO = selectedFieldDTO.getMatchSelections();
		matchDateNumericDTO = selectedFieldDTO.getValueSelections();
		initializeMatchDialog();
	}
	
	private void initializeMatchDialog() {
		prepareTitle();
		prepareOptionSelection();
		prepareFieldName();
		prepareCodeNamePanel();
		prepareFieldReferenceLbl();
		prepareMatchOptions();
		prepareDateOrNumericPanel();
		prepareMatchCharatersPanel();
		prepareIgnoreCapitalization();
	}

	private void prepareTitle() {
		String defaultTitle = matchDialogTitle.getText();
		if (fieldType == 'C') {
			matchDialogTitle.setText("Alphanumeric Field " + defaultTitle + " Matching Characters");
		} else if (fieldType == 'N' || fieldType == 'D'){
			matchDialogTitle.setText(defaultTitle + " Value");
		} else {
			matchDialogTitle.setText(defaultTitle + " " + fieldType + " is currently not supportable.");
		}
	}

	private void prepareOptionSelection() {
		String keyName = selectedFieldDTO.getKeyName();
		if (charactersMatchDTO != null) {
			Map<String, String> optionTypeMap = charactersMatchDTO.getOptionTypeMap();
			if (optionTypeMap != null && optionTypeMap.size() > 0 && optionTypeMap.get(keyName) != null) {
				this.optionType =	optionTypeMap.get(keyName);
			}
		}
	}

	private void prepareFieldName() {
		String fieldName = selectedFieldDTO.getKeyName();
		if (fieldName != null) {
			fieldNameLbl.setText(fieldName);
		}
	}

	private void prepareCodeNamePanel() {
		if (characterFieldSelections != null && characterFieldSelections.getIsNameAvailable()) {
			codeNamePanel.setVisible(true);
		}
	}
	
	private void prepareFieldReferenceLbl() {
		fieldType = selectedFieldDTO.getFieldType().charAt(0);
		if (fieldType == 'C') {
			fieldReferenceLbl.setText("that");
		} else if (fieldType == 'N' || fieldType == 'D'){
			fieldReferenceLbl.setText("is");
		}
	}

	private void prepareMatchOptions() {
		if (fieldType == 'C') {
			for (String matchOption : charactersMatchDTO.getCboThats()) {
				matchOptionCmbBox.addItem(matchOption, matchOption);
			}
		} else if (fieldType == 'N' || fieldType == 'D') {
			for (String matchOption : matchDateNumericDTO.getCboIs()) {
				matchOptionCmbBox.addItem(matchOption, matchOption);
			}
		}
	}

	private void prepareDateOrNumericPanel() {
		if (fieldType == 'D' || fieldType == 'N') {
			dateOrNumericMatchPanel.setVisible(true);
			prepareDateOrNumericFields();
		}
		// TODO
	}

	private void prepareDateOrNumericFields() {
		if (fieldType == 'D') {
			startDateBox.setVisible(true);
			endDateBox.setVisible(true);
			startDatePicker.addValueChangeHandler(new ValueChangeHandler<Date>() {
				
				@Override
				public void onValueChange(ValueChangeEvent<Date> event) {
					String dateStr = DateTimeFormat.getFormat("MM/dd/yyyy").format(event.getValue());
					startDateBox.setText(dateStr);
					startDatePicker.setVisible(false);
					okButton.setEnabled(true);
				}
			});
			endDatePicker.addValueChangeHandler(new ValueChangeHandler<Date>() {
				
				@Override
				public void onValueChange(ValueChangeEvent<Date> event) {
					String dateStr = DateTimeFormat.getFormat("MM/dd/yyyy").format(event.getValue());
					endDateBox.setText(dateStr);
					endDatePicker.setVisible(false);					
					okButton.setEnabled(true);
				}
			});
		} else if (fieldType == 'N') {
			rangeStartNbrBox.setVisible(true);
			rangeEndNbrBox.setVisible(true);
			
			numberTextBoxHandler(rangeStartNbrBox);
			numberTextBoxHandler(rangeEndNbrBox);
		}
	}

	private void numberTextBoxHandler(TextBox textbox) {
		textbox.addKeyPressHandler(new KeyPressHandler() {
			public void onKeyPress(KeyPressEvent event) {
				if (!Character.isDigit(event.getCharCode())) {
					((TextBox) event.getSource()).cancelKey();
				}
			}
		});
	}

	private void prepareMatchCharatersPanel() {
		if (fieldType == 'C') {
			characterMatchPanel.setVisible(true);
		} 
	}

	private void prepareIgnoreCapitalization() {
		if (fieldType == 'C') {
			ignoreCapsChkBox.setVisible(true);
		} 
	}

	public FlexSelectionParamItemDTO getSelectedFieldDTO() {
		return selectedFieldDTO;
	}
	
	public void prepareOkButtonEventProcessiong() {
		prepareMatchOptionType();
		if (fieldType == 'C') {
			String codeOrName = new String();;
			
			if (codeRadioBtn != null && codeRadioBtn.getValue()) {
				codeOrName = codeRadioBtn.getText();
			} 
			if (nameRadioBtn != null && nameRadioBtn.getValue()) {
				codeOrName = nameRadioBtn.getText();
			}
			charactersMatchDTO.addSelection(optionType, codeOrName, matchOptionType, matchTxtBox.getText().trim(), 
					ignoreCapsChkBox.getValue(), selectedFieldDTO.getFieldName(), selectedFieldDTO.getKeyName());
			
		} else if (fieldType == 'D') {
			matchDateNumericDTO.addSelection(optionType, matchOptionType, startDateBox.getValue(), endDateBox.getValue(), 
					selectedFieldDTO.getFieldName(), selectedFieldDTO.getKeyName());
			
		} else if (fieldType == 'N') {
			matchDateNumericDTO.addSelection(optionType, matchOptionType, rangeStartNbrBox.getValue().trim(), rangeEndNbrBox.getValue().trim(), 
					selectedFieldDTO.getFieldName(), selectedFieldDTO.getKeyName());
		}
		
		dialogWindow.hide();
	}
	
	private void prepareMatchOptionType() {
		if (matchOptionType != null) {
			matchOptionType = "\n" + matchOptionType;
		} else {
			if (fieldType == 'C') {
				matchOptionType = "\nstarts with";
			}
			if (fieldType == 'D' || fieldType == 'N') {
				matchOptionType = "\nequal to";
			}
		}
	}
}
