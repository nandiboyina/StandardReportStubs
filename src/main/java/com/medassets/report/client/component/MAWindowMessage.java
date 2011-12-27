package com.medassets.report.client.component;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * MedAssets version of GWT's Window.Alert widget. This dialog should be used when information needs
 * to be shown to the user. It will contain an informational dialog. If a warning is needed, use
 * MAWindowAlert.
 *
 * Example:
 * // Create a callback function for the Message window...
 * MAWindowCallback cb = new MAWindowCallback() {
 *    // Called when one of the buttons are clicked
 *    // @param buttonIndex - Index of button that was clicked
 *    // @param input - Value user entered (Only applicable in MAWindowPrompt!!)
 *    @Override
 *    public void onClick(int buttonIndex, Object input) {
 *       if (buttonIndex == 0) { // user clicked the "Delete" button
 *          service.deleteFolder(selectedDto, new AsyncCallback<String>() {
 *             @Override
 *             public void onFailure(Throwable caught) {
 *                GWT.log(caught.getMessage(), caught);
 *             }
 *
 *             @Override
 *             public void onSuccess(String result) {
 *                tree.removeItem(selectedTreeItem);
 *                refresh();
 *             }
 *          });
 *       }
 * }};
 * // Show message dialog...
 * new MAWindowMessage(
 *    "Delete Folder?", // Title
 *    selectedDto.getName() + " will be deleted. Do you want to continue?", // Message
 *    cb, // callback
 *    "Delete", "Cancel" // Buttons (order is important!!)
 *  ).center();
 **/
public class MAWindowMessage extends DialogBox {
	MAWindowCallback callback;
    String htmlMessage;
    String [] buttonText;
    VerticalPanel vPanel;
    VerticalPanel contentsPanel;
    HorizontalPanel hPanel;
    
    /**
     * Constructor.
     * @param title - Title of dialog
     * @param htmlMessage - Message in dialog
     * @param callback - Callback to perform when user clicks a button. The callback will contain
     *                   the text of the button that was clicked.
     * @param buttonText - Labels for each button. (You can put as many as you like)
     */
    public MAWindowMessage(String title, String htmlMessage, MAWindowCallback callback,
        String ... buttonText) {
		setTitle(title);
		setText(title);
		setAnimationEnabled(true);
		setGlassEnabled(true);
		this.callback = callback;
        this.htmlMessage = htmlMessage;
        this.buttonText = buttonText;
        init();
    }

    private void init() {
		vPanel = new VerticalPanel();
		vPanel.setSpacing(4);
		setWidget(vPanel);

		hPanel = new HorizontalPanel();
		hPanel.setSpacing(5);
		vPanel.add(hPanel);
		vPanel.setCellHorizontalAlignment(hPanel, HasHorizontalAlignment.ALIGN_CENTER);
		vPanel.setCellVerticalAlignment(hPanel, HasVerticalAlignment.ALIGN_MIDDLE);

		hPanel.add(getImage());
		hPanel.add(new Label(""));

		contentsPanel = new VerticalPanel();
		contentsPanel.setSpacing(5);
		contentsPanel.setCellHorizontalAlignment(contentsPanel, HasHorizontalAlignment.ALIGN_CENTER);
        hPanel.add(contentsPanel);
		addMessage();

		HorizontalPanel bPanel = new HorizontalPanel();
		bPanel.setSpacing(5);
		vPanel.add(bPanel);
		vPanel.setCellHorizontalAlignment(bPanel, HasHorizontalAlignment.ALIGN_CENTER);
		for (int i = 0; i < buttonText.length; i++) {
            final int index = i;
			Button b = new Button(buttonText[i], new ClickHandler() {
						public void onClick(ClickEvent event) {
                            buttonClicked(index);
						}
					});
			b.setFocus(true);
			bPanel.add(b);
		}
	}

    void buttonClicked(int buttonIndex) {
        MAWindowMessage.this.hide();
        if (callback != null) {
            callback.onClick(buttonIndex, null);
        }
    }

    void addMessage() {
        HTML details = new HTML(htmlMessage);
        contentsPanel.add(details);
    }

    Image getImage() {
		MAImageResources ir = GWT.create(MAImageResources.class);
        return new Image(ir.information_48());
    }
}
