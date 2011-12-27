package com.medassets.report.client.flex.selection.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.ui.ListBox;
import com.medassets.report.client.flex.selection.presenter.SelectTabPresenter;

public class AvailableParameterListBox extends ListBox {
	
	private SelectTabPresenter selectTabPresenter;

	public AvailableParameterListBox() {
		super(); 					
		this.sinkEvents(Event.ONDBLCLICK); // Sink the double click event (ListBox already sinks single clicks)
	}
	
	public void onBrowserEvent(Event event) {
		super.onBrowserEvent(event); 		// Handle events as a normal ListBox would
		int type = DOM.eventGetType(event); // Look at the type of event again
		switch (type) {
			case Event.ONDBLCLICK: { 		// If it is a double click event, handle it Put the code you want to execute for a double click event here
				GWT.log("AvailableParameterListBox.onBrowserEvent().onDoubleClick - Begin");
				int selectedIndex = selectTabPresenter.getView().leftSideParametersListBox_eventBox().getSelectedIndex();
				selectTabPresenter.selectedParameterKeyName = selectTabPresenter.getView().leftSideParametersListBox_eventBox().getValue(selectedIndex);
				selectTabPresenter.getView().enableMatchButton();
				selectTabPresenter.intiateFieldValues();
				GWT.log("SelectTabPresenter.onBrowserEvent().onDoubleClick - End");
				break;
			}
		}
	}
	
	public SelectTabPresenter getSelectTabPresenter() {
		return selectTabPresenter;
	}

	public void setSelectTabPresenter(SelectTabPresenter selectTabPresenter) {
		this.selectTabPresenter = selectTabPresenter;
	}
}
