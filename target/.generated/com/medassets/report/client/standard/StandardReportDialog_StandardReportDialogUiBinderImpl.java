package com.medassets.report.client.standard;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class StandardReportDialog_StandardReportDialogUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.medassets.report.client.standard.StandardReportDialog>, com.medassets.report.client.standard.StandardReportDialog.StandardReportDialogUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<span id='{0}'></span>")
    SafeHtml html1(String arg0);
     
  }

  Template template = GWT.create(Template.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.medassets.report.client.standard.StandardReportDialog owner) {

    com.medassets.report.client.standard.StandardReportDialog_StandardReportDialogUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.medassets.report.client.standard.StandardReportDialog_StandardReportDialogUiBinderImpl_GenBundle) GWT.create(com.medassets.report.client.standard.StandardReportDialog_StandardReportDialogUiBinderImpl_GenBundle.class);
    com.medassets.report.client.standard.StandardReportDialog_StandardReportDialogUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button saveButton = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.client.ui.Button saveAsButton = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.client.ui.Button runButton = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel3 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
    com.medassets.report.client.component.MAFormPanel formPanel = (com.medassets.report.client.component.MAFormPanel) GWT.create(com.medassets.report.client.component.MAFormPanel.class);
    com.google.gwt.user.client.ui.ScrollPanel scrollPanel = (com.google.gwt.user.client.ui.ScrollPanel) GWT.create(com.google.gwt.user.client.ui.ScrollPanel.class);
    com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel2 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template.html1(domId0).asString());

    saveButton.setText("Save");
    f_HorizontalPanel3.add(saveButton);
    saveAsButton.setText("Save As");
    f_HorizontalPanel3.add(saveAsButton);
    runButton.setText("Run");
    f_HorizontalPanel3.add(runButton);
    f_HorizontalPanel3.setStyleName("" + style.dialogButtonPanel() + "");
    f_HorizontalPanel3.setSpacing(1);
    f_VerticalPanel2.add(f_HorizontalPanel3);
    formPanel.setStyleName("" + style.dialogForm() + "");
    scrollPanel.add(formPanel);
    f_VerticalPanel2.add(scrollPanel);

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(f_VerticalPanel2, domId0Element);


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.handleSaveClick(event);
      }
    };
    saveButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.handleSaveAsClick(event);
      }
    };
    saveAsButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.handleRunClick(event);
      }
    };
    runButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3);

    owner.formPanel = formPanel;
    owner.runButton = runButton;
    owner.saveAsButton = saveAsButton;
    owner.saveButton = saveButton;
    owner.scrollPanel = scrollPanel;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
