package com.medassets.report.client.component;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.CloseEvent;
import com.google.gwt.event.logical.shared.CloseHandler;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PopupPanel;
import com.medassets.report.client.service.StandardService;
import com.medassets.report.client.service.StandardServiceAsync;
import com.medassets.report.shared.ParamAvailableItemValue;
import com.medassets.report.shared.ParamAvailableItems;
import com.medassets.report.shared.StandardParamItemDTO;

public class MASelector extends Hyperlink implements MAComponent {
    private static final StandardServiceAsync STANDARD_SERVICE = GWT.create(StandardService.class);
    //private static final Logger LOGGER = Logger.getLogger(MASelector.class.getName());
    private Label label;

    private boolean multiSelect = false;
    private boolean enableSelectAll;
    private boolean allSelected;

    private StandardParamItemDTO dto;

    private List<ParamAvailableItemValue> availableData;
    private List<ParamAvailableItemValue> selectedData;
    private ParamAvailableItemValue selectedItem;

    private SelectorDialog dialog;
    private boolean codeOnly;

    public MASelector(boolean multiSelect, MAComponent parent) {
        this.multiSelect = multiSelect;
        init(parent);
    }

    public MASelector() {
        init(null);
    }

    public MASelector(MAComponent parent) {
        init(parent);
    }

    public boolean isEnableSelectAll() {
        return enableSelectAll;
    }

    public void setEnableSelectAll(boolean enableSelectAll) {
        this.enableSelectAll = enableSelectAll;
    }

    public boolean isAllSelected() {
        return allSelected;
    }

    public void setAllSelected(boolean allSelected) {
        this.allSelected = allSelected;
        if (allSelected) {
            setText("All");
        }
    }

    private void init(MAComponent parent) {
        label = new Label();
        label.setWidth("100%");

        addHandler(createClickHandler(parent), ClickEvent.getType());
    }

