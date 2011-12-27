package com.medassets.report.shared;


import java.util.Arrays;
import java.util.List;

import com.google.gwt.user.client.rpc.IsSerializable;

public class StandardParamItemDTO implements IsSerializable {

	private Long reportTemplateID;
	private Long paramID;
	private Long reportInstanceID;
	private int paramDataType;
	private WizStyleEnum wizStyle;
	private String paramName;
	private String defaultParamCodeValueInCrystalReport;
    private String defaultParamDescriptionInCrystalReport;
    	private String promptDescription;
	private boolean subParam;
	private boolean paramSelAll;
	private boolean paramSQLBased;
    private String lookup;
    private String aValue;
    private List<String> aValueList;
    private String defaultParamValueInDatabase;
    private boolean modified;
    private StandardParamItemDTO parentParam;  ;
    private boolean isParentParam ;
    private String parentName;

    public List<String> getaValueList() {
        return aValueList;
    }

    public void setaValueList(String aValueList) {
        //convert this to ArrayList
        if (aValueList != null) {
            String splitString = ",";

            String[] ListOfValues = aValueList.split(splitString);

            for (int i = 0; i < ListOfValues.length; i++) {
                String s = ListOfValues[i];
                s = s.replaceAll("\"", "");
                ListOfValues[i] = s;
            }
            for (String s : ListOfValues) {
                if (s.startsWith("\"") && s.endsWith("\"")) {
                    //strip off double quotes around it
                    s = s.substring(1, s.length() - 1);
                }

            }
            this.aValueList = Arrays.asList(ListOfValues);
        }
    }

    public void setDefaultParamValueInDatabase(String defaultParamValueInDatabase) {
        this.defaultParamValueInDatabase = defaultParamValueInDatabase;
    }

    public String getDefaultParamValueInDatabase() {
        return defaultParamValueInDatabase;
    }

    public enum WizStyleEnum implements IsSerializable {
        TEXT, CHK, CALENDAR, LIST, CBO, RADIO_BUTTON
    }

    public StandardParamItemDTO() {
    }

    public Long getReportTemplateID() {
        return reportTemplateID;
    }

    public void setReportTemplateID(Long reportTemplateID) {
        this.reportTemplateID = reportTemplateID;
    }

    public Long getParamID() {
        return paramID;
    }

    public void setParamID(Long paramID) {
        this.paramID = paramID;
    }

    public Long getReportInstanceID() {
        return reportInstanceID;
    }

    public void setReportInstanceID(Long reportInstanceID) {
        this.reportInstanceID = reportInstanceID;
    }

    public int getParamDataType() {
        return paramDataType;
    }

    public void setParamDataType(int paramDataType) {
        this.paramDataType = paramDataType;
    }

    public WizStyleEnum getWizStyle() {
        return wizStyle;
    }

    public void setWizStyle(WizStyleEnum wizStyle) {
        this.wizStyle = wizStyle;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

	public String getDefaultParamCodeValueInCrystalReport() {
		return defaultParamCodeValueInCrystalReport;
	}

	public void setDefaultParamCodeValueInCrystalReport(
            String defaultParamCodeValueInCrystalReport) {
		this.defaultParamCodeValueInCrystalReport = defaultParamCodeValueInCrystalReport;
	}

    public String getPromptDescription() {
        return promptDescription;
    }

    public void setPromptDescription(String promptDescription) {
        this.promptDescription = promptDescription;
    }

    public boolean isSubParam() {
        return subParam;
    }

    public void setSubParam(boolean subParam) {
        this.subParam = subParam;
    }

    public boolean isParamSelAll() {
        return paramSelAll;
    }

    public void setParamSelAll(boolean paramSelAll) {
        this.paramSelAll = paramSelAll;
    }

    public boolean isParamSQLBased() {
        return paramSQLBased;
    }

    public void setParamSQLBased(boolean paramSQLBased) {
        this.paramSQLBased = paramSQLBased;
    }

    public String getLookup() {
        return lookup;
    }

    public void setLookup(String lookup) {
        this.lookup = lookup;
    }

    public String getaValue() {
        return aValue;
    }

    public void setaValue(String aValue) {
        this.aValue = aValue;
    }

    public String getDefaultParamDescriptionInCrystalReport() {
        return defaultParamDescriptionInCrystalReport;
    }

    public void setDefaultParamDescriptionInCrystalReport(String defaultParamDescriptionInCrystalReport) {
        this.defaultParamDescriptionInCrystalReport = defaultParamDescriptionInCrystalReport;
    }

    public boolean isModified() {
        return modified;
    }

    public void setModified(boolean modified) {
        this.modified = modified;
    }

    public StandardParamItemDTO getParentParam() {
        return parentParam;
    }

    public void setParentParam(StandardParamItemDTO parentParam) {
        this.parentParam = parentParam;
    }

    public boolean isParentParam() {
        return isParentParam;
    }

    public void setParentParam(boolean parentParam) {
        isParentParam = parentParam;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }
}
