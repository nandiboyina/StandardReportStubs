package com.medassets.report.client.activity;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.Tree;
import com.google.gwt.user.client.ui.TreeItem;
import com.medassets.report.client.library.ClientFactory;
import com.medassets.report.client.library.MainNavTree;
import com.medassets.report.client.library.MainView;
import com.medassets.report.client.library.ReportTable;
import com.medassets.report.client.place.MainPlace;
import com.medassets.report.client.place.ReportPlace;
import com.medassets.report.shared.StandardParamItemDTO;
import com.medassets.report.shared.TreeItemDTO;

import java.util.Iterator;

/**
 * Created by IntelliJ IDEA.
 * User: lkumili
 * Date: 12/15/11
 * Time: 5:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class ReportTableActivity extends AbstractActivity implements MainView.Presenter {

    private ClientFactory clientFactory;

    private String name;

    MainView mainView;

    private TreeItem selectedItem;

    public ReportTableActivity(ReportPlace place, ClientFactory clientFactory) {
        this.clientFactory = clientFactory;
    }

    @Override
    public void start(AcceptsOneWidget acceptsOneWidget, EventBus eventBus) {
        mainView = clientFactory.getMainView();
        mainView.setPresenter(this);
        selectedItem.setState(true);
        TreeItemDTO dto = (TreeItemDTO) selectedItem.getUserObject();
        selectedItem.setSelected(true);
        mainView.getTable().changeView(dto);
        acceptsOneWidget.setWidget(mainView.asWidget());


    }

    @Override
    public void goTO(Place place) {
        clientFactory.getPlaceController().goTo(place);
    }

    public void setMainView(MainView mainView) {
        this.mainView = mainView;
    }

    public MainView getMainView() {
        return mainView;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeItem getSelectedItem() {
        return selectedItem;
    }

    public void setSelectedItem(TreeItem selectedItem) {
        this.selectedItem = selectedItem;
    }
}
