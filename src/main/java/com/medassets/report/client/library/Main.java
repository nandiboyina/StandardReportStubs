package com.medassets.report.client.library;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.CssResource;
import com.google.gwt.resources.client.CssResource.NotStrict;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.RootLayoutPanel;

public class Main implements EntryPoint {

    @UiField(provided = true)
    Panel mainPanel;
    @UiField
    Label title;

    RootLayoutPanel root;
    DockLayoutPanel dockPanel;

    public static final String BROWSER_TITLE = "Standard, Flexible, and OLAP Report Library";

	interface GlobalResources extends ClientBundle {
		@NotStrict
		@Source("../resources/GlobalStyles.css")
		CssResource css();
	}

	interface MainUiBinder extends UiBinder<DockLayoutPanel, Main> {
	}

	private static final MainUiBinder binder = GWT.create(MainUiBinder.class);

    public Main() {
        mainPanel = new ReportLibrary(this);
    }

	public void onModuleLoad() {
        Window.setTitle(BROWSER_TITLE);
		GWT.<GlobalResources> create(GlobalResources.class).css()
				.ensureInjected();
		dockPanel = binder.createAndBindUi(this);

		root = RootLayoutPanel.get();
		root.add(dockPanel);
	}

    public void setMainPanel(Panel panel, String panelTitle) {

        panel.setStyleName("pageContent");
        dockPanel.remove(mainPanel);
        mainPanel = panel;

        title.setText(panelTitle);

        dockPanel.add(mainPanel);
    }
}
