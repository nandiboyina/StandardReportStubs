package com.medassets.report.client.component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasChangeHandlers;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasValue;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.RadioButton;

/**
 * A collection of radio buttons given some choices in a String[]. This class
 * also provides an easy way to get to individual radios based on their name.
 */
public class MARadioButtonGroup extends Composite implements HasValue<String>,
		HasClickHandlers, HasChangeHandlers, MAComponent {

	// A map of question to radio button.
	protected Map<String, RadioButton> choiceToRadio = new HashMap<String, RadioButton>();

	protected Panel mainPanel;
	private String groupName;
	private Label label = new Label();
    boolean required;

	public MARadioButtonGroup() {
		// providing an automatic unique group name
		setUpWidget(new Date().getTime() + "");
	}

	/**
	 * Creates a new {@link RadioButtonGroup}
	 * @param groupName the name of the radio buttons in this group.
	 */
	public MARadioButtonGroup(String groupName) {
		// sanity check
		assert groupName != null : getClass().getName()
				+ ": groupName can't be null.";
		setUpWidget(groupName);
	}

	private void setUpWidget(String groupName) {
		this.groupName = groupName;
		this.mainPanel = new HorizontalPanel();
		initWidget(mainPanel);
	}

	/**
	 * Sets the choices for this {@link RadioButtonGroup}. The previous choices
	 * are cleared before the new ones are added.
	 * 
     * @param codesAndLabels a list of String codes/labels for the {@link RadioButtonGroup}.
	 */
	public void setChoices(String ... codesAndLabels) {

		mainPanel.clear();
		choiceToRadio.clear();
        addChoices(codesAndLabels);
	}

    public void addChoices(String ... codesAndLabels) {
		// make a new radio button for each choice we are given
		for (int i = 0; i < codesAndLabels.length; i++) {

			// create the radio button, add some style to it and add our custom
			// click listener to catch clicks.
			String key = codesAndLabels[i];
			RadioButton radio = new RadioButton("group", codesAndLabels[++i]);
			choiceToRadio.put(key, radio);
			mainPanel.add(radio);
		}
    }

	/**
	 * Returns a reference of the radio button with the provided choice
	 * 
	 * @param choice
	 *            the choice of the button to be returned
	 * @return the radio button with specified choice.
	 */
	public RadioButton getRadio(String name) {
		return choiceToRadio.get(name);
	}

	/**
	 * Returns true if at least one radio in this group is checked.
	 * 
	 * @return true if at least one radio in this group is checked.
	 */
	public boolean isChecked() {
		boolean set = false;

		// if any are checked, that means the group is checked.
		for (RadioButton radio : choiceToRadio.values()) {
			if (radio.getValue()) {
				set = true;
				break;
			}
		}
		return set;
	}

	public String getValue() {
		String result = null;

		// find the radio button that's checked, and get it's text. There
		// shouldn't be any more checked since it's radio buttons.
		for (Entry<String, RadioButton> element : choiceToRadio.entrySet()) {
			if (element.getValue().getValue()) {
				result = element.getKey();
				break;
			}
		}

		return result;
	}

	public void setValue(String value) {
		RadioButton buttonToCheck = choiceToRadio.get(value);

		// check buttonToCheck and uncheck the previous one.
		if (buttonToCheck != null) {
			RadioButton checked = getRadio(getValue());
			if (checked != null) {
				checked.setValue(false);
			}

			buttonToCheck.setValue(true);
		}
	}

	public void setValue(String arg0, boolean arg1) {

		setValue(arg0);
		ValueChangeEvent.fire(MARadioButtonGroup.this, getValue());
	}

	/**
	 * Returns the number of {@link RadioButton} this collection has.
	 * 
	 * @return the number of {@link RadioButton} this collection has.
	 */
	public int size() {
		return choiceToRadio.size();
	}

	public HandlerRegistration addClickHandler(ClickHandler arg0) {
		return addDomHandler(arg0, ClickEvent.getType());
	}

	public HandlerRegistration addValueChangeHandler(
			ValueChangeHandler<String> handler) {
		addChangeHandler(new ChangeHandler() {
			public void onChange(ChangeEvent event) {
				ValueChangeEvent.fire(MARadioButtonGroup.this, getValue());
			}
		});
		return addHandler(handler, ValueChangeEvent.getType());
	}

	public HandlerRegistration addChangeHandler(ChangeHandler arg0) {
		return addDomHandler(arg0, ChangeEvent.getType());
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	@Override
	public void setDTO(Object dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getDTO() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setMAValue(Object val) {
		setValue(val.toString());
	}

	@Override
	public Object getMAValue() {
		return getValue();
	}

	@Override
	public void setMALabel(String text) {
		this.label.setText(text);
	}

	@Override
	public Label getMALabel() {
		return this.label;
	}

	@Override
	public void setMATooltip(String tooltip) {
		label.setTitle(tooltip);
	}

    public void setMARequired(boolean b) {
        this.required = b;
    }

    public boolean isMARequired() {
        return this.required;
    }

    public boolean isMAEmpty() {
        return this.getMAValue() == null;
    }

    public void setMAFocus() {
		for (Entry<String, RadioButton> element : choiceToRadio.entrySet()) {
            ((RadioButton)element).setFocus(true);
            return;
		}
    }

    public void setMAEnabled(boolean b) {
		for (Entry<String, RadioButton> element : choiceToRadio.entrySet()) {
            ((RadioButton)element).setEnabled(b);
		}
    }
}
