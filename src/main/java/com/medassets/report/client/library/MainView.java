package com.medassets.report.client.library;

import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.IsWidget;

/**
 * Created by IntelliJ IDEA.
 * User: lkumili
 * Date: 12/6/11
 * Time: 1:52 PM
 * To change this template use File | Settings | File Templates.
 */
public interface MainView extends IsWidget{

    MainNavTree getTree();
    ReportTable getTable();
    void setTree(MainNavTree tree);
    void setTable(ReportTable table);

    void setPresenter(Presenter presenter);
    public interface Presenter{
        void goTO(Place place);
    }

}
