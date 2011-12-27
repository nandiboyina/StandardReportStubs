package com.medassets.report.client.component;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.medassets.report.shared.ParamAvailableItemValue;

/**
 * A widget that presents a list of choices to the user, either as a list box or
 * as a drop-down list.
 */
public class MAListBox extends ListBox implements MAComponent {

    /**
     * Start of MAComponent attributes...
     */
    Label label; // Used in forms
    Object dto; // DTO (parameter) this component represents (this attibute is not always used)
    boolean required; // Determines if this component requires a value in it (used in forms)
    /**
     * End of MAComponent attributes...
     */

    // Objects that are reflected in the list
    List<ParamAvailableItemValue> data = new ArrayList<ParamAvailableItemValue>();

    public MAListBox() {
        init();
    }

    public MAListBox(boolean isMultipleSelect) {
        super(isMultipleSelect);
        init();
        if (isMultipleSelect) {
            setVisibleItemCount(10);
        }
    }

    private void init() {
        label = new Label();
        setWidth("100%");
    }

    /**
     * Select a value (code) in the ParamAvailableItemValue list.
     *
     * @param code
     */
    @Override
    public void setMAValue(Object code) {
        for (int i = 0; i < data.size(); i++) {
            ParamAvailableItemValue paiv = data.get(i);
            if (paiv.getCode().equals(code == null ? "" : code.toString())) {
                setSelectedIndex(i);
                break;
            }
        }
    }

    /**
     * Return a comma delimited string of selected ParamAvailableItemValue.codes.
     *
     * @return
     */
    @Override
    public Object getMAValue() {
        List<ParamAvailableItemValue> selectedItems = getSelectedItems();
        /*    StringBuilder returnValue = new StringBuilder();
      for (ParamAvailableItemValue val : selectedItems) {
        *//*  if (val.getCode().equals("ALL")) {
                return val.getCode();
            }
            if (selectedItems.size() > 1) {
                returnValue.append("\"");
            }*//*

            returnValue.append(val.getCode());
            if (selectedItems.size() > 1) {
                returnValue.append("\",");
            }
        }*/
        //  return returnValue.substring(0, returnValue.length() - 1);
        return selectedItems; // change to just return the list of items selected
    }

    /**
     * Return the selected ParamAvailableItemValues.
     *
     * @return
     */
    public List<ParamAvailableItemValue> getSelectedItems() {
        List<ParamAvailableItemValue> selectedItems = new ArrayList<ParamAvailableItemValue>();
        if (isMultipleSelect()) {
            for (int i = 0; i < getItemCount(); i++) {
                if (isItemSelected(i)) {
                    selectedItems.add(data.get(i));
                }
            }
            return selectedItems;
        } else if (getSelectedIndex() > -1) {
            selectedItems.add(data.get(getSelectedIndex()));
        }
        return selectedItems;
    }

    /**
     * Set label text (used in forms)
     *
     * @param text
     */
    @Override
    public void setMALabel(String text) {
        this.label.setText(text);
    }

    @Override
    public Label getMALabel() {
        return this.label;
    }

    /**
     * Add a list of ParamAvailableItemValues to the list. (for single-select)
     *
     * @param data
     * @param defaultCode - If the defaultCode is found - selected it
     */
    public void setMAData(List<ParamAvailableItemValue> data, String defaultCode) {
        for (ParamAvailableItemValue param : data) {
            addMAItem(param);
        }
        setMAValue(defaultCode);
        // If default was not found, select the first item in the list...
        if (getSelectedIndex() < 0 && getItemCount() > 0) {
            setSelectedIndex(0);
        }
    }

    /**
     * Add a list of ParamAvailableItemValues to the list. (for multi-select)
     *
     * @param data
     * @param defaultCodeList - Multi-select the default codes
     */
    public void setMAData(List<ParamAvailableItemValue> data, List<String> defaultCodeList) {
        for (ParamAvailableItemValue param : data) {
            addMAItem(param);
            if (defaultCodeList.contains(param.getCode())) {
                //   setSelectedIndex(getItemCount()-1);
                setItemSelected(getItemCount() - 1, true);
            }
        }
        // If default was not found, select the first item in the list...
        if (getSelectedIndex() < 0 && getItemCount() > 0) {
            setSelectedIndex(0);
        }
    }

    /**
     * Add a single item to the list.
     *
     * @param code
     * @param label
     */
    public void addMAItem(String code, String label) {
        ParamAvailableItemValue param = new ParamAvailableItemValue();
        param.setCode(code);
        param.setName(label);
        addMAItem(param);
    }

    /**
     * Add a single item to the list.
     *
     * @param val
     */
    public void addMAItem(ParamAvailableItemValue val) {
        data.add(val);
        if (val.getName() != null) {
            addItem(val.getName());
        } else {
            addItem(val.getCode() + " " + val.getName());
        }
    }

    /**
     * Remove all items from the list.
     */
    @Override
    public void clear() {
        super.clear();
        data.clear();
    }

    /**
     * In the event you would like to associate a DTO with this component.
     *
     * @param dto
     */
    @Override
    public void setDTO(Object dto) {
        this.dto = dto;
    }

    @Override
    public Object getDTO() {
        return this.dto;
    }

    @Override
    public void setMATooltip(String tooltip) {
        label.setTitle(tooltip);
        this.setTitle(tooltip);
    }

    @Override
    public void setMARequired(boolean b) {
        this.required = b;
    }

    @Override
    public boolean isMARequired() {
        return this.required;
    }

    @Override
    public boolean isMAEmpty() {
        return this.getMAValue() == null;
    }

    @Override
    public void setMAFocus() {
        this.setFocus(true);
    }

    @Override
    public void setMAEnabled(boolean b) {
        this.setEnabled(b);
    }
}
