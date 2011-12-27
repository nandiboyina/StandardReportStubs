package com.medassets.report.client.component;

import java.util.List;

import com.google.gwt.user.client.ui.FormPanel;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;
import java.util.ArrayList;

public class MAFormPanel extends FormPanel {

    public static final String LABEL_WIDTH = "300px";
    public static final String LABEL_HEIGHT = "200px";

	Grid grid;

	public MAFormPanel() {
		setStyleName("dialogForm");
		grid = new Grid();
		grid.setStyleName("formTable");
		grid.setWidth("100%");
		add(grid);
	}
	
    public void showLoading() {
        grid.clear();
        grid.resize(1, 1);
        Label loadingLabel = new Label("Please wait, loading...");
        loadingLabel.setSize(LABEL_WIDTH, LABEL_HEIGHT);
        grid.setWidget(0, 0, loadingLabel);
    }
    
    public void setWidgets(List<MAComponent> comps) {
        grid.clear();
        grid.resize(comps.size(), 2);
        int row = 0;
        for (MAComponent comp : comps) {
            grid.setWidget(row, 0, (Label)comp.getMALabel());
            grid.setWidget(row, 1, (Widget)comp);
            if (comp instanceof MAListBox) {
                grid.getCellFormatter().addStyleName(row, 0, "formTableCell-0-ListBox");
            } else {
                grid.getCellFormatter().addStyleName(row, 0, "formTableCell-0");
            }
            grid.getCellFormatter().addStyleName(row, 1, "formTableCell-1");
            row++;
        }
    }

    public List<MAComponent> getWidgets() {
        List<MAComponent> list = new ArrayList<MAComponent>();
        for (int i = 0; i < grid.getRowCount(); i++) {
            list.add((MAComponent)grid.getWidget(i, 1));
        }
        return list;
    }
}
