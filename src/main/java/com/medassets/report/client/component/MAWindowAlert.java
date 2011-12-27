package com.medassets.report.client.component;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Image;

/**
 * MedAssets version of GWT's Window.Alert widget. This dialog should be used when a warning needs
 * to be shown to the user. It will contain a warning icon.
 * 
 * Example:
 * new MAWindowAlert(
 *    "Error", // Title
 *    "You are trying to delete a folder that contains reports or folders. " + // Message
 *    "You must move or delete the reports and/or folders before you can " +
 *    "delete the folder.",
 *    null, // Callback (not needed in this case)
 *    "Ok").center();
 **/
public class MAWindowAlert extends MAWindowMessage {

	public MAWindowAlert(String title, String htmlContent, MAWindowCallback callback,
        String ... buttonText) {
        super(title, htmlContent, callback, buttonText);
    }
    
    @Override
    Image getImage() {
        MAImageResources ir = GWT.create(MAImageResources.class);
        return new Image(ir.warning_48());
    }
}
