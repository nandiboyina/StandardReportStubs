package com.medassets.report.client.library;


import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.*;
import com.medassets.report.client.mvp.ReportActivityMapper;
import com.medassets.report.client.mvp.ReportPlaceHistorymapper;
import com.medassets.report.client.place.MainPlace;

public class ReportViewImpl implements EntryPoint {
    private static ReportViewImplUiBinder uiBinder = GWT.create(ReportViewImplUiBinder.class);


    interface ReportViewImplUiBinder extends UiBinder<DockLayoutPanel, ReportViewImpl> {
    }

    private Place defaultPlace = new MainPlace("main");
    @UiField
    OneWidgetLayoutPanel mainViewPanel;


    @Override
    public void onModuleLoad() {
        DockLayoutPanel dockLayoutPanel = uiBinder.createAndBindUi(this);
        ClientFactory clientFactory = GWT.create(ClientFactory.class);
        EventBus eventBus = clientFactory.getEventBus();
        PlaceController placeController = clientFactory.getPlaceController();
        MainView mainView= clientFactory.getMainView();

        ReportActivityMapper activityMapper = new ReportActivityMapper(clientFactory);
        ActivityManager activityManager = new ActivityManager(activityMapper, eventBus);
        activityManager.setDisplay(mainViewPanel);


        ReportPlaceHistorymapper historymapper = GWT.create(ReportPlaceHistorymapper.class);
        PlaceHistoryHandler historyHandler = new PlaceHistoryHandler(historymapper);
        historyHandler.register(placeController, eventBus, defaultPlace);

        RootLayoutPanel.get().add(dockLayoutPanel);
        historyHandler.handleCurrentHistory();

    }


}
