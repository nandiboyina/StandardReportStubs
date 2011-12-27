package com.medassets.report.client.other;


import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiConstructor;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ResizeComposite;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class EditBox extends ResizeComposite {

    @UiField
    TextBox edit;

    @UiField
    Label label;

    interface Binder extends UiBinder<Widget, EditBox> {
    }

    private static final Binder binder = GWT.create(Binder.class);

    @UiConstructor
    public EditBox() {
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
        // make room by moving the editBox too
        edit.getElement().getStyle().setProperty("left", width);
    }

    public void setLabelTextStyleName(String name) {
        label.setStyleName(name);
    }
    
    public void setValue(String text) {
    	edit.setText(text);
    }
}
