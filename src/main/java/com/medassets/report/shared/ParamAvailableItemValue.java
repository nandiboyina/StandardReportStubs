package com.medassets.report.shared;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * Created by IntelliJ IDEA.
 * User: pgoyal
 * Date: Sep 26, 2011
 * Time: 1:30:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class ParamAvailableItemValue implements IsSerializable {

    private Integer index;
    private String code = "";
    private String name;
    private int hashCode;

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String description) {
        this.name = description;
    }

    public String toString() {
        if (name == null) {
            return code;
        } else {
            return code + " " + name;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof ParamAvailableItemValue)) {
            return false;
        }

        // odd condition we're seeing some. Just assume false
        if (code == null && name == null) {
            return false;
        }

        if (hashCode == obj.hashCode()) {
            return true;
        }

        ParamAvailableItemValue that = (ParamAvailableItemValue) obj;

        return code.equals(that.getCode());

    }

    @Override
    public int hashCode() {
        if (hashCode == 0) {

            String hashString = code + name;

            hashCode = hashString.hashCode();

            if (index != null && name != null) {
                hashCode = index.hashCode() * code.hashCode() * name.hashCode();
            } else if (name != null) {
                hashCode = code.hashCode() * name.hashCode();
            } else {
                hashCode = code.hashCode();
            }
        }
        return hashCode;
    }
}
