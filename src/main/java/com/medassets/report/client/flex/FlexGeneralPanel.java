package com.medassets.report.client.flex;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiConstructor;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;
import com.medassets.report.client.component.MAComponent;
import com.medassets.report.client.component.MAWindowAlert;
import com.medassets.report.client.component.MAListBox;
import com.medassets.report.client.component.MARadioButtonGroup;
import com.medassets.report.client.component.MATextBox;
import com.medassets.report.client.service.FlexService;
import com.medassets.report.client.service.FlexServiceAsync;
import com.medassets.report.shared.FlexGeneralParamItemDTO;
import com.medassets.report.shared.ParamAvailableItemValue;
import com.medassets.report.shared.ReportItemDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FlexGeneralPanel extends Composite {

    private static final FlexServiceAsync SERVICE = GWT.create(FlexService.class);
    List<MAComponent> widgets = new ArrayList<MAComponent>();

    interface Binder extends UiBinder<Widget, FlexGeneralPanel> {
    }
    private static final Binder binder = GWT.create(Binder.class);
    @UiField
    VerticalPanel formPanel;
    ReportItemDTO report;
    
    private List<FlexGeneralParamItemDTO> fieldList;

    @UiConstructor
    public FlexGeneralPanel() {
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
        SERVICE.getGeneralData(report,
            new AsyncCallback<List<FlexGeneralParamItemDTO>>() {

				public void onFailure(Throwable caught) {
                    GWT.log(caught.getMessage(), caught);
                    new MAWindowAlert("Error", caught.getMessage(), null, "Ok").center();
                }

                public void onSuccess(List<FlexGeneralParamItemDTO> pResult) {
                	setFieldList(pResult); 
                    buildWidgets(getFieldList());
                }
            });
    }

    private void buildWidgets(List<FlexGeneralParamItemDTO> result) {
        List<MAComponent> list = new ArrayList<MAComponent>();

        MATextBox tb = new MATextBox();
        tb.setMALabel("Name");
        tb.setMAValue(report.getName());
        tb.setMARequired(true);
        addWidget(tb);

        tb = new MATextBox();
        tb.setMALabel("Name 2");
        tb.setMAValue(report.getSubTitle());
        addWidget(tb);

        for (int i = 0; i < result.size(); i++) {
            FlexGeneralParamItemDTO dto = result.get(i);
            addWidget((Widget)createWidget(dto));
        }
        SERVICE.getReportTemplateName(report.getReportTemplateId(),
            new AsyncCallback<String>() {

                public void onFailure(Throwable caught) {
                    GWT.log(caught.getMessage(), caught);
                    new MAWindowAlert("Error", caught.getMessage(), null, "Ok").center();
                }

                public void onSuccess(String result) {
                    enableDisableHack(result);
                }
            });
    }

    private MAComponent createWidget(FlexGeneralParamItemDTO dto) {
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
                    choices[ndx++] = key;
                    choices[ndx++] = dto.getListOfValues().get(key);
                }
                bg.setChoices(choices);
                bg.setValue(dto.getCurrentValue());
                comp = bg;
                break;
            default:
                comp = new MATextBox();
        }
        comp.setMALabel(dto.getLabelName());
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
                mc.getMALabel().setStyleName("formTableCell-0b-ListBox");
            } else {
                mc.getMALabel().setStyleName("formTableCell-0b");
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

    private void enableDisableHack(String templateName) {
        if (!templateName.equalsIgnoreCase("Daily Resource Utilization")) return;
        enableCharges("Column 1 Totals:", "Column 1 Source of Charges:");
        enableCharges("Column 2 Totals:", "Column 2 Source of Charges:");
        enableCharges("Column 3 Totals:", "Column 3 Source of Charges:");
    }

    private static final String CHARGE_STR = "GT - Charges";
    private void enableCharges(String str1, String str2) {
        final MAComponent comp1 = findComp(str1);
        final MAComponent comp2 = findComp(str2);
        if (comp1 != null && comp2 != null) {
            ((ListBox)comp1).addChangeHandler(new ChangeHandler() {
                    @Override
                    public void onChange(ChangeEvent event) {
                        checkCode(comp1, comp2);
                    }
                });
            checkCode(comp1, comp2);
        }
    }

    private void checkCode(MAComponent comp1, MAComponent comp2) {
        String str = getMAListBoxValue((MAListBox)comp1);
        comp2.setMAEnabled(str.equals(CHARGE_STR));
    }

    /**
     * This should be in MAListBox!!
     * @param lb
     * @return
     */
    private String getMAListBoxValue(MAListBox lb) {
        List<ParamAvailableItemValue> param = (List<ParamAvailableItemValue>) lb.getMAValue();
        if (param != null && param.size() > 0) {
            return param.get(0).getCode() == null ? "" : param.get(0).getCode();
        }
        return "";
    }

    MAComponent findComp(String label) {
        for (MAComponent comp : widgets) {
            if (comp.getMALabel() != null && comp.getMALabel().getText().equalsIgnoreCase(label)) {
                return comp;
            }
        }
        return null;
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

    private void loadList(final MAListBox lb, final FlexGeneralParamItemDTO dto) {
        Map<String, String> map = dto.getListOfValues();
        List<ParamAvailableItemValue> list = new ArrayList<ParamAvailableItemValue>();
        for (String key : map.keySet()) {
            ParamAvailableItemValue param = new ParamAvailableItemValue();
            param.setCode(key);
            param.setName(map.get(key));
            list.add(param);
        }
        lb.setMAData(list, dto.getDefaultSelection());
    }

	public List<FlexGeneralParamItemDTO> getFieldList() {
		return fieldList;
	}

	public void setFieldList(List<FlexGeneralParamItemDTO> fieldList) {
		this.fieldList = fieldList;
	}
}
