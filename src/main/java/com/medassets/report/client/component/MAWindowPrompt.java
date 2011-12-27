package com.medassets.report.client.component;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.TextBox;

/**
 * MedAssets version of GWT's Window.Prompt widget. This dialog should be used when input is needed
 * from the user in the form of a text box.
 * 
 * Example:
 *       // Create a callback function for the prompt window...
 *       MAWindowCallback cb = new MAWindowCallback() {
 *            // Called when one of the buttons are clicked
 *            // @param buttonIndex - Index of button that was clicked
 *            // @param input - Value user entered
 *           @Override
 *           public void onClick(int buttonIndex, Object input) {
 *               if (buttonIndex == 0) {
 *                   continueRenameFolder(String.valueOf(input), defaultName);
 *               }
 *           }
 *       };
 *       // Show prompt...
 *       new MAWindowPrompt(
 *           "Rename Folder", // Title
 *           "Please enter the new folder name:", // Message
 *           defaultName, // Default value
 *           cb, // Callback
 *           "Ok", "Cancel" // button text
 *           ).center();
 **/
public class MAWindowPrompt extends MAWindowMessage {

    TextBox tb;

    public MAWindowPrompt(String title, String htmlContent, MAWindowCallback callback,
        String ... buttonText) {
        super(title, htmlContent, callback, buttonText);
    }

    public MAWindowPrompt(String title, String htmlContent, String defaultValue,
        MAWindowCallback callback, String ... buttonText) {
        super(title, htmlContent, callback, buttonText);
        tb.setText(defaultValue);
    }

    @Override
    void addMessage() {
        HTML details = new HTML(htmlMessage);
        contentsPanel.add(details);
        contentsPanel.setCellHorizontalAlignment(details, HasHorizontalAlignment.ALIGN_LEFT);

        tb = new TextBox();
        tb.setWidth("300px");
        contentsPanel.add(tb);
        contentsPanel.setCellHorizontalAlignment(tb, HasHorizontalAlignment.ALIGN_LEFT);
    }

    @Override
    void buttonClicked(int buttonIndex) {
        MAWindowPrompt.this.hide();
        if (callback != null) {
            callback.onClick(buttonIndex, tb.getText());
        }
    }

    @Override
    Image getImage() {
		MAImageResources ir = GWT.create(MAImageResources.class);
        return new Image(ir.question_48());
    }
}