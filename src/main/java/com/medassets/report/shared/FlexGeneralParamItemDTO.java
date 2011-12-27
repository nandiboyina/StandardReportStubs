package com.medassets.report.shared;

import com.google.gwt.user.client.rpc.IsSerializable;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 
 * @author hbala Transfer Object representing a Single Drop Down List for the
 *         General Tab 
 *         
 *         
 * The Main Attributes backing the UI are:
 * labelName : The Label to use for the Drop Down List listOfValues : The
 * Values to show for the Drop Down list (Use each Value when iterating thru the
 * Map, not the Key) defaultSelection : The Default Selection for this drop down
 * list (This will contain the value of the Key for the above listOfValues Map)
 * 
 * Also the UI will set the selected Value for the Drop Down List in field currentValue
 * 
 */

public class FlexGeneralParamItemDTO implements IsSerializable {
	private String labelName;
	
	private Map<String, String> listOfValues = new LinkedHashMap<String, String>();
	private String defaultSelection;
	
	private String formulaDestination;
	private Boolean setEachGroup;
	private Long rptGeneralObjectId;
	private String setTo;
	private Long helpId;
	private String fieldName;
	private String fieldType;
	private Long rptDictionaryId;	
	private String functionType;
	
	private String currentValue;
	private int wizStyle;

    public enum WizStyleEnum {
		TEXT, CHK, CALENDAR, LIST, CBO, RADIO_BUTTON
	}


	public String getCurrentValue() {
		return currentValue;
	}

	public void setCurrentValue(String currentValue) {
		this.currentValue = currentValue;
	}

	public Long getRptDictionaryId() {
		return rptDictionaryId;
	}

	public void setRptDictionaryId(Long rptDictionaryId) {
		this.rptDictionaryId = rptDictionaryId;
	}

	public Long getRptGeneralObjectId() {
		return rptGeneralObjectId;
	}

	public void setRptGeneralObjectId(Long rptGeneralObjectId) {
		this.rptGeneralObjectId = rptGeneralObjectId;
	}

	public String getFunctionType() {
		return functionType;
	}

	public void setFunctionType(String functionType) {
		this.functionType = functionType;
	}

	public String getLabelName() {
		return labelName;
	}

	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

	public Map<String, String> getListOfValues() {
		return listOfValues;
	}

	public void setListOfValues(Map<String, String> listOfValues) {
		this.listOfValues = listOfValues;
	}

	public String getDefaultSelection() {
		return defaultSelection;
	}

	public void setDefaultSelection(String defaultSelection) {
		this.defaultSelection = defaultSelection;
	}

	public FlexGeneralParamItemDTO() {

	}


	public String getFormulaDestination() {
		return formulaDestination;
	}

	public void setFormulaDestination(String formulaDestination) {
		this.formulaDestination = formulaDestination;
	}

	public Boolean getSetEachGroup() {
		return setEachGroup;
	}

	public void setSetEachGroup(Boolean setEachGroup) {
		this.setEachGroup = setEachGroup;
	}

	public String getSetTo() {
		return setTo;
	}

	public void setSetTo(String setTo) {
		this.setTo = setTo;
	}

	public Long getHelpId() {
		return helpId;
	}

	public void setHelpId(Long helpId) {
		this.helpId = helpId;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getFieldType() {
		return fieldType;
	}

	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}

	public int getWizStyle() {
		return wizStyle;
	}

	public void setWizStyle(int wizStyle) {
		this.wizStyle = wizStyle;
	}

    public String toString() {
        return "fieldName: " + fieldName
            + "\nfieldType: " + fieldType
            + "\nlabel: " + labelName
            + "\nrptDictionaryId : " + rptDictionaryId
            + "\nsetTo : " + setTo
            + "\nhelpId : " + helpId
            + "\nfunctionType : " + functionType
            + "\ncurrentValue : " + currentValue
            + "\nrptGeneralObjectId : " + rptGeneralObjectId
            + "\nsetEachGroup : " + setEachGroup
            + "\nformulaDestination : " + formulaDestination
            + "\ndefaultSelection: " + defaultSelection
            + "\nwizStyle: " + wizStyle
            + "\nvalues: " + listOfValues.toString();
    }
}
