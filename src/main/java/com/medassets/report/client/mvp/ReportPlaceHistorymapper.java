package com.medassets.report.client.mvp;

import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import com.medassets.report.client.place.MainPlace;
import com.medassets.report.client.place.ReportPlace;

/**
 * Created by IntelliJ IDEA.
 * User: lkumili
 * Date: 12/6/11
 * Time: 1:49 PM
 * To change this template use File | Settings | File Templates.
 */
@WithTokenizers( { MainPlace.Tokenizer.class, ReportPlace.Tokenizer.class})
public interface ReportPlaceHistorymapper extends PlaceHistoryMapper{
}
