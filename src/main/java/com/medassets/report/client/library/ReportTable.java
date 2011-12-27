package com.medassets.report.client.library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import com.google.gwt.cell.client.ButtonCell;
import com.google.gwt.cell.client.Cell;
import com.google.gwt.cell.client.DateCell;
import com.google.gwt.cell.client.FieldUpdater;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.ColumnSortEvent;
import com.google.gwt.user.cellview.client.SimplePager;
import com.google.gwt.user.cellview.client.SimplePager.TextLocation;
import com.google.gwt.user.cellview.client.TextColumn;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ListDataProvider;
import com.google.gwt.view.client.SelectionChangeEvent;
import com.google.gwt.view.client.SingleSelectionModel;
import com.medassets.report.client.component.MAWindowAlert;
import com.medassets.report.client.component.MAWindowCallback;
import com.medassets.report.client.flex.FlexReportDialog;
import com.medassets.report.client.service.MainService;
import com.medassets.report.client.service.MainServiceAsync;
import com.medassets.report.client.standard.StandardReportDialog;
import com.medassets.report.shared.ReportItemDTO;
import com.medassets.report.shared.ReportItemDTO.FIELDS;
import com.medassets.report.shared.TreeItemDTO;

/**
 * Displays report templates and instances.
 *
 * @author tcerasuolo
 */
public class ReportTable extends Composite {

    private static final int PAGE_SIZE = 100;

    // Columns that can be displayed in the table
    // TODO: localize
    final TableColumn[] COLUMNS = {
        new TableColumn(FIELDS.NAME, "Name", 0, 1, 2),
        new TableColumn(FIELDS.TEMPLATE_NAME, "Template", 1, 2),
        new TableColumn(FIELDS.CREATED_CODE, "Created By", 1, 2),
        new TableColumn(FIELDS.CREATED_DATE, "Created Date", 1, 2),
        new TableColumn(FIELDS.MODIFIED_CODE, "Modified By", 1, 2),
        new TableColumn(FIELDS.MODIFIED_DATE, "Modified Date", 1, 2)
    };

    private Main mainPanel;

    // Reference to the real cellTable columns. Since columns are added/removed
    // from the table depending on the view, this is a good way to still reference them
    Column[] columnRefs = new Column[COLUMNS.length];

    // Quick map from cellTable column to our own custom TableColumn
    Map<Column, TableColumn> columnMap = new HashMap<Column, TableColumn>();

    // Backend service for getting data
    final MainServiceAsync service = GWT.create(MainService.class);

    TreeItemDTO treeItem;
    ReportItemDTO selectedDto;
    boolean firstTimeFlag;

    CellTable<ReportItemDTO> cellTable;
    ListDataProvider<ReportItemDTO> provider;

    // Data structures to hold the data.
    List<ReportItemDTO> allData = new ArrayList<ReportItemDTO>(); // all reports from db
    List<ReportItemDTO> viewData = new ArrayList<ReportItemDTO>(); // subset of allData

    // Styling and binding...
    static ReportTableUiBinder uiBinder = GWT.create(ReportTableUiBinder.class);

    interface ReportTableUiBinder extends UiBinder<Widget, ReportTable> {
    }

    interface TableStyle extends CellTable.Style {
    }

    interface TableResources extends CellTable.Resources {
        @Source("../resources/CellTable.css")
        TableStyle cellTableStyle();
    }

    @UiField
    ScrollPanel scrollPanel;
    SimplePager simplePager;
    @UiField
    HTMLPanel pagerPanel;
    @UiField
    FlowPanel buttonPanel;
    @UiField
    TextBox searchField;

    Button editTB;
    Button deleteTB;

    StandardReportDialog standardReport;
    FlexReportDialog flexReport;

    String lastSearchText = "";

    int lastSortColumn;
    boolean lastSortAscending = true;

    Vector<String> searchVector = new Vector<String>();
    SingleSelectionModel<ReportItemDTO> selectionModel;

    public ReportTable() {
        initWidget(uiBinder.createAndBindUi(this));
        setupTable();
        setupToolbarButtons();
    }

