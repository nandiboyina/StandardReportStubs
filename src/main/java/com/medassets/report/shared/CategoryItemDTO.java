package com.medassets.report.shared;

import java.util.List;

import com.google.gwt.user.client.rpc.IsSerializable;

public class CategoryItemDTO implements IsSerializable {

    private String code;
    private String description;
    private List<CategoryItemDTO> children;
    
    public CategoryItemDTO(){}
    public CategoryItemDTO(String code) {
    	this.code = code;
    }
    
    public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<CategoryItemDTO> getChildren() {
		return children;
	}

	public void setChildren(List<CategoryItemDTO> children) {
		this.children = children;
	}
}
