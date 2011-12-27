package com.medassets.report.client.library;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class ReportTable_ReportTableUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.medassets.report.client.library.ReportTable>, com.medassets.report.client.library.ReportTable.ReportTableUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<span id='{0}'></span> <span id='{1}'></span>")
    SafeHtml html1(String arg0, String arg1);
     
    @Template("")
    SafeHtml html2();
     
  }

  Template template = GWT.create(Template.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.medassets.report.client.library.ReportTable owner) {

    com.medassets.report.client.library.ReportTable_ReportTableUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.medassets.report.client.library.ReportTable_ReportTableUiBinderImpl_GenBundle) GWT.create(com.medassets.report.client.library.ReportTable_ReportTableUiBinderImpl_GenBundle.class);
    com.medassets.report.client.library.ReportTable_ReportTableUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.FlowPanel buttonPanel = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.TextBox searchField = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel2 = new com.google.gwt.user.client.ui.HTMLPanel(template.html1(domId0, domId1).asString());
    com.google.gwt.user.client.ui.HTMLPanel pagerPanel = new com.google.gwt.user.client.ui.HTMLPanel(template.html2().asString());
    com.google.gwt.user.client.ui.ScrollPanel scrollPanel = (com.google.gwt.user.client.ui.ScrollPanel) GWT.create(com.google.gwt.user.client.ui.ScrollPanel.class);
    com.google.gwt.user.client.ui.DockLayoutPanel f_DockLayoutPanel1 = new com.google.gwt.user.client.ui.DockLayoutPanel(com.google.gwt.dom.client.Style.Unit.EM);

    buttonPanel.setStyleName("" + style.toolbarButtonPanel() + "");
    searchField.setStyleName("" + style.searchText() + "");
    f_HTMLPanel2.setStyleName("" + style.toolbarPanel() + "");
    f_DockLayoutPanel1.addNorth(f_HTMLPanel2, 3.1);
    pagerPanel.setStyleName("" + style.pagerPanel() + "");
    f_DockLayoutPanel1.addSouth(pagerPanel, 2.3);
    scrollPanel.setStyleName("" + style.bottomBorder() + "");
    f_DockLayoutPanel1.add(scrollPanel);

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel2.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    attachRecord0.detach();
    f_HTMLPanel2.addAndReplaceElement(buttonPanel, domId0Element);
    f_HTMLPanel2.addAndReplaceElement(searchField, domId1Element);


    owner.buttonPanel = buttonPanel;
    owner.pagerPanel = pagerPanel;
    owner.scrollPanel = scrollPanel;
    owner.searchField = searchField;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_DockLayoutPanel1;
  }
}
