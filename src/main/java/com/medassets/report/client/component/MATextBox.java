package com.medassets.report.client.component;

import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;

public class MATextBox extends TextBox implements MAComponent {

	Label label;
    Object dto;
    boolean required;
	
	public MATextBox() {
		label = new Label();
        setWidth("100%");
	}
	
	@Override
	public void setMAValue(Object val) {
		this.setText(val == null ? "" : val.toString());
	}

	@Override
	public Object getMAValue() {
		return this.getText();
	}

	@Override
	public void setMALabel(String text) {
		this.label.setText(text);
	}

	@Override
	public Label getMALabel() {
		return this.label;
	}
	
    public void setDTO(Object dto) {
        this.dto = dto;
    }

    public Object getDTO() {
        return this.dto;
    }

    public void setMATooltip(String tooltip) {
        label.setTitle(tooltip);
        this.setTitle(tooltip);
    }

    public void setMARequired(boolean b) {
        this.required = b;
    }

    public boolean isMARequired() {
        return this.required;
    }

    public boolean isMAEmpty() {
        return this.getValue().trim().equals("");
    }

    public void setMAFocus() {
        this.setFocus(true);
    }

    public void setMAEnabled(boolean b) {
        this.setEnabled(b);
    }
}
