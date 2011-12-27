package com.medassets.report.client.flex;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TabLayoutPanel;
import com.google.gwt.user.client.ui.Widget;
import com.medassets.report.client.component.MAComponent;
import com.medassets.report.shared.ReportItemDTO;
import java.util.ArrayList;
import java.util.List;

public class FlexReport extends Composite {

    interface Binder extends UiBinder<Widget, FlexReport> {
    }
    @UiField
    FlexGeneralPanel flexGeneralPanel;
    @UiField
    FlexGlobalSettingsPanel flexGlobalPanel;
    @UiField
    FlexSelectPanel flexSelectPanel;
    ReportItemDTO report;
    private static final Binder binder = GWT.create(Binder.class);

    public FlexReport() {
        initWidget(binder.createAndBindUi(this));
    }

    void load(ReportItemDTO report) {
        this.report = report;
        flexGeneralPanel.load(report);
        flexSelectPanel.load(report);
        flexGlobalPanel.load(report);
    }

    List<MAComponent> getEmptyRequiredFields() {
        List<MAComponent> list = new ArrayList<MAComponent>();
        list.addAll(flexGeneralPanel.getEmptyRequiredFields());
        list.addAll(flexGlobalPanel.getEmptyRequiredFields());
        return list;
    }
}
