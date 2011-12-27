package com.medassets.report.client.library;

import com.google.gwt.user.client.ui.*;

import java.util.Iterator;

/**
 * Created by IntelliJ IDEA.
 * User: lkumili
 * Date: 12/9/11
 * Time: 10:15 AM
 * To change this template use File | Settings | File Templates.
 */
public class OneWidgetLayoutPanel extends LayoutPanel implements AcceptsOneWidget {

    private IsWidget widget = null;

    public void setWidget(IsWidget widget) {
        if (this.widget != null) {
            super.remove(this.widget);

        }

        this.widget = widget;
        if (widget != null) {
            super.add(widget);
        }
    }


}
