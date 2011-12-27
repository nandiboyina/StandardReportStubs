package com.medassets.report.client.flex;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiConstructor;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.medassets.report.client.component.MAComponent;
import com.medassets.report.client.component.MAListBox;
import com.medassets.report.client.component.MARadioButtonGroup;
import com.medassets.report.client.component.MATextBox;
import com.medassets.report.client.component.MAWindowAlert;
import com.medassets.report.client.service.FlexService;
import com.medassets.report.client.service.FlexServiceAsync;
import com.medassets.report.shared.FlexGlobalSettingsParamItemDTO;
import com.medassets.report.shared.ParamAvailableItemValue;
import com.medassets.report.shared.ReportItemDTO;
import java.util.Iterator;

public class FlexGlobalSettingsPanel extends Composite {

    private static FlexServiceAsync SERVICE;
    List<MAComponent> widgets = new ArrayList<MAComponent>();

    static {
        try {
            SERVICE = GWT.create(FlexService.class);
        } catch (Exception ex) {
            GWT.log(ex.getMessage());
        }
    }

    interface Binder extends UiBinder<Widget, FlexGlobalSettingsPanel> {}
    private static final Binder binder = GWT.create(Binder.class);

    @UiField
    VerticalPanel formPanel;
    ReportItemDTO report;
    
	private List<FlexGlobalSettingsParamItemDTO> fieldList;

    @UiConstructor
    public FlexGlobalSettingsPanel() {
        super();
        initWidget(binder.createAndBindUi(this));
    }

    void load(ReportItemDTO report) {
        if (report == null) {
            return;
        }
        this.report = report;
        buildWidgets();
    }

    /**
     * Build screen widgets (labels, text boxes, combo boxes, etc) for a given report.
     * @param reportTemplateId
     * @param form
     */
    private void buildWidgets() {
        if (SERVICE == null) {
            GWT.log("FlexService is unavailable");
            return;
        }

        SERVICE.populateGlobalSettingsTabParametersByType(report.getReportTemplateId(),
            report.getReportInstanceId(),
            new AsyncCallback<List<FlexGlobalSettingsParamItemDTO>>() {

                public void onFailure(Throwable caught) {
                    GWT.log(caught.getMessage(), caught);
                    new MAWindowAlert("Error", caught.getMessage(), null, "Ok").center();
                }

                public void onSuccess(List<FlexGlobalSettingsParamItemDTO> result) {
                    buildWidgets(result);
                }
            });
    }

    /**
     * Create the widgets and place them on the screen.
     * Since only 1 list can be returned from the service layer, a <null> reference was added to
     * the list as a placeholder for a section break.
     * @param result
     */
    private void buildWidgets(List<FlexGlobalSettingsParamItemDTO> result) {
    	this.setFieldList(result);
        int lastIndex = 0;
        for (int i = 0; i < result.size(); i++) {
            if (result.get(i) == null) { // null object means the end of the first section
                lastIndex=i+1;
                break;
            }
            addWidget((Widget)createWidget(result.get(i)));
        }

        Label lbl = new Label();
        lbl.setStyleName("formSectionLabel");
        lbl.setText("Encounter-Level User-Defined Relations");
        addWidget(lbl);

        for (int i = lastIndex; i < result.size(); i++) {
            if (result.get(i) == null) { // null object means the end of the second section
                lastIndex=i+1;
                break;
            }
            addWidget((Widget)createWidget(result.get(i)));
        }

        lbl = new Label();
        lbl.setStyleName("formSectionLabel");
        lbl.setText("Charge-Level User-Defined Relations");
        addWidget(lbl);

        for (int i = lastIndex; i < result.size(); i++) {
            addWidget((Widget)createWidget(result.get(i)));
        }
    }

    private MAComponent createWidget(FlexGlobalSettingsParamItemDTO dto) {
        MAComponent comp = null;

        if (dto.getLabelName().equalsIgnoreCase("Consolidate Code Description")) {
            dto.setWizStyle(5);
        } else if (dto.getListOfValues() != null && dto.getListOfValues().size() > 1) {
            dto.setWizStyle(4);
        }

        switch (dto.getWizStyle()) {
            case 4:
                MAListBox lb = new MAListBox();
                loadList(lb, dto);
                comp = lb;
                break;
            case 5:
                MARadioButtonGroup bg = new MARadioButtonGroup();
                String[] choices = new String[dto.getListOfValues().size()];
                Iterator<String> keys = dto.getListOfValues().keySet().iterator();
                int ndx = 0;
                while (keys.hasNext()) {
                    String key = keys.next();
                    choices[ndx] = key;
                    choices[ndx++] = dto.getListOfValues().get(key);
                }
                bg.setChoices(choices);
                bg.setValue(dto.getCurrentValue());
                comp = bg;
                break;
            default:
                comp = new MATextBox();
        }
        comp.setMALabel(dto.getDisplayLabelName());
        comp.setMAValue(dto.getCurrentValue());
        comp.setMATooltip(dto.toString());
        return comp;
    }

    private void addWidget(Widget w) {
        if (w instanceof MAComponent) {
            MAComponent mc = (MAComponent)w;
            widgets.add(mc);
            HorizontalPanel fp = new HorizontalPanel();
            if (mc instanceof MAListBox) {
                mc.getMALabel().setStyleName("formTableCell-0a-ListBox");
            } else {
                mc.getMALabel().setStyleName("formTableCell-0a");
            }
            fp.add(mc.getMALabel());
            fp.add(w);
            fp.setCellHorizontalAlignment(w, HasHorizontalAlignment.ALIGN_LEFT);
            fp.setCellVerticalAlignment(w, HasVerticalAlignment.ALIGN_TOP);
            if (!(mc instanceof MARadioButtonGroup)) {
                fp.setCellWidth(w, "100%");
                w.setStyleName("formTableCell-1a");
            }
            formPanel.add(fp);
        } else {
            formPanel.add(w);
        }
    }

    private void loadList(final MAListBox lb, final FlexGlobalSettingsParamItemDTO dto) {
        Map<String, String> map = dto.getListOfValues();
        List<ParamAvailableItemValue> list = new ArrayList<ParamAvailableItemValue>();
        for (String key : map.keySet()) {
            ParamAvailableItemValue param = new ParamAvailableItemValue();
            param.setCode(key);
            param.setName(map.get(key));
            list.add(param);
        }
        lb.setMAData(list, dto.getCurrentValue());
    }

    List<MAComponent> getEmptyRequiredFields() {
        List<MAComponent> list = new ArrayList<MAComponent>();
        for (MAComponent comp : widgets) {
            if (comp.isMARequired() && comp.isMAEmpty()) {
                list.add(comp);
            }
        }
        return list;
    }

    List<Object> getDTOs() {
        List<Object> list = new ArrayList<Object>();
        for (MAComponent comp : widgets) {
            list.add(comp.getDTO());
        }
        return list;
    }

	public List<FlexGlobalSettingsParamItemDTO> getFieldList() {
		return fieldList;
	}

	public void setFieldList(List<FlexGlobalSettingsParamItemDTO> fieldList) {
		this.fieldList = fieldList;
	}
}
