package com.medassets.report.client.flex.selection.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class SelectTabView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.medassets.report.client.flex.selection.view.SelectTabView>, com.medassets.report.client.flex.selection.view.SelectTabView.Binder {

  interface Template extends SafeHtmlTemplates {
    @Template("<span id='{0}'></span>")
    SafeHtml html1(String arg0);
     
  }

  Template template = GWT.create(Template.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.medassets.report.client.flex.selection.view.SelectTabView owner) {

    com.medassets.report.client.flex.selection.view.SelectTabView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.medassets.report.client.flex.selection.view.SelectTabView_BinderImpl_GenBundle) GWT.create(com.medassets.report.client.flex.selection.view.SelectTabView_BinderImpl_GenBundle.class);
    com.medassets.report.client.flex.selection.view.SelectTabView_BinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label3 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.Label f_Label4 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.Button rightMoveBtn = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.client.ui.Button matchBtn = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.client.ui.Button andOrBtn = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.client.ui.Button leftMoveBtn = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.medassets.report.client.flex.selection.widgets.AvailableParameterListBox leftSideParametersListBox = (com.medassets.report.client.flex.selection.widgets.AvailableParameterListBox) GWT.create(com.medassets.report.client.flex.selection.widgets.AvailableParameterListBox.class);
    com.google.gwt.user.cellview.client.CellTable leftSideParameterCodesTable = owner.leftSideParameterCodesTable;
    com.google.gwt.user.client.ui.ScrollPanel f_ScrollPanel5 = (com.google.gwt.user.client.ui.ScrollPanel) GWT.create(com.google.gwt.user.client.ui.ScrollPanel.class);
    com.google.gwt.user.client.ui.AbsolutePanel leftSideParameterCodesListPanel = (com.google.gwt.user.client.ui.AbsolutePanel) GWT.create(com.google.gwt.user.client.ui.AbsolutePanel.class);
    com.google.gwt.user.client.ui.Button returnBtn = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.cellview.client.CellTable rightSideInclusionsListTable = owner.rightSideInclusionsListTable;
    com.google.gwt.user.client.ui.ScrollPanel f_ScrollPanel7 = (com.google.gwt.user.client.ui.ScrollPanel) GWT.create(com.google.gwt.user.client.ui.ScrollPanel.class);
    com.google.gwt.user.client.ui.AbsolutePanel f_AbsolutePanel6 = (com.google.gwt.user.client.ui.AbsolutePanel) GWT.create(com.google.gwt.user.client.ui.AbsolutePanel.class);
    com.google.gwt.user.client.ui.Label parameterLbl = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.Button searchBtn = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.client.ui.AbsolutePanel f_AbsolutePanel2 = (com.google.gwt.user.client.ui.AbsolutePanel) GWT.create(com.google.gwt.user.client.ui.AbsolutePanel.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template.html1(domId0).asString());

    f_Label3.setText("Available:");
    f_AbsolutePanel2.add(f_Label3, 10, 32);
    f_Label4.setText("Selected:");
    f_AbsolutePanel2.add(f_Label4, 370, 32);
    rightMoveBtn.setText(">");
    rightMoveBtn.setHeight("24px");
    rightMoveBtn.setWidth("50px");
    f_AbsolutePanel2.add(rightMoveBtn, 307, 209);
    matchBtn.setText("Match");
    matchBtn.setHeight("24px");
    matchBtn.setWidth("50px");
    f_AbsolutePanel2.add(matchBtn, 307, 362);
    andOrBtn.setText("And/Or");
    andOrBtn.setHeight("24px");
    andOrBtn.setWidth("50px");
    f_AbsolutePanel2.add(andOrBtn, 307, 320);
    leftMoveBtn.setText("<");
    leftMoveBtn.setHeight("24px");
    leftMoveBtn.setWidth("50px");
    f_AbsolutePanel2.add(leftMoveBtn, 307, 252);
    leftSideParametersListBox.setHeight("509px");
    leftSideParametersListBox.setMultipleSelect(false);
    leftSideParametersListBox.setWidth("283px");
    leftSideParametersListBox.setVisibleItemCount(32000);
    f_AbsolutePanel2.add(leftSideParametersListBox, 10, 56);
    leftSideParameterCodesTable.setTableLayoutFixed(true);
    leftSideParameterCodesTable.setKeyboardPagingPolicy(com.google.gwt.user.cellview.client.HasKeyboardPagingPolicy.KeyboardPagingPolicy.INCREASE_RANGE);
    leftSideParameterCodesTable.setHeight("42px");
    leftSideParameterCodesTable.setTabIndex(1);
    leftSideParameterCodesTable.setWidth("265px");
    leftSideParameterCodesTable.setPageSize(32000);
    leftSideParameterCodesTable.setFocus(true);
    leftSideParameterCodesTable.setRowCount(29);
    f_ScrollPanel5.add(leftSideParameterCodesTable);
    f_ScrollPanel5.setHeight("509px");
    f_ScrollPanel5.setAlwaysShowScrollBars(false);
    f_ScrollPanel5.setWidth("283px");
    leftSideParameterCodesListPanel.add(f_ScrollPanel5, 0, 0);
    leftSideParameterCodesListPanel.setStyleName("mainPanel");
    leftSideParameterCodesListPanel.setHeight("509px");
    leftSideParameterCodesListPanel.setWidth("283px");
    f_AbsolutePanel2.add(leftSideParameterCodesListPanel, 10, 56);
    returnBtn.setStyleName("" + style.backButton() + "");
    returnBtn.setText("Return");
    returnBtn.setHeight("22px");
    returnBtn.setWidth("57px");
    f_AbsolutePanel2.add(returnBtn, 173, 28);
    rightSideInclusionsListTable.setHeight("65px");
    rightSideInclusionsListTable.setWidth("242px");
    rightSideInclusionsListTable.setFocus(true);
    f_ScrollPanel7.add(rightSideInclusionsListTable);
    f_ScrollPanel7.setHeight("509px");
    f_ScrollPanel7.setAlwaysShowScrollBars(true);
    f_ScrollPanel7.setWidth("260px");
    f_AbsolutePanel6.add(f_ScrollPanel7, 0, 0);
    f_AbsolutePanel6.setStyleName("mainPanel");
    f_AbsolutePanel6.setHeight("509px");
    f_AbsolutePanel6.setWidth("260px");
    f_AbsolutePanel2.add(f_AbsolutePanel6, 370, 56);
    parameterLbl.setText("");
    f_AbsolutePanel2.add(parameterLbl, 10, 8);
    searchBtn.setStyleName("" + style.searchButton() + "");
    searchBtn.setText("Search");
    searchBtn.setHeight("22px");
    searchBtn.setWidth("57px");
    f_AbsolutePanel2.add(searchBtn, 236, 28);
    f_AbsolutePanel2.setStyleName("mainPanel");
    f_AbsolutePanel2.setHeight("575px");
    f_AbsolutePanel2.setWidth("642px");
    f_HTMLPanel1.setHeight("939");
    f_HTMLPanel1.setWidth("678");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(f_AbsolutePanel2, domId0Element);


    owner.andOrBtn = andOrBtn;
    owner.leftMoveBtn = leftMoveBtn;
    owner.leftSideParameterCodesListPanel = leftSideParameterCodesListPanel;
    owner.leftSideParametersListBox = leftSideParametersListBox;
    owner.matchBtn = matchBtn;
    owner.parameterLbl = parameterLbl;
    owner.returnBtn = returnBtn;
    owner.rightMoveBtn = rightMoveBtn;
    owner.searchBtn = searchBtn;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_HTMLPanel1;
  }
}
