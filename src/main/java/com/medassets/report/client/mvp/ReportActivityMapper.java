package com.medassets.report.client.mvp;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.Tree;
import com.google.gwt.user.client.ui.TreeItem;
import com.medassets.report.client.activity.MainActivity;
import com.medassets.report.client.activity.ReportTableActivity;
import com.medassets.report.client.library.ClientFactory;
import com.medassets.report.client.library.MainNavTree;
import com.medassets.report.client.library.MainView;
import com.medassets.report.client.place.MainPlace;
import com.medassets.report.client.place.ReportPlace;
import com.medassets.report.shared.TreeItemDTO;

import java.util.Iterator;

/**
 * Created by IntelliJ IDEA.
 * User: lkumili
 * Date: 12/6/11
 * Time: 1:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class ReportActivityMapper implements ActivityMapper {

    private ClientFactory clientFactory;
    private MainActivity mainActivity = null;

    public ReportActivityMapper(ClientFactory clientFactory) {
        super();
        this.clientFactory = clientFactory;

    }


    @Override
    public Activity getActivity(Place place) {
           MainView mainView;
        //TODO: Return places for each view defined for report library.
        if (place instanceof MainPlace) {
            {
                mainActivity = new MainActivity((MainPlace) place, clientFactory);
                return mainActivity;
            }
        }
        if (place instanceof ReportPlace) {
            {
                ReportTableActivity reportTableActivity = new ReportTableActivity((ReportPlace) place, clientFactory);
                if (mainActivity != null) {
                    mainView = mainActivity.getMainView();
                } else {
                    MainPlace mainPlace= new MainPlace(((ReportPlace) place).getMainToken());
                    mainActivity=   new MainActivity((MainPlace) mainPlace, clientFactory);
                    mainView=clientFactory.getMainView();
                    intializeMainView(mainView);
                }
                reportTableActivity.setMainView(mainView);
                reportTableActivity.setName(((ReportPlace) place).getMainToken());
                TreeItem item = getTreeForPlace(((ReportPlace) place).getMainToken(), mainView.getTree());
                reportTableActivity.setSelectedItem(item);


                return reportTableActivity;
            }
        }
        return null;
    }

    private TreeItem getTreeForPlace(String placeName, MainNavTree tree) {
        String delims = "[:]";
        String[] tokens = null;
        String parent = "";
        String child = "";
        if (placeName != null) {
            tokens = placeName.split(delims);
            parent = tokens[0];
            child = tokens[1];
        }
        TreeItem treeItem = null;
        Iterator<TreeItem> iter = tree.getTree().treeItemIterator();
        while (iter.hasNext()) {
            TreeItem item = iter.next();
            TreeItemDTO dto = (TreeItemDTO) item.getUserObject();
            if ((child.equalsIgnoreCase(dto.getName())) && (parent.equalsIgnoreCase(dto.getParent().getName()))) {
                treeItem = item;
                tree.getTree().getSelectedItem().setState(false);

                item.setState(true);

            }
        }

        return treeItem;
    }

    private void intializeMainView(final MainView mainView){
          mainView.getTree().setReportTable(mainView.getTable());
        mainView.getTree().refresh();
        mainView.getTree().addSelectionHandler(new SelectionHandler<TreeItem>() {
            public void onSelection(SelectionEvent<TreeItem> event) {
                TreeItem ti = event.getSelectedItem();
                TreeItemDTO dto = (TreeItemDTO) ti.getUserObject();
                mainView.getTable().changeView(dto);
            }
        });
    }
}
