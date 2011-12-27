package com.medassets.report.client.component;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.medassets.report.client.component.MultiSelectorDialog;

public class MultiSelectorDialog_MultiSelectorDialogUiBinderImpl implements UiBinder<com.medassets.report.client.component.MultiSelectorDialog, com.medassets.report.client.component.MultiSelectorDialog>, com.medassets.report.client.component.MultiSelectorDialog.MultiSelectorDialogUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("Select All")
    SafeHtml html1();
     
    @Template("&gt;&gt;")
    SafeHtml html2();
     
    @Template("&gt;")
    SafeHtml html3();
     
    @Template("&lt;")
    SafeHtml html4();
     
    @Template("&lt;&lt;")
    SafeHtml html5();
     
    @Template("<span id='{0}'></span> <span id='{1}'></span> <span id='{2}'></span> <span id='{3}'></span>")
    SafeHtml html6(String arg0, String arg1, String arg2, String arg3);
     
    @Template("<span id='{0}'></span> <span id='{1}'></span>")
    SafeHtml html7(String arg0, String arg1);
     
    @Template("<span id='{0}'></span> <span id='{1}'></span> <span id='{2}'></span>")
    SafeHtml html8(String arg0, String arg1, String arg2);
     
  }

  Template template = GWT.create(Template.class);

  public com.medassets.report.client.component.MultiSelectorDialog createAndBindUi(final com.medassets.report.client.component.MultiSelectorDialog owner) {

    com.medassets.report.client.component.MultiSelectorDialog_MultiSelectorDialogUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.medassets.report.client.component.MultiSelectorDialog_MultiSelectorDialogUiBinderImpl_GenBundle) GWT.create(com.medassets.report.client.component.MultiSelectorDialog_MultiSelectorDialogUiBinderImpl_GenBundle.class);
    com.medassets.report.client.component.MultiSelectorDialog_MultiSelectorDialogUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label5 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.Label availableCount = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.Label f_Label6 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.CheckBox selectAllCheckBox = (com.google.gwt.user.client.ui.CheckBox) GWT.create(com.google.gwt.user.client.ui.CheckBox.class);
    com.medassets.report.client.other.HorizontalFlowPanel f_HorizontalFlowPanel4 = (com.medassets.report.client.other.HorizontalFlowPanel) GWT.create(com.medassets.report.client.other.HorizontalFlowPanel.class);
    com.google.gwt.user.client.ui.Label f_Label7 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.Label selectedCount = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.Label f_Label8 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.medassets.report.client.other.HorizontalFlowPanel selectedCountPanel = (com.medassets.report.client.other.HorizontalFlowPanel) GWT.create(com.medassets.report.client.other.HorizontalFlowPanel.class);
    com.google.gwt.user.client.ui.LayoutPanel f_LayoutPanel3 = (com.google.gwt.user.client.ui.LayoutPanel) GWT.create(com.google.gwt.user.client.ui.LayoutPanel.class);
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.cellview.client.CellTable availableTable = owner.availableTable;
    com.google.gwt.user.client.ui.ScrollPanel availableScrollPanel = (com.google.gwt.user.client.ui.ScrollPanel) GWT.create(com.google.gwt.user.client.ui.ScrollPanel.class);
    com.google.gwt.user.cellview.client.CellTable selectedTable = owner.selectedTable;
    com.google.gwt.user.client.ui.ScrollPanel selectScrollPanel = (com.google.gwt.user.client.ui.ScrollPanel) GWT.create(com.google.gwt.user.client.ui.ScrollPanel.class);
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button addAllButton = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button addButton = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    java.lang.String domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button removeButton = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    java.lang.String domId5 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button removeAllButton = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.client.ui.HTMLPanel buttonPanel = new com.google.gwt.user.client.ui.HTMLPanel(template.html6(domId2, domId3, domId4, domId5).asString());
    com.google.gwt.user.client.ui.LayoutPanel mainPanel = (com.google.gwt.user.client.ui.LayoutPanel) GWT.create(com.google.gwt.user.client.ui.LayoutPanel.class);
    java.lang.String domId6 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.ListBox criteria = (com.google.gwt.user.client.ui.ListBox) GWT.create(com.google.gwt.user.client.ui.ListBox.class);
    com.google.gwt.user.client.ui.TextBox search = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel10 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
    java.lang.String domId7 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button okButton = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    java.lang.String domId8 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button cancelButton = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel11 = new com.google.gwt.user.client.ui.HTMLPanel(template.html7(domId7, domId8).asString());
    com.google.gwt.user.client.ui.LayoutPanel f_LayoutPanel9 = (com.google.gwt.user.client.ui.LayoutPanel) GWT.create(com.google.gwt.user.client.ui.LayoutPanel.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel2 = new com.google.gwt.user.client.ui.HTMLPanel(template.html8(domId0, domId1, domId6).asString());
    com.medassets.report.client.component.MultiSelectorDialog f_MultiSelectorDialog1 = owner.createDialog();

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
    f_Label7.setText("Selected (");
    selectedCountPanel.add(f_Label7);
    selectedCountPanel.add(selectedCount);
    f_Label8.setText(")");
    selectedCountPanel.add(f_Label8);
    f_LayoutPanel3.add(selectedCountPanel);
    f_LayoutPanel3.setWidgetRightWidth(selectedCountPanel, 1, com.google.gwt.dom.client.Style.Unit.PX, 300, com.google.gwt.dom.client.Style.Unit.PX);
    f_LayoutPanel3.setHeight("20px");
    f_LayoutPanel3.setWidth("670px");
    availableScrollPanel.add(availableTable);
    availableScrollPanel.setStyleName("" + style.listPanels() + "");
    mainPanel.add(availableScrollPanel);
    mainPanel.setWidgetLeftWidth(availableScrollPanel, 1, com.google.gwt.dom.client.Style.Unit.PX, 300, com.google.gwt.dom.client.Style.Unit.PX);
    selectScrollPanel.add(selectedTable);
    selectScrollPanel.setStyleName("" + style.listPanels() + "");
    mainPanel.add(selectScrollPanel);
    mainPanel.setWidgetRightWidth(selectScrollPanel, 1, com.google.gwt.dom.client.Style.Unit.PX, 300, com.google.gwt.dom.client.Style.Unit.PX);
    addAllButton.setHTML(template.html2().asString());
    addAllButton.setStyleName("" + style.selectorButton() + "");
    addButton.setHTML(template.html3().asString());
    addButton.setStyleName("" + style.selectorButton() + "");
    removeButton.setHTML(template.html4().asString());
    removeButton.setStyleName("" + style.selectorButton() + "");
    removeAllButton.setHTML(template.html5().asString());
    removeAllButton.setStyleName("" + style.selectorButton() + "");
    buttonPanel.setStyleName("" + style.centerBar() + "");
    mainPanel.add(buttonPanel);
    mainPanel.setWidgetLeftWidth(buttonPanel, 315, com.google.gwt.dom.client.Style.Unit.PX, 40, com.google.gwt.dom.client.Style.Unit.PX);
    mainPanel.setHeight("450px");
    mainPanel.setWidth("670px");
    criteria.addItem("Starts with");
    criteria.addItem("Contains", "2");
    f_HorizontalPanel10.add(criteria);
    search.setStyleName("" + style.searchBox() + "");
    f_HorizontalPanel10.add(search);
    f_HorizontalPanel10.setStyleName("" + style.bottomPanel() + "");
    f_LayoutPanel9.add(f_HorizontalPanel10);
    f_LayoutPanel9.setWidgetLeftWidth(f_HorizontalPanel10, 1, com.google.gwt.dom.client.Style.Unit.PX, 50, com.google.gwt.dom.client.Style.Unit.PCT);
    okButton.setStyleName("" + style.okButton() + "");
    okButton.setText("OK");
    cancelButton.setStyleName("" + style.okButton() + "");
    cancelButton.setText("Cancel");
    f_HTMLPanel11.setStyleName("" + style.buttonPanel() + "");
    f_LayoutPanel9.add(f_HTMLPanel11);
    f_LayoutPanel9.setWidgetRightWidth(f_HTMLPanel11, 1, com.google.gwt.dom.client.Style.Unit.PX, 200, com.google.gwt.dom.client.Style.Unit.PX);
    f_LayoutPanel9.setHeight("34px");
    f_LayoutPanel9.setWidth("100%");
    f_HTMLPanel2.setStyleName("" + style.html_panel() + "");
    f_MultiSelectorDialog1.add(f_HTMLPanel2);

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel2.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    UiBinderUtil.TempAttachment attachRecord1 = UiBinderUtil.attachToDom(buttonPanel.getElement());
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    com.google.gwt.user.client.Element domId3Element = com.google.gwt.dom.client.Document.get().getElementById(domId3).cast();
    com.google.gwt.user.client.Element domId4Element = com.google.gwt.dom.client.Document.get().getElementById(domId4).cast();
    com.google.gwt.user.client.Element domId5Element = com.google.gwt.dom.client.Document.get().getElementById(domId5).cast();
    attachRecord1.detach();
    buttonPanel.addAndReplaceElement(addAllButton, domId2Element);
    buttonPanel.addAndReplaceElement(addButton, domId3Element);
    buttonPanel.addAndReplaceElement(removeButton, domId4Element);
    buttonPanel.addAndReplaceElement(removeAllButton, domId5Element);
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    UiBinderUtil.TempAttachment attachRecord2 = UiBinderUtil.attachToDom(f_HTMLPanel11.getElement());
    com.google.gwt.user.client.Element domId7Element = com.google.gwt.dom.client.Document.get().getElementById(domId7).cast();
    com.google.gwt.user.client.Element domId8Element = com.google.gwt.dom.client.Document.get().getElementById(domId8).cast();
    attachRecord2.detach();
    f_HTMLPanel11.addAndReplaceElement(okButton, domId7Element);
    f_HTMLPanel11.addAndReplaceElement(cancelButton, domId8Element);
    com.google.gwt.user.client.Element domId6Element = com.google.gwt.dom.client.Document.get().getElementById(domId6).cast();
    attachRecord0.detach();
    f_HTMLPanel2.addAndReplaceElement(f_LayoutPanel3, domId0Element);
    f_HTMLPanel2.addAndReplaceElement(mainPanel, domId1Element);
    f_HTMLPanel2.addAndReplaceElement(f_LayoutPanel9, domId6Element);


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.handleRemoveAllClick(event);
      }
    };
    removeAllButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onAddAllClick(event);
      }
    };
    addAllButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onRemoveButtonClick(event);
      }
    };
    removeButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onAddButtonClick(event);
      }
    };
    addButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4);

    final com.google.gwt.event.logical.shared.ValueChangeHandler<java.lang.Boolean> handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames5 = new com.google.gwt.event.logical.shared.ValueChangeHandler<java.lang.Boolean>() {
      public void onValueChange(com.google.gwt.event.logical.shared.ValueChangeEvent<java.lang.Boolean> event) {
        owner.onSelectAllValueChange(event);
      }
    };
    selectAllCheckBox.addValueChangeHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames5);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames6 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onOkButtonClick(event);
      }
    };
    okButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames6);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames7 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onCancelButtonClick(event);
      }
    };
    cancelButton.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames7);

    final com.google.gwt.event.dom.client.ChangeHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames8 = new com.google.gwt.event.dom.client.ChangeHandler() {
      public void onChange(com.google.gwt.event.dom.client.ChangeEvent event) {
        owner.onCriteriaChange(event);
      }
    };
    criteria.addChangeHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames8);

    final com.google.gwt.event.dom.client.KeyUpHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames9 = new com.google.gwt.event.dom.client.KeyUpHandler() {
      public void onKeyUp(com.google.gwt.event.dom.client.KeyUpEvent event) {
        owner.onSearchKeyUp(event);
      }
    };
    search.addKeyUpHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames9);

    owner.addAllButton = addAllButton;
    owner.addButton = addButton;
    owner.availableCount = availableCount;
    owner.availableScrollPanel = availableScrollPanel;
    owner.buttonPanel = buttonPanel;
    owner.cancelButton = cancelButton;
    owner.criteria = criteria;
    owner.mainPanel = mainPanel;
    owner.okButton = okButton;
    owner.removeAllButton = removeAllButton;
    owner.removeButton = removeButton;
    owner.search = search;
    owner.selectAllCheckBox = selectAllCheckBox;
    owner.selectScrollPanel = selectScrollPanel;
    owner.selectedCount = selectedCount;
    owner.selectedCountPanel = selectedCountPanel;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_MultiSelectorDialog1;
  }
}
