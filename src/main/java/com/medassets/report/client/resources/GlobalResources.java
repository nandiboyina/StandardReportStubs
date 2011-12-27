package com.medassets.report.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

public interface GlobalResources extends ClientBundle {
	public static final GlobalResources RESOURCE =  GWT.create(GlobalResources.class);

	@Source("com/medassets/report/client/resources/GlobalStyles.css")
	GlobalStylesheet globalStyles();

	ImageResource folder();
	ImageResource template();
	ImageResource report();
	
	@Source("noimage.png")
	ImageResource treeLeaf();
}
