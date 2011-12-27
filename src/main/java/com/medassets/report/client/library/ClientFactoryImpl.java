package com.medassets.report.client.library;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.place.shared.PlaceController;

/**
 * Created by IntelliJ IDEA.
 * User: lkumili
 * Date: 12/6/11
 * Time: 12:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class ClientFactoryImpl implements  ClientFactory{
    private static final EventBus eventBus= new SimpleEventBus();
    private static final PlaceController placeController= new PlaceController(eventBus);
   private static final MainView mainView= new MainViewImpl();


    @Override
    public EventBus getEventBus() {
        return eventBus;
    }

    @Override
    public PlaceController getPlaceController() {
        return placeController;
    }


    public MainView getMainView(){
        return mainView;
    }
}
