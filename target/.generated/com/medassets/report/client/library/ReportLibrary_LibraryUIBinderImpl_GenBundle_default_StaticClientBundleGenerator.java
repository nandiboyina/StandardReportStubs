package com.medassets.report.client.library;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class ReportLibrary_LibraryUIBinderImpl_GenBundle_default_StaticClientBundleGenerator implements com.medassets.report.client.library.ReportLibrary_LibraryUIBinderImpl_GenBundle {
  private static ReportLibrary_LibraryUIBinderImpl_GenBundle_default_StaticClientBundleGenerator _instance0 = new ReportLibrary_LibraryUIBinderImpl_GenBundle_default_StaticClientBundleGenerator();
  private void styleInitializer() {
    style = new com.medassets.report.client.library.ReportLibrary_LibraryUIBinderImpl_GenCss_style() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? (("body{font-family:" + ("Arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("9pt")  + ";color:" + ("black")  + ";margin:" + ("0")  + ";border:" + ("0")  + ";padding:" + ("0")  + ";background:" + ("#fff")  + ";direction:" + ("rtl")  + ";}table td,select{font-family:" + ("Arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("9pt")  + ";}.GDCSE03CIT{border:") + (("1px"+ " " +"solid"+ " " +"#2291c8")  + ";}.GDCSE03CLT{background:" + ("#fff"+ " " +"url(headerTitleBG.png)"+ " " +"repeat-x")  + ";color:" + ("#fff")  + ";margin-top:" + ("5px")  + ";margin-right:" + ("5px")  + ";margin-left:" + ("5px")  + ";padding-right:" + ("5px")  + ";padding-top:" + ("4px")  + ";height:" + ("22px")  + ";vertical-align:" + ("middle")  + ";font-size:" + ("10pt") ) + (";}.GDCSE03CKT{margin-top:" + ("1px")  + ";margin-right:" + ("5px")  + ";margin-bottom:" + ("5px")  + ";margin-left:" + ("5px")  + ";}.GDCSE03CMT{border-top:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";vertical-align:" + ("middle")  + ";padding:" + ("0")  + ";margin:" + ("0")  + ";spacing:" + ("0")  + ";text-align:" + ("left")  + ";}.GDCSE03COT{vertical-align:") + (("middle")  + ";padding:" + ("0")  + ";margin:" + ("0")  + ";spacing:" + ("0")  + ";text-align:" + ("left")  + ";}.GDCSE03CNR{margin:" + ("0")  + ";padding:" + ("5px")  + ";text-align:" + ("left")  + ";background-color:" + ("#fff")  + ";font-size:" + ("smaller")  + ";}.GDCSE03CGT{font-weight:" + ("bold") ) + (";font-size:" + ("large")  + ";font-family:" + ("helvetica")  + ";margin-right:" + ("0")  + ";padding:" + ("10px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";background-color:" + ("#fff")  + ";}.GDCSE03CHT{text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03CLU{padding:" + ("0")  + ";border:") + (("1px"+ " " +"solid"+ " " +"#2291c8")  + ";background-color:" + ("#fff")  + ";}.GDCSE03CJT{width:" + ("100%")  + ";padding:" + ("10px")  + ";}.GDCSE03CPT{background-color:" + ("#e0e0e0")  + ";color:" + ("#000")  + ";padding-right:" + ("5px")  + ";font-weight:" + ("bold")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";}.GDCSE03CNT{background:" + ("#fff"+ " " +"url(zoom.png)"+ " " +"no-repeat"+ " " +"3px")  + ";padding:" + ("3px"+ " " +"24px"+ " " +"3px"+ " " +"3px") ) + (";border:" + ("1px"+ " " +"solid"+ " " +"#7f9db9")  + ";margin:" + ("5px")  + ";float:" + ("left")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03CMT{padding:" + ("0")  + ";margin:" + ("0")  + ";text-align:" + ("center")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03CFU{background:" + ("#e1e1e1")  + ";vertical-align:" + ("middle")  + ";border-bottom:") + (("1px"+ " " +"solid"+ " " +"#000")  + ";white-space:" + ("nowrap")  + ";}.GDCSE03CEU{display:" + ("inline")  + ";margin-top:" + ("8px")  + ";margin-right:" + ("5px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";float:" + ("right")  + ";}.GDCSE03CKU{background:" + ("#e1e1e1")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#000") ) + (";}.GDCSE03CJU{width:" + ("100%")  + ";margin-top:" + ("8px")  + ";margin-right:" + ("5px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";}.GDCSE03CHU{margin-top:" + ("8px")  + ";margin-right:" + ("5px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";white-space:") + (("nowrap")  + ";}.GDCSE03CIU{text-decoration:" + ("underline")  + ";margin-right:" + ("5px")  + ";margin-left:" + ("5px")  + ";cursor:" + ("hand")  + ";}.GDCSE03CGU{border-top:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";}.GDCSE03CAU{padding:" + ("0"+ " " +"5px"+ " " +"0"+ " " +"5px")  + ";margin:" + ("0"+ " " +"0"+ " " +"0"+ " " +"0")  + ";width:" + ("auto")  + " !important;overflow:" + ("visible")  + ";}.GDCSE03CBU{padding:" + ("4px"+ " " +"8px") ) + (";background:" + ("#eee")  + ";vertical-align:" + ("baseline")  + ";border-top-right-radius:" + ("4px")  + ";border-bottom-right-radius:" + ("4px")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";}.GDCSE03CCU{padding:" + ("4px"+ " " +"8px")  + ";background:" + ("#eee")  + ";vertical-align:") + (("baseline")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-left:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-right-width:" + ("0")  + ";}.GDCSE03CDU{padding:" + ("4px"+ " " +"8px")  + ";background:" + ("#eee")  + ";vertical-align:" + ("baseline") ) + (";-moz-border-radius:" + ("0")  + ";-webkit-border-radius:" + ("0")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border-left:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-right-width:" + ("0")  + ";}.GDCSE03CMR{padding:" + ("10px")  + ";text-align:") + (("right")  + ";float:" + ("right")  + ";}.GDCSE03CKR{float:" + ("right")  + ";text-align:" + ("right")  + ";padding:" + ("10px")  + ";white-space:" + ("nowrap")  + ";}.GDCSE03CLR{float:" + ("right")  + ";text-align:" + ("right")  + ";padding:" + ("5px")  + ";white-space:" + ("nowrap")  + ";}.GDCSE03CBS{padding:" + ("5px") ) + (";padding-top:" + ("5px")  + ";text-align:" + ("right")  + ";width:" + ("300px")  + ";}.GDCSE03CCS{padding:" + ("5px")  + ";padding-top:" + ("8px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("top")  + ";width:" + ("300px")  + ";}.GDCSE03CHS{padding:" + ("5px")  + ";width:" + ("600px")  + ";vertical-align:") + (("top")  + ";}.GDCSE03CDS{padding:" + ("7px")  + ";text-align:" + ("right")  + ";width:" + ("200px")  + ";}.GDCSE03CES{padding:" + ("7px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("top")  + ";width:" + ("200px")  + ";}.GDCSE03CIS{width:" + ("300px")  + ";vertical-align:" + ("top")  + ";text-align:" + ("right") ) + (";}.GDCSE03CFS{padding:" + ("7px")  + ";text-align:" + ("right")  + ";width:" + ("300px")  + ";}.GDCSE03CGS{padding:" + ("7px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("top")  + ";width:" + ("300px")  + ";}.GDCSE03CPR{font-weight:" + ("bold")  + ";padding:" + ("7px")  + ";padding-top:" + ("20px")  + ";padding-bottom:") + (("10px")  + ";}.GDCSE03CLS,.GDCSE03CMS{background-color:" + ("#fff")  + ";}.GDCSE03CDT .GDCSE03CET{padding:" + ("0")  + ";margin:" + ("0")  + ";white-space:" + ("nowrap")  + ";cursor:" + ("hand")  + ";cursor:" + ("pointer")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03CDT .GDCSE03CFT{background:" + ("#3f8dd1")  + ";color:" + ("white")  + ";height:" + ("auto") ) + (";padding:" + ("0")  + ";margin:" + ("0")  + ";white-space:" + ("nowrap")  + ";cursor:" + ("hand")  + ";cursor:" + ("pointer")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03CKS .GDCSE03CIR{font-weight:" + ("bold")  + ";}a,a:visited,a:hover{color:" + ("#004785")  + ";}")) : (("body{font-family:" + ("Arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("9pt")  + ";color:" + ("black")  + ";margin:" + ("0")  + ";border:" + ("0")  + ";padding:" + ("0")  + ";background:" + ("#fff")  + ";direction:" + ("ltr")  + ";}table td,select{font-family:" + ("Arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("9pt")  + ";}.GDCSE03CIT{border:") + (("1px"+ " " +"solid"+ " " +"#2291c8")  + ";}.GDCSE03CLT{background:" + ("#fff"+ " " +"url(headerTitleBG.png)"+ " " +"repeat-x")  + ";color:" + ("#fff")  + ";margin-top:" + ("5px")  + ";margin-left:" + ("5px")  + ";margin-right:" + ("5px")  + ";padding-left:" + ("5px")  + ";padding-top:" + ("4px")  + ";height:" + ("22px")  + ";vertical-align:" + ("middle")  + ";font-size:" + ("10pt") ) + (";}.GDCSE03CKT{margin-top:" + ("1px")  + ";margin-left:" + ("5px")  + ";margin-bottom:" + ("5px")  + ";margin-right:" + ("5px")  + ";}.GDCSE03CMT{border-top:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";vertical-align:" + ("middle")  + ";padding:" + ("0")  + ";margin:" + ("0")  + ";spacing:" + ("0")  + ";text-align:" + ("right")  + ";}.GDCSE03COT{vertical-align:") + (("middle")  + ";padding:" + ("0")  + ";margin:" + ("0")  + ";spacing:" + ("0")  + ";text-align:" + ("right")  + ";}.GDCSE03CNR{margin:" + ("0")  + ";padding:" + ("5px")  + ";text-align:" + ("right")  + ";background-color:" + ("#fff")  + ";font-size:" + ("smaller")  + ";}.GDCSE03CGT{font-weight:" + ("bold") ) + (";font-size:" + ("large")  + ";font-family:" + ("helvetica")  + ";margin-left:" + ("0")  + ";padding:" + ("10px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";background-color:" + ("#fff")  + ";}.GDCSE03CHT{text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03CLU{padding:" + ("0")  + ";border:") + (("1px"+ " " +"solid"+ " " +"#2291c8")  + ";background-color:" + ("#fff")  + ";}.GDCSE03CJT{width:" + ("100%")  + ";padding:" + ("10px")  + ";}.GDCSE03CPT{background-color:" + ("#e0e0e0")  + ";color:" + ("#000")  + ";padding-left:" + ("5px")  + ";font-weight:" + ("bold")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";}.GDCSE03CNT{background:" + ("#fff"+ " " +"url(zoom.png)"+ " " +"no-repeat"+ " " +"3px")  + ";padding:" + ("3px"+ " " +"3px"+ " " +"3px"+ " " +"24px") ) + (";border:" + ("1px"+ " " +"solid"+ " " +"#7f9db9")  + ";margin:" + ("5px")  + ";float:" + ("right")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03CMT{padding:" + ("0")  + ";margin:" + ("0")  + ";text-align:" + ("center")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03CFU{background:" + ("#e1e1e1")  + ";vertical-align:" + ("middle")  + ";border-bottom:") + (("1px"+ " " +"solid"+ " " +"#000")  + ";white-space:" + ("nowrap")  + ";}.GDCSE03CEU{display:" + ("inline")  + ";margin-top:" + ("8px")  + ";margin-left:" + ("5px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";float:" + ("left")  + ";}.GDCSE03CKU{background:" + ("#e1e1e1")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#000") ) + (";}.GDCSE03CJU{width:" + ("100%")  + ";margin-top:" + ("8px")  + ";margin-left:" + ("5px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";}.GDCSE03CHU{margin-top:" + ("8px")  + ";margin-left:" + ("5px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";white-space:") + (("nowrap")  + ";}.GDCSE03CIU{text-decoration:" + ("underline")  + ";margin-left:" + ("5px")  + ";margin-right:" + ("5px")  + ";cursor:" + ("hand")  + ";}.GDCSE03CGU{border-top:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";}.GDCSE03CAU{padding:" + ("0"+ " " +"5px"+ " " +"0"+ " " +"5px")  + ";margin:" + ("0"+ " " +"0"+ " " +"0"+ " " +"0")  + ";width:" + ("auto")  + " !important;overflow:" + ("visible")  + ";}.GDCSE03CBU{padding:" + ("4px"+ " " +"8px") ) + (";background:" + ("#eee")  + ";vertical-align:" + ("baseline")  + ";border-top-left-radius:" + ("4px")  + ";border-bottom-left-radius:" + ("4px")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";}.GDCSE03CCU{padding:" + ("4px"+ " " +"8px")  + ";background:" + ("#eee")  + ";vertical-align:") + (("baseline")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-right:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-left-width:" + ("0")  + ";}.GDCSE03CDU{padding:" + ("4px"+ " " +"8px")  + ";background:" + ("#eee")  + ";vertical-align:" + ("baseline") ) + (";-moz-border-radius:" + ("0")  + ";-webkit-border-radius:" + ("0")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border-right:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-left-width:" + ("0")  + ";}.GDCSE03CMR{padding:" + ("10px")  + ";text-align:") + (("left")  + ";float:" + ("left")  + ";}.GDCSE03CKR{float:" + ("left")  + ";text-align:" + ("left")  + ";padding:" + ("10px")  + ";white-space:" + ("nowrap")  + ";}.GDCSE03CLR{float:" + ("left")  + ";text-align:" + ("left")  + ";padding:" + ("5px")  + ";white-space:" + ("nowrap")  + ";}.GDCSE03CBS{padding:" + ("5px") ) + (";padding-top:" + ("5px")  + ";text-align:" + ("left")  + ";width:" + ("300px")  + ";}.GDCSE03CCS{padding:" + ("5px")  + ";padding-top:" + ("8px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("top")  + ";width:" + ("300px")  + ";}.GDCSE03CHS{padding:" + ("5px")  + ";width:" + ("600px")  + ";vertical-align:") + (("top")  + ";}.GDCSE03CDS{padding:" + ("7px")  + ";text-align:" + ("left")  + ";width:" + ("200px")  + ";}.GDCSE03CES{padding:" + ("7px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("top")  + ";width:" + ("200px")  + ";}.GDCSE03CIS{width:" + ("300px")  + ";vertical-align:" + ("top")  + ";text-align:" + ("left") ) + (";}.GDCSE03CFS{padding:" + ("7px")  + ";text-align:" + ("left")  + ";width:" + ("300px")  + ";}.GDCSE03CGS{padding:" + ("7px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("top")  + ";width:" + ("300px")  + ";}.GDCSE03CPR{font-weight:" + ("bold")  + ";padding:" + ("7px")  + ";padding-top:" + ("20px")  + ";padding-bottom:") + (("10px")  + ";}.GDCSE03CLS,.GDCSE03CMS{background-color:" + ("#fff")  + ";}.GDCSE03CDT .GDCSE03CET{padding:" + ("0")  + ";margin:" + ("0")  + ";white-space:" + ("nowrap")  + ";cursor:" + ("hand")  + ";cursor:" + ("pointer")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03CDT .GDCSE03CFT{background:" + ("#3f8dd1")  + ";color:" + ("white")  + ";height:" + ("auto") ) + (";padding:" + ("0")  + ";margin:" + ("0")  + ";white-space:" + ("nowrap")  + ";cursor:" + ("hand")  + ";cursor:" + ("pointer")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03CKS .GDCSE03CIR{font-weight:" + ("bold")  + ";}a,a:visited,a:hover{color:" + ("#004785")  + ";}"));
      }
      public java.lang.String Caption(){
        return "GDCSE03CIR";
      }
      public java.lang.String bottomBorder(){
        return "GDCSE03CJR";
      }
      public java.lang.String dialogButtonPanel(){
        return "GDCSE03CKR";
      }
      public java.lang.String dialogButtonPanel2(){
        return "GDCSE03CLR";
      }
      public java.lang.String dialogForm(){
        return "GDCSE03CMR";
      }
      public java.lang.String footerPanel(){
        return "GDCSE03CNR";
      }
      public java.lang.String formPanel(){
        return "GDCSE03COR";
      }
      public java.lang.String formSectionLabel(){
        return "GDCSE03CPR";
      }
      public java.lang.String formTable(){
        return "GDCSE03CAS";
      }
      public java.lang.String formTableCell0(){
        return "GDCSE03CBS";
      }
      public java.lang.String formTableCell0ListBox(){
        return "GDCSE03CCS";
      }
      public java.lang.String formTableCell0a(){
        return "GDCSE03CDS";
      }
      public java.lang.String formTableCell0aListBox(){
        return "GDCSE03CES";
      }
      public java.lang.String formTableCell0b(){
        return "GDCSE03CFS";
      }
      public java.lang.String formTableCell0bListBox(){
        return "GDCSE03CGS";
      }
      public java.lang.String formTableCell1(){
        return "GDCSE03CHS";
      }
      public java.lang.String formTableCell1a(){
        return "GDCSE03CIS";
      }
      public java.lang.String gwtButton(){
        return "GDCSE03CJS";
      }
      public java.lang.String gwtDialogBox(){
        return "GDCSE03CKS";
      }
      public java.lang.String gwtSplitLayoutPanelHDragger(){
        return "GDCSE03CLS";
      }
      public java.lang.String gwtSplitLayoutPanelVDragger(){
        return "GDCSE03CMS";
      }
      public java.lang.String gwtToggleButtonDown(){
        return "GDCSE03CNS";
      }
      public java.lang.String gwtToggleButtonDownDisabled(){
        return "GDCSE03COS";
      }
      public java.lang.String gwtToggleButtonDownHovering(){
        return "GDCSE03CPS";
      }
      public java.lang.String gwtToggleButtonUp(){
        return "GDCSE03CAT";
      }
      public java.lang.String gwtToggleButtonUpDisabled(){
        return "GDCSE03CBT";
      }
      public java.lang.String gwtToggleButtonUpHovering(){
        return "GDCSE03CCT";
      }
      public java.lang.String gwtTree(){
        return "GDCSE03CDT";
      }
      public java.lang.String gwtTreeItem(){
        return "GDCSE03CET";
      }
      public java.lang.String gwtTreeItemSelected(){
        return "GDCSE03CFT";
      }
      public java.lang.String headerPanel1(){
        return "GDCSE03CGT";
      }
      public java.lang.String headerPanel2(){
        return "GDCSE03CHT";
      }
      public java.lang.String mainPanel(){
        return "GDCSE03CIT";
      }
      public java.lang.String messageList(){
        return "GDCSE03CJT";
      }
      public java.lang.String pageContent(){
        return "GDCSE03CKT";
      }
      public java.lang.String pageHeader(){
        return "GDCSE03CLT";
      }
      public java.lang.String pagerPanel(){
        return "GDCSE03CMT";
      }
      public java.lang.String searchText(){
        return "GDCSE03CNT";
      }
      public java.lang.String simplePager(){
        return "GDCSE03COT";
      }
      public java.lang.String titleBar(){
        return "GDCSE03CPT";
      }
      public java.lang.String toolbarButton(){
        return "GDCSE03CAU";
      }
      public java.lang.String toolbarButton2a(){
        return "GDCSE03CBU";
      }
      public java.lang.String toolbarButton2b(){
        return "GDCSE03CCU";
      }
      public java.lang.String toolbarButton2c(){
        return "GDCSE03CDU";
      }
      public java.lang.String toolbarButtonPanel(){
        return "GDCSE03CEU";
      }
      public java.lang.String toolbarPanel(){
        return "GDCSE03CFU";
      }
      public java.lang.String topBorder(){
        return "GDCSE03CGU";
      }
      public java.lang.String treeButtonPanel(){
        return "GDCSE03CHU";
      }
      public java.lang.String treeLinks(){
        return "GDCSE03CIU";
      }
      public java.lang.String treeToolbarButtonPanel(){
        return "GDCSE03CJU";
      }
      public java.lang.String treeToolbarPanel(){
        return "GDCSE03CKU";
      }
      public java.lang.String westPanel(){
        return "GDCSE03CLU";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.medassets.report.client.library.ReportLibrary_LibraryUIBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.medassets.report.client.library.ReportLibrary_LibraryUIBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.medassets.report.client.library.ReportLibrary_LibraryUIBinderImpl_GenCss_style style;
  
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
      case 'style': return this.@com.medassets.report.client.library.ReportLibrary_LibraryUIBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
