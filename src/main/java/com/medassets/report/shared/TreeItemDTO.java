package com.medassets.report.shared;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.user.client.rpc.IsSerializable;

public class TreeItemDTO implements IsSerializable {

    private int type = 0;
    private String name;
    private String category;
    private Long ObjectId ;
    private Long parentFolderId;
    private TreeItemDTO parent;

	private List<TreeItemDTO> children = new ArrayList<TreeItemDTO>();

    public TreeItemDTO() {
    }

    public TreeItemDTO(String name, int type) {
        this.name = name;
        this.type = type;
    }

    public TreeItemDTO(String name, List<TreeItemDTO> children) {
        this.name = name;
        this.setChildren(children);
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName();
    }

    public void setType(int type) {
        this.type = type;
        if (children != null) {
            for (TreeItemDTO dto : children) {
                dto.setType(type);
            }
        }
    }

    public int getType() {
        return this.type;
    }

	public List<TreeItemDTO> getChildren() {
		return children;
	}

	public void setChildren(List<TreeItemDTO> children) {
		this.children = children;
	}
	
	public void addChild(TreeItemDTO dto) {
		children.add(dto);
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public TreeItemDTO clone() {
		TreeItemDTO dto = new TreeItemDTO();
		dto.setCategory(this.getCategory());
		dto.setChildren(this.getChildren());
		dto.setName(this.getName());
		dto.setType(this.getType());
		return dto;
	}

    public Long getObjectId() {
		return ObjectId;
	}

	public void setObjectId(Long objectId) {
		ObjectId = objectId;
	}

    public Long getParentFolderId() {
        return parentFolderId;
    }

    public void setParentFolderId(Long parentFolderId) {
        this.parentFolderId = parentFolderId;
    }

    public TreeItemDTO getParent() {
        return parent;
    }

    public void setParent(TreeItemDTO parent) {
        this.parent = parent;
    }
}
