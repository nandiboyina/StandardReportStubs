package com.medassets.report.client.common;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class Header extends Composite {

	private static HeaderPanelUiBinder uiBinder = GWT
			.create(HeaderPanelUiBinder.class);

	interface HeaderPanelUiBinder extends UiBinder<Widget, Header> {
	}

	public Header() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public Header(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
	}
}
