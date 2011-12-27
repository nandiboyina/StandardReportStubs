package com.medassets.report.client.component;

import com.google.gwt.user.client.ui.Label;

public interface MAComponent {
    public void setDTO(Object dto);
    public Object getDTO();
	public void setMAValue(Object val);
	public Object getMAValue();
	public void setMALabel(String text);
	public Label getMALabel();
    public void setMATooltip(String tooltip);
    public void setMAEnabled(boolean b);
    
    /**
     * Determines if the field is required (must have a value entered)
     * @return 
     */
    public boolean isMARequired();
    public void setMARequired(boolean b);

    /**
     * Determines if the field is empty (has no value entered)
     * @return 
     */
    public boolean isMAEmpty();

    /**
     * Set focus in the field
     */
    public void setMAFocus();
}
