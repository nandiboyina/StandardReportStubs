package com.medassets.report.shared;

import com.google.gwt.user.client.rpc.IsSerializable;

public class ReportLibraryDTO implements IsSerializable {

	private String name;
	private String description;
	private String createdBy;
	private String createdDate;
	private String modifiedBy;
	private String modifiedDate;
	private String template;

	public static enum FIELDS {
		NAME,
		DESCRIPTION,
		CREATED_BY,
		CREATED_DATE,
		MODIFIED_BY,
		MODIFIED_DATE,
		TEMPLATE;
	}
	
	public ReportLibraryDTO() {}
	
	public ReportLibraryDTO(String name, String description, String createdBy,
			String createdDate, String modifiedBy, String modifiedDate, String template) {
		this.setName(name);
		this.setDescription(description);
		this.setCreatedBy(createdBy);
		this.createdDate = createdDate;
		this.modifiedBy = modifiedBy;
		this.modifiedDate = modifiedDate;
		this.template = template;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	public Object getValue(FIELDS field) {
		switch (field) {
		case NAME:
			return getName();
		case DESCRIPTION:
			return getDescription();
		case CREATED_BY:
			return getCreatedBy();
		case CREATED_DATE:
			return getCreatedDate();
		case MODIFIED_BY:
			return getModifiedBy();
		case MODIFIED_DATE:
			return getModifiedDate();
		case TEMPLATE:
			return getTemplate();
		default:
			return null;
		}
	}
}
