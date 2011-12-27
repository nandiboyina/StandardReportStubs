package com.medassets.report.client.flex.selection.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class AndOrDialog_AndOrDialogUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.medassets.report.client.flex.selection.view.AndOrDialog>, com.medassets.report.client.flex.selection.view.AndOrDialog.AndOrDialogUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<span id='{0}'></span>")
    SafeHtml html1(String arg0);
     
  }

  Template template = GWT.create(Template.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.medassets.report.client.flex.selection.view.AndOrDialog owner) {

    com.medassets.report.client.flex.selection.view.AndOrDialog_AndOrDialogUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.medassets.report.client.flex.selection.view.AndOrDialog_AndOrDialogUiBinderImpl_GenBundle) GWT.create(com.medassets.report.client.flex.selection.view.AndOrDialog_AndOrDialogUiBinderImpl_GenBundle.class);
    com.medassets.report.client.flex.selection.view.AndOrDialog_AndOrDialogUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label title = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.HorizontalPanel hpOne = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
    com.google.gwt.user.client.ui.RadioButton andRadioButton = new com.google.gwt.user.client.ui.RadioButton("new name");
    com.google.gwt.user.client.ui.RadioButton orRadioButton = new com.google.gwt.user.client.ui.RadioButton("new name");
    com.google.gwt.user.client.ui.RadioButton andNotRadioButton = new com.google.gwt.user.client.ui.RadioButton("new name");
    com.google.gwt.user.client.ui.RadioButton orNotRadioButton = new com.google.gwt.user.client.ui.RadioButton("new name");
    com.google.gwt.user.client.ui.AbsolutePanel f_AbsolutePanel4 = (com.google.gwt.user.client.ui.AbsolutePanel) GWT.create(com.google.gwt.user.client.ui.AbsolutePanel.class);
    com.google.gwt.user.client.ui.TextBox paramDescLblBox = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.google.gwt.user.client.ui.Label paramDescHeader = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.AbsolutePanel f_AbsolutePanel5 = (com.google.gwt.user.client.ui.AbsolutePanel) GWT.create(com.google.gwt.user.client.ui.AbsolutePanel.class);
    com.google.gwt.user.client.ui.Button okBtn = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.client.ui.Button cancelBtn = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.client.ui.AbsolutePanel f_AbsolutePanel6 = (com.google.gwt.user.client.ui.AbsolutePanel) GWT.create(com.google.gwt.user.client.ui.AbsolutePanel.class);
    com.google.gwt.user.client.ui.AbsolutePanel f_AbsolutePanel3 = (com.google.gwt.user.client.ui.AbsolutePanel) GWT.create(com.google.gwt.user.client.ui.AbsolutePanel.class);
    com.google.gwt.user.client.ui.VerticalPanel f_VerticalPanel2 = (com.google.gwt.user.client.ui.VerticalPanel) GWT.create(com.google.gwt.user.client.ui.VerticalPanel.class);
    com.google.gwt.user.client.ui.DialogBox mainPanel = new com.google.gwt.user.client.ui.DialogBox(false, true);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template.html1(domId0).asString());

    title.setText("Select All");
    hpOne.add(title);
    f_AbsolutePanel3.add(hpOne, 0, 0);
    andRadioButton.setText("AND");
    andRadioButton.setChecked(true);
    f_AbsolutePanel4.add(andRadioButton, 10, 10);
    orRadioButton.setText("OR");
    f_AbsolutePanel4.add(orRadioButton, 95, 10);
    andNotRadioButton.setText("AND NOT");
    f_AbsolutePanel4.add(andNotRadioButton, 277, 10);
    orNotRadioButton.setText("OR NOT");
    f_AbsolutePanel4.add(orNotRadioButton, 177, 10);
    f_AbsolutePanel4.setHeight("36px");
    f_AbsolutePanel4.setWidth("450px");
    f_AbsolutePanel3.add(f_AbsolutePanel4, 0, 24);
    paramDescLblBox.setHeight("26px");
    paramDescLblBox.setReadOnly(true);
    paramDescLblBox.setWidth("404px");
    f_AbsolutePanel5.add(paramDescLblBox, 0, 34);
    paramDescHeader.setText("New Label");
    paramDescHeader.setHeight("18px");
    paramDescHeader.setWidth("414px");
    f_AbsolutePanel5.add(paramDescHeader, -2, 10);
    f_AbsolutePanel5.setHeight("78px");
    f_AbsolutePanel5.setWidth("414px");
    f_AbsolutePanel3.add(f_AbsolutePanel5, 0, 89);
    okBtn.setText("OK");
    okBtn.setWidth("67px");
    f_AbsolutePanel6.add(okBtn, 98, 0);
    cancelBtn.setText("CANCEL");
    cancelBtn.setHeight("24px");
    cancelBtn.setWidth("67px");
    f_AbsolutePanel6.add(cancelBtn, 187, 0);
    f_AbsolutePanel6.setHeight("45px");
    f_AbsolutePanel6.setWidth("414px");
    f_AbsolutePanel3.add(f_AbsolutePanel6, 0, 186);
    f_AbsolutePanel3.setHeight("279px");
    f_VerticalPanel2.add(f_AbsolutePanel3);
    f_VerticalPanel2.setHeight("278px");
    f_VerticalPanel2.setWidth("424px");
    mainPanel.setWidget(f_VerticalPanel2);
    mainPanel.setHeight("286px");
    mainPanel.setGlassEnabled(true);
    mainPanel.setAnimationEnabled(true);
    mainPanel.setWidth("450px");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(mainPanel, domId0Element);


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.handleClick2(event);
      }
    };
    andRadioButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.handleClick3(event);
      }
    };
    orRadioButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.handleClick4(event);
      }
    };
    andNotRadioButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.handleClick5(event);
      }
    };
    orNotRadioButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames5 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.handleClick1(event);
      }
    };
    cancelBtn.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames5);

    owner.cancelBtn = cancelBtn;
    owner.mainPanel = mainPanel;
    owner.okBtn = okBtn;
    owner.paramDescHeader = paramDescHeader;
    owner.paramDescLblBox = paramDescLblBox;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