    private void setupTable() {
        CellTable.Resources resources = GWT.create(TableResources.class);
        cellTable = new CellTable<ReportItemDTO>(PAGE_SIZE, resources);
        cellTable.setWidth("100%");

        cellTable.addColumnSortHandler(new ColumnSortEvent.Handler() {
            public void onColumnSort(ColumnSortEvent event) {
                @SuppressWarnings("unchecked")
                int i = cellTable.getColumnIndex((Column<ReportItemDTO, ?>) event.getColumn());
                sort(event.isSortAscending(), i);
            }
        });
        setupColumns();
        cellTable.getColumnSortList().push(cellTable.getColumn(0));

        selectionModel = new SingleSelectionModel<ReportItemDTO>();
        cellTable.setSelectionModel(selectionModel);

        selectionModel.addSelectionChangeHandler(new SelectionChangeEvent.Handler() {
            public void onSelectionChange(SelectionChangeEvent event) {
                selectedDto = selectionModel.getSelectedObject();
                enableButtons(selectedDto);
            }
        });

        provider = new ListDataProvider<ReportItemDTO>();
        provider.addDataDisplay(cellTable);
        provider.setList(viewData);

        SimplePager.Resources pagerResources = GWT.create(SimplePager.Resources.class);
        simplePager = new SimplePager(TextLocation.LEFT, pagerResources, false, 0, true);
        simplePager.setDisplay(cellTable);
        pagerPanel.add(simplePager);
        scrollPanel.add(cellTable);
    }

    private void setupColumns() {
        for (int i = 0; i < COLUMNS.length; i++) {
            if (COLUMNS[i].field == FIELDS.MODIFIED_DATE
                || COLUMNS[i].field == FIELDS.CREATED_DATE) {
                addDateColumn(COLUMNS[i]);
            } else if (COLUMNS[i].field == FIELDS.NAME) {
                addLinkColumn(COLUMNS[i]);
            } else {
                addTextColumn(COLUMNS[i]);
            }
            columnRefs[i] = cellTable.getColumn(i);
            columnMap.put(cellTable.getColumn(i), COLUMNS[i]);
        }
    }

