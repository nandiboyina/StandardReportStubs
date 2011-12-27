package com.medassets.report.client.library;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.SplitLayoutPanel;

public class ReportLibrary_LibraryUIBinderImpl implements UiBinder<com.google.gwt.user.client.ui.SplitLayoutPanel, com.medassets.report.client.library.ReportLibrary>, com.medassets.report.client.library.ReportLibrary.LibraryUIBinder {

  public com.google.gwt.user.client.ui.SplitLayoutPanel createAndBindUi(final com.medassets.report.client.library.ReportLibrary owner) {

    com.medassets.report.client.library.ReportLibrary_LibraryUIBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.medassets.report.client.library.ReportLibrary_LibraryUIBinderImpl_GenBundle) GWT.create(com.medassets.report.client.library.ReportLibrary_LibraryUIBinderImpl_GenBundle.class);
    com.medassets.report.client.library.ReportLibrary_LibraryUIBinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.medassets.report.client.library.MainNavTree tree = (com.medassets.report.client.library.MainNavTree) GWT.create(com.medassets.report.client.library.MainNavTree.class);
    com.medassets.report.client.library.ReportTable table = (com.medassets.report.client.library.ReportTable) GWT.create(com.medassets.report.client.library.ReportTable.class);
    com.google.gwt.user.client.ui.SplitLayoutPanel f_SplitLayoutPanel1 = (com.google.gwt.user.client.ui.SplitLayoutPanel) GWT.create(com.google.gwt.user.client.ui.SplitLayoutPanel.class);

    f_SplitLayoutPanel1.addWest(tree, 250);
    table.setStyleName("" + style.mainPanel() + "");
    f_SplitLayoutPanel1.add(table);
    f_SplitLayoutPanel1.setStyleName("" + style.pageContent() + "");



    owner.table = table;
    owner.tree = tree;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_SplitLayoutPanel1;
  }
}
