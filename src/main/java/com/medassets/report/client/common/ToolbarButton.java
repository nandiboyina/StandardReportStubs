package com.medassets.report.client.common;

import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Image;

public class ToolbarButton extends Button {
	private String text;

	public ToolbarButton() {
		super();
	}

	public void setResource(ImageResource imageResource) {
		Image img = new Image(imageResource);
		String definedStyles = img.getElement().getAttribute("style");
		img.getElement().setAttribute("style",
				definedStyles + "; vertical-align:middle;");
		DOM.insertBefore(getElement(), img.getElement(),
				DOM.getFirstChild(getElement()));
	}

	@Override
	public void setText(String text) {
		this.text = text;
		Element span = DOM.createElement("span");
		span.setInnerText(text);
		span.setAttribute("style", "padding:7px; padding-left:5px; vertical-align:middle;");

		DOM.insertChild(getElement(), span, 0);
	}

	@Override
	public String getText() {
		return this.text;
	}
}