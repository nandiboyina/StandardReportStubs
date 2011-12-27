package com.medassets.report.client.common;

import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Widget;

public class StandardDialogBox extends DialogBox implements HasWidgets {
	@Override
	public void add(Widget w) {
		Widget widget = getWidget();
		if (widget != null && widget instanceof HasWidgets) {
			((HasWidgets) getWidget()).add(w);
		} else {
			super.add(w);
		}
	}
}
