package com.medassets.report.client.component;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiFactory;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.view.client.MultiSelectionModel;
import com.google.gwt.view.client.SelectionChangeEvent;
import com.medassets.report.client.other.HorizontalFlowPanel;
import com.medassets.report.shared.ParamAvailableItemValue;

public class MultiSelectorDialog extends SelectorDialog {

    interface MultiSelectorDialogUiBinder extends UiBinder<MultiSelectorDialog, MultiSelectorDialog> {
    }

    private static MultiSelectorDialogUiBinder ourUiBinder = GWT.create(MultiSelectorDialogUiBinder.class);


    @UiField(provided = true)
    CellTable<ParamAvailableItemValue> selectedTable;

    @UiField
    Button addButton;
    @UiField
    Button removeButton;
    @UiField
    Button addAllButton;
    @UiField
    Button removeAllButton;

    @UiField
    Label selectedCount;

    @UiField
    ScrollPanel selectScrollPanel;
    @UiField
    HorizontalFlowPanel selectedCountPanel;

    @UiField
    HTMLPanel buttonPanel;


    /**
     * Data selected (if all is not selected).
     */
    protected List<ParamAvailableItemValue> selectedData;

    /**
     * Selection model for the right column. Always multiselect.
     */
    protected MultiSelectionModel<ParamAvailableItemValue> selectedSelectionModel;


    public MultiSelectorDialog() {
        super();
        selectedData = new ArrayList<ParamAvailableItemValue>();
        selectedTable = new CellTable<ParamAvailableItemValue>();

        ourUiBinder.createAndBindUi(this);

        setupSelection();

        setupSelectorButtons();

    }


    private void setupSelectorButtons() {
        // set initial state
        addButton.setEnabled(false);
        removeButton.setEnabled(false);
        removeAllButton.setEnabled(false);
    }

    @UiFactory
    protected MultiSelectorDialog createDialog() {
        return this;
    }


    @UiHandler("removeAllButton")
    public void handleRemoveAllClick(ClickEvent e) {
        availableData.addAll(selectedData);

        if (filteredData == null) {
            setData(availableData, availableTable);
        } else {
            filteredData.addAll(selectedData);
            setData(filteredData, availableTable);
        }
        selectedData.clear();
        setData(selectedData, selectedTable);

        // removing items from the list doesn't unselect them in the selection model
        selectedSelectionModel.clear();

        setButtonState();
        updateTotals();
    }

    @UiHandler("addAllButton")
    public void onAddAllClick(ClickEvent clickEvent) {
        if (filteredData == null) {
            selectedData.addAll(availableData);

            availableData.clear();
            setData(availableData, availableTable);
        } else {
            selectedData.addAll(filteredData);

            availableData.removeAll(filteredData);
            filteredData.clear();
            setData(filteredData, availableTable);
        }
        setData(selectedData, selectedTable);

        // removing items from a list doesn't unselect them in the selection model
        ((MultiSelectionModel<ParamAvailableItemValue>) availableSelectionModel).clear();

        setButtonState();
        updateTotals();
    }


    @UiHandler("removeButton")
    public void onRemoveButtonClick(ClickEvent event) {
        Set<ParamAvailableItemValue> rows = selectedSelectionModel.getSelectedSet();
        selectedData.removeAll(rows);
        selectedSelectionModel.clear();
        setData(selectedData, selectedTable);

        availableData.addAll(rows);

        if (filteredData == null) {
            setData(availableData, availableTable);
        } else {
            filteredData.addAll(rows);
            setData(filteredData, availableTable);
        }

        setButtonState();
        updateTotals();
    }


    @UiHandler("addButton")
    public void onAddButtonClick(ClickEvent event) {
        Set<ParamAvailableItemValue> selectedRows
            = ((MultiSelectionModel<ParamAvailableItemValue>) availableSelectionModel).getSelectedSet();

        ((MultiSelectionModel<ParamAvailableItemValue>) availableSelectionModel).clear();

        selectedData.addAll(selectedRows);
        setData(selectedData, selectedTable);

        availableData.removeAll(selectedRows);

        if (filteredData == null) {
            setData(availableData, availableTable);
        } else {
            filteredData.removeAll(selectedRows);
            setData(filteredData, availableTable);
        }

        setButtonState();
        updateTotals();
    }

    @UiHandler("selectAllCheckBox")
    public void onSelectAllValueChange(ValueChangeEvent<Boolean> event) {
        if (!event.getValue()) {
            availableData.addAll(selectedData);
            selectedData.clear();

            selectedSelectionModel.clear();
            ((MultiSelectionModel<ParamAvailableItemValue>) availableSelectionModel).clear();

            setData(selectedData, selectedTable);
            selectedTable.setSelectionModel(selectedSelectionModel);
        }
        super.onSelectAllValueChange(event);
        updateTotals();
        setButtonState();
    }

