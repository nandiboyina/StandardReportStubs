package com.medassets.report.client.component;

import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiFactory;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.view.client.SelectionChangeEvent;
import com.google.gwt.view.client.SingleSelectionModel;
import com.medassets.report.shared.ParamAvailableItemValue;

public class SingleSelectorDialog extends SelectorDialog {

    interface SingleSelectorDialogUiBinder extends UiBinder<SingleSelectorDialog, SingleSelectorDialog> {
    }

    private static SingleSelectorDialogUiBinder ourUiBinder = GWT.create(SingleSelectorDialogUiBinder.class);


    private ParamAvailableItemValue singleSelectItem;


    public SingleSelectorDialog() {
        super();
        ourUiBinder.createAndBindUi(this);
        setupSelection();
    }

    @UiFactory
    protected SingleSelectorDialog createDialog() {
        return this;
    }


    @UiHandler("okButton")
    public void onOkButtonClick(ClickEvent event) {
        super.onOkButtonClick(event);
    }

    @UiHandler("selectAllCheckBox")
    public void onSelectAllValueChange(ValueChangeEvent<Boolean> event) {
        if (event.getValue()) {
            resetAvailable();
            okButton.setEnabled(true);
        } else {
            okButton.setEnabled(true);
            availableSelectionModel.setSelected(availableData.get(0), true);
        }
        super.onSelectAllValueChange(event);
    }


    /**
     * Set the data and setup the dialog for a one column data set.
     *
     * @param availableDataItems available data items. Final because we don't want to change the list.
     * @param selectedItem       selected
     */
    public void setRowData(final List<ParamAvailableItemValue> availableDataItems, ParamAvailableItemValue selectedItem) {

        super.setRowData(availableDataItems);
        singleSelectItem = selectedItem;

        if (singleSelectItem != null) {
            availableSelectionModel.setSelected(singleSelectItem, true);
        }
        updateTotals();
    }

    public void setRowData(final List<ParamAvailableItemValue> availableDataItems, List<ParamAvailableItemValue> selectedItem) {
    }

    /**
     * Gets the currently selected data. Single select mode just returns a 1 item list.
     *
     * @return List<ParamAvailableItemValue> list of selected items
     */
    public ParamAvailableItemValue getSelectedData() {
        return singleSelectItem;
    }


    @Override
    protected void setupAvailableSelectionModel() {
        availableSelectionModel = new SingleSelectionModel<ParamAvailableItemValue>();
        availableSelectionModel.addSelectionChangeHandler(new SelectionChangeEvent.Handler() {
            public void onSelectionChange(SelectionChangeEvent event) {
                singleSelectItem = ((SingleSelectionModel<ParamAvailableItemValue>) availableSelectionModel).getSelectedObject();
                if (singleSelectItem != null) {
                    okButton.setEnabled(true);
                }
            }
        });

        super.setupAvailableSelectionModel();
    }

    protected void setButtonState() {
        // no op for single select
    }

}
