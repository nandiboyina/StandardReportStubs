package com.medassets.report.client.flex;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class FlexGeneralPanel_BinderImpl_GenBundle_default_StaticClientBundleGenerator implements com.medassets.report.client.flex.FlexGeneralPanel_BinderImpl_GenBundle {
  private static FlexGeneralPanel_BinderImpl_GenBundle_default_StaticClientBundleGenerator _instance0 = new FlexGeneralPanel_BinderImpl_GenBundle_default_StaticClientBundleGenerator();
  private void styleInitializer() {
    style = new com.medassets.report.client.flex.FlexGeneralPanel_BinderImpl_GenCss_style() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? (("body{font-family:" + ("Arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("9pt")  + ";color:" + ("black")  + ";margin:" + ("0")  + ";border:" + ("0")  + ";padding:" + ("0")  + ";background:" + ("#fff")  + ";direction:" + ("rtl")  + ";}table td,select{font-family:" + ("Arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("9pt")  + ";}.GDCSE03CODB{border:") + (("1px"+ " " +"solid"+ " " +"#2291c8")  + ";}.GDCSE03CBEB{background:" + ("#fff"+ " " +"url(headerTitleBG.png)"+ " " +"repeat-x")  + ";color:" + ("#fff")  + ";margin-top:" + ("5px")  + ";margin-right:" + ("5px")  + ";margin-left:" + ("5px")  + ";padding-right:" + ("5px")  + ";padding-top:" + ("4px")  + ";height:" + ("22px")  + ";vertical-align:" + ("middle")  + ";font-size:" + ("10pt") ) + (";}.GDCSE03CAEB{margin-top:" + ("1px")  + ";margin-right:" + ("5px")  + ";margin-bottom:" + ("5px")  + ";margin-left:" + ("5px")  + ";}.GDCSE03CCEB{border-top:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";vertical-align:" + ("middle")  + ";padding:" + ("0")  + ";margin:" + ("0")  + ";spacing:" + ("0")  + ";text-align:" + ("left")  + ";}.GDCSE03CEEB{vertical-align:") + (("middle")  + ";padding:" + ("0")  + ";margin:" + ("0")  + ";spacing:" + ("0")  + ";text-align:" + ("left")  + ";}.GDCSE03CDCB{margin:" + ("0")  + ";padding:" + ("5px")  + ";text-align:" + ("left")  + ";background-color:" + ("#fff")  + ";font-size:" + ("smaller")  + ";}.GDCSE03CMDB{font-weight:" + ("bold") ) + (";font-size:" + ("large")  + ";font-family:" + ("helvetica")  + ";margin-right:" + ("0")  + ";padding:" + ("10px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";background-color:" + ("#fff")  + ";}.GDCSE03CNDB{text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03CBFB{padding:" + ("0")  + ";border:") + (("1px"+ " " +"solid"+ " " +"#2291c8")  + ";background-color:" + ("#fff")  + ";}.GDCSE03CPDB{width:" + ("100%")  + ";padding:" + ("10px")  + ";}.GDCSE03CFEB{background-color:" + ("#e0e0e0")  + ";color:" + ("#000")  + ";padding-right:" + ("5px")  + ";font-weight:" + ("bold")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";}.GDCSE03CDEB{background:" + ("#fff"+ " " +"url(zoom.png)"+ " " +"no-repeat"+ " " +"3px")  + ";padding:" + ("3px"+ " " +"24px"+ " " +"3px"+ " " +"3px") ) + (";border:" + ("1px"+ " " +"solid"+ " " +"#7f9db9")  + ";margin:" + ("5px")  + ";float:" + ("left")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03CCEB{padding:" + ("0")  + ";margin:" + ("0")  + ";text-align:" + ("center")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03CLEB{background:" + ("#e1e1e1")  + ";vertical-align:" + ("middle")  + ";border-bottom:") + (("1px"+ " " +"solid"+ " " +"#000")  + ";white-space:" + ("nowrap")  + ";}.GDCSE03CKEB{display:" + ("inline")  + ";margin-top:" + ("8px")  + ";margin-right:" + ("5px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";float:" + ("right")  + ";}.GDCSE03CAFB{background:" + ("#e1e1e1")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#000") ) + (";}.GDCSE03CPEB{width:" + ("100%")  + ";margin-top:" + ("8px")  + ";margin-right:" + ("5px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";}.GDCSE03CNEB{margin-top:" + ("8px")  + ";margin-right:" + ("5px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";white-space:") + (("nowrap")  + ";}.GDCSE03COEB{text-decoration:" + ("underline")  + ";margin-right:" + ("5px")  + ";margin-left:" + ("5px")  + ";cursor:" + ("hand")  + ";}.GDCSE03CMEB{border-top:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";}.GDCSE03CGEB{padding:" + ("0"+ " " +"5px"+ " " +"0"+ " " +"5px")  + ";margin:" + ("0"+ " " +"0"+ " " +"0"+ " " +"0")  + ";width:" + ("auto")  + " !important;overflow:" + ("visible")  + ";}.GDCSE03CHEB{padding:" + ("4px"+ " " +"8px") ) + (";background:" + ("#eee")  + ";vertical-align:" + ("baseline")  + ";border-top-right-radius:" + ("4px")  + ";border-bottom-right-radius:" + ("4px")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";}.GDCSE03CIEB{padding:" + ("4px"+ " " +"8px")  + ";background:" + ("#eee")  + ";vertical-align:") + (("baseline")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-left:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-right-width:" + ("0")  + ";}.GDCSE03CJEB{padding:" + ("4px"+ " " +"8px")  + ";background:" + ("#eee")  + ";vertical-align:" + ("baseline") ) + (";-moz-border-radius:" + ("0")  + ";-webkit-border-radius:" + ("0")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border-left:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-right-width:" + ("0")  + ";}.GDCSE03CCCB{padding:" + ("10px")  + ";text-align:") + (("right")  + ";float:" + ("right")  + ";}.GDCSE03CACB{float:" + ("right")  + ";text-align:" + ("right")  + ";padding:" + ("10px")  + ";white-space:" + ("nowrap")  + ";}.GDCSE03CBCB{float:" + ("right")  + ";text-align:" + ("right")  + ";padding:" + ("5px")  + ";white-space:" + ("nowrap")  + ";}.GDCSE03CHCB{padding:" + ("5px") ) + (";padding-top:" + ("5px")  + ";text-align:" + ("right")  + ";width:" + ("300px")  + ";}.GDCSE03CICB{padding:" + ("5px")  + ";padding-top:" + ("8px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("top")  + ";width:" + ("300px")  + ";}.GDCSE03CNCB{padding:" + ("5px")  + ";width:" + ("600px")  + ";vertical-align:") + (("top")  + ";}.GDCSE03CJCB{padding:" + ("7px")  + ";text-align:" + ("right")  + ";width:" + ("200px")  + ";}.GDCSE03CKCB{padding:" + ("7px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("top")  + ";width:" + ("200px")  + ";}.GDCSE03COCB{width:" + ("300px")  + ";vertical-align:" + ("top")  + ";text-align:" + ("right") ) + (";}.GDCSE03CLCB{padding:" + ("7px")  + ";text-align:" + ("right")  + ";width:" + ("300px")  + ";}.GDCSE03CMCB{padding:" + ("7px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("top")  + ";width:" + ("300px")  + ";}.GDCSE03CFCB{font-weight:" + ("bold")  + ";padding:" + ("7px")  + ";padding-top:" + ("20px")  + ";padding-bottom:") + (("10px")  + ";}.GDCSE03CBDB,.GDCSE03CCDB{background-color:" + ("#fff")  + ";}.GDCSE03CJDB .GDCSE03CKDB{padding:" + ("0")  + ";margin:" + ("0")  + ";white-space:" + ("nowrap")  + ";cursor:" + ("hand")  + ";cursor:" + ("pointer")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03CJDB .GDCSE03CLDB{background:" + ("#3f8dd1")  + ";color:" + ("white")  + ";height:" + ("auto") ) + (";padding:" + ("0")  + ";margin:" + ("0")  + ";white-space:" + ("nowrap")  + ";cursor:" + ("hand")  + ";cursor:" + ("pointer")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03CADB .GDCSE03COBB{font-weight:" + ("bold")  + ";}a,a:visited,a:hover{color:" + ("#004785")  + ";}")) : (("body{font-family:" + ("Arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("9pt")  + ";color:" + ("black")  + ";margin:" + ("0")  + ";border:" + ("0")  + ";padding:" + ("0")  + ";background:" + ("#fff")  + ";direction:" + ("ltr")  + ";}table td,select{font-family:" + ("Arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("9pt")  + ";}.GDCSE03CODB{border:") + (("1px"+ " " +"solid"+ " " +"#2291c8")  + ";}.GDCSE03CBEB{background:" + ("#fff"+ " " +"url(headerTitleBG.png)"+ " " +"repeat-x")  + ";color:" + ("#fff")  + ";margin-top:" + ("5px")  + ";margin-left:" + ("5px")  + ";margin-right:" + ("5px")  + ";padding-left:" + ("5px")  + ";padding-top:" + ("4px")  + ";height:" + ("22px")  + ";vertical-align:" + ("middle")  + ";font-size:" + ("10pt") ) + (";}.GDCSE03CAEB{margin-top:" + ("1px")  + ";margin-left:" + ("5px")  + ";margin-bottom:" + ("5px")  + ";margin-right:" + ("5px")  + ";}.GDCSE03CCEB{border-top:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";vertical-align:" + ("middle")  + ";padding:" + ("0")  + ";margin:" + ("0")  + ";spacing:" + ("0")  + ";text-align:" + ("right")  + ";}.GDCSE03CEEB{vertical-align:") + (("middle")  + ";padding:" + ("0")  + ";margin:" + ("0")  + ";spacing:" + ("0")  + ";text-align:" + ("right")  + ";}.GDCSE03CDCB{margin:" + ("0")  + ";padding:" + ("5px")  + ";text-align:" + ("right")  + ";background-color:" + ("#fff")  + ";font-size:" + ("smaller")  + ";}.GDCSE03CMDB{font-weight:" + ("bold") ) + (";font-size:" + ("large")  + ";font-family:" + ("helvetica")  + ";margin-left:" + ("0")  + ";padding:" + ("10px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";background-color:" + ("#fff")  + ";}.GDCSE03CNDB{text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03CBFB{padding:" + ("0")  + ";border:") + (("1px"+ " " +"solid"+ " " +"#2291c8")  + ";background-color:" + ("#fff")  + ";}.GDCSE03CPDB{width:" + ("100%")  + ";padding:" + ("10px")  + ";}.GDCSE03CFEB{background-color:" + ("#e0e0e0")  + ";color:" + ("#000")  + ";padding-left:" + ("5px")  + ";font-weight:" + ("bold")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";}.GDCSE03CDEB{background:" + ("#fff"+ " " +"url(zoom.png)"+ " " +"no-repeat"+ " " +"3px")  + ";padding:" + ("3px"+ " " +"3px"+ " " +"3px"+ " " +"24px") ) + (";border:" + ("1px"+ " " +"solid"+ " " +"#7f9db9")  + ";margin:" + ("5px")  + ";float:" + ("right")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03CCEB{padding:" + ("0")  + ";margin:" + ("0")  + ";text-align:" + ("center")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03CLEB{background:" + ("#e1e1e1")  + ";vertical-align:" + ("middle")  + ";border-bottom:") + (("1px"+ " " +"solid"+ " " +"#000")  + ";white-space:" + ("nowrap")  + ";}.GDCSE03CKEB{display:" + ("inline")  + ";margin-top:" + ("8px")  + ";margin-left:" + ("5px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";float:" + ("left")  + ";}.GDCSE03CAFB{background:" + ("#e1e1e1")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#000") ) + (";}.GDCSE03CPEB{width:" + ("100%")  + ";margin-top:" + ("8px")  + ";margin-left:" + ("5px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";}.GDCSE03CNEB{margin-top:" + ("8px")  + ";margin-left:" + ("5px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";white-space:") + (("nowrap")  + ";}.GDCSE03COEB{text-decoration:" + ("underline")  + ";margin-left:" + ("5px")  + ";margin-right:" + ("5px")  + ";cursor:" + ("hand")  + ";}.GDCSE03CMEB{border-top:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";}.GDCSE03CGEB{padding:" + ("0"+ " " +"5px"+ " " +"0"+ " " +"5px")  + ";margin:" + ("0"+ " " +"0"+ " " +"0"+ " " +"0")  + ";width:" + ("auto")  + " !important;overflow:" + ("visible")  + ";}.GDCSE03CHEB{padding:" + ("4px"+ " " +"8px") ) + (";background:" + ("#eee")  + ";vertical-align:" + ("baseline")  + ";border-top-left-radius:" + ("4px")  + ";border-bottom-left-radius:" + ("4px")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";}.GDCSE03CIEB{padding:" + ("4px"+ " " +"8px")  + ";background:" + ("#eee")  + ";vertical-align:") + (("baseline")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-right:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-left-width:" + ("0")  + ";}.GDCSE03CJEB{padding:" + ("4px"+ " " +"8px")  + ";background:" + ("#eee")  + ";vertical-align:" + ("baseline") ) + (";-moz-border-radius:" + ("0")  + ";-webkit-border-radius:" + ("0")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border-right:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-left-width:" + ("0")  + ";}.GDCSE03CCCB{padding:" + ("10px")  + ";text-align:") + (("left")  + ";float:" + ("left")  + ";}.GDCSE03CACB{float:" + ("left")  + ";text-align:" + ("left")  + ";padding:" + ("10px")  + ";white-space:" + ("nowrap")  + ";}.GDCSE03CBCB{float:" + ("left")  + ";text-align:" + ("left")  + ";padding:" + ("5px")  + ";white-space:" + ("nowrap")  + ";}.GDCSE03CHCB{padding:" + ("5px") ) + (";padding-top:" + ("5px")  + ";text-align:" + ("left")  + ";width:" + ("300px")  + ";}.GDCSE03CICB{padding:" + ("5px")  + ";padding-top:" + ("8px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("top")  + ";width:" + ("300px")  + ";}.GDCSE03CNCB{padding:" + ("5px")  + ";width:" + ("600px")  + ";vertical-align:") + (("top")  + ";}.GDCSE03CJCB{padding:" + ("7px")  + ";text-align:" + ("left")  + ";width:" + ("200px")  + ";}.GDCSE03CKCB{padding:" + ("7px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("top")  + ";width:" + ("200px")  + ";}.GDCSE03COCB{width:" + ("300px")  + ";vertical-align:" + ("top")  + ";text-align:" + ("left") ) + (";}.GDCSE03CLCB{padding:" + ("7px")  + ";text-align:" + ("left")  + ";width:" + ("300px")  + ";}.GDCSE03CMCB{padding:" + ("7px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("top")  + ";width:" + ("300px")  + ";}.GDCSE03CFCB{font-weight:" + ("bold")  + ";padding:" + ("7px")  + ";padding-top:" + ("20px")  + ";padding-bottom:") + (("10px")  + ";}.GDCSE03CBDB,.GDCSE03CCDB{background-color:" + ("#fff")  + ";}.GDCSE03CJDB .GDCSE03CKDB{padding:" + ("0")  + ";margin:" + ("0")  + ";white-space:" + ("nowrap")  + ";cursor:" + ("hand")  + ";cursor:" + ("pointer")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03CJDB .GDCSE03CLDB{background:" + ("#3f8dd1")  + ";color:" + ("white")  + ";height:" + ("auto") ) + (";padding:" + ("0")  + ";margin:" + ("0")  + ";white-space:" + ("nowrap")  + ";cursor:" + ("hand")  + ";cursor:" + ("pointer")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03CADB .GDCSE03COBB{font-weight:" + ("bold")  + ";}a,a:visited,a:hover{color:" + ("#004785")  + ";}"));
      }
      public java.lang.String Caption(){
        return "GDCSE03COBB";
      }
      public java.lang.String bottomBorder(){
        return "GDCSE03CPBB";
      }
      public java.lang.String dialogButtonPanel(){
        return "GDCSE03CACB";
      }
      public java.lang.String dialogButtonPanel2(){
        return "GDCSE03CBCB";
      }
      public java.lang.String dialogForm(){
        return "GDCSE03CCCB";
      }
      public java.lang.String footerPanel(){
        return "GDCSE03CDCB";
      }
      public java.lang.String formPanel(){
        return "GDCSE03CECB";
      }
      public java.lang.String formSectionLabel(){
        return "GDCSE03CFCB";
      }
      public java.lang.String formTable(){
        return "GDCSE03CGCB";
      }
      public java.lang.String formTableCell0(){
        return "GDCSE03CHCB";
      }
      public java.lang.String formTableCell0ListBox(){
        return "GDCSE03CICB";
      }
      public java.lang.String formTableCell0a(){
        return "GDCSE03CJCB";
      }
      public java.lang.String formTableCell0aListBox(){
        return "GDCSE03CKCB";
      }
      public java.lang.String formTableCell0b(){
        return "GDCSE03CLCB";
      }
      public java.lang.String formTableCell0bListBox(){
        return "GDCSE03CMCB";
      }
      public java.lang.String formTableCell1(){
        return "GDCSE03CNCB";
      }
      public java.lang.String formTableCell1a(){
        return "GDCSE03COCB";
      }
      public java.lang.String gwtButton(){
        return "GDCSE03CPCB";
      }
      public java.lang.String gwtDialogBox(){
        return "GDCSE03CADB";
      }
      public java.lang.String gwtSplitLayoutPanelHDragger(){
        return "GDCSE03CBDB";
      }
      public java.lang.String gwtSplitLayoutPanelVDragger(){
        return "GDCSE03CCDB";
      }
      public java.lang.String gwtToggleButtonDown(){
        return "GDCSE03CDDB";
      }
      public java.lang.String gwtToggleButtonDownDisabled(){
        return "GDCSE03CEDB";
      }
      public java.lang.String gwtToggleButtonDownHovering(){
        return "GDCSE03CFDB";
      }
      public java.lang.String gwtToggleButtonUp(){
        return "GDCSE03CGDB";
      }
      public java.lang.String gwtToggleButtonUpDisabled(){
        return "GDCSE03CHDB";
      }
      public java.lang.String gwtToggleButtonUpHovering(){
        return "GDCSE03CIDB";
      }
      public java.lang.String gwtTree(){
        return "GDCSE03CJDB";
      }
      public java.lang.String gwtTreeItem(){
        return "GDCSE03CKDB";
      }
      public java.lang.String gwtTreeItemSelected(){
        return "GDCSE03CLDB";
      }
      public java.lang.String headerPanel1(){
        return "GDCSE03CMDB";
      }
      public java.lang.String headerPanel2(){
        return "GDCSE03CNDB";
      }
      public java.lang.String mainPanel(){
        return "GDCSE03CODB";
      }
      public java.lang.String messageList(){
        return "GDCSE03CPDB";
      }
      public java.lang.String pageContent(){
        return "GDCSE03CAEB";
      }
      public java.lang.String pageHeader(){
        return "GDCSE03CBEB";
      }
      public java.lang.String pagerPanel(){
        return "GDCSE03CCEB";
      }
      public java.lang.String searchText(){
        return "GDCSE03CDEB";
      }
      public java.lang.String simplePager(){
        return "GDCSE03CEEB";
      }
      public java.lang.String titleBar(){
        return "GDCSE03CFEB";
      }
      public java.lang.String toolbarButton(){
        return "GDCSE03CGEB";
      }
      public java.lang.String toolbarButton2a(){
        return "GDCSE03CHEB";
      }
      public java.lang.String toolbarButton2b(){
        return "GDCSE03CIEB";
      }
      public java.lang.String toolbarButton2c(){
        return "GDCSE03CJEB";
      }
      public java.lang.String toolbarButtonPanel(){
        return "GDCSE03CKEB";
      }
      public java.lang.String toolbarPanel(){
        return "GDCSE03CLEB";
      }
      public java.lang.String topBorder(){
        return "GDCSE03CMEB";
      }
      public java.lang.String treeButtonPanel(){
        return "GDCSE03CNEB";
      }
      public java.lang.String treeLinks(){
        return "GDCSE03COEB";
      }
      public java.lang.String treeToolbarButtonPanel(){
        return "GDCSE03CPEB";
      }
      public java.lang.String treeToolbarPanel(){
        return "GDCSE03CAFB";
      }
      public java.lang.String westPanel(){
        return "GDCSE03CBFB";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.medassets.report.client.flex.FlexGeneralPanel_BinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.medassets.report.client.flex.FlexGeneralPanel_BinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.medassets.report.client.flex.FlexGeneralPanel_BinderImpl_GenCss_style style;
  
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
      case 'style': return this.@com.medassets.report.client.flex.FlexGeneralPanel_BinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
