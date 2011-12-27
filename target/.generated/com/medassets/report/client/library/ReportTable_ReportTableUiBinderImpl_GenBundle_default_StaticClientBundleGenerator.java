package com.medassets.report.client.library;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class ReportTable_ReportTableUiBinderImpl_GenBundle_default_StaticClientBundleGenerator implements com.medassets.report.client.library.ReportTable_ReportTableUiBinderImpl_GenBundle {
  private static ReportTable_ReportTableUiBinderImpl_GenBundle_default_StaticClientBundleGenerator _instance0 = new ReportTable_ReportTableUiBinderImpl_GenBundle_default_StaticClientBundleGenerator();
  private void styleInitializer() {
    style = new com.medassets.report.client.library.ReportTable_ReportTableUiBinderImpl_GenCss_style() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "style";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? (("body{font-family:" + ("Arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("9pt")  + ";color:" + ("black")  + ";margin:" + ("0")  + ";border:" + ("0")  + ";padding:" + ("0")  + ";background:" + ("#fff")  + ";direction:" + ("rtl")  + ";}table td,select{font-family:" + ("Arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("9pt")  + ";}.GDCSE03CMW{border:") + (("1px"+ " " +"solid"+ " " +"#2291c8")  + ";}.GDCSE03CPW{background:" + ("#fff"+ " " +"url(headerTitleBG.png)"+ " " +"repeat-x")  + ";color:" + ("#fff")  + ";margin-top:" + ("5px")  + ";margin-right:" + ("5px")  + ";margin-left:" + ("5px")  + ";padding-right:" + ("5px")  + ";padding-top:" + ("4px")  + ";height:" + ("22px")  + ";vertical-align:" + ("middle")  + ";font-size:" + ("10pt") ) + (";}.GDCSE03COW{margin-top:" + ("1px")  + ";margin-right:" + ("5px")  + ";margin-bottom:" + ("5px")  + ";margin-left:" + ("5px")  + ";}.GDCSE03CAX{border-top:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";vertical-align:" + ("middle")  + ";padding:" + ("0")  + ";margin:" + ("0")  + ";spacing:" + ("0")  + ";text-align:" + ("left")  + ";}.GDCSE03CCX{vertical-align:") + (("middle")  + ";padding:" + ("0")  + ";margin:" + ("0")  + ";spacing:" + ("0")  + ";text-align:" + ("left")  + ";}.GDCSE03CBV{margin:" + ("0")  + ";padding:" + ("5px")  + ";text-align:" + ("left")  + ";background-color:" + ("#fff")  + ";font-size:" + ("smaller")  + ";}.GDCSE03CKW{font-weight:" + ("bold") ) + (";font-size:" + ("large")  + ";font-family:" + ("helvetica")  + ";margin-right:" + ("0")  + ";padding:" + ("10px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";background-color:" + ("#fff")  + ";}.GDCSE03CLW{text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03CPX{padding:" + ("0")  + ";border:") + (("1px"+ " " +"solid"+ " " +"#2291c8")  + ";background-color:" + ("#fff")  + ";}.GDCSE03CNW{width:" + ("100%")  + ";padding:" + ("10px")  + ";}.GDCSE03CDX{background-color:" + ("#e0e0e0")  + ";color:" + ("#000")  + ";padding-right:" + ("5px")  + ";font-weight:" + ("bold")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";}.GDCSE03CBX{background:" + ("#fff"+ " " +"url(zoom.png)"+ " " +"no-repeat"+ " " +"3px")  + ";padding:" + ("3px"+ " " +"24px"+ " " +"3px"+ " " +"3px") ) + (";border:" + ("1px"+ " " +"solid"+ " " +"#7f9db9")  + ";margin:" + ("5px")  + ";float:" + ("left")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03CAX{padding:" + ("0")  + ";margin:" + ("0")  + ";text-align:" + ("center")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03CJX{background:" + ("#e1e1e1")  + ";vertical-align:" + ("middle")  + ";border-bottom:") + (("1px"+ " " +"solid"+ " " +"#000")  + ";white-space:" + ("nowrap")  + ";}.GDCSE03CIX{display:" + ("inline")  + ";margin-top:" + ("8px")  + ";margin-right:" + ("5px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";float:" + ("right")  + ";}.GDCSE03COX{background:" + ("#e1e1e1")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#000") ) + (";}.GDCSE03CNX{width:" + ("100%")  + ";margin-top:" + ("8px")  + ";margin-right:" + ("5px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";}.GDCSE03CLX{margin-top:" + ("8px")  + ";margin-right:" + ("5px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";white-space:") + (("nowrap")  + ";}.GDCSE03CMX{text-decoration:" + ("underline")  + ";margin-right:" + ("5px")  + ";margin-left:" + ("5px")  + ";cursor:" + ("hand")  + ";}.GDCSE03CKX{border-top:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";}.GDCSE03CEX{padding:" + ("0"+ " " +"5px"+ " " +"0"+ " " +"5px")  + ";margin:" + ("0"+ " " +"0"+ " " +"0"+ " " +"0")  + ";width:" + ("auto")  + " !important;overflow:" + ("visible")  + ";}.GDCSE03CFX{padding:" + ("4px"+ " " +"8px") ) + (";background:" + ("#eee")  + ";vertical-align:" + ("baseline")  + ";border-top-right-radius:" + ("4px")  + ";border-bottom-right-radius:" + ("4px")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";}.GDCSE03CGX{padding:" + ("4px"+ " " +"8px")  + ";background:" + ("#eee")  + ";vertical-align:") + (("baseline")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-left:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-right-width:" + ("0")  + ";}.GDCSE03CHX{padding:" + ("4px"+ " " +"8px")  + ";background:" + ("#eee")  + ";vertical-align:" + ("baseline") ) + (";-moz-border-radius:" + ("0")  + ";-webkit-border-radius:" + ("0")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border-left:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-right-width:" + ("0")  + ";}.GDCSE03CAV{padding:" + ("10px")  + ";text-align:") + (("right")  + ";float:" + ("right")  + ";}.GDCSE03COU{float:" + ("right")  + ";text-align:" + ("right")  + ";padding:" + ("10px")  + ";white-space:" + ("nowrap")  + ";}.GDCSE03CPU{float:" + ("right")  + ";text-align:" + ("right")  + ";padding:" + ("5px")  + ";white-space:" + ("nowrap")  + ";}.GDCSE03CFV{padding:" + ("5px") ) + (";padding-top:" + ("5px")  + ";text-align:" + ("right")  + ";width:" + ("300px")  + ";}.GDCSE03CGV{padding:" + ("5px")  + ";padding-top:" + ("8px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("top")  + ";width:" + ("300px")  + ";}.GDCSE03CLV{padding:" + ("5px")  + ";width:" + ("600px")  + ";vertical-align:") + (("top")  + ";}.GDCSE03CHV{padding:" + ("7px")  + ";text-align:" + ("right")  + ";width:" + ("200px")  + ";}.GDCSE03CIV{padding:" + ("7px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("top")  + ";width:" + ("200px")  + ";}.GDCSE03CMV{width:" + ("300px")  + ";vertical-align:" + ("top")  + ";text-align:" + ("right") ) + (";}.GDCSE03CJV{padding:" + ("7px")  + ";text-align:" + ("right")  + ";width:" + ("300px")  + ";}.GDCSE03CKV{padding:" + ("7px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("top")  + ";width:" + ("300px")  + ";}.GDCSE03CDV{font-weight:" + ("bold")  + ";padding:" + ("7px")  + ";padding-top:" + ("20px")  + ";padding-bottom:") + (("10px")  + ";}.GDCSE03CPV,.GDCSE03CAW{background-color:" + ("#fff")  + ";}.GDCSE03CHW .GDCSE03CIW{padding:" + ("0")  + ";margin:" + ("0")  + ";white-space:" + ("nowrap")  + ";cursor:" + ("hand")  + ";cursor:" + ("pointer")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03CHW .GDCSE03CJW{background:" + ("#3f8dd1")  + ";color:" + ("white")  + ";height:" + ("auto") ) + (";padding:" + ("0")  + ";margin:" + ("0")  + ";white-space:" + ("nowrap")  + ";cursor:" + ("hand")  + ";cursor:" + ("pointer")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03COV .GDCSE03CMU{font-weight:" + ("bold")  + ";}a,a:visited,a:hover{color:" + ("#004785")  + ";}")) : (("body{font-family:" + ("Arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("9pt")  + ";color:" + ("black")  + ";margin:" + ("0")  + ";border:" + ("0")  + ";padding:" + ("0")  + ";background:" + ("#fff")  + ";direction:" + ("ltr")  + ";}table td,select{font-family:" + ("Arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("9pt")  + ";}.GDCSE03CMW{border:") + (("1px"+ " " +"solid"+ " " +"#2291c8")  + ";}.GDCSE03CPW{background:" + ("#fff"+ " " +"url(headerTitleBG.png)"+ " " +"repeat-x")  + ";color:" + ("#fff")  + ";margin-top:" + ("5px")  + ";margin-left:" + ("5px")  + ";margin-right:" + ("5px")  + ";padding-left:" + ("5px")  + ";padding-top:" + ("4px")  + ";height:" + ("22px")  + ";vertical-align:" + ("middle")  + ";font-size:" + ("10pt") ) + (";}.GDCSE03COW{margin-top:" + ("1px")  + ";margin-left:" + ("5px")  + ";margin-bottom:" + ("5px")  + ";margin-right:" + ("5px")  + ";}.GDCSE03CAX{border-top:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";vertical-align:" + ("middle")  + ";padding:" + ("0")  + ";margin:" + ("0")  + ";spacing:" + ("0")  + ";text-align:" + ("right")  + ";}.GDCSE03CCX{vertical-align:") + (("middle")  + ";padding:" + ("0")  + ";margin:" + ("0")  + ";spacing:" + ("0")  + ";text-align:" + ("right")  + ";}.GDCSE03CBV{margin:" + ("0")  + ";padding:" + ("5px")  + ";text-align:" + ("right")  + ";background-color:" + ("#fff")  + ";font-size:" + ("smaller")  + ";}.GDCSE03CKW{font-weight:" + ("bold") ) + (";font-size:" + ("large")  + ";font-family:" + ("helvetica")  + ";margin-left:" + ("0")  + ";padding:" + ("10px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";background-color:" + ("#fff")  + ";}.GDCSE03CLW{text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03CPX{padding:" + ("0")  + ";border:") + (("1px"+ " " +"solid"+ " " +"#2291c8")  + ";background-color:" + ("#fff")  + ";}.GDCSE03CNW{width:" + ("100%")  + ";padding:" + ("10px")  + ";}.GDCSE03CDX{background-color:" + ("#e0e0e0")  + ";color:" + ("#000")  + ";padding-left:" + ("5px")  + ";font-weight:" + ("bold")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";}.GDCSE03CBX{background:" + ("#fff"+ " " +"url(zoom.png)"+ " " +"no-repeat"+ " " +"3px")  + ";padding:" + ("3px"+ " " +"3px"+ " " +"3px"+ " " +"24px") ) + (";border:" + ("1px"+ " " +"solid"+ " " +"#7f9db9")  + ";margin:" + ("5px")  + ";float:" + ("right")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03CAX{padding:" + ("0")  + ";margin:" + ("0")  + ";text-align:" + ("center")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03CJX{background:" + ("#e1e1e1")  + ";vertical-align:" + ("middle")  + ";border-bottom:") + (("1px"+ " " +"solid"+ " " +"#000")  + ";white-space:" + ("nowrap")  + ";}.GDCSE03CIX{display:" + ("inline")  + ";margin-top:" + ("8px")  + ";margin-left:" + ("5px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";float:" + ("left")  + ";}.GDCSE03COX{background:" + ("#e1e1e1")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#000") ) + (";}.GDCSE03CNX{width:" + ("100%")  + ";margin-top:" + ("8px")  + ";margin-left:" + ("5px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";}.GDCSE03CLX{margin-top:" + ("8px")  + ";margin-left:" + ("5px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";white-space:") + (("nowrap")  + ";}.GDCSE03CMX{text-decoration:" + ("underline")  + ";margin-left:" + ("5px")  + ";margin-right:" + ("5px")  + ";cursor:" + ("hand")  + ";}.GDCSE03CKX{border-top:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";}.GDCSE03CEX{padding:" + ("0"+ " " +"5px"+ " " +"0"+ " " +"5px")  + ";margin:" + ("0"+ " " +"0"+ " " +"0"+ " " +"0")  + ";width:" + ("auto")  + " !important;overflow:" + ("visible")  + ";}.GDCSE03CFX{padding:" + ("4px"+ " " +"8px") ) + (";background:" + ("#eee")  + ";vertical-align:" + ("baseline")  + ";border-top-left-radius:" + ("4px")  + ";border-bottom-left-radius:" + ("4px")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";}.GDCSE03CGX{padding:" + ("4px"+ " " +"8px")  + ";background:" + ("#eee")  + ";vertical-align:") + (("baseline")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-right:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-left-width:" + ("0")  + ";}.GDCSE03CHX{padding:" + ("4px"+ " " +"8px")  + ";background:" + ("#eee")  + ";vertical-align:" + ("baseline") ) + (";-moz-border-radius:" + ("0")  + ";-webkit-border-radius:" + ("0")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border-right:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-left-width:" + ("0")  + ";}.GDCSE03CAV{padding:" + ("10px")  + ";text-align:") + (("left")  + ";float:" + ("left")  + ";}.GDCSE03COU{float:" + ("left")  + ";text-align:" + ("left")  + ";padding:" + ("10px")  + ";white-space:" + ("nowrap")  + ";}.GDCSE03CPU{float:" + ("left")  + ";text-align:" + ("left")  + ";padding:" + ("5px")  + ";white-space:" + ("nowrap")  + ";}.GDCSE03CFV{padding:" + ("5px") ) + (";padding-top:" + ("5px")  + ";text-align:" + ("left")  + ";width:" + ("300px")  + ";}.GDCSE03CGV{padding:" + ("5px")  + ";padding-top:" + ("8px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("top")  + ";width:" + ("300px")  + ";}.GDCSE03CLV{padding:" + ("5px")  + ";width:" + ("600px")  + ";vertical-align:") + (("top")  + ";}.GDCSE03CHV{padding:" + ("7px")  + ";text-align:" + ("left")  + ";width:" + ("200px")  + ";}.GDCSE03CIV{padding:" + ("7px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("top")  + ";width:" + ("200px")  + ";}.GDCSE03CMV{width:" + ("300px")  + ";vertical-align:" + ("top")  + ";text-align:" + ("left") ) + (";}.GDCSE03CJV{padding:" + ("7px")  + ";text-align:" + ("left")  + ";width:" + ("300px")  + ";}.GDCSE03CKV{padding:" + ("7px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("top")  + ";width:" + ("300px")  + ";}.GDCSE03CDV{font-weight:" + ("bold")  + ";padding:" + ("7px")  + ";padding-top:" + ("20px")  + ";padding-bottom:") + (("10px")  + ";}.GDCSE03CPV,.GDCSE03CAW{background-color:" + ("#fff")  + ";}.GDCSE03CHW .GDCSE03CIW{padding:" + ("0")  + ";margin:" + ("0")  + ";white-space:" + ("nowrap")  + ";cursor:" + ("hand")  + ";cursor:" + ("pointer")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03CHW .GDCSE03CJW{background:" + ("#3f8dd1")  + ";color:" + ("white")  + ";height:" + ("auto") ) + (";padding:" + ("0")  + ";margin:" + ("0")  + ";white-space:" + ("nowrap")  + ";cursor:" + ("hand")  + ";cursor:" + ("pointer")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03COV .GDCSE03CMU{font-weight:" + ("bold")  + ";}a,a:visited,a:hover{color:" + ("#004785")  + ";}"));
      }
      public java.lang.String Caption(){
        return "GDCSE03CMU";
      }
      public java.lang.String bottomBorder(){
        return "GDCSE03CNU";
      }
      public java.lang.String dialogButtonPanel(){
        return "GDCSE03COU";
      }
      public java.lang.String dialogButtonPanel2(){
        return "GDCSE03CPU";
      }
      public java.lang.String dialogForm(){
        return "GDCSE03CAV";
      }
      public java.lang.String footerPanel(){
        return "GDCSE03CBV";
      }
      public java.lang.String formPanel(){
        return "GDCSE03CCV";
      }
      public java.lang.String formSectionLabel(){
        return "GDCSE03CDV";
      }
      public java.lang.String formTable(){
        return "GDCSE03CEV";
      }
      public java.lang.String formTableCell0(){
        return "GDCSE03CFV";
      }
      public java.lang.String formTableCell0ListBox(){
        return "GDCSE03CGV";
      }
      public java.lang.String formTableCell0a(){
        return "GDCSE03CHV";
      }
      public java.lang.String formTableCell0aListBox(){
        return "GDCSE03CIV";
      }
      public java.lang.String formTableCell0b(){
        return "GDCSE03CJV";
      }
      public java.lang.String formTableCell0bListBox(){
        return "GDCSE03CKV";
      }
      public java.lang.String formTableCell1(){
        return "GDCSE03CLV";
      }
      public java.lang.String formTableCell1a(){
        return "GDCSE03CMV";
      }
      public java.lang.String gwtButton(){
        return "GDCSE03CNV";
      }
      public java.lang.String gwtDialogBox(){
        return "GDCSE03COV";
      }
      public java.lang.String gwtSplitLayoutPanelHDragger(){
        return "GDCSE03CPV";
      }
      public java.lang.String gwtSplitLayoutPanelVDragger(){
        return "GDCSE03CAW";
      }
      public java.lang.String gwtToggleButtonDown(){
        return "GDCSE03CBW";
      }
      public java.lang.String gwtToggleButtonDownDisabled(){
        return "GDCSE03CCW";
      }
      public java.lang.String gwtToggleButtonDownHovering(){
        return "GDCSE03CDW";
      }
      public java.lang.String gwtToggleButtonUp(){
        return "GDCSE03CEW";
      }
      public java.lang.String gwtToggleButtonUpDisabled(){
        return "GDCSE03CFW";
      }
      public java.lang.String gwtToggleButtonUpHovering(){
        return "GDCSE03CGW";
      }
      public java.lang.String gwtTree(){
        return "GDCSE03CHW";
      }
      public java.lang.String gwtTreeItem(){
        return "GDCSE03CIW";
      }
      public java.lang.String gwtTreeItemSelected(){
        return "GDCSE03CJW";
      }
      public java.lang.String headerPanel1(){
        return "GDCSE03CKW";
      }
      public java.lang.String headerPanel2(){
        return "GDCSE03CLW";
      }
      public java.lang.String mainPanel(){
        return "GDCSE03CMW";
      }
      public java.lang.String messageList(){
        return "GDCSE03CNW";
      }
      public java.lang.String pageContent(){
        return "GDCSE03COW";
      }
      public java.lang.String pageHeader(){
        return "GDCSE03CPW";
      }
      public java.lang.String pagerPanel(){
        return "GDCSE03CAX";
      }
      public java.lang.String searchText(){
        return "GDCSE03CBX";
      }
      public java.lang.String simplePager(){
        return "GDCSE03CCX";
      }
      public java.lang.String titleBar(){
        return "GDCSE03CDX";
      }
      public java.lang.String toolbarButton(){
        return "GDCSE03CEX";
      }
      public java.lang.String toolbarButton2a(){
        return "GDCSE03CFX";
      }
      public java.lang.String toolbarButton2b(){
        return "GDCSE03CGX";
      }
      public java.lang.String toolbarButton2c(){
        return "GDCSE03CHX";
      }
      public java.lang.String toolbarButtonPanel(){
        return "GDCSE03CIX";
      }
      public java.lang.String toolbarPanel(){
        return "GDCSE03CJX";
      }
      public java.lang.String topBorder(){
        return "GDCSE03CKX";
      }
      public java.lang.String treeButtonPanel(){
        return "GDCSE03CLX";
      }
      public java.lang.String treeLinks(){
        return "GDCSE03CMX";
      }
      public java.lang.String treeToolbarButtonPanel(){
        return "GDCSE03CNX";
      }
      public java.lang.String treeToolbarPanel(){
        return "GDCSE03COX";
      }
      public java.lang.String westPanel(){
        return "GDCSE03CPX";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.medassets.report.client.library.ReportTable_ReportTableUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.medassets.report.client.library.ReportTable_ReportTableUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.medassets.report.client.library.ReportTable_ReportTableUiBinderImpl_GenCss_style style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@com.medassets.report.client.library.ReportTable_ReportTableUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
