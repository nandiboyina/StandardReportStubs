package com.medassets.report.client.common;

import com.google.gwt.cell.client.AbstractCell;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.user.client.ui.Hyperlink;

public class HyperlinkCell extends AbstractCell<Hyperlink> {

	@Override
	public void render(com.google.gwt.cell.client.Cell.Context context,
			Hyperlink value, SafeHtmlBuilder sb) {
		sb.append(SafeHtmlUtils.fromTrustedString(value.toString()));
	}
}