    /**
     * TODO: localize
     */
    private void setupToolbarButtons() {
        MyImageResources mir = GWT.create(MyImageResources.class);

        editTB = new Button("Edit Description");
        //editTB.setResource(mir.edit());
        editTB.setStyleName("toolbarButton");
        editTB.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                edit();
            }
        });
        buttonPanel.add(editTB);

        deleteTB = new Button("Delete");
        //deleteTB.setResource(mir.delete());
        deleteTB.setStyleName("toolbarButton");
        deleteTB.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                // Create a callback function for the Message window...
                MAWindowCallback cb = new MAWindowCallback() {

                    /**
                     * Called when one of the buttons are clicked
                     * @param buttonIndex - Index of button that was clicked
                     * @param input - Value user entered (Only applicable in MAWindowPrompt!!)
                     */
                    @Override
                    public void onClick(int buttonIndex, Object input) {
                        if (buttonIndex == 0) { // user clicked the "Delete" button
                    service.deleteReport(selectedDto, new AsyncCallback<String>() {

                        public void onFailure(Throwable caught) {
                            GWT.log(caught.getMessage(), caught);
                        }

                        @Override
                        public void onSuccess(String result) {
                            provider.getList().remove(selectedDto);
                            provider.refresh();
                        }
                    });
                }
            }
                };
                // Show message dialog...
                new MAWindowAlert(
                    "Delete Report?", // Title
                    selectedDto.getName() + " will be deleted. Do you want to continue?", // Message
                    cb, // callback
                    "Delete", "Cancel" // Buttons (order is important!!)
                    ).center();
			}
        });
        buttonPanel.add(deleteTB);

        searchField.addKeyUpHandler(new MyKeyboardUpHandler());
        enableButtons(null);
    }

    private class MyKeyboardUpHandler implements KeyUpHandler {
        public void onKeyUp(KeyUpEvent event) {
            switch (event.getNativeKeyCode()) {
                case KeyCodes.KEY_ESCAPE:
                    searchField.setText("");
                    break;
            }
            startSearch(searchField.getText());
        }
    }

    private void startSearch(String text) {
        searchVector.add(text);
        if (searchVector.size() > 1) {
            return;
        }
        Timer t = new Timer() {
            public void run() {
                if (searchVector.size() > 0) {
                    String txt = searchVector.lastElement();
                    searchVector.removeAllElements();
                    if (txt != null) {
                        if (txt.contains(lastSearchText) && !txt.equals("")) {
                            filterView(txt);
                        } else {
                            buildView(txt);
                        }
                        lastSearchText = txt;
                    }
                }
            }
        };
        t.schedule(700);
    }

    /**
     * User Story: US8789
     * As report user, I want Alliance to enable and disable the buttons in Report Library to
     * enable and disable relevant features depending on what I have selected.
     * In summary:
     * The folder buttons (New Folder, Rename Folder and Delete Folder) are enabled if and only
     * if a folder (i.e. Folders or one of its descendants in the tree) is selected.
     * Otherwise, they are disabled.
     * The report buttons (Edit Description and Delete) are enabled if and only if a report is
     * selected.  Otherwise, they are disabled.
     * The Search button is always enabled.
     *
     * @param dto dto
     */
    private void enableButtons(ReportItemDTO dto) {
        deleteTB.setEnabled(isDeletable(dto));
        editTB.setEnabled(isEditable(dto));
    }

    private boolean isDeletable(ReportItemDTO dto) {
        return dto != null && dto.getReportInstanceId() != null && dto.getReportInstanceId() > 0;
    }

    private boolean isEditable(ReportItemDTO dto) {
        return isDeletable(dto);
    }

    public void edit() {
    }

    public void setMainPanel(Main mainPanel) {
        this.mainPanel = mainPanel;
    }


    protected void refresh() {
        simplePager.startLoading();
        allData.clear();
        provider.getList().clear();
        cellTable.setVisibleRangeAndClearData(cellTable.getVisibleRange(), true);
        service.getReports(new AsyncCallback<List<ReportItemDTO>>() {
            public void onFailure(Throwable caught) {
                GWT.log(caught.getMessage(), caught);
                new MAWindowAlert(
                    "Error", // Title
                    caught.getMessage(), // Message
                    null, // Callback (not needed in this case)
                    "Ok").center();
            }

            public void onSuccess(final List<ReportItemDTO> result) {
            	//Window.alert(result.toString())
                allData = result;
                changeView(treeItem);
            }
        });
    }

    /**
     * A new tree item has been selected - change the table view to reflect the new parent.
     *
     * @param treeItem ti
     */
    public void changeView(TreeItemDTO treeItem) {
        this.treeItem = treeItem;

        clearSelectionModel();
        enableButtons(null);
        provider.getList().clear();
        cellTable.setVisibleRangeAndClearData(cellTable.getVisibleRange(), true);

        showHideColumns(treeItem);

        if (!firstTimeFlag) {
            firstTimeFlag = true;
            refresh();
            return;
        }

        buildView(lastSearchText);
    }


    public boolean hasChildren(TreeItemDTO treeItemDTO) {
        for (ReportItemDTO dto : allData) {
            if (isIncluded(treeItemDTO, dto)) {
                // only need one child to be true
                return true;
            }
        }
        return false;
    }

    /**
     * Create a "view" that is a result of the tree item selected and search criteria.
     *
     * @param searchText st
     */
    private void buildView(String searchText) {
        clearSelectionModel();
        enableButtons(null);
        provider.getList().clear();
        for (ReportItemDTO dto : allData) {
            if (isIncluded(treeItem, dto)) {
                provider.getList().add(dto);
            }
        }

        // If search is active...
        if (searchText != null && searchText.length() > 0) {
            for (int i = provider.getList().size() - 1; i >= 0; i--) {
                if (!provider.getList().get(i).stringMatch(searchText)) {
                    viewData.remove(i);
                }
            }
        }

        sort(lastSortAscending, lastSortColumn);
        scrollPanel.scrollToTop();
    }

    private void clearSelectionModel() {
        selectedDto = null;
        for (int i = 0; i < provider.getList().size(); i++) {
            selectionModel.setSelected(provider.getList().get(i), false);
        }
    }

    /**
     * Filter the current view by search criteria.
     *
     * @param searchText st
     */
    private void filterView(String searchText) {
        clearSelectionModel();
        enableButtons(null);
        if (searchText != null && searchText.length() > 0) {
            for (int i = provider.getList().size() - 1; i >= 0; i--) {
                if (!provider.getList().get(i).stringMatch(searchText)) {
                    provider.getList().remove(i);
                }
            }
        }
        provider.refresh();
    }

    @SuppressWarnings("unchecked")
    private void showHideColumns(TreeItemDTO treeItem) {
        // Remove columns..
        for (int i = 0; i < columnRefs.length; i++) {
            boolean b = false;
            for (int j = 0; j < COLUMNS[i].types.length; j++) {
                if (COLUMNS[i].types[j] == treeItem.getType()) {
                    b = true;
                    if (cellTable.getColumnIndex(columnRefs[i]) < 0) {
                        cellTable.insertColumn(i, columnRefs[i], COLUMNS[i].label);
                    }
                    break;
                }
            }
            if (!b && cellTable.getColumnIndex(columnRefs[i]) > -1) {
                cellTable.removeColumn(columnRefs[i]);
            }
        }
    }

    /**
     * Determine if report should be included in this view.
     *
     * @param parent p
     * @param dto    d
     * @return r
     */
    private boolean isIncluded(TreeItemDTO parent, ReportItemDTO dto) {
        if (dto == null) {
            return false;
        }

        switch (parent.getType()) {

            // Template
            case 0:
                if (dto.getReportType().equals("Report")) {
                    return false;
                }
                if (parent.getCategory() != null && parent.getCategory().equals("Template")) {
                    return true;
                }
                if (dto.getCategory().equals(parent.getCategory())) {
                    return true;
                }
                return false;
            // Report instance
            case 1:
                if (dto.getReportType().equals("Report Template")) {
                    return false;
                }
                if (parent.getCategory() != null && parent.getCategory().equals("Instance")) {
                    return true;
                }
                if (dto.getCategory().equals(parent.getCategory())) {
                    return true;
                }
                return false;
            // Folder
            case 2:
                if (dto.getReportType().equals("Report Template")) {
                    return false;
                }
                if (dto.getFolderName() == null || dto.getFolderName().length() == 0) {
                    return false;
                }
                if (dto.getFolderName().equalsIgnoreCase(parent.getName())) {
                    return true;
                }
                return false;
        }
        return false;
    }

    private void addTextColumn(final TableColumn tc) {
        TextColumn<ReportItemDTO> c = new TextColumn<ReportItemDTO>() {
            @Override
            public String getValue(ReportItemDTO r) {
                Object obj = r.getValue(tc.field);
                return obj == null ? "" : obj.toString();
            }
        };
        c.setSortable(true);
        cellTable.addColumn(c, tc.label);
    }

    private void addLinkColumn(final TableColumn tc) {
        addColumn(new MyButtonCell(), tc.label, new GetValue<String>() {
                public String getValue(ReportItemDTO dto) {
                    return dto.getName();
                }
            }, new FieldUpdater<ReportItemDTO, String>() {
            public void update(int index, ReportItemDTO dto, String value) {
                if (dto != null) {
                    showReport(dto);
                }
            }
        }
        );
    }

    /**
     * Add a column with a header.
     *
     * @param <C>        the cell type
     * @param cell       the cell used to render the column
     * @param headerText the header string
     * @param getter     the value getter for the cell
     */
    private <C> Column<ReportItemDTO, C> addColumn(Cell<C> cell, String headerText,
                                                   final GetValue<C> getter, FieldUpdater<ReportItemDTO, C> fieldUpdater) {
        Column<ReportItemDTO, C> column = new Column<ReportItemDTO, C>(cell) {

            @Override
            public C getValue(ReportItemDTO object) {
                return getter.getValue(object);
            }
        };
        column.setFieldUpdater(fieldUpdater);
        cellTable.addColumn(column, headerText);
        column.setSortable(true);
        return column;
    }

    private class MyButtonCell extends ButtonCell {
        public MyButtonCell() {
            super();
        }

        @Override
        public void render(final Context context, final SafeHtml data,
                           final SafeHtmlBuilder sb) {
            sb.append(SafeHtmlUtils.fromTrustedString(
                "<a href=\"javascript:void(0)\">" + data.asString() + "</a>"));
        }
    }

    /**
     * Get a cell value from a record.
     *
     * @param <C> the cell type
     */
    private static interface GetValue<C> {
        C getValue(ReportItemDTO dto);
    }

    private void showReport(ReportItemDTO dto) {
        if (dto.getCategory().equals("F")) {
            if (flexReport == null) {
                flexReport = new FlexReportDialog();
                flexReport.setMainPanel(mainPanel);
            }
            flexReport.load(dto);
            mainPanel.setMainPanel(flexReport, dto.getName());
        } else {
            if (standardReport == null) {
                standardReport = new StandardReportDialog();
                standardReport.setMainPanel(mainPanel);
            }

            standardReport.load(dto);
            mainPanel.setMainPanel(standardReport, dto.getName());
        }
    }

    private void addDateColumn(final TableColumn tc) {
        Column<ReportItemDTO, Date> dc = new Column<ReportItemDTO, Date>(
            new DateCell(DateTimeFormat.getFormat("MM/dd/yy hh:mm:ss aa"))) {
            @Override
            public Date getValue(ReportItemDTO dto) {
                Object val = dto.getValue(tc.field);
                if (val != null) {
                    return new Date(Long.valueOf(dto.getValue(tc.field).toString()));
                } else {
                    return null;
                }
            }
        };
        dc.setSortable(true);
        cellTable.addColumn(dc, tc.label);
    }

    /**
     * Sort the viewData and update the table
     *
     * @param ascending a
     * @param column    c
     */
    private void sort(boolean ascending, int column) {
        lastSortColumn = column;
        lastSortAscending = ascending;
        Column c = cellTable.getColumn(column);
        TableColumn tc = columnMap.get(c);
        Collections.sort(provider.getList(), new MyComparator(ascending, tc.field));
        provider.refresh();
    }

    private class MyComparator implements Comparator<ReportItemDTO> {
        private boolean ascending;
        private FIELDS f;

        public MyComparator(boolean ascending, FIELDS f) {
            this.ascending = ascending;
            this.f = f;
        }

        @Override
        public int compare(ReportItemDTO o1, ReportItemDTO o2) {
            Object obj1 = o1.getValue(f);
            Object obj2 = o2.getValue(f);

            if (obj1 instanceof Date && obj2 instanceof Date) {
                if (!ascending) {
                    return ((Date) obj1).compareTo((Date) obj2);
                } else {
                    return ((Date) obj2).compareTo((Date) obj1);
                }
            }

            String str1 = (obj1 == null ? "" : obj1.toString().toLowerCase().trim());
            String str2 = (obj2 == null ? "" : obj2.toString().toLowerCase().trim());
            if (!ascending) {
                String hold = str1;
                str1 = str2;
                str2 = hold;
            }
            return str1.compareTo(str2);
        }
    }

    interface MyImageResources extends ClientBundle {
        @Source("../resources/copy.png")
        ImageResource copy();

        @Source("../resources/cross.png")
        ImageResource delete();

        @Source("../resources/reload.png")
        ImageResource refresh();

        @Source("../resources/zoom.png")
        ImageResource search();

        @Source("../resources/pencil.png")
        ImageResource edit();
    }

    private class TableColumn {
        FIELDS field;
        String label;
        int[] types;

        /**
         * @param field
         * @param label
         * @param types
         */
        public TableColumn(FIELDS field, String label, int... types) {
            this.field = field;
            this.label = label;
            this.types = types;
        }
    }
}