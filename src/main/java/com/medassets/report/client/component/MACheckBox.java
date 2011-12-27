package com.medassets.report.client.component;

import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Label;

public class MACheckBox extends CheckBox implements MAComponent {

	Label label;
    Object dto;
    boolean required;
	
	public MACheckBox() {
		label = new Label();
        setWidth("100%");
	}
	
	@Override
	public void setMAValue(Object val) {
		this.setValue(Boolean.valueOf(val == null ? "" : val.toString()));
	}

	@Override
	public Object getMAValue() {
		return this.getValue();
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
        return this.getValue();
    }

    public void setMAFocus() {
        this.setFocus(true);
    }

    public void setMAEnabled(boolean b) {
        this.setEnabled(b);
    }
}
