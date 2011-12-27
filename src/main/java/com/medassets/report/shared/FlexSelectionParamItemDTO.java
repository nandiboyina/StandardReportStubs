package com.medassets.report.shared;

import com.google.gwt.user.client.rpc.IsSerializable;

public class FlexSelectionParamItemDTO implements IsSerializable {

	private String parentName;

	private String keyName;

	private String aliasName;

	// Null for non leaf item
	private String description;

	// Null for non leaf item
	private String fieldName; 

	// For Leaf level item ,possible values are C,D,N representing String, Date, Number respectively Null for non leaf item
	private String fieldType; 

	// Null for non leaf item
	private String lookup; 

	private String toolName;

	private FlexSelectSelectionAllDTO itemSelections = new FlexSelectSelectionAllDTO();

	private FlexSelectSelectionExceptionDTO valueSelections = new FlexSelectSelectionExceptionDTO();

	private FlexSelectSelectionMatchDTO matchSelections = new FlexSelectSelectionMatchDTO();

	private Boolean cbField;

	private Boolean populated = false;

	private String reportType;

	private Long objectId;

	private String pickListOrderBy;

	private Boolean allowNullSelection = false;

	private Boolean isRequiredForExists = false;
	
	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	public String getKeyName() {
		return keyName;
	}

	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}

	public String getAliasName() {
		return aliasName;
	}

	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public String getLookup() {
		return lookup;
	}

	public void setLookup(String lookup) {
		this.lookup = lookup;
	}

	public String getToolName() {
		return toolName;
	}

	public void setToolName(String toolName) {
		this.toolName = toolName;
	}

	public Boolean getCbField() {
		return cbField;
	}

	public void setCbField(Boolean cbField) {
		this.cbField = cbField;
	}

	public Boolean getPopulated() {
		return populated;
	}

	public void setPopulated(Boolean populated) {
		this.populated = populated;
	}

	public String getReportType() {
		return reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
	}

	public Long getObjectId() {
		return objectId;
	}

	public void setObjectId(Long objectId) {
		this.objectId = objectId;
	}

	public String getPickListOrderBy() {
		return pickListOrderBy;
	}

	public void setPickListOrderBy(String pickListOrderBy) {
		this.pickListOrderBy = pickListOrderBy;
	}

	public Boolean getAllowNullSelection() {
		return allowNullSelection;
	}

	public void setAllowNullSelection(Boolean allowNullSelection) {
		this.allowNullSelection = allowNullSelection;
	}

	public Boolean getIsRequiredForExists() {
		return isRequiredForExists;
	}

	public void setIsRequiredForExists(Boolean isRequiredForExists) {
		this.isRequiredForExists = isRequiredForExists;
	}

	/**
	 *  'For 'C' type fields, if there is only one column such as 'Contract Name', ZipCode, CodeGroup, etc.
	 *   
	 * @return Boolean
	 */
	public Boolean getIsOneColumnOnly() {
		if (this.fieldName != null || this.fieldType != null) {
			if ("C".equals(this.fieldType)) {
				if (!(this.fieldName.contains(";"))) {
					return true;
				}
			}
		}
		return false;
	}

	public FlexSelectSelectionAllDTO getItemSelections() {
		return itemSelections;
	}

	public void setItemSelections(FlexSelectSelectionAllDTO itemSelections) {
		this.itemSelections = itemSelections;
	}

	public FlexSelectSelectionExceptionDTO getValueSelections() {
		return valueSelections;
	}

	public void setValueSelections(FlexSelectSelectionExceptionDTO valueSelections) {
		this.valueSelections = valueSelections;
	}

	public FlexSelectSelectionMatchDTO getMatchSelections() {
		return matchSelections;
	}

	public void setMatchSelections(FlexSelectSelectionMatchDTO matchSelections) {
		this.matchSelections = matchSelections;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		// Equality check on objectId is safe because the RptDictionary row
		// will always have an objectId
		Long objObjectId = null;
		if (!(obj instanceof FlexSelectionParamItemDTO)) {
			return false;
		} else {
			objObjectId = ((FlexSelectionParamItemDTO) obj).getObjectId();
		}
		return objectId.equals(objObjectId);
	}

	@Override
	public int hashCode() {
		return objectId.intValue();
	}

	public boolean rangeNotAllowed() {
		if ("W".equals(this.pickListOrderBy) // Week and Month
				|| "M".equals(this.pickListOrderBy)) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return this.getKeyName();
	}

}
