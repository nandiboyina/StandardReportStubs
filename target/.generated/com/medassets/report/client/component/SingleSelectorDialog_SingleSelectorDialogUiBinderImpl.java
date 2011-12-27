package com.medassets.report.client.component;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.medassets.report.client.component.SingleSelectorDialog;

public class SingleSelectorDialog_SingleSelectorDialogUiBinderImpl implements UiBinder<com.medassets.report.client.component.SingleSelectorDialog, com.medassets.report.client.component.SingleSelectorDialog>, com.medassets.report.client.component.SingleSelectorDialog.SingleSelectorDialogUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("Select All")
    SafeHtml html1();
     
    @Template("<span id='{0}'></span> <span id='{1}'></span>")
    SafeHtml html2(String arg0, String arg1);
     
    @Template("<span id='{0}'></span> <span id='{1}'></span> <span id='{2}'></span>")
    SafeHtml html3(String arg0, String arg1, String arg2);
     
  }

  Template template = GWT.create(Template.class);

  public com.medassets.report.client.component.SingleSelectorDialog createAndBindUi(final com.medassets.report.client.component.SingleSelectorDialog owner) {

    com.medassets.report.client.component.SingleSelectorDialog_SingleSelectorDialogUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.medassets.report.client.component.SingleSelectorDialog_SingleSelectorDialogUiBinderImpl_GenBundle) GWT.create(com.medassets.report.client.component.SingleSelectorDialog_SingleSelectorDialogUiBinderImpl_GenBundle.class);
    com.medassets.report.client.component.SingleSelectorDialog_SingleSelectorDialogUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label5 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.Label availableCount = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.Label f_Label6 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.CheckBox selectAllCheckBox = (com.google.gwt.user.client.ui.CheckBox) GWT.create(com.google.gwt.user.client.ui.CheckBox.class);
    com.medassets.report.client.other.HorizontalFlowPanel f_HorizontalFlowPanel4 = (com.medassets.report.client.other.HorizontalFlowPanel) GWT.create(com.medassets.report.client.other.HorizontalFlowPanel.class);
    com.google.gwt.user.client.ui.LayoutPanel f_LayoutPanel3 = (com.google.gwt.user.client.ui.LayoutPanel) GWT.create(com.google.gwt.user.client.ui.LayoutPanel.class);
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.cellview.client.CellTable availableTable = owner.availableTable;
    com.google.gwt.user.client.ui.ScrollPanel availableScrollPanel = (com.google.gwt.user.client.ui.ScrollPanel) GWT.create(com.google.gwt.user.client.ui.ScrollPanel.class);
    com.google.gwt.user.client.ui.LayoutPanel mainPanel = (com.google.gwt.user.client.ui.LayoutPanel) GWT.create(com.google.gwt.user.client.ui.LayoutPanel.class);
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.ListBox criteria = (com.google.gwt.user.client.ui.ListBox) GWT.create(com.google.gwt.user.client.ui.ListBox.class);
    com.google.gwt.user.client.ui.TextBox search = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel8 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button okButton = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    java.lang.String domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button cancelButton = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel9 = new com.google.gwt.user.client.ui.HTMLPanel(template.html2(domId3, domId4).asString());
    com.google.gwt.user.client.ui.LayoutPanel f_LayoutPanel7 = (com.google.gwt.user.client.ui.LayoutPanel) GWT.create(com.google.gwt.user.client.ui.LayoutPanel.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel2 = new com.google.gwt.user.client.ui.HTMLPanel(template.html3(domId0, domId1, domId2).asString());
    com.medassets.report.client.component.SingleSelectorDialog f_SingleSelectorDialog1 = owner.createDialog();

    f_Label5.setText("Available (");
    f_HorizontalFlowPanel4.add(f_Label5);
    f_HorizontalFlowPanel4.add(availableCount);
    f_Label6.setText(")        ");
    f_HorizontalFlowPanel4.add(f_Label6);
    selectAllCheckBox.setHTML(template.html1().asString());
    selectAllCheckBox.setStyleName("" + style.selectAll() + "");
    f_HorizontalFlowPanel4.add(selectAllCheckBox);
    f_LayoutPanel3.add(f_HorizontalFlowPanel4);
    f_LayoutPanel3.setWidgetLeftWidth(f_HorizontalFlowPanel4, 1, com.google.gwt.dom.client.Style.Unit.PX, 300, com.google.gwt.dom.client.Style.Unit.PX);
    f_LayoutPanel3.setHeight("20px");
    f_LayoutPanel3.setWidth("670px");
    availableScrollPanel.add(availableTable);
    availableScrollPanel.setStyleName("" + style.listPanels() + "");
    mainPanel.add(availableScrollPanel);
    mainPanel.setWidgetLeftWidth(availableScrollPanel, 1, com.google.gwt.dom.client.Style.Unit.PX, 665, com.google.gwt.dom.client.Style.Unit.PX);
    mainPanel.setHeight("450px");
    mainPanel.setWidth("670px");
    criteria.addItem("Starts with");
    criteria.addItem("Contains", "2");
    f_HorizontalPanel8.add(criteria);
    search.setStyleName("" + style.searchBox() + "");
    f_HorizontalPanel8.add(search);
    f_HorizontalPanel8.setStyleName("" + style.bottomPanel() + "");
    f_LayoutPanel7.add(f_HorizontalPanel8);
    f_LayoutPanel7.setWidgetLeftWidth(f_HorizontalPanel8, 1, com.google.gwt.dom.client.Style.Unit.PX, 50, com.google.gwt.dom.client.Style.Unit.PCT);
    okButton.setStyleName("" + style.okButton() + "");
    okButton.setText("OK");
    cancelButton.setStyleName("" + style.okButton() + "");
    cancelButton.setText("Cancel");
    f_HTMLPanel9.setStyleName("" + style.buttonPanel() + "");
    f_LayoutPanel7.add(f_HTMLPanel9);
    f_LayoutPanel7.setWidgetRightWidth(f_HTMLPanel9, 1, com.google.gwt.dom.client.Style.Unit.PX, 200, com.google.gwt.dom.client.Style.Unit.PX);
    f_LayoutPanel7.setHeight("34px");
    f_LayoutPanel7.setWidth("100%");
    f_HTMLPanel2.setStyleName("" + style.html_panel() + "");
    f_SingleSelectorDialog1.add(f_HTMLPanel2);

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel2.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    UiBinderUtil.TempAttachment attachRecord1 = UiBinderUtil.attachToDom(f_HTMLPanel9.getElement());
    com.google.gwt.user.client.Element domId3Element = com.google.gwt.dom.client.Document.get().getElementById(domId3).cast();
    com.google.gwt.user.client.Element domId4Element = com.google.gwt.dom.client.Document.get().getElementById(domId4).cast();
    attachRecord1.detach();
    f_HTMLPanel9.addAndReplaceElement(okButton, domId3Element);
    f_HTMLPanel9.addAndReplaceElement(cancelButton, domId4Element);
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    attachRecord0.detach();
    f_HTMLPanel2.addAndReplaceElement(f_LayoutPanel3, domId0Element);
    f_HTMLPanel2.addAndReplaceElement(mainPanel, domId1Element);
    f_HTMLPanel2.addAndReplaceElement(f_LayoutPanel7, domId2Element);


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onOkButtonClick(event);
      }
    };
    okButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    final com.google.gwt.event.logical.shared.ValueChangeHandler<java.lang.Boolean> handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.logical.shared.ValueChangeHandler<java.lang.Boolean>() {
      public void onValueChange(com.google.gwt.event.logical.shared.ValueChangeEvent<java.lang.Boolean> event) {
        owner.onSelectAllValueChange(event);
      }
    };
    selectAllCheckBox.addValueChangeHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onCancelButtonClick(event);
      }
    };
    cancelButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3);

    final com.google.gwt.event.dom.client.ChangeHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4 = new com.google.gwt.event.dom.client.ChangeHandler() {
      public void onChange(com.google.gwt.event.dom.client.ChangeEvent event) {
        owner.onCriteriaChange(event);
      }
    };
    criteria.addChangeHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4);

    final com.google.gwt.event.dom.client.KeyUpHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames5 = new com.google.gwt.event.dom.client.KeyUpHandler() {
      public void onKeyUp(com.google.gwt.event.dom.client.KeyUpEvent event) {
        owner.onSearchKeyUp(event);
      }
    };
    search.addKeyUpHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames5);

    owner.availableCount = availableCount;
    owner.availableScrollPanel = availableScrollPanel;
    owner.cancelButton = cancelButton;
    owner.criteria = criteria;
    owner.mainPanel = mainPanel;
    owner.okButton = okButton;
    owner.search = search;
    owner.selectAllCheckBox = selectAllCheckBox;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_SingleSelectorDialog1;
  }
}
