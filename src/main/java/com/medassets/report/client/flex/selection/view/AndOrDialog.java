package com.medassets.report.client.flex.selection.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class AndOrDialog extends Composite {

	@UiField
	DialogBox mainPanel;

	@UiField
	Button okBtn;
	
	@UiField
	Button cancelBtn;

	@UiField
	Label paramDescHeader;

	@UiField
	TextBox paramDescLblBox;
	
	@UiHandler("andRadioButton")
	void handleClick2(ClickEvent e) {
		updateDimensionOption("AND");
	}

	@UiHandler("orRadioButton")
	void handleClick3(ClickEvent e) {
		updateDimensionOption("OR");
	}

	@UiHandler("andNotRadioButton")
	void handleClick4(ClickEvent e) {
		updateDimensionOption("AND NOT");
	}

	@UiHandler("orNotRadioButton")
	void handleClick5(ClickEvent e) {
		updateDimensionOption("OR NOT");
	}
	
	private static AndOrDialogUiBinder uiBinder = GWT.create(AndOrDialogUiBinder.class);

	interface AndOrDialogUiBinder extends UiBinder<Widget, AndOrDialog> {
	}

	private String optionType;

	public AndOrDialog() {
		initWidget(uiBinder.createAndBindUi(this));
		this.mainPanel.setVisible(false);
	}

	public void setData(String pSelectedParameter) {
		paramDescHeader.setText("All " + pSelectedParameter + " ");
		updateDimensionOption("AND");
//		TODO andRadioButton.setValue(true);
	}

	@UiHandler("cancelBtn")
	void handleClick1(ClickEvent e) {
		mainPanel.hide();
	}

	private void updateDimensionOption(String optionType) {
		setOptionType(optionType);
		paramDescLblBox.setText(optionType + " " + paramDescHeader.getText() + " List");
	}

	public String getOptionType() {
		return optionType;
	}

	public void setOptionType(String optionType) {
		this.optionType = optionType;
	}

}
