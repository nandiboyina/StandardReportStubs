package com.medassets.report.client.library;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Main_MainUiBinderImpl_GenBundle_default_InlineClientBundleGenerator implements com.medassets.report.client.library.Main_MainUiBinderImpl_GenBundle {
  private static Main_MainUiBinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new Main_MainUiBinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.medassets.report.client.library.Main_MainUiBinderImpl_GenCss_style() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? (("body{font-family:" + ("Arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("9pt")  + ";color:" + ("black")  + ";margin:" + ("0")  + ";border:" + ("0")  + ";padding:" + ("0")  + ";background:" + ("#fff")  + ";direction:" + ("rtl")  + ";}table td,select{font-family:" + ("Arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("9pt")  + ";}.GOJU5EJBGN{border:") + (("1px"+ " " +"solid"+ " " +"#2291c8")  + ";}.GOJU5EJBJN{background:" + ("#fff"+ " " +"url(headerTitleBG.png)"+ " " +"repeat-x")  + ";color:" + ("#fff")  + ";margin-top:" + ("5px")  + ";margin-right:" + ("5px")  + ";margin-left:" + ("5px")  + ";padding-right:" + ("5px")  + ";padding-top:" + ("4px")  + ";height:" + ("22px")  + ";vertical-align:" + ("middle")  + ";font-size:" + ("10pt") ) + (";}.GOJU5EJBIN{margin-top:" + ("1px")  + ";margin-right:" + ("5px")  + ";margin-bottom:" + ("5px")  + ";margin-left:" + ("5px")  + ";}.GOJU5EJBKN{border-top:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";vertical-align:" + ("middle")  + ";padding:" + ("0")  + ";margin:" + ("0")  + ";spacing:" + ("0")  + ";text-align:" + ("left")  + ";}.GOJU5EJBMN{vertical-align:") + (("middle")  + ";padding:" + ("0")  + ";margin:" + ("0")  + ";spacing:" + ("0")  + ";text-align:" + ("left")  + ";}.GOJU5EJBLL{margin:" + ("0")  + ";padding:" + ("5px")  + ";text-align:" + ("left")  + ";background-color:" + ("#fff")  + ";font-size:" + ("smaller")  + ";}.GOJU5EJBEN{font-weight:" + ("bold") ) + (";font-size:" + ("large")  + ";font-family:" + ("helvetica")  + ";margin-right:" + ("0")  + ";padding:" + ("10px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";background-color:" + ("#fff")  + ";}.GOJU5EJBFN{text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBJO{padding:" + ("0")  + ";border:") + (("1px"+ " " +"solid"+ " " +"#2291c8")  + ";background-color:" + ("#fff")  + ";}.GOJU5EJBHN{width:" + ("100%")  + ";padding:" + ("10px")  + ";}.GOJU5EJBNN{background-color:" + ("#e0e0e0")  + ";color:" + ("#000")  + ";padding-right:" + ("5px")  + ";font-weight:" + ("bold")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";}.GOJU5EJBLN{background:" + ("#fff"+ " " +"url(zoom.png)"+ " " +"no-repeat"+ " " +"3px")  + ";padding:" + ("3px"+ " " +"24px"+ " " +"3px"+ " " +"3px") ) + (";border:" + ("1px"+ " " +"solid"+ " " +"#7f9db9")  + ";margin:" + ("5px")  + ";float:" + ("left")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBKN{padding:" + ("0")  + ";margin:" + ("0")  + ";text-align:" + ("center")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBDO{background:" + ("#e1e1e1")  + ";vertical-align:" + ("middle")  + ";border-bottom:") + (("1px"+ " " +"solid"+ " " +"#000")  + ";white-space:" + ("nowrap")  + ";}.GOJU5EJBCO{display:" + ("inline")  + ";margin-top:" + ("8px")  + ";margin-right:" + ("5px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";float:" + ("right")  + ";}.GOJU5EJBIO{background:" + ("#e1e1e1")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#000") ) + (";}.GOJU5EJBHO{width:" + ("100%")  + ";margin-top:" + ("8px")  + ";margin-right:" + ("5px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";}.GOJU5EJBFO{margin-top:" + ("8px")  + ";margin-right:" + ("5px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";white-space:") + (("nowrap")  + ";}.GOJU5EJBGO{text-decoration:" + ("underline")  + ";margin-right:" + ("5px")  + ";margin-left:" + ("5px")  + ";cursor:" + ("hand")  + ";}.GOJU5EJBEO{border-top:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";}.GOJU5EJBON{padding:" + ("0"+ " " +"5px"+ " " +"0"+ " " +"5px")  + ";margin:" + ("0"+ " " +"0"+ " " +"0"+ " " +"0")  + ";width:" + ("auto")  + " !important;overflow:" + ("visible")  + ";}.GOJU5EJBPN{padding:" + ("4px"+ " " +"8px") ) + (";background:" + ("#eee")  + ";vertical-align:" + ("baseline")  + ";border-top-right-radius:" + ("4px")  + ";border-bottom-right-radius:" + ("4px")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";}.GOJU5EJBAO{padding:" + ("4px"+ " " +"8px")  + ";background:" + ("#eee")  + ";vertical-align:") + (("baseline")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-left:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-right-width:" + ("0")  + ";}.GOJU5EJBBO{padding:" + ("4px"+ " " +"8px")  + ";background:" + ("#eee")  + ";vertical-align:" + ("baseline") ) + (";-moz-border-radius:" + ("0")  + ";-webkit-border-radius:" + ("0")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border-left:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-right-width:" + ("0")  + ";}.GOJU5EJBKL{padding:" + ("10px")  + ";text-align:") + (("right")  + ";float:" + ("right")  + ";}.GOJU5EJBIL{float:" + ("right")  + ";text-align:" + ("right")  + ";padding:" + ("10px")  + ";white-space:" + ("nowrap")  + ";}.GOJU5EJBJL{float:" + ("right")  + ";text-align:" + ("right")  + ";padding:" + ("5px")  + ";white-space:" + ("nowrap")  + ";}.GOJU5EJBPL{padding:" + ("5px") ) + (";padding-top:" + ("5px")  + ";text-align:" + ("right")  + ";width:" + ("300px")  + ";}.GOJU5EJBAM{padding:" + ("5px")  + ";padding-top:" + ("8px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("top")  + ";width:" + ("300px")  + ";}.GOJU5EJBFM{padding:" + ("5px")  + ";width:" + ("600px")  + ";vertical-align:") + (("top")  + ";}.GOJU5EJBBM{padding:" + ("7px")  + ";text-align:" + ("right")  + ";width:" + ("200px")  + ";}.GOJU5EJBCM{padding:" + ("7px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("top")  + ";width:" + ("200px")  + ";}.GOJU5EJBGM{width:" + ("300px")  + ";vertical-align:" + ("top")  + ";text-align:" + ("right") ) + (";}.GOJU5EJBDM{padding:" + ("7px")  + ";text-align:" + ("right")  + ";width:" + ("300px")  + ";}.GOJU5EJBEM{padding:" + ("7px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("top")  + ";width:" + ("300px")  + ";}.GOJU5EJBNL{font-weight:" + ("bold")  + ";padding:" + ("7px")  + ";padding-top:" + ("20px")  + ";padding-bottom:") + (("10px")  + ";}.GOJU5EJBJM,.GOJU5EJBKM{background-color:" + ("#fff")  + ";}.GOJU5EJBBN .GOJU5EJBCN{padding:" + ("0")  + ";margin:" + ("0")  + ";white-space:" + ("nowrap")  + ";cursor:" + ("hand")  + ";cursor:" + ("pointer")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBBN .GOJU5EJBDN{background:" + ("#3f8dd1")  + ";color:" + ("white")  + ";height:" + ("auto") ) + (";padding:" + ("0")  + ";margin:" + ("0")  + ";white-space:" + ("nowrap")  + ";cursor:" + ("hand")  + ";cursor:" + ("pointer")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBIM .GOJU5EJBGL{font-weight:" + ("bold")  + ";}a,a:visited,a:hover{color:" + ("#004785")  + ";}")) : (("body{font-family:" + ("Arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("9pt")  + ";color:" + ("black")  + ";margin:" + ("0")  + ";border:" + ("0")  + ";padding:" + ("0")  + ";background:" + ("#fff")  + ";direction:" + ("ltr")  + ";}table td,select{font-family:" + ("Arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("9pt")  + ";}.GOJU5EJBGN{border:") + (("1px"+ " " +"solid"+ " " +"#2291c8")  + ";}.GOJU5EJBJN{background:" + ("#fff"+ " " +"url(headerTitleBG.png)"+ " " +"repeat-x")  + ";color:" + ("#fff")  + ";margin-top:" + ("5px")  + ";margin-left:" + ("5px")  + ";margin-right:" + ("5px")  + ";padding-left:" + ("5px")  + ";padding-top:" + ("4px")  + ";height:" + ("22px")  + ";vertical-align:" + ("middle")  + ";font-size:" + ("10pt") ) + (";}.GOJU5EJBIN{margin-top:" + ("1px")  + ";margin-left:" + ("5px")  + ";margin-bottom:" + ("5px")  + ";margin-right:" + ("5px")  + ";}.GOJU5EJBKN{border-top:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";vertical-align:" + ("middle")  + ";padding:" + ("0")  + ";margin:" + ("0")  + ";spacing:" + ("0")  + ";text-align:" + ("right")  + ";}.GOJU5EJBMN{vertical-align:") + (("middle")  + ";padding:" + ("0")  + ";margin:" + ("0")  + ";spacing:" + ("0")  + ";text-align:" + ("right")  + ";}.GOJU5EJBLL{margin:" + ("0")  + ";padding:" + ("5px")  + ";text-align:" + ("right")  + ";background-color:" + ("#fff")  + ";font-size:" + ("smaller")  + ";}.GOJU5EJBEN{font-weight:" + ("bold") ) + (";font-size:" + ("large")  + ";font-family:" + ("helvetica")  + ";margin-left:" + ("0")  + ";padding:" + ("10px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";background-color:" + ("#fff")  + ";}.GOJU5EJBFN{text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBJO{padding:" + ("0")  + ";border:") + (("1px"+ " " +"solid"+ " " +"#2291c8")  + ";background-color:" + ("#fff")  + ";}.GOJU5EJBHN{width:" + ("100%")  + ";padding:" + ("10px")  + ";}.GOJU5EJBNN{background-color:" + ("#e0e0e0")  + ";color:" + ("#000")  + ";padding-left:" + ("5px")  + ";font-weight:" + ("bold")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";}.GOJU5EJBLN{background:" + ("#fff"+ " " +"url(zoom.png)"+ " " +"no-repeat"+ " " +"3px")  + ";padding:" + ("3px"+ " " +"3px"+ " " +"3px"+ " " +"24px") ) + (";border:" + ("1px"+ " " +"solid"+ " " +"#7f9db9")  + ";margin:" + ("5px")  + ";float:" + ("right")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBKN{padding:" + ("0")  + ";margin:" + ("0")  + ";text-align:" + ("center")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBDO{background:" + ("#e1e1e1")  + ";vertical-align:" + ("middle")  + ";border-bottom:") + (("1px"+ " " +"solid"+ " " +"#000")  + ";white-space:" + ("nowrap")  + ";}.GOJU5EJBCO{display:" + ("inline")  + ";margin-top:" + ("8px")  + ";margin-left:" + ("5px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";float:" + ("left")  + ";}.GOJU5EJBIO{background:" + ("#e1e1e1")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#000") ) + (";}.GOJU5EJBHO{width:" + ("100%")  + ";margin-top:" + ("8px")  + ";margin-left:" + ("5px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";}.GOJU5EJBFO{margin-top:" + ("8px")  + ";margin-left:" + ("5px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";white-space:") + (("nowrap")  + ";}.GOJU5EJBGO{text-decoration:" + ("underline")  + ";margin-left:" + ("5px")  + ";margin-right:" + ("5px")  + ";cursor:" + ("hand")  + ";}.GOJU5EJBEO{border-top:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";}.GOJU5EJBON{padding:" + ("0"+ " " +"5px"+ " " +"0"+ " " +"5px")  + ";margin:" + ("0"+ " " +"0"+ " " +"0"+ " " +"0")  + ";width:" + ("auto")  + " !important;overflow:" + ("visible")  + ";}.GOJU5EJBPN{padding:" + ("4px"+ " " +"8px") ) + (";background:" + ("#eee")  + ";vertical-align:" + ("baseline")  + ";border-top-left-radius:" + ("4px")  + ";border-bottom-left-radius:" + ("4px")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";}.GOJU5EJBAO{padding:" + ("4px"+ " " +"8px")  + ";background:" + ("#eee")  + ";vertical-align:") + (("baseline")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-right:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-left-width:" + ("0")  + ";}.GOJU5EJBBO{padding:" + ("4px"+ " " +"8px")  + ";background:" + ("#eee")  + ";vertical-align:" + ("baseline") ) + (";-moz-border-radius:" + ("0")  + ";-webkit-border-radius:" + ("0")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border-right:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-left-width:" + ("0")  + ";}.GOJU5EJBKL{padding:" + ("10px")  + ";text-align:") + (("left")  + ";float:" + ("left")  + ";}.GOJU5EJBIL{float:" + ("left")  + ";text-align:" + ("left")  + ";padding:" + ("10px")  + ";white-space:" + ("nowrap")  + ";}.GOJU5EJBJL{float:" + ("left")  + ";text-align:" + ("left")  + ";padding:" + ("5px")  + ";white-space:" + ("nowrap")  + ";}.GOJU5EJBPL{padding:" + ("5px") ) + (";padding-top:" + ("5px")  + ";text-align:" + ("left")  + ";width:" + ("300px")  + ";}.GOJU5EJBAM{padding:" + ("5px")  + ";padding-top:" + ("8px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("top")  + ";width:" + ("300px")  + ";}.GOJU5EJBFM{padding:" + ("5px")  + ";width:" + ("600px")  + ";vertical-align:") + (("top")  + ";}.GOJU5EJBBM{padding:" + ("7px")  + ";text-align:" + ("left")  + ";width:" + ("200px")  + ";}.GOJU5EJBCM{padding:" + ("7px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("top")  + ";width:" + ("200px")  + ";}.GOJU5EJBGM{width:" + ("300px")  + ";vertical-align:" + ("top")  + ";text-align:" + ("left") ) + (";}.GOJU5EJBDM{padding:" + ("7px")  + ";text-align:" + ("left")  + ";width:" + ("300px")  + ";}.GOJU5EJBEM{padding:" + ("7px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("top")  + ";width:" + ("300px")  + ";}.GOJU5EJBNL{font-weight:" + ("bold")  + ";padding:" + ("7px")  + ";padding-top:" + ("20px")  + ";padding-bottom:") + (("10px")  + ";}.GOJU5EJBJM,.GOJU5EJBKM{background-color:" + ("#fff")  + ";}.GOJU5EJBBN .GOJU5EJBCN{padding:" + ("0")  + ";margin:" + ("0")  + ";white-space:" + ("nowrap")  + ";cursor:" + ("hand")  + ";cursor:" + ("pointer")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBBN .GOJU5EJBDN{background:" + ("#3f8dd1")  + ";color:" + ("white")  + ";height:" + ("auto") ) + (";padding:" + ("0")  + ";margin:" + ("0")  + ";white-space:" + ("nowrap")  + ";cursor:" + ("hand")  + ";cursor:" + ("pointer")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBIM .GOJU5EJBGL{font-weight:" + ("bold")  + ";}a,a:visited,a:hover{color:" + ("#004785")  + ";}"));
      }
      public java.lang.String Caption(){
        return "GOJU5EJBGL";
      }
      public java.lang.String bottomBorder(){
        return "GOJU5EJBHL";
      }
      public java.lang.String dialogButtonPanel(){
        return "GOJU5EJBIL";
      }
      public java.lang.String dialogButtonPanel2(){
        return "GOJU5EJBJL";
      }
      public java.lang.String dialogForm(){
        return "GOJU5EJBKL";
      }
      public java.lang.String footerPanel(){
        return "GOJU5EJBLL";
      }
      public java.lang.String formPanel(){
        return "GOJU5EJBML";
      }
      public java.lang.String formSectionLabel(){
        return "GOJU5EJBNL";
      }
      public java.lang.String formTable(){
        return "GOJU5EJBOL";
      }
      public java.lang.String formTableCell0(){
        return "GOJU5EJBPL";
      }
      public java.lang.String formTableCell0ListBox(){
        return "GOJU5EJBAM";
      }
      public java.lang.String formTableCell0a(){
        return "GOJU5EJBBM";
      }
      public java.lang.String formTableCell0aListBox(){
        return "GOJU5EJBCM";
      }
      public java.lang.String formTableCell0b(){
        return "GOJU5EJBDM";
      }
      public java.lang.String formTableCell0bListBox(){
        return "GOJU5EJBEM";
      }
      public java.lang.String formTableCell1(){
        return "GOJU5EJBFM";
      }
      public java.lang.String formTableCell1a(){
        return "GOJU5EJBGM";
      }
      public java.lang.String gwtButton(){
        return "GOJU5EJBHM";
      }
      public java.lang.String gwtDialogBox(){
        return "GOJU5EJBIM";
      }
      public java.lang.String gwtSplitLayoutPanelHDragger(){
        return "GOJU5EJBJM";
      }
      public java.lang.String gwtSplitLayoutPanelVDragger(){
        return "GOJU5EJBKM";
      }
      public java.lang.String gwtToggleButtonDown(){
        return "GOJU5EJBLM";
      }
      public java.lang.String gwtToggleButtonDownDisabled(){
        return "GOJU5EJBMM";
      }
      public java.lang.String gwtToggleButtonDownHovering(){
        return "GOJU5EJBNM";
      }
      public java.lang.String gwtToggleButtonUp(){
        return "GOJU5EJBOM";
      }
      public java.lang.String gwtToggleButtonUpDisabled(){
        return "GOJU5EJBPM";
      }
      public java.lang.String gwtToggleButtonUpHovering(){
        return "GOJU5EJBAN";
      }
      public java.lang.String gwtTree(){
        return "GOJU5EJBBN";
      }
      public java.lang.String gwtTreeItem(){
        return "GOJU5EJBCN";
      }
      public java.lang.String gwtTreeItemSelected(){
        return "GOJU5EJBDN";
      }
      public java.lang.String headerPanel1(){
        return "GOJU5EJBEN";
      }
      public java.lang.String headerPanel2(){
        return "GOJU5EJBFN";
      }
      public java.lang.String mainPanel(){
        return "GOJU5EJBGN";
      }
      public java.lang.String messageList(){
        return "GOJU5EJBHN";
      }
      public java.lang.String pageContent(){
        return "GOJU5EJBIN";
      }
      public java.lang.String pageHeader(){
        return "GOJU5EJBJN";
      }
      public java.lang.String pagerPanel(){
        return "GOJU5EJBKN";
      }
      public java.lang.String searchText(){
        return "GOJU5EJBLN";
      }
      public java.lang.String simplePager(){
        return "GOJU5EJBMN";
      }
      public java.lang.String titleBar(){
        return "GOJU5EJBNN";
      }
      public java.lang.String toolbarButton(){
        return "GOJU5EJBON";
      }
      public java.lang.String toolbarButton2a(){
        return "GOJU5EJBPN";
      }
      public java.lang.String toolbarButton2b(){
        return "GOJU5EJBAO";
      }
      public java.lang.String toolbarButton2c(){
        return "GOJU5EJBBO";
      }
      public java.lang.String toolbarButtonPanel(){
        return "GOJU5EJBCO";
      }
      public java.lang.String toolbarPanel(){
        return "GOJU5EJBDO";
      }
      public java.lang.String topBorder(){
        return "GOJU5EJBEO";
      }
      public java.lang.String treeButtonPanel(){
        return "GOJU5EJBFO";
      }
      public java.lang.String treeLinks(){
        return "GOJU5EJBGO";
      }
      public java.lang.String treeToolbarButtonPanel(){
        return "GOJU5EJBHO";
      }
      public java.lang.String treeToolbarPanel(){
        return "GOJU5EJBIO";
      }
      public java.lang.String westPanel(){
        return "GOJU5EJBJO";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.medassets.report.client.library.Main_MainUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.medassets.report.client.library.Main_MainUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.medassets.report.client.library.Main_MainUiBinderImpl_GenCss_style style;
  
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
      case 'style': return this.@com.medassets.report.client.library.Main_MainUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
