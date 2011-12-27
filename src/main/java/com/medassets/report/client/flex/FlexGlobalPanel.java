package com.medassets.report.client.flex;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.ResizeComposite;
import com.google.gwt.user.client.ui.Widget;

public class FlexGlobalPanel extends ResizeComposite {

    interface Binder extends UiBinder<Widget, FlexGlobalPanel> {
    }

    private static final Binder binder = GWT.create(Binder.class);




    public FlexGlobalPanel() {
        super();

        initWidget(binder.createAndBindUi(this));
    }




}
