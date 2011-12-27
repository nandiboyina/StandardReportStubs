package com.medassets.report.shared;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * Created by IntelliJ IDEA.
 * User: pgoyal
 * Date: Oct 5, 2011
 * Time: 12:08:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class CrystalViewerSupportItemDTO implements IsSerializable {

    private Long reportTemplateID;
    private String user;
    private String password;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getReportTemplateID() {
        return reportTemplateID;
    }

    public void setReportTemplateID(Long reportTemplateID) {
        this.reportTemplateID = reportTemplateID;
    }
}
