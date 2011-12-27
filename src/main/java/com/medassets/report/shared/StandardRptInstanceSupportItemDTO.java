package com.medassets.report.shared;

import com.google.gwt.user.client.rpc.IsSerializable;

public class StandardRptInstanceSupportItemDTO implements IsSerializable {
    private Long folderID;
    private String creatingUser;
    private String modifyingUser;
    private String rptInstanceName;
    private String rptInstanceDescription;
    private char published;
    private String subTitleName;
    private Long templateID;
    private Long instanceID;


    public Long getFolderID() {
        return folderID;
    }

    public void setFolderID(Long folderID) {
        this.folderID = folderID;
    }

    public String getCreatingUser() {
        return creatingUser;
    }

    public void setCreatingUser(String creatingUser) {
        this.creatingUser = creatingUser;
    }

    public String getModifyingUser() {
        return modifyingUser;
    }

    public void setModifyingUser(String modifyingUser) {
        this.modifyingUser = modifyingUser;
    }

    public String getRptInstanceName() {
        return rptInstanceName;
    }

    public void setRptInstanceName(String rptInstanceName) {
        this.rptInstanceName = rptInstanceName;
    }

    public String getRptInstanceDescription() {
        return rptInstanceDescription;
    }

    public void setRptInstanceDescription(String rptInstanceDescription) {
        this.rptInstanceDescription = rptInstanceDescription;
    }

    public char getPublished() {
        return published;
    }

    public void setPublished(char published) {
        this.published = published;
    }

    public String getSubTitleName() {
        return subTitleName;
    }

    public void setSubTitleName(String subTitleName) {
        this.subTitleName = subTitleName;
    }

    public long getTemplateID() {
            return templateID;  //To change body of created methods use File | Settings | File Templates.
    }

    public void setTemplateID(Long templateID) {
        this.templateID = templateID;
    }

    public Long getInstanceID() {
        return instanceID;
    }

    public void setInstanceID(Long instanceID) {
        this.instanceID = instanceID;
    }
}
