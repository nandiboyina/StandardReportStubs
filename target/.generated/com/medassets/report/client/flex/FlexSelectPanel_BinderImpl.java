package com.medassets.report.client.flex;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class FlexSelectPanel_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.medassets.report.client.flex.FlexSelectPanel>, com.medassets.report.client.flex.FlexSelectPanel.Binder {

  interface Template extends SafeHtmlTemplates {
    @Template("")
    SafeHtml html1();
     
  }

  Template template = GWT.create(Template.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.medassets.report.client.flex.FlexSelectPanel owner) {

    com.medassets.report.client.flex.FlexSelectPanel_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.medassets.report.client.flex.FlexSelectPanel_BinderImpl_GenBundle) GWT.create(com.medassets.report.client.flex.FlexSelectPanel_BinderImpl_GenBundle.class);
    com.google.gwt.user.client.ui.HTMLPanel selectTabPanel = new com.google.gwt.user.client.ui.HTMLPanel(template.html1().asString());




    owner.selectTabPanel = selectTabPanel;

    return selectTabPanel;
  }
}
