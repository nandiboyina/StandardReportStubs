package com.medassets.report.client.common;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class Header_HeaderPanelUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.medassets.report.client.common.Header>, com.medassets.report.client.common.Header.HeaderPanelUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<div class='group' id='header'> <div class='group' style='color: #ffffff; float:left; padding-left:7px; padding-top:2px; padding-bottom:0px; white-space:nowrap; text-align:left;'> <a href='../mainmenu.do' style='color: #ffffff;background-image: URL(linkImg.gif);background-repeat: no-repeat;background-position: right 3px;padding: 0px 10px 0px 0px;'>Alliance Home</a> <a href='../mainmenu.do' style='color: #ffffff;padding: 0px 10px 0px 0px;'>Reporting</a> </div> <div class='group' style='color: #ffffff; float:right; width:280px; height:100%; padding-right:7px; padding-top:2px; padding-bottom:0px; white-space:nowrap; text-align:right;'> <a href='../logout.do' style='color: #ffffff;'>Log out</a> | <a href='#' onClick='FMCOpenHelp(&#39;../Subsystems/stdreports/Content/srlwh.htm&#39;, null);' style='color: #ffffff;'>Help</a> </div> </div>")
    SafeHtml html1();
     
  }

  Template template = GWT.create(Template.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.medassets.report.client.common.Header owner) {

    com.medassets.report.client.common.Header_HeaderPanelUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.medassets.report.client.common.Header_HeaderPanelUiBinderImpl_GenBundle) GWT.create(com.medassets.report.client.common.Header_HeaderPanelUiBinderImpl_GenBundle.class);
    com.medassets.report.client.common.Header_HeaderPanelUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel2 = new com.google.gwt.user.client.ui.HTMLPanel(template.html1().asString());
    com.google.gwt.user.client.ui.FlowPanel f_FlowPanel1 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);

    f_HTMLPanel2.setHeight("25px");
    f_FlowPanel1.add(f_HTMLPanel2);
    f_FlowPanel1.setWidth("100%");



    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_FlowPanel1;
  }
}
