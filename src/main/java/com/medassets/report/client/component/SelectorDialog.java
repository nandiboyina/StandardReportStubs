package com.medassets.report.client.component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.HasKeyboardSelectionPolicy;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.view.client.SelectionModel;
import com.medassets.report.shared.ParamAvailableItemValue;


/**
 * Selection dialog that handles both multiple and single select. Search to provide an aid for finding
 * entries in large lists.
 */
public abstract class SelectorDialog extends DialogBox implements HasWidgets {

    public boolean codeOnly;

    public void setCodeOnly(boolean codeOnly) {
        this.codeOnly = codeOnly;
    }

    public boolean isCodeOnly() {
        return codeOnly;
    }

    public void resetSearchText() {
        search.setText("");
    }


    @UiField(provided = true)
    CellTable<ParamAvailableItemValue> availableTable;
    // Buttons

    @UiField
    Button okButton;
    @UiField
    Button cancelButton;

    // Search

    @UiField
    TextBox search;
    @UiField
    ListBox criteria;

    // Totals

    @UiField
    Label availableCount;
    @UiField
    CheckBox selectAllCheckBox;

    // Panels

    @UiField
    LayoutPanel mainPanel;
    @UiField
    ScrollPanel availableScrollPanel;

    /**
     * Full List of data
     */
    protected List<ParamAvailableItemValue> availableData;

    /**
     * When searching show only a subset is displayed using this list.
     */
    protected List<ParamAvailableItemValue> filteredData;

    /**
     * Selection model for the left column. Only column in single select mode.
     */
    protected SelectionModel<ParamAvailableItemValue> availableSelectionModel;

    boolean selectAllCheckBoxEnabled = false;

    private boolean cancelled;

    private String lastSearchText = "";


    public SelectorDialog() {

        availableTable = new CellTable<ParamAvailableItemValue>();

        availableData = new ArrayList<ParamAvailableItemValue>();

        setText("Selector");

        setAnimationEnabled(true);
        setGlassEnabled(true);

    }


    @UiHandler("cancelButton")
    public void onCancelButtonClick(ClickEvent clickEvent) {
        cancelled = true;
        hide();
    }

    @UiHandler("criteria")
    public void onCriteriaChange(ChangeEvent changeEvent) {
        filterView(search.getText());
    }


    @UiHandler("search")
    public void onSearchKeyUp(KeyUpEvent event) {
        if (event.getNativeKeyCode() == KeyCodes.KEY_ESCAPE) {
            search.setText("");
        }
        search();
    }


    abstract public void setRowData(final List<ParamAvailableItemValue> availableDataItems, ParamAvailableItemValue selectedItem);

    abstract public void setRowData(final List<ParamAvailableItemValue> availableDataItems, List<ParamAvailableItemValue> selectedItems);

    /**
     * Set the data and setup the dialog for a one column data set.
     *
     * @param availableDataItems available data items. Final because we don't want to change the list.
     */
    public void setRowData(final List<ParamAvailableItemValue> availableDataItems) {

        availableData = new ArrayList<ParamAvailableItemValue>(availableDataItems);

        setData(availableData, availableTable);

        setupAvailableColumn();
    }

    /**
     * Gets the dialog canceled flat.
     *
     * @return true if the dialog was closed by cancel and not OK
     */
    public boolean isCancelled() {
        return cancelled;
    }

    /**
     * Sets the title bar text of the dialog.
     *
     * @param title text to display
     */
    public void setTitle(String title) {
        setText("Select: " + title);
    }


    public boolean isSelectAllCheckBoxEnabled() {
        return selectAllCheckBoxEnabled;
    }

    public void setAllSelected() {
        selectAllCheckBox.setValue(true);
        doSelectAll();
    }

    public boolean isAllSelected() {
        return selectAllCheckBox.getValue();
    }

    /**
     * Enables/disables selectAll mode.
     *
     * @param state
     */
    public void setSelectAllCheckBoxEnabled(boolean state) {
        selectAllCheckBoxEnabled = state;
        selectAllCheckBox.setEnabled(state);
        selectAllCheckBox.setVisible(state);
    }

    private String getSearchString(ParamAvailableItemValue row) {
        String code = row.getCode() == null? "" : row.getCode();
        String description = row.getName() == null? "" : row.getName();
        return code + " " + description;
    }