    @UiHandler("okButton")
    public void onOkButtonClick(ClickEvent event) {
        // if select all is chosen make sure we restore availabledata
        if (selectAllCheckBox.getValue()) {
            if (selectedData != null) {
                availableData.addAll(selectedData);
            }
            selectedData = null;
        }
        super.onOkButtonClick(event);
    }


    /**
     * Set the data and setup the dialog for a one column data set.
     *
     * @param availableDataItems available data items. Final because we don't want to change the list.
     * @param selectedDataItems  selected
     */
    @Override
    public void setRowData(final List<ParamAvailableItemValue> availableDataItems, List<ParamAvailableItemValue> selectedDataItems) {

        if (selectedDataItems != null) {
            // removed the selected items by code
            List<ParamAvailableItemValue> remove = new ArrayList<ParamAvailableItemValue>();
            for (ParamAvailableItemValue removeItem : selectedDataItems) {
                for (ParamAvailableItemValue p : availableDataItems) {
                    if (p.getCode() != null && p.getCode().equals(removeItem.getCode())) {
                        remove.add(p);
                    }
                }
            }
            availableDataItems.removeAll(remove);
        } else {
        }

        super.setRowData(availableDataItems);

        setupSelectColumn();

        if (selectedDataItems == null) {
            selectedData = new ArrayList<ParamAvailableItemValue>();
        } else {
            selectedData = new ArrayList<ParamAvailableItemValue>(selectedDataItems);
        }
        setData(selectedData, selectedTable);

        updateTotals();
    }

    /**
     * Only used in singleSelect. Having the second parameter be Object instead would get rid of this.
     *
     * @param availableDataItems
     * @param selectedItem
     */
    public void setRowData(final List<ParamAvailableItemValue> availableDataItems, ParamAvailableItemValue selectedItem) {
    }

    /**
     * Gets the currently selected data. Single select mode just returns a 1 item list.
     *
     * @return List<ParamAvailableItemValue> list of selected items
     */
    public List<ParamAvailableItemValue> getSelectedData() {
        return selectedData;
    }


    @Override
    public void doSelectAll() {
        super.doSelectAll();

        selectedData.addAll(availableData);
        availableData.clear();

        setData(selectedData, selectedTable);
        selectedTable.setSelectionModel(null);

        availableTable.setSelectionModel(null);
        setData(availableData, availableTable);

        filteredData = null;

        setButtonState();
        updateTotals();
    }

    @Override
    protected void setupAvailableSelectionModel() {
        // Add a selection model to handle user selection.
        availableSelectionModel = new MultiSelectionModel<ParamAvailableItemValue>();

        availableSelectionModel.addSelectionChangeHandler(new SelectionChangeEvent.Handler() {
            public void onSelectionChange(SelectionChangeEvent selectionChangeEvent) {
                setButtonState();
            }
        });
        super.setupAvailableSelectionModel();
    }

    protected void setupSelectedSelectionModel() {
        // Add a selection model to handle user selection.
        selectedSelectionModel = new MultiSelectionModel<ParamAvailableItemValue>();
        selectedTable.setSelectionModel(selectedSelectionModel);

        selectedSelectionModel.addSelectionChangeHandler(new SelectionChangeEvent.Handler() {
            public void onSelectionChange(SelectionChangeEvent selectionChangeEvent) {
                setButtonState();
            }
        });
    }


    protected void setButtonState() {
        if (selectAllCheckBox.getValue()) {
            addAllButton.setEnabled(false);
            addButton.setEnabled(false);
            removeAllButton.setEnabled(false);
            removeButton.setEnabled(false);
        } else {
            addAllButton.setEnabled(availableTable.getRowCount() > 0);
            removeAllButton.setEnabled(selectedTable.getRowCount() > 0);
            removeButton.setEnabled(selectedSelectionModel.getSelectedSet().size() > 0);

            Set selected = ((MultiSelectionModel<ParamAvailableItemValue>) availableSelectionModel).getSelectedSet();
            addButton.setEnabled(selected.size() > 0);
        }
        okButton.setEnabled(selectedTable.getRowCount() > 0);

    }

    protected void updateTotals() {
        super.updateTotals();
        if (selectAllCheckBoxEnabled && selectAllCheckBox.getValue()) {
            selectedCount.setText(String.valueOf(selectedData.size()));
        } else {
            selectedCount.setText(String.valueOf(selectedData.size()));
        }
    }

    @Override
    protected void setupSelection() {
        super.setupSelection();
        setupSelectedSelectionModel();
    }


    private void setupSelectColumn() {
        selectedTable.setWidth("100%");

        setupCodeColumn(selectedTable);
        if (!codeOnly) {
            setupDescriptionColumn(selectedTable);
        }
    }
}
