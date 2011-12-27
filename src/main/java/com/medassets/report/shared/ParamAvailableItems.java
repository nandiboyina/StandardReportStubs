package com.medassets.report.shared;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.IsSerializable;

public class ParamAvailableItems implements IsSerializable {


    boolean codeOnly;
    ArrayList<ParamAvailableItemValue> params;

    public boolean isCodeOnly() {
        return codeOnly;
    }

    public void setCodeOnly(boolean codeOnly) {
        this.codeOnly = codeOnly;
    }

    public ArrayList<ParamAvailableItemValue> getParams() {
        return params;
    }

    public void setParams(ArrayList<ParamAvailableItemValue> params) {
        this.params = params;
    }


}
