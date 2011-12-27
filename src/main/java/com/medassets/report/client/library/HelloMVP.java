package com.medassets.report.client.library;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.ui.*;
import com.medassets.report.client.mvp.ReportActivityMapper;
import com.medassets.report.client.mvp.ReportPlaceHistorymapper;
import com.medassets.report.client.place.MainPlace;

/**
 * Created by IntelliJ IDEA.
 * User: lkumili
 * Date: 12/7/11
 * Time: 8:48 AM
 * To change this template use File | Settings | File Templates.
 */
public class HelloMVP implements EntryPoint{

    private Place defaultPlace= new MainPlace("World!");
    private SimplePanel appWidget= new SimplePanel();

    private DockLayoutPanel dockLayoutPanel;
    @Override
    public void onModuleLoad() {

      /*  ClientFactory clientFactory= GWT.create(ClientFactory.class);
        EventBus eventBus= clientFactory.getEventBus();
        PlaceController placeController= clientFactory.getPlaceController();


        ActivityMapper activityMapper=  new ReportActivityMapper(clientFactory);
        ActivityManager activityManager= new ActivityManager(activityMapper,eventBus);
      //  dockLayoutPanel= clientFactory.getMainView().getDockLayoutPanel();
        appWidget.add(dockLayoutPanel);
        activityManager.setDisplay(appWidget);

        ReportPlaceHistorymapper historymapper= GWT.create(ReportPlaceHistorymapper.class);
        PlaceHistoryHandler historyHandler= new PlaceHistoryHandler(historymapper);
        historyHandler.register(placeController,eventBus,defaultPlace)  ;
        historyHandler.handleCurrentHistory();
		
		RootPanel.get().add(appWidget);*/

    }
}
