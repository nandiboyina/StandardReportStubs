package com.medassets.report.client.place;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.medassets.report.client.library.MainNavTree;
import com.medassets.report.client.library.ReportTable;

/**
 * Created by IntelliJ IDEA.
 * User: lkumili
 * Date: 12/15/11
 * Time: 5:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class ReportPlace extends Place {

    private String mainToken;

    private String parent;

    public ReportPlace(String token,String parent) {

       this.mainToken=token;
       this.parent=parent;
    }

     public ReportPlace(String token) {

       this.mainToken=token;
    }

    public ReportPlace(MainNavTree tree, ReportTable table) {

    }

    public String getMainToken() {
        return mainToken;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public static class Tokenizer implements PlaceTokenizer<ReportPlace> {

        public String getToken(ReportPlace place) {
            return place.getMainToken();
        }
         public ReportPlace getPlace(String token) {
           ReportPlace newPlace=new  ReportPlace(token);
             return newPlace;
        }




    }
}
