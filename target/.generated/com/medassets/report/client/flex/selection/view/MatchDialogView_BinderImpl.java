package com.medassets.report.client.flex.selection.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class MatchDialogView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.medassets.report.client.flex.selection.view.MatchDialogView>, com.medassets.report.client.flex.selection.view.MatchDialogView.Binder {

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.medassets.report.client.flex.selection.view.MatchDialogView owner) {

    com.medassets.report.client.flex.selection.view.MatchDialogView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.medassets.report.client.flex.selection.view.MatchDialogView_BinderImpl_GenBundle) GWT.create(com.medassets.report.client.flex.selection.view.MatchDialogView_BinderImpl_GenBundle.class);
    com.medassets.report.client.flex.selection.view.MatchDialogView_BinderImpl_GenCss_style style = clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style();
    com.google.gwt.user.datepicker.client.DatePicker startDatePicker = (com.google.gwt.user.datepicker.client.DatePicker) GWT.create(com.google.gwt.user.datepicker.client.DatePicker.class);
    com.google.gwt.user.client.ui.Label f_Label5 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextBox startDateBox = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.google.gwt.user.client.ui.TextBox rangeStartNbrBox = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.google.gwt.user.datepicker.client.DatePicker endDatePicker = (com.google.gwt.user.datepicker.client.DatePicker) GWT.create(com.google.gwt.user.datepicker.client.DatePicker.class);
    com.google.gwt.user.client.ui.Label f_Label6 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextBox endDateBox = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.google.gwt.user.client.ui.TextBox rangeEndNbrBox = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.google.gwt.user.client.ui.AbsolutePanel andRangePanel = (com.google.gwt.user.client.ui.AbsolutePanel) GWT.create(com.google.gwt.user.client.ui.AbsolutePanel.class);
    com.google.gwt.user.client.ui.AbsolutePanel dateOrNumericMatchPanel = (com.google.gwt.user.client.ui.AbsolutePanel) GWT.create(com.google.gwt.user.client.ui.AbsolutePanel.class);
    com.google.gwt.user.client.ui.Label f_Label7 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.TextBox matchTxtBox = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    com.google.gwt.user.client.ui.AbsolutePanel characterMatchPanel = (com.google.gwt.user.client.ui.AbsolutePanel) GWT.create(com.google.gwt.user.client.ui.AbsolutePanel.class);
    com.google.gwt.user.client.ui.FlowPanel f_FlowPanel4 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
    com.google.gwt.user.client.ui.Label matchDialogTitle = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.Label fieldNameLbl = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.CheckBox ignoreCapsChkBox = (com.google.gwt.user.client.ui.CheckBox) GWT.create(com.google.gwt.user.client.ui.CheckBox.class);
    com.google.gwt.user.client.ui.RadioButton andRadioBtn = new com.google.gwt.user.client.ui.RadioButton("new name");
    com.google.gwt.user.client.ui.RadioButton orRadioBtn = new com.google.gwt.user.client.ui.RadioButton("new name");
    com.google.gwt.user.client.ui.RadioButton andNotRadioBtn = new com.google.gwt.user.client.ui.RadioButton("new name");
    com.google.gwt.user.client.ui.RadioButton orNotRadioBtn = new com.google.gwt.user.client.ui.RadioButton("new name");
    com.google.gwt.user.client.ui.AbsolutePanel f_AbsolutePanel8 = (com.google.gwt.user.client.ui.AbsolutePanel) GWT.create(com.google.gwt.user.client.ui.AbsolutePanel.class);
    com.google.gwt.user.client.ui.RadioButton codeRadioBtn = new com.google.gwt.user.client.ui.RadioButton("new name");
    com.google.gwt.user.client.ui.RadioButton nameRadioBtn = new com.google.gwt.user.client.ui.RadioButton("new name");
    com.google.gwt.user.client.ui.AbsolutePanel codeNamePanel = (com.google.gwt.user.client.ui.AbsolutePanel) GWT.create(com.google.gwt.user.client.ui.AbsolutePanel.class);
    com.google.gwt.user.client.ui.Label fieldReferenceLbl = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    com.google.gwt.user.client.ui.ListBox matchOptionCmbBox = (com.google.gwt.user.client.ui.ListBox) GWT.create(com.google.gwt.user.client.ui.ListBox.class);
    com.google.gwt.user.client.ui.AbsolutePanel f_AbsolutePanel10 = (com.google.gwt.user.client.ui.AbsolutePanel) GWT.create(com.google.gwt.user.client.ui.AbsolutePanel.class);
    com.google.gwt.user.client.ui.HorizontalPanel f_HorizontalPanel9 = (com.google.gwt.user.client.ui.HorizontalPanel) GWT.create(com.google.gwt.user.client.ui.HorizontalPanel.class);
    com.google.gwt.user.client.ui.Button okButton = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.client.ui.Button cancelBtn = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.client.ui.AbsolutePanel f_AbsolutePanel3 = (com.google.gwt.user.client.ui.AbsolutePanel) GWT.create(com.google.gwt.user.client.ui.AbsolutePanel.class);
    com.google.gwt.user.client.ui.AbsolutePanel f_AbsolutePanel2 = (com.google.gwt.user.client.ui.AbsolutePanel) GWT.create(com.google.gwt.user.client.ui.AbsolutePanel.class);
    com.google.gwt.user.client.ui.DialogBox dialogWindow = new com.google.gwt.user.client.ui.DialogBox(false, true);
    com.google.gwt.user.client.ui.FlowPanel f_FlowPanel1 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);

    startDatePicker.setHeight("90px");
    startDatePicker.setWidth("140px");
    dateOrNumericMatchPanel.add(startDatePicker, 98, 33);
    f_Label5.setText("the value(s):");
    dateOrNumericMatchPanel.add(f_Label5, 10, 20);
    dateOrNumericMatchPanel.add(startDateBox, 88, 10);
    dateOrNumericMatchPanel.add(rangeStartNbrBox, 88, 10);
    andRangePanel.add(endDatePicker, 68, 23);
    f_Label6.setText("and");
    f_Label6.setHeight("24px");
    f_Label6.setWidth("23px");
    andRangePanel.add(f_Label6, 29, 4);
    andRangePanel.add(endDateBox, 58, 0);
    andRangePanel.add(rangeEndNbrBox, 58, 0);
    andRangePanel.setHeight("215px");
    andRangePanel.setWidth("281px");
    dateOrNumericMatchPanel.add(andRangePanel, 249, 10);
    dateOrNumericMatchPanel.setHeight("259px");
    dateOrNumericMatchPanel.setWidth("540px");
    f_FlowPanel4.add(dateOrNumericMatchPanel);
    f_Label7.setText("the character(s)");
    f_Label7.setHeight("18px");
    f_Label7.setWidth("200px");
    characterMatchPanel.add(f_Label7, 10, 16);
    matchTxtBox.setHeight("16px");
    matchTxtBox.setWidth("292px");
    characterMatchPanel.add(matchTxtBox, 230, 10);
    characterMatchPanel.setHeight("48px");
    characterMatchPanel.setWidth("540px");
    f_FlowPanel4.add(characterMatchPanel);
    f_FlowPanel4.setHeight("206px");
    f_FlowPanel4.setWidth("540px");
    f_AbsolutePanel3.add(f_FlowPanel4, 0, 160);
    matchDialogTitle.setText("Select by");
    matchDialogTitle.setHeight("18px");
    matchDialogTitle.setWidth("520px");
    f_AbsolutePanel3.add(matchDialogTitle, 10, 10);
    fieldNameLbl.setText("New Label");
    fieldNameLbl.setHeight("18px");
    fieldNameLbl.setWidth("520px");
    f_AbsolutePanel3.add(fieldNameLbl, 10, 81);
    ignoreCapsChkBox.setText("Ignore capitalization");
    ignoreCapsChkBox.setHeight("20px");
    ignoreCapsChkBox.setWidth("140px");
    f_AbsolutePanel3.add(ignoreCapsChkBox, 10, 225);
    andRadioBtn.setText("AND");
    andRadioBtn.setChecked(true);
    f_AbsolutePanel8.add(andRadioBtn, 10, 10);
    orRadioBtn.setText("OR");
    f_AbsolutePanel8.add(orRadioBtn, 95, 10);
    andNotRadioBtn.setText("AND NOT");
    f_AbsolutePanel8.add(andNotRadioBtn, 277, 10);
    orNotRadioBtn.setText("OR NOT");
    f_AbsolutePanel8.add(orNotRadioBtn, 177, 10);
    f_AbsolutePanel8.setHeight("36px");
    f_AbsolutePanel8.setWidth("450px");
    f_AbsolutePanel3.add(f_AbsolutePanel8, 10, 28);
    codeRadioBtn.setText("Code");
    codeNamePanel.add(codeRadioBtn, 10, 10);
    nameRadioBtn.setText("Name");
    codeNamePanel.add(nameRadioBtn, 97, 10);
    codeNamePanel.setHeight("36px");
    codeNamePanel.setWidth("185px");
    f_HorizontalPanel9.add(codeNamePanel);
    fieldReferenceLbl.setText("that/is");
    fieldReferenceLbl.setHeight("18px");
    fieldReferenceLbl.setWidth("51px");
    f_AbsolutePanel10.add(fieldReferenceLbl, 38, 10);
    matchOptionCmbBox.setHeight("22px");
    matchOptionCmbBox.setWidth("140px");
    f_AbsolutePanel10.add(matchOptionCmbBox, 117, 6);
    f_AbsolutePanel10.setHeight("37px");
    f_AbsolutePanel10.setWidth("316px");
    f_HorizontalPanel9.add(f_AbsolutePanel10);
    f_HorizontalPanel9.setHeight("47px");
    f_HorizontalPanel9.setWidth("529px");
    f_AbsolutePanel3.add(f_HorizontalPanel9, 10, 94);
    okButton.setText("OK");
    okButton.setHeight("24px");
    okButton.setWidth("85px");
    f_AbsolutePanel3.add(okButton, 126, 372);
    cancelBtn.setText("CANCEL");
    cancelBtn.setHeight("24px");
    cancelBtn.setWidth("85px");
    f_AbsolutePanel3.add(cancelBtn, 238, 372);
    f_AbsolutePanel3.setHeight("457px");
    f_AbsolutePanel3.setWidth("563px");
    f_AbsolutePanel2.add(f_AbsolutePanel3, 10, 10);
    f_AbsolutePanel2.setHeight("493px");
    f_AbsolutePanel2.setWidth("578px");
    dialogWindow.setWidget(f_AbsolutePanel2);
    dialogWindow.setHeight("330px");
    dialogWindow.setWidth("590px");
    f_FlowPanel1.add(dialogWindow);
    f_FlowPanel1.setStyleName("" + style.panel() + "");



    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onAndRadioSelection(event);
      }
    };
    andRadioBtn.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames1);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onOrRadioRadioSelection(event);
      }
    };
    orRadioBtn.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames2);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onAndNotRadioSelection(event);
      }
    };
    andNotRadioBtn.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames3);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onOrNotRadioSelection(event);
      }
    };
    orNotRadioBtn.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames4);

    final com.google.gwt.event.dom.client.ChangeHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames5 = new com.google.gwt.event.dom.client.ChangeHandler() {
      public void onChange(com.google.gwt.event.dom.client.ChangeEvent event) {
        owner.onMatchOptionCmbBoxChange(event);
      }
    };
    matchOptionCmbBox.addChangeHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames5);

    final com.google.gwt.event.dom.client.FocusHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames6 = new com.google.gwt.event.dom.client.FocusHandler() {
      public void onFocus(com.google.gwt.event.dom.client.FocusEvent event) {
        owner.onStartDateBoxFocus(event);
      }
    };
    startDateBox.addFocusHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames6);

    final com.google.gwt.event.dom.client.FocusHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames7 = new com.google.gwt.event.dom.client.FocusHandler() {
      public void onFocus(com.google.gwt.event.dom.client.FocusEvent event) {
        owner.onEndDateBoxFocus(event);
      }
    };
    endDateBox.addFocusHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames7);

    final com.google.gwt.event.dom.client.BlurHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames8 = new com.google.gwt.event.dom.client.BlurHandler() {
      public void onBlur(com.google.gwt.event.dom.client.BlurEvent event) {
        owner.onStartDateBoxBlur(event);
      }
    };
    startDateBox.addBlurHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames8);

    final com.google.gwt.event.dom.client.BlurHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames9 = new com.google.gwt.event.dom.client.BlurHandler() {
      public void onBlur(com.google.gwt.event.dom.client.BlurEvent event) {
        owner.onEndDateBoxBlur(event);
      }
    };
    endDateBox.addBlurHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames9);

    final com.google.gwt.event.dom.client.KeyPressHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames10 = new com.google.gwt.event.dom.client.KeyPressHandler() {
      public void onKeyPress(com.google.gwt.event.dom.client.KeyPressEvent event) {
        owner.onRangeStartNbrBoxKeyPress(event);
      }
    };
    rangeStartNbrBox.addKeyPressHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames10);

    final com.google.gwt.event.dom.client.BlurHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames11 = new com.google.gwt.event.dom.client.BlurHandler() {
      public void onBlur(com.google.gwt.event.dom.client.BlurEvent event) {
        owner.onRangeStartNbrBoxBlur(event);
      }
    };
    rangeStartNbrBox.addBlurHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames11);

    final com.google.gwt.event.dom.client.KeyPressHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames12 = new com.google.gwt.event.dom.client.KeyPressHandler() {
      public void onKeyPress(com.google.gwt.event.dom.client.KeyPressEvent event) {
        owner.onRangeEndNbrBoxKeyPress(event);
      }
    };
    rangeEndNbrBox.addKeyPressHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames12);

    final com.google.gwt.event.dom.client.BlurHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames13 = new com.google.gwt.event.dom.client.BlurHandler() {
      public void onBlur(com.google.gwt.event.dom.client.BlurEvent event) {
        owner.onRangeEndNbrBoxBlur(event);
      }
    };
    rangeEndNbrBox.addBlurHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames13);

    final com.google.gwt.event.dom.client.KeyPressHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames14 = new com.google.gwt.event.dom.client.KeyPressHandler() {
      public void onKeyPress(com.google.gwt.event.dom.client.KeyPressEvent event) {
        owner.onMatchTxtBoxKeyPress(event);
      }
    };
    matchTxtBox.addKeyPressHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames14);

    final com.google.gwt.event.dom.client.BlurHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames15 = new com.google.gwt.event.dom.client.BlurHandler() {
      public void onBlur(com.google.gwt.event.dom.client.BlurEvent event) {
        owner.onMatchTxtBoxBlur(event);
      }
    };
    matchTxtBox.addBlurHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames15);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames16 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onIgnoreCapsChkBoxClick(event);
      }
    };
    ignoreCapsChkBox.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames16);

    final com.google.gwt.event.dom.client.ClickHandler handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames17 = new com.google.gwt.event.dom.client.ClickHandler() {
      public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
        owner.onCancelButtonClick(event);
      }
    };
    cancelBtn.addClickHandler(handlerMethodWithNameVeryUnlikelyToCollideWithUserFieldNames17);

    owner.andNotRadioBtn = andNotRadioBtn;
    owner.andRadioBtn = andRadioBtn;
    owner.andRangePanel = andRangePanel;
    owner.cancelBtn = cancelBtn;
    owner.characterMatchPanel = characterMatchPanel;
    owner.codeNamePanel = codeNamePanel;
    owner.codeRadioBtn = codeRadioBtn;
    owner.dateOrNumericMatchPanel = dateOrNumericMatchPanel;
    owner.dialogWindow = dialogWindow;
    owner.endDateBox = endDateBox;
    owner.endDatePicker = endDatePicker;
    owner.fieldNameLbl = fieldNameLbl;
    owner.fieldReferenceLbl = fieldReferenceLbl;
    owner.ignoreCapsChkBox = ignoreCapsChkBox;
    owner.matchDialogTitle = matchDialogTitle;
    owner.matchOptionCmbBox = matchOptionCmbBox;
    owner.matchTxtBox = matchTxtBox;
    owner.nameRadioBtn = nameRadioBtn;
    owner.okButton = okButton;
    owner.orNotRadioBtn = orNotRadioBtn;
    owner.orRadioBtn = orRadioBtn;
    owner.rangeEndNbrBox = rangeEndNbrBox;
    owner.rangeStartNbrBox = rangeStartNbrBox;
    owner.startDateBox = startDateBox;
    owner.startDatePicker = startDatePicker;
    clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay.style().ensureInjected();

    return f_FlowPanel1;
  }
}
