package com.medassets.report.client.other;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiConstructor;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.ResizeComposite;
import com.google.gwt.user.client.ui.Widget;

public class LabelListBox extends ResizeComposite {


    @UiField
    ListBox listBox;

    @UiField
    Label label;

    interface Binder extends UiBinder<Widget, LabelListBox> {
    }

    private static final Binder binder = GWT.create(Binder.class);

    @UiConstructor
    public LabelListBox() {
        super();
        initWidget(binder.createAndBindUi(this));
    }

    @Override
    public void onLoad() {
    }

    public void setLabelText(String text) {
        label.setText(text);
    }

    public void setLabelWidth(String width) {
        label.getElement().getStyle().setProperty("width", width);
        // make room by moving the listBox too
        listBox.getElement().getStyle().setProperty("left", width);
    }

    public void setLabelTextStyleName(String name) {
        label.setStyleName(name);
    }

    public ListBox getListBox() {
        return listBox;
    }
}
