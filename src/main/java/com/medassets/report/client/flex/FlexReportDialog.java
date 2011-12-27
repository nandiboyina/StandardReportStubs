package com.medassets.report.client.flex;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.logical.shared.ResizeEvent;
import com.google.gwt.event.logical.shared.ResizeHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Frame;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.medassets.report.client.component.MAComponent;
import com.medassets.report.client.component.MAWindowAlert;
import com.medassets.report.client.component.MAWindowCallback;
import com.medassets.report.client.library.Main;
import com.medassets.report.client.service.FlexService;
import com.medassets.report.client.service.FlexServiceAsync;
import com.medassets.report.shared.FlexSelectionParamItemDTO;
import com.medassets.report.shared.FlexSortParamItemDTO;
import com.medassets.report.shared.ReportItemDTO;

public class FlexReportDialog extends FlowPanel implements ResizeHandler {

    private static FlexReportDialogUiBinder uiBinder = GWT.create(FlexReportDialogUiBinder.class);
//	private static final MainServiceAsync SERVICE = GWT.create(MainService.class);
    
    private final FlexServiceAsync selectTabService = GWT.create(FlexService.class);

    interface FlexReportDialogUiBinder extends UiBinder<Widget, FlexReportDialog> {
    }

    @UiField
    FlexReport flexReport;
    @UiField
    Button saveButton;
    @UiField
    Button saveAsButton;
    @UiField
    Button runButton;

    ReportItemDTO report;

    private Main mainPanel;


    public FlexReportDialog() {
        add(uiBinder.createAndBindUi(this));
        Window.addResizeHandler(this);
    }

    /**
     * Load the standard report parameter prompts.
     *
     * @param report
     */
    public void load(ReportItemDTO report) {
        if (report == null) {
            return;
        }
        this.report = report;
        formatSize();
        flexReport.load(report);
    }

    @Override
    public void onResize(ResizeEvent event) {
        formatSize();
    }


    public void setMainPanel(Main mainPanel) {
        this.mainPanel = mainPanel;
    }

    @UiHandler("saveButton")
    void handleSaveClick(ClickEvent e) {
        if (checkForRequiredFields()) {
            return;
        }
    }

    @UiHandler("saveAsButton")
    void handleSaveAsClick(ClickEvent e) {
        if (checkForRequiredFields()) {
            return;
        }
    }
    
    AsyncCallback<Void> runflexReportCallback = new AsyncCallback<Void>() {
		
		@Override
		public void onSuccess(Void result) {
			 GWT.log("Run succeeded. Session should contain crystal obj");
			 openReport("Flex Report", "/FlexReportCrystalViewer.jsp");
		}
		
		@Override
		public void onFailure(Throwable caught) {
			 GWT.log("Caught: " + caught.getClass());
             GWT.log("Crystal Run failed");
			new MAWindowAlert("Error", caught.getMessage() + ": flexreport failed to execute.", null, "Ok").center();
		}
	};
	
	 public void openReport(String name, String url) {
        Frame frame = new Frame(url);
        Panel panel = new SimplePanel(frame);
        frame.setSize("100%", "100%");
        panel.setSize("100%", "100%");
        mainPanel.setMainPanel(panel, name);
	 }

    @UiHandler("runButton")
    void handleRunClick(ClickEvent e) {
    	if (checkForRequiredFields()) {
    		Map<String, FlexSelectionParamItemDTO> selectionDTOList = this.flexReport.flexSelectPanel.getSelectTabPresenter().getSelectedParamItemDTOMap();
    		List<FlexSortParamItemDTO> sortParamList = new ArrayList<FlexSortParamItemDTO>();
    		
    		
    		List<FlexSelectionParamItemDTO> flexSelectionParamList = null;
    		if (selectionDTOList != null && selectionDTOList.size() > 0) {
    			flexSelectionParamList = new ArrayList<FlexSelectionParamItemDTO>(this.flexReport.flexSelectPanel.getSelectTabPresenter().getSelectedParamItemDTOMap().values());
    		}
    		
    		selectTabService.runFlexReport(this.report.getReportTemplateId(), 
    				this.report.getReportInstanceId(), 
    				this.report.getTemplateName(), 
    				this.flexReport.flexGlobalPanel.getFieldList(), 
    				flexSelectionParamList, 
    				this.flexReport.flexGeneralPanel.getFieldList(), 
    				sortParamList, 
    				runflexReportCallback);
            return;
        }
    }

    /**
     * Determine if any "required" fields are still empty. If so, prompt user to enter value.
     */
    private boolean checkForRequiredFields() {
        final List<MAComponent> required = flexReport.getEmptyRequiredFields();
        if (required.size() > 0) {
            MAWindowCallback cb = new MAWindowCallback() {
                @Override
                public void onClick(int buttonIndex, Object input) {
                    required.get(0).setMAFocus();
                }
            };
            new MAWindowAlert("Value Required", // Title
                "Please enter a value for field: " + required.get(0).getMALabel().getText(), // Content
                cb, // callback
                "Continue" // button text
            ).center();
            return true;
        }
        return true;
    }

    /**
     * Don't allow the dialog to grow bigger than the window.
     */
    private void formatSize() {
        int w = Math.min(700, (int) (Window.getClientWidth() * .85));
        int h = Math.min(700, (int) (Window.getClientHeight() * .85));
        //if (flexReport.getOffsetWidth() > w) {
        flexReport.setWidth(w + "px");
        //}
        //if (flexReport.getOffsetHeight() > h) {
        flexReport.setHeight(h + "px");
        //}
    }
}
