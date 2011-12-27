package com.medassets.report.client.place;


import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.medassets.report.client.library.MainNavTree;
import com.medassets.report.client.library.ReportTable;

/**
 * Created by IntelliJ IDEA.
 * User: lkumili
 * Date: 12/6/11
 * Time: 2:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class MainPlace extends Place {

    private String mainToken;

    private MainNavTree tree;

    private ReportTable table;

    public MainPlace(String token) {
        this.mainToken = token;

    }

    public MainPlace(MainNavTree tree, ReportTable table) {
        this.tree = tree;
        this.table = table;

    }

    public String getMainToken() {
        return mainToken;
    }

    public static class Tokenizer implements PlaceTokenizer<MainPlace>{

        public String getToken(MainPlace place) {
            return place.getMainToken();
        }


        public MainPlace getPlace(String token) {
            return new MainPlace(token);
        }
    }
}
