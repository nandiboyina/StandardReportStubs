package com.medassets.report.client.component;

public interface MAWindowCallback {
    /**
     * onClick is called when the user clicks on one of the buttons in an MAWindow.
     * @param buttonIndex - Index number of button that was clicked
     * @param input - Input value that was entered (if any?)(See MAWindowPrompt)
     */
    void onClick(int buttonIndex, Object input);
}
