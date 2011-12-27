package com.medassets.report.client.library;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class MainNavTree_MainNavTreeUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.medassets.report.client.library.MainNavTree>, com.medassets.report.client.library.MainNavTree.MainNavTreeUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<span id='{0}'></span> <span id='{1}'></span>")
    SafeHtml html1(String arg0, String arg1);
     
  }

  Template template = GWT.create(Template.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.medassets.report.client.library.MainNavTree owner) {

    com.medassets.report.client.library.MainNavTree_MainNavTreeUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.medassets.report.client.library.MainNavTree_MainNavTreeUiBinderImpl_GenBundle) GWT.create(com.medassets.report.client.library.MainNavTree_MainNavTreeUiBinderImpl_GenBundle.class);
    com.medassets.report.client.library.MainNavTree_MainNavTreeUiBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label expandAll = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.Label collapseAll = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel3 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.FlowPanel buttonPanel = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel2 = new com.google.gwt.user.client.ui.HTMLPanel(template.html1(domId0, domId1).asString());
    com.google.gwt.user.client.ui.ScrollPanel scrollPanel = (com.google.gwt.user.client.ui.ScrollPanel) GWT.create(com.google.gwt.user.client.ui.ScrollPanel.class);
    com.google.gwt.user.client.ui.DockLayoutPanel f_DockLayoutPanel1 = new com.google.gwt.user.client.ui.DockLayoutPanel(com.google.gwt.dom.client.Style.Unit.EM);

    expandAll.setText("Expand All");
    expandAll.setStyleName("" + style.treeLinks() + "");
    f_HorizontalPanel3.add(expandAll);
    collapseAll.setText("Collapse All");
    collapseAll.setStyleName("" + style.treeLinks() + "");
    f_HorizontalPanel3.add(collapseAll);
    f_HorizontalPanel3.setStyleName("" + style.treeButtonPanel() + "");
    buttonPanel.setStyleName("" + style.treeToolbarButtonPanel() + "");
    f_HTMLPanel2.setStyleName("" + style.treeToolbarPanel() + "");
    f_DockLayoutPanel1.addNorth(f_HTMLPanel2, 5);
    f_DockLayoutPanel1.add(scrollPanel);
    f_DockLayoutPanel1.setStyleName("" + style.westPanel() + "");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel2.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    attachRecord0.detach();
    f_HTMLPanel2.addAndReplaceElement(f_HorizontalPanel3, domId0Element);
    f_HTMLPanel2.addAndReplaceElement(buttonPanel, domId1Element);


    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onExpandAllClick(event);
      }
    };
    expandAll.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onCollapseAllClick(event);
      }
    };
    collapseAll.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

    owner.buttonPanel = buttonPanel;
    owner.collapseAll = collapseAll;
    owner.expandAll = expandAll;
    owner.scrollPanel = scrollPanel;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_DockLayoutPanel1;
  }
}
