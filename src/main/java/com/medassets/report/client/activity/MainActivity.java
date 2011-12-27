package com.medassets.report.client.activity;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TreeItem;
import com.medassets.report.client.library.*;
import com.medassets.report.client.place.MainPlace;
import com.medassets.report.client.place.ReportPlace;
import com.medassets.report.shared.TreeItemDTO;
import org.apache.log4j.chainsaw.Main;

/**
 * Created by IntelliJ IDEA.
 * User: lkumili
 * Date: 12/6/11
 * Time: 2:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class MainActivity extends AbstractActivity implements MainView.Presenter{

    private ClientFactory clientFactory;

    private String name;

    private MainNavTree tree;

    private ReportTable table;
     MainView mainView;

    private String selectedParent;

    public MainActivity(MainPlace place,ClientFactory clientFactory){
      //TODO:  this.tree= place.
        this.name= place.getMainToken();
        this.clientFactory=clientFactory;
    }
    @Override
    public void start(AcceptsOneWidget acceptsOneWidget, EventBus eventBus) {

        mainView = clientFactory.getMainView();
        mainView.setPresenter(this);
        mainView.getTree().setReportTable(mainView.getTable());
        mainView.getTree().refresh();
        mainView.getTree().addSelectionHandler(new SelectionHandler<TreeItem>() {
            public void onSelection(SelectionEvent<TreeItem> event) {
                 String token;
                TreeItem ti = event.getSelectedItem();
                TreeItemDTO dto = (TreeItemDTO) ti.getUserObject();
                mainView.getTable().changeView(dto);
                selectedParent = dto.getParent().getName();
                token = dto.getParent().getName() + ":" + dto.getName();
                goTO(new ReportPlace(token));

            }
        });
        acceptsOneWidget.setWidget(mainView.asWidget());
    }

    @Override
    public void goTO(Place place) {
        clientFactory.getPlaceController().goTo(place);
    }

    public  MainView getMainView(){
        return mainView;
    }

    public String getSelectedParent() {
        return selectedParent;
    }

    public void setSelectedParent(String selectedParent) {
        this.selectedParent = selectedParent;
    }
}
