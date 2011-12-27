package com.medassets.report.client.flex;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiConstructor;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.medassets.report.client.flex.selection.presenter.SelectTabPresenter;
import com.medassets.report.client.flex.selection.view.SelectTabView;
import com.medassets.report.shared.ReportItemDTO;

public class FlexSelectPanel extends Composite {

	public interface Binder extends UiBinder<Widget, FlexSelectPanel> {
	}

	private static final Binder binder = GWT.create(Binder.class);

	@UiField
	HTMLPanel selectTabPanel;

	ReportItemDTO report;

	private SelectTabPresenter selectTabPresenter;

	@UiConstructor
	public FlexSelectPanel() {
		super();
		initWidget(binder.createAndBindUi(this));
	}

	public void load(ReportItemDTO report) {
		if (report == null) {
			return;
		}
		this.report = report;
		loadWidgets();
	}

	private void loadWidgets() {
		selectTabPresenter = new SelectTabPresenter(new SelectTabView(), report);
		getSelectTabPresenter().reveal();
		selectTabPanel.clear();
		selectTabPanel.add(getSelectTabPresenter().getWidget());
	}

	public SelectTabPresenter getSelectTabPresenter() {
		return selectTabPresenter;
	}
}