    private void setupAvailableColumn() {
        availableTable.setWidth("100%");
        // Setup the available list
        setupCodeColumn(availableTable);
        if (!codeOnly) {
            setupDescriptionColumn(availableTable);
        }
    }

    protected void setupDescriptionColumn(CellTable<ParamAvailableItemValue> table) {
        TextColumn<ParamAvailableItemValue> col = new TextColumn<ParamAvailableItemValue>() {
            @Override
            public String getValue(ParamAvailableItemValue s) {
                return s.getName();
            }
        };

        table.addColumn(col);
        table.setColumnWidth(col, "100%");
    }

    protected void setupCodeColumn(CellTable<ParamAvailableItemValue> table) {
        TextColumn<ParamAvailableItemValue> col = new TextColumn<ParamAvailableItemValue>() {
            @Override
            public String getValue(ParamAvailableItemValue s) {
                return s.getCode();
            }
        };

        table.addColumn(col);
        if (codeOnly) {
            table.setColumnWidth(col, "100%");
        } else {
            table.setColumnWidth(col, "15px");
        }
    }

    public void onOkButtonClick(ClickEvent event) {
        hide();
    }


    public void onSelectAllValueChange(ValueChangeEvent<Boolean> event) {
        if (event.getValue()) {
            doSelectAll();
        } else {
            setData(availableData, availableTable);

            availableTable.setSelectionModel(availableSelectionModel);
            search.setEnabled(true);
            criteria.setEnabled(true);
            resetAvailable();
            lastSearchText = "";
            setButtonState();
        }
    }

    protected abstract void setButtonState();


    public void doSelectAll() {
        availableTable.setSelectionModel(null);
        okButton.setEnabled(true);

        // clear the search field
        search.setText("");
        search.setEnabled(false);
        criteria.setEnabled(false);
    }

    protected void setData(List<ParamAvailableItemValue> data, CellTable<ParamAvailableItemValue> cellList) {
        Collections.sort(data, new Comparator<ParamAvailableItemValue>() {

            // check for nulls then compare
            public int compare(ParamAvailableItemValue a, ParamAvailableItemValue b) {

                return a == null ?
                    (b == null ? 0 : Integer.MIN_VALUE) :
                    (b == null ? Integer.MAX_VALUE : compareCodes(a.getCode(), b.getCode()));
            }

            public int compareCodes(String a, String b) {
                return a == null ?
                    (b == null ? 0 : Integer.MIN_VALUE) :
                    (b == null ? Integer.MAX_VALUE : a.compareToIgnoreCase(b));
            }
        });

        cellList.setRowData(data);
    }


    protected void setupSelection() {
        setupAvailableSelectionModel();
    }


    protected void setupAvailableSelectionModel() {
        availableTable.setKeyboardSelectionPolicy(HasKeyboardSelectionPolicy.KeyboardSelectionPolicy.ENABLED);
        availableTable.setSelectionModel(availableSelectionModel);
    }


    private void search() {
        final Vector<String> searchVector = new Vector<String>();

        searchVector.add(search.getText());

        if (searchVector.size() > 1) {
            return;
        }

        Timer t = new Timer() {
            public void run() {
                if (searchVector.size() > 0) {
                    String txt = searchVector.lastElement();
                    searchVector.removeAllElements();
                    if (txt != null) {
                        if ((txt.contains(lastSearchText) || lastSearchText.startsWith(txt)) && !txt.equals("")) {
                            filterView(txt);
                        } else {
                            resetAvailable();
                        }
                        lastSearchText = txt;
                    }
                }
            }
        };
        t.schedule(700);
    }

    protected void updateTotals() {
        availableCount.setText(String.valueOf(availableTable.getRowCount()));
    }

    protected void resetAvailable() {
        setData(availableData, availableTable);
        filteredData = null;
        updateTotals();
    }

    private void filterView(String filterString) {
        filteredData = new ArrayList<ParamAvailableItemValue>();

        for (ParamAvailableItemValue row : availableData) {
            if (criteria.getSelectedIndex() == 0) {
                if (getSearchString(row).toUpperCase().startsWith(filterString.toUpperCase())) {
                    filteredData.add(row);
                }
            } else {
                if (getSearchString(row).toUpperCase().contains(filterString.toUpperCase())) {
                    filteredData.add(row);
                }
            }
        }

        setData(filteredData, availableTable);
        updateTotals();
    }

}
