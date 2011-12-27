package com.medassets.report.client.flex;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.NativeEvent;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Widget;

public class MatchingCharactersDialog extends DialogBox {
    interface Binder extends UiBinder<Widget, MatchingCharactersDialog> {
    }

    private static final Binder uiBinder = GWT.create(Binder.class);


    @UiField
    Button closeButton;

    @UiField
    ListBox planListBox;

    @UiField
    ListBox thatListBox;

    public MatchingCharactersDialog() {
        setText("Select By Matching Characters");
        setWidget(uiBinder.createAndBindUi(this));

        setAnimationEnabled(true);
        setGlassEnabled(true);

        thatListBox.addItem("starts with");
        thatListBox.addItem("contains");
        thatListBox.addItem("ends with");
        thatListBox.addItem("matches exactly");

        planListBox.addItem("code");
    }

    @Override
    protected void onPreviewNativeEvent(Event.NativePreviewEvent preview) {
        super.onPreviewNativeEvent(preview);

        NativeEvent evt = preview.getNativeEvent();
        if (evt.getType().equals("keydown")) {
            // Use the popup's key preview hooks to close the dialog when either
            // enter or escape is pressed.
            switch (evt.getKeyCode()) {
                case KeyCodes.KEY_ENTER:
                case KeyCodes.KEY_ESCAPE:
                    hide();
                    break;
            }
        }
    }

    @UiHandler("closeButton")
    void onSignOutClicked(ClickEvent event) {
        hide();
    }
}