    private ClickHandler createClickHandler(final MAComponent parent) {
        return new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                initializeDialog(parent);
            }
        };
    }

    private void initializeDialog(MAComponent parent) {
        if (multiSelect) {
            dialog = new MultiSelectorDialog();
        } else {
            dialog = new SingleSelectorDialog();
        }
        dialog.setTitle(label.getText());
        dialog.resetSearchText();
        dialog.center();
        dialog.addCloseHandler(new CloseHandler<PopupPanel>() {
            public void onClose(CloseEvent<PopupPanel> popupPanelCloseEvent) {
                handleSelectorClose();
            }
        }
        );

        loadData(parent);
    }

    private void loadData(MAComponent parent) {
        String lookupQuery = "";
        StandardParamItemDTO standardParamDTO = null;
        List<ParamAvailableItemValue> parentValue = null;
        String parentcode;
        if (dto.getParentParam() != null && parent != null) {
            lookupQuery = dto.getLookup();
            standardParamDTO = dto.getParentParam();
            parentValue = (List<ParamAvailableItemValue>) parent.getMAValue();
            if (parentValue.size() > 0) {
                parentcode = parentValue.get(0).getCode();
                parentcode = parentcode.replace("'", "''");
                lookupQuery = lookupQuery.replace(standardParamDTO.getParamName(), parentcode);
                dto.setLookup(lookupQuery);
            }

            /* if (LOGGER.isDebugEnabled()) {
                LOGGER.debug("Executing query for depended parameter based on the parent parameter selected value" + "Parent selected value is: " + standardParamDTO.getaValue() + "Lookup query modified is :" + dto.getLookup());
            }*/
        }
        STANDARD_SERVICE.getAvailableValuesForCBOorLIST(dto,
            new AsyncCallback<ParamAvailableItems>() {

                public void onFailure(Throwable caught) {

                    GWT.log("Exception: " + caught.getClass());

                    if (caught.getMessage().contains("html id=\"login")) {
                        // we've been redirected to the login page. Force a reload to properly load it.
                        Window.Location.reload();
                    }
                    GWT.log(caught.getMessage(), caught);
                    Window.alert(caught.getMessage());
                }

                public void onSuccess(ParamAvailableItems result) {
                    availableData = result.getParams();
                    codeOnly = result.isCodeOnly();

                    loadAndShow();

                }
            });

        if (dto.getParentParam() != null && parent != null) {
            if (!lookupQuery.equals("") && standardParamDTO != null && parentValue != null) {
                lookupQuery = lookupQuery.replace(parentValue.get(0).getCode(), standardParamDTO.getParamName());
            }
            dto.setLookup(lookupQuery);
        }

    }

    private void loadAndShow() {

        dialog.setSelectAllCheckBoxEnabled(enableSelectAll);
        dialog.setCodeOnly(codeOnly);

        if (enableSelectAll) {
            // * and ALL are in the DB sometimes and returned in the list. Remove them
            if (availableData != null) {
                ParamAvailableItemValue item = availableData.get(0);
                if (item != null) {
                    if (item.getCode().equals("All") || item.getCode().equals("*")) {
                        availableData.remove(item);
                    }
                }
            }

        }

        if (selectedData == null) {
            // this should only happen the first time the dialog is opened for a value
            // we have to convert the string or list<string> into the selected objects
            setSelectedData();
        }
        if (multiSelect) {
            dialog.setRowData(availableData, selectedData);
        } else {
            dialog.setRowData(availableData, selectedItem);
        }
        if (allSelected) {
            dialog.setAllSelected();
        }
        dialog.resetSearchText();
        dialog.center();
    }

    private void setSelectedData() {
        if (multiSelect) {

        } else {
            String selected = getText();
            for (ParamAvailableItemValue val : availableData) {
                if (selected.equals(val.getName())) {
                    selectedData = new ArrayList<ParamAvailableItemValue>();
                    selectedData.add(val);
                    return;
                }
            }
        }
    }

    private void handleSelectorClose() {
        if (!dialog.isCancelled()) {

            allSelected = dialog.isAllSelected();

            if (enableSelectAll && allSelected) {
                setText("All");
                selectedData = null;
            } else {
                getSelectedDataFromDialog();
            }
        }

    }

    @Override
    public void setText(String s) {
        super.setHTML("<U>" + s + "</U>");
    }

    private void getSelectedDataFromDialog() {

        if (multiSelect) {
            MultiSelectorDialog multiDlg = (MultiSelectorDialog) dialog;

            selectedData = multiDlg.getSelectedData();

            if (dialog.isSelectAllCheckBoxEnabled() && dialog.isAllSelected()) {
                setText("All");
            } else {

                if (selectedData.size() == 1) {
                    setMAValue(selectedData.get(0));
                } else {
                    setText(selectedData.size() + " selected");
                }
                if (availableData.size() == 0) {
                    setText("&lt;NONE&gt;");


                }
            }
        } else {
            SingleSelectorDialog singDlg = (SingleSelectorDialog) dialog;
            selectedItem = singDlg.getSelectedData();
            if (selectedItem == null || ((selectedItem.toString() == null))) {
                setText("&lt;NONE&gt;");
            } else {
                setText(selectedItem.toString());
            }
            if (availableData.size() == 0 && selectedItem != null) {
                setText("&lt;NONE&gt;");
                setMAValue("&lt;NONE&gt;");

            }
        }

    }

    @Override
    public void setDTO(Object dto) {
        this.dto = (StandardParamItemDTO) dto;
    }

    @Override
    public Object getDTO() {
        return dto;
    }

    @Override
    public void setMAValue(Object val) {
        if (allSelected) {
            setText("All");
        } else if (val != null && val.toString() != null && !val.toString().isEmpty()) {
            SafeHtmlBuilder builder = new SafeHtmlBuilder();
            builder.appendEscaped(val.toString());
            setText(builder.toSafeHtml().asString());
        } else {
            setText("&lt;NONE&gt;");
        }

        if (val != null) {

            if (multiSelect) {
                if (selectedData == null) {
                    selectedData = new ArrayList<ParamAvailableItemValue>();
                } else {
                    selectedData.clear();
                }
                selectedData.add((ParamAvailableItemValue) val);
            } else {
                selectedItem = (ParamAvailableItemValue) val;
            }
        }
    }

    public void setMAValues(List<ParamAvailableItemValue> items) {
        if (items.size() == 1) {
            setMAValue(items.get(0));
        } else {
            if (selectedData == null) {
                selectedData = new ArrayList<ParamAvailableItemValue>();
            }
            selectedData.addAll(items);
            setText(items.size() + " selected");
        }
    }

    @Override
    public Object getMAValue() {
        if (allSelected) {
            setAllValue();
        }

        if (multiSelect) {
            return selectedData;
        } else {
            ArrayList<ParamAvailableItemValue> rv = new ArrayList<ParamAvailableItemValue>();
            if (selectedItem != null && selectedItem.toString() != null) {
                rv.add(selectedItem);
            }
            return rv;
        }
    }

    private void setAllValue() {
        ParamAvailableItemValue val = new ParamAvailableItemValue();
        val.setCode("*");
        val.setName("All");
        if (selectedData == null) {
            selectedData = new ArrayList<ParamAvailableItemValue>();
        } else {
            selectedData.clear();
        }
        selectedData.add(val);
    }


    @Override
    public void setMALabel(String text) {
        label.setText(text);
    }

    @Override
    public Label getMALabel() {
        return label;
    }

    @Override
    public void setMATooltip(String tooltip) {
        setTitle(tooltip);
    }

    @Override
    public void setMAEnabled(boolean b) {
    }

    @Override
    public boolean isMARequired() {
        return false;
    }

    @Override
    public void setMARequired(boolean b) {

    }

    @Override
    public boolean isMAEmpty() {
        return false;
    }

    @Override
    public void setMAFocus() {
    }

}
