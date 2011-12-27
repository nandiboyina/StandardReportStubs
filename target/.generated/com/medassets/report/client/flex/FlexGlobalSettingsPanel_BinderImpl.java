package com.medassets.report.client.flex;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class FlexGlobalSettingsPanel_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.medassets.report.client.flex.FlexGlobalSettingsPanel>, com.medassets.report.client.flex.FlexGlobalSettingsPanel.Binder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.medassets.report.client.flex.FlexGlobalSettingsPanel owner) {

    com.medassets.report.client.flex.FlexGlobalSettingsPanel_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.medassets.report.client.flex.FlexGlobalSettingsPanel_BinderImpl_GenBundle) GWT.create(com.medassets.report.client.flex.FlexGlobalSettingsPanel_BinderImpl_GenBundle.class);
    com.medassets.report.client.flex.FlexGlobalSettingsPanel_BinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.google.gwt.user.client.ui.VerticalPanel formPanel = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
    com.google.gwt.user.client.ui.FormPanel f_FormPanel1 = (com.google.gwt.user.client.ui.FormPanel) GWT.create(com.google.gwt.user.client.ui.FormPanel.class);

    formPanel.setStyleName("" + style.dialogForm() + "");
    f_FormPanel1.add(formPanel);



    owner.formPanel = formPanel;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_FormPanel1;
  }
}
