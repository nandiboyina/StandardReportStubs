package com.medassets.report.client.library;

import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.PlaceController;

/**
 * Created by IntelliJ IDEA.
 * User: lkumili
 * Date: 12/6/11
 * Time: 12:10 PM
 * To change this template use File | Settings | File Templates.
 */
public interface ClientFactory {

    EventBus getEventBus();
    PlaceController getPlaceController();
    MainView getMainView();


}
