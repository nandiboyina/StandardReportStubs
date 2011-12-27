package com.medassets.report.client.flex;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class FlexReport_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.medassets.report.client.flex.FlexReport>, com.medassets.report.client.flex.FlexReport.Binder {

  interface Template extends SafeHtmlTemplates {
    @Template("General")
    SafeHtml html1();
     
    @Template("Selections")
    SafeHtml html2();
     
    @Template("")
    SafeHtml html3();
     
    @Template("Sorts")
    SafeHtml html4();
     
    @Template("Global Settings")
    SafeHtml html5();
     
  }

  Template template = GWT.create(Template.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.medassets.report.client.flex.FlexReport owner) {

    com.medassets.report.client.flex.FlexReport_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.medassets.report.client.flex.FlexReport_BinderImpl_GenBundle) GWT.create(com.medassets.report.client.flex.FlexReport_BinderImpl_GenBundle.class);
    com.medassets.report.client.flex.FlexGeneralPanel flexGeneralPanel = new com.medassets.report.client.flex.FlexGeneralPanel();
    com.google.gwt.user.client.ui.ScrollPanel f_ScrollPanel2 = (com.google.gwt.user.client.ui.ScrollPanel) GWT.create(com.google.gwt.user.client.ui.ScrollPanel.class);
    com.medassets.report.client.flex.FlexSelectPanel flexSelectPanel = new com.medassets.report.client.flex.FlexSelectPanel();
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel3 = new com.google.gwt.user.client.ui.HTMLPanel(template.html3().asString());
    com.medassets.report.client.flex.FlexGlobalSettingsPanel flexGlobalPanel = new com.medassets.report.client.flex.FlexGlobalSettingsPanel();
    com.google.gwt.user.client.ui.ScrollPanel f_ScrollPanel4 = (com.google.gwt.user.client.ui.ScrollPanel) GWT.create(com.google.gwt.user.client.ui.ScrollPanel.class);
    com.google.gwt.user.client.ui.TabLayoutPanel f_TabLayoutPanel1 = new com.google.gwt.user.client.ui.TabLayoutPanel(2.5, com.google.gwt.dom.client.Style.Unit.EM);

    f_ScrollPanel2.add(flexGeneralPanel);
    f_TabLayoutPanel1.add(f_ScrollPanel2, template.html1().asString(), true);
    f_TabLayoutPanel1.add(flexSelectPanel, template.html2().asString(), true);
    f_TabLayoutPanel1.add(f_HTMLPanel3, template.html4().asString(), true);
    f_ScrollPanel4.add(flexGlobalPanel);
    f_TabLayoutPanel1.add(f_ScrollPanel4, template.html5().asString(), true);



    owner.flexGeneralPanel = flexGeneralPanel;
    owner.flexGlobalPanel = flexGlobalPanel;
    owner.flexSelectPanel = flexSelectPanel;

    return f_TabLayoutPanel1;
  }
}
