package com.medassets.report.client.component;

import com.google.gwt.user.client.ui.Label;

public class MALabel extends Label implements MAComponent {

    Object dto;

    public MALabel() {
		super();
	}
	
	public MALabel(String text) {
		super(text);
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
		setText(text);
		
	}

	@Override
	public Label getMALabel() {
		return this;
	}
	
    public void setDTO(Object dto) {
        this.dto = dto;
    }

    public Object getDTO() {
        return this.dto;
    }

    public void setMATooltip(String tooltip) {
        this.setTitle(tooltip);
    }

    public void setMARequired(boolean b) {
    }

    public boolean isMARequired() {
        return false;
    }

    public boolean isMAEmpty() {
        return this.getText().trim().equals("");
    }

    public void setMAFocus() {
    }

    public void setMAEnabled(boolean b) {
    }
}
