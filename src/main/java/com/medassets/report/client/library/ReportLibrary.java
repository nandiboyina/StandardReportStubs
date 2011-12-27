package com.medassets.report.client.library;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiFactory;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.SplitLayoutPanel;
import com.google.gwt.user.client.ui.TreeItem;
import com.medassets.report.shared.TreeItemDTO;

public class ReportLibrary extends SplitLayoutPanel implements HasWidgets {

    interface GlobalResources extends ClientBundle {
        @CssResource.NotStrict
        @Source("../resources/GlobalStyles.css")
        CssResource css();
    }

    interface LibraryUIBinder extends UiBinder<SplitLayoutPanel, ReportLibrary> {
    }

    private static final LibraryUIBinder binder = GWT.create(LibraryUIBinder.class);

    @UiField
    MainNavTree tree;
    @UiField
    ReportTable table;

    private Main parent;

    public ReportLibrary(Main parent) {
        this.parent = parent;
        GWT.log("Creating RL");
        GWT.<GlobalResources>create(GlobalResources.class).css().ensureInjected();

        SplitLayoutPanel panel =  binder.createAndBindUi(this);

        add(panel);

        tree.setReportTable(table);

        table.setMainPanel(parent);

        tree.addSelectionHandler(new SelectionHandler<TreeItem>() {
            public void onSelection(SelectionEvent<TreeItem> event) {
                TreeItem ti = event.getSelectedItem();
                TreeItemDTO dto = (TreeItemDTO) ti.getUserObject();
                table.changeView(dto);
            }
        });
        tree.refresh();
    }

    @UiFactory
    protected ReportLibrary createDialog() {
        return this;
    }
}
