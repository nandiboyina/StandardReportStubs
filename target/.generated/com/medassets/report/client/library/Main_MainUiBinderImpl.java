package com.medassets.report.client.library;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.DockLayoutPanel;

public class Main_MainUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.DockLayoutPanel, com.medassets.report.client.library.Main>, com.medassets.report.client.library.Main.MainUiBinder {

  public com.google.gwt.user.client.ui.DockLayoutPanel createAndBindUi(final com.medassets.report.client.library.Main owner) {

    com.medassets.report.client.library.Main_MainUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.medassets.report.client.library.Main_MainUiBinderImpl_GenBundle) GWT.create(com.medassets.report.client.library.Main_MainUiBinderImpl_GenBundle.class);
    com.medassets.report.client.library.Main_MainUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.medassets.report.client.common.Header f_Header3 = (com.medassets.report.client.common.Header) GWT.create(com.medassets.report.client.common.Header.class);
    com.google.gwt.user.client.ui.Label title = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel2 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
    com.google.gwt.user.client.ui.Panel mainPanel = owner.mainPanel;
    com.google.gwt.user.client.ui.DockLayoutPanel f_DockLayoutPanel1 = new com.google.gwt.user.client.ui.DockLayoutPanel(com.google.gwt.dom.client.Style.Unit.EM);

    f_VerticalPanel2.add(f_Header3);
    title.setText("Standard, Flexible, and OLAP Report Library");
    title.setStyleName("" + style.pageHeader() + "");
    f_VerticalPanel2.add(title);
    f_VerticalPanel2.setWidth("100%");
    f_DockLayoutPanel1.addNorth(f_VerticalPanel2, 4.5);
    f_DockLayoutPanel1.add(mainPanel);



    owner.title = title;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_DockLayoutPanel1;
  }
}
