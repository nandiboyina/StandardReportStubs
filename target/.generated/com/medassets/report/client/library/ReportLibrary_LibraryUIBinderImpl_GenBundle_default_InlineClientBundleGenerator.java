package com.medassets.report.client.library;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class ReportLibrary_LibraryUIBinderImpl_GenBundle_default_InlineClientBundleGenerator implements com.medassets.report.client.library.ReportLibrary_LibraryUIBinderImpl_GenBundle {
  private static ReportLibrary_LibraryUIBinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new ReportLibrary_LibraryUIBinderImpl_GenBundle_default_InlineClientBundleGenerator();
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? (("body{font-family:" + ("Arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("9pt")  + ";color:" + ("black")  + ";margin:" + ("0")  + ";border:" + ("0")  + ";padding:" + ("0")  + ";background:" + ("#fff")  + ";direction:" + ("rtl")  + ";}table td,select{font-family:" + ("Arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("9pt")  + ";}.GOJU5EJBKQ{border:") + (("1px"+ " " +"solid"+ " " +"#2291c8")  + ";}.GOJU5EJBNQ{background:" + ("#fff"+ " " +"url(headerTitleBG.png)"+ " " +"repeat-x")  + ";color:" + ("#fff")  + ";margin-top:" + ("5px")  + ";margin-right:" + ("5px")  + ";margin-left:" + ("5px")  + ";padding-right:" + ("5px")  + ";padding-top:" + ("4px")  + ";height:" + ("22px")  + ";vertical-align:" + ("middle")  + ";font-size:" + ("10pt") ) + (";}.GOJU5EJBMQ{margin-top:" + ("1px")  + ";margin-right:" + ("5px")  + ";margin-bottom:" + ("5px")  + ";margin-left:" + ("5px")  + ";}.GOJU5EJBOQ{border-top:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";vertical-align:" + ("middle")  + ";padding:" + ("0")  + ";margin:" + ("0")  + ";spacing:" + ("0")  + ";text-align:" + ("left")  + ";}.GOJU5EJBAR{vertical-align:") + (("middle")  + ";padding:" + ("0")  + ";margin:" + ("0")  + ";spacing:" + ("0")  + ";text-align:" + ("left")  + ";}.GOJU5EJBPO{margin:" + ("0")  + ";padding:" + ("5px")  + ";text-align:" + ("left")  + ";background-color:" + ("#fff")  + ";font-size:" + ("smaller")  + ";}.GOJU5EJBIQ{font-weight:" + ("bold") ) + (";font-size:" + ("large")  + ";font-family:" + ("helvetica")  + ";margin-right:" + ("0")  + ";padding:" + ("10px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";background-color:" + ("#fff")  + ";}.GOJU5EJBJQ{text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBNR{padding:" + ("0")  + ";border:") + (("1px"+ " " +"solid"+ " " +"#2291c8")  + ";background-color:" + ("#fff")  + ";}.GOJU5EJBLQ{width:" + ("100%")  + ";padding:" + ("10px")  + ";}.GOJU5EJBBR{background-color:" + ("#e0e0e0")  + ";color:" + ("#000")  + ";padding-right:" + ("5px")  + ";font-weight:" + ("bold")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";}.GOJU5EJBPQ{background:" + ("#fff"+ " " +"url(zoom.png)"+ " " +"no-repeat"+ " " +"3px")  + ";padding:" + ("3px"+ " " +"24px"+ " " +"3px"+ " " +"3px") ) + (";border:" + ("1px"+ " " +"solid"+ " " +"#7f9db9")  + ";margin:" + ("5px")  + ";float:" + ("left")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBOQ{padding:" + ("0")  + ";margin:" + ("0")  + ";text-align:" + ("center")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBHR{background:" + ("#e1e1e1")  + ";vertical-align:" + ("middle")  + ";border-bottom:") + (("1px"+ " " +"solid"+ " " +"#000")  + ";white-space:" + ("nowrap")  + ";}.GOJU5EJBGR{display:" + ("inline")  + ";margin-top:" + ("8px")  + ";margin-right:" + ("5px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";float:" + ("right")  + ";}.GOJU5EJBMR{background:" + ("#e1e1e1")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#000") ) + (";}.GOJU5EJBLR{width:" + ("100%")  + ";margin-top:" + ("8px")  + ";margin-right:" + ("5px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";}.GOJU5EJBJR{margin-top:" + ("8px")  + ";margin-right:" + ("5px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";white-space:") + (("nowrap")  + ";}.GOJU5EJBKR{text-decoration:" + ("underline")  + ";margin-right:" + ("5px")  + ";margin-left:" + ("5px")  + ";cursor:" + ("hand")  + ";}.GOJU5EJBIR{border-top:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";}.GOJU5EJBCR{padding:" + ("0"+ " " +"5px"+ " " +"0"+ " " +"5px")  + ";margin:" + ("0"+ " " +"0"+ " " +"0"+ " " +"0")  + ";width:" + ("auto")  + " !important;overflow:" + ("visible")  + ";}.GOJU5EJBDR{padding:" + ("4px"+ " " +"8px") ) + (";background:" + ("#eee")  + ";vertical-align:" + ("baseline")  + ";border-top-right-radius:" + ("4px")  + ";border-bottom-right-radius:" + ("4px")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";}.GOJU5EJBER{padding:" + ("4px"+ " " +"8px")  + ";background:" + ("#eee")  + ";vertical-align:") + (("baseline")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-left:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-right-width:" + ("0")  + ";}.GOJU5EJBFR{padding:" + ("4px"+ " " +"8px")  + ";background:" + ("#eee")  + ";vertical-align:" + ("baseline") ) + (";-moz-border-radius:" + ("0")  + ";-webkit-border-radius:" + ("0")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border-left:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-right-width:" + ("0")  + ";}.GOJU5EJBOO{padding:" + ("10px")  + ";text-align:") + (("right")  + ";float:" + ("right")  + ";}.GOJU5EJBMO{float:" + ("right")  + ";text-align:" + ("right")  + ";padding:" + ("10px")  + ";white-space:" + ("nowrap")  + ";}.GOJU5EJBNO{float:" + ("right")  + ";text-align:" + ("right")  + ";padding:" + ("5px")  + ";white-space:" + ("nowrap")  + ";}.GOJU5EJBDP{padding:" + ("5px") ) + (";padding-top:" + ("5px")  + ";text-align:" + ("right")  + ";width:" + ("300px")  + ";}.GOJU5EJBEP{padding:" + ("5px")  + ";padding-top:" + ("8px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("top")  + ";width:" + ("300px")  + ";}.GOJU5EJBJP{padding:" + ("5px")  + ";width:" + ("600px")  + ";vertical-align:") + (("top")  + ";}.GOJU5EJBFP{padding:" + ("7px")  + ";text-align:" + ("right")  + ";width:" + ("200px")  + ";}.GOJU5EJBGP{padding:" + ("7px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("top")  + ";width:" + ("200px")  + ";}.GOJU5EJBKP{width:" + ("300px")  + ";vertical-align:" + ("top")  + ";text-align:" + ("right") ) + (";}.GOJU5EJBHP{padding:" + ("7px")  + ";text-align:" + ("right")  + ";width:" + ("300px")  + ";}.GOJU5EJBIP{padding:" + ("7px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("top")  + ";width:" + ("300px")  + ";}.GOJU5EJBBP{font-weight:" + ("bold")  + ";padding:" + ("7px")  + ";padding-top:" + ("20px")  + ";padding-bottom:") + (("10px")  + ";}.GOJU5EJBNP,.GOJU5EJBOP{background-color:" + ("#fff")  + ";}.GOJU5EJBFQ .GOJU5EJBGQ{padding:" + ("0")  + ";margin:" + ("0")  + ";white-space:" + ("nowrap")  + ";cursor:" + ("hand")  + ";cursor:" + ("pointer")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBFQ .GOJU5EJBHQ{background:" + ("#3f8dd1")  + ";color:" + ("white")  + ";height:" + ("auto") ) + (";padding:" + ("0")  + ";margin:" + ("0")  + ";white-space:" + ("nowrap")  + ";cursor:" + ("hand")  + ";cursor:" + ("pointer")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBMP .GOJU5EJBKO{font-weight:" + ("bold")  + ";}a,a:visited,a:hover{color:" + ("#004785")  + ";}")) : (("body{font-family:" + ("Arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("9pt")  + ";color:" + ("black")  + ";margin:" + ("0")  + ";border:" + ("0")  + ";padding:" + ("0")  + ";background:" + ("#fff")  + ";direction:" + ("ltr")  + ";}table td,select{font-family:" + ("Arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("9pt")  + ";}.GOJU5EJBKQ{border:") + (("1px"+ " " +"solid"+ " " +"#2291c8")  + ";}.GOJU5EJBNQ{background:" + ("#fff"+ " " +"url(headerTitleBG.png)"+ " " +"repeat-x")  + ";color:" + ("#fff")  + ";margin-top:" + ("5px")  + ";margin-left:" + ("5px")  + ";margin-right:" + ("5px")  + ";padding-left:" + ("5px")  + ";padding-top:" + ("4px")  + ";height:" + ("22px")  + ";vertical-align:" + ("middle")  + ";font-size:" + ("10pt") ) + (";}.GOJU5EJBMQ{margin-top:" + ("1px")  + ";margin-left:" + ("5px")  + ";margin-bottom:" + ("5px")  + ";margin-right:" + ("5px")  + ";}.GOJU5EJBOQ{border-top:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";vertical-align:" + ("middle")  + ";padding:" + ("0")  + ";margin:" + ("0")  + ";spacing:" + ("0")  + ";text-align:" + ("right")  + ";}.GOJU5EJBAR{vertical-align:") + (("middle")  + ";padding:" + ("0")  + ";margin:" + ("0")  + ";spacing:" + ("0")  + ";text-align:" + ("right")  + ";}.GOJU5EJBPO{margin:" + ("0")  + ";padding:" + ("5px")  + ";text-align:" + ("right")  + ";background-color:" + ("#fff")  + ";font-size:" + ("smaller")  + ";}.GOJU5EJBIQ{font-weight:" + ("bold") ) + (";font-size:" + ("large")  + ";font-family:" + ("helvetica")  + ";margin-left:" + ("0")  + ";padding:" + ("10px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";background-color:" + ("#fff")  + ";}.GOJU5EJBJQ{text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBNR{padding:" + ("0")  + ";border:") + (("1px"+ " " +"solid"+ " " +"#2291c8")  + ";background-color:" + ("#fff")  + ";}.GOJU5EJBLQ{width:" + ("100%")  + ";padding:" + ("10px")  + ";}.GOJU5EJBBR{background-color:" + ("#e0e0e0")  + ";color:" + ("#000")  + ";padding-left:" + ("5px")  + ";font-weight:" + ("bold")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";}.GOJU5EJBPQ{background:" + ("#fff"+ " " +"url(zoom.png)"+ " " +"no-repeat"+ " " +"3px")  + ";padding:" + ("3px"+ " " +"3px"+ " " +"3px"+ " " +"24px") ) + (";border:" + ("1px"+ " " +"solid"+ " " +"#7f9db9")  + ";margin:" + ("5px")  + ";float:" + ("right")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBOQ{padding:" + ("0")  + ";margin:" + ("0")  + ";text-align:" + ("center")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBHR{background:" + ("#e1e1e1")  + ";vertical-align:" + ("middle")  + ";border-bottom:") + (("1px"+ " " +"solid"+ " " +"#000")  + ";white-space:" + ("nowrap")  + ";}.GOJU5EJBGR{display:" + ("inline")  + ";margin-top:" + ("8px")  + ";margin-left:" + ("5px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";float:" + ("left")  + ";}.GOJU5EJBMR{background:" + ("#e1e1e1")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#000") ) + (";}.GOJU5EJBLR{width:" + ("100%")  + ";margin-top:" + ("8px")  + ";margin-left:" + ("5px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";}.GOJU5EJBJR{margin-top:" + ("8px")  + ";margin-left:" + ("5px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";white-space:") + (("nowrap")  + ";}.GOJU5EJBKR{text-decoration:" + ("underline")  + ";margin-left:" + ("5px")  + ";margin-right:" + ("5px")  + ";cursor:" + ("hand")  + ";}.GOJU5EJBIR{border-top:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";}.GOJU5EJBCR{padding:" + ("0"+ " " +"5px"+ " " +"0"+ " " +"5px")  + ";margin:" + ("0"+ " " +"0"+ " " +"0"+ " " +"0")  + ";width:" + ("auto")  + " !important;overflow:" + ("visible")  + ";}.GOJU5EJBDR{padding:" + ("4px"+ " " +"8px") ) + (";background:" + ("#eee")  + ";vertical-align:" + ("baseline")  + ";border-top-left-radius:" + ("4px")  + ";border-bottom-left-radius:" + ("4px")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";}.GOJU5EJBER{padding:" + ("4px"+ " " +"8px")  + ";background:" + ("#eee")  + ";vertical-align:") + (("baseline")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-right:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-left-width:" + ("0")  + ";}.GOJU5EJBFR{padding:" + ("4px"+ " " +"8px")  + ";background:" + ("#eee")  + ";vertical-align:" + ("baseline") ) + (";-moz-border-radius:" + ("0")  + ";-webkit-border-radius:" + ("0")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border-right:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-left-width:" + ("0")  + ";}.GOJU5EJBOO{padding:" + ("10px")  + ";text-align:") + (("left")  + ";float:" + ("left")  + ";}.GOJU5EJBMO{float:" + ("left")  + ";text-align:" + ("left")  + ";padding:" + ("10px")  + ";white-space:" + ("nowrap")  + ";}.GOJU5EJBNO{float:" + ("left")  + ";text-align:" + ("left")  + ";padding:" + ("5px")  + ";white-space:" + ("nowrap")  + ";}.GOJU5EJBDP{padding:" + ("5px") ) + (";padding-top:" + ("5px")  + ";text-align:" + ("left")  + ";width:" + ("300px")  + ";}.GOJU5EJBEP{padding:" + ("5px")  + ";padding-top:" + ("8px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("top")  + ";width:" + ("300px")  + ";}.GOJU5EJBJP{padding:" + ("5px")  + ";width:" + ("600px")  + ";vertical-align:") + (("top")  + ";}.GOJU5EJBFP{padding:" + ("7px")  + ";text-align:" + ("left")  + ";width:" + ("200px")  + ";}.GOJU5EJBGP{padding:" + ("7px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("top")  + ";width:" + ("200px")  + ";}.GOJU5EJBKP{width:" + ("300px")  + ";vertical-align:" + ("top")  + ";text-align:" + ("left") ) + (";}.GOJU5EJBHP{padding:" + ("7px")  + ";text-align:" + ("left")  + ";width:" + ("300px")  + ";}.GOJU5EJBIP{padding:" + ("7px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("top")  + ";width:" + ("300px")  + ";}.GOJU5EJBBP{font-weight:" + ("bold")  + ";padding:" + ("7px")  + ";padding-top:" + ("20px")  + ";padding-bottom:") + (("10px")  + ";}.GOJU5EJBNP,.GOJU5EJBOP{background-color:" + ("#fff")  + ";}.GOJU5EJBFQ .GOJU5EJBGQ{padding:" + ("0")  + ";margin:" + ("0")  + ";white-space:" + ("nowrap")  + ";cursor:" + ("hand")  + ";cursor:" + ("pointer")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBFQ .GOJU5EJBHQ{background:" + ("#3f8dd1")  + ";color:" + ("white")  + ";height:" + ("auto") ) + (";padding:" + ("0")  + ";margin:" + ("0")  + ";white-space:" + ("nowrap")  + ";cursor:" + ("hand")  + ";cursor:" + ("pointer")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBMP .GOJU5EJBKO{font-weight:" + ("bold")  + ";}a,a:visited,a:hover{color:" + ("#004785")  + ";}"));
      }
      public java.lang.String Caption(){
        return "GOJU5EJBKO";
      }
      public java.lang.String bottomBorder(){
        return "GOJU5EJBLO";
      }
      public java.lang.String dialogButtonPanel(){
        return "GOJU5EJBMO";
      }
      public java.lang.String dialogButtonPanel2(){
        return "GOJU5EJBNO";
      }
      public java.lang.String dialogForm(){
        return "GOJU5EJBOO";
      }
      public java.lang.String footerPanel(){
        return "GOJU5EJBPO";
      }
      public java.lang.String formPanel(){
        return "GOJU5EJBAP";
      }
      public java.lang.String formSectionLabel(){
        return "GOJU5EJBBP";
      }
      public java.lang.String formTable(){
        return "GOJU5EJBCP";
      }
      public java.lang.String formTableCell0(){
        return "GOJU5EJBDP";
      }
      public java.lang.String formTableCell0ListBox(){
        return "GOJU5EJBEP";
      }
      public java.lang.String formTableCell0a(){
        return "GOJU5EJBFP";
      }
      public java.lang.String formTableCell0aListBox(){
        return "GOJU5EJBGP";
      }
      public java.lang.String formTableCell0b(){
        return "GOJU5EJBHP";
      }
      public java.lang.String formTableCell0bListBox(){
        return "GOJU5EJBIP";
      }
      public java.lang.String formTableCell1(){
        return "GOJU5EJBJP";
      }
      public java.lang.String formTableCell1a(){
        return "GOJU5EJBKP";
      }
      public java.lang.String gwtButton(){
        return "GOJU5EJBLP";
      }
      public java.lang.String gwtDialogBox(){
        return "GOJU5EJBMP";
      }
      public java.lang.String gwtSplitLayoutPanelHDragger(){
        return "GOJU5EJBNP";
      }
      public java.lang.String gwtSplitLayoutPanelVDragger(){
        return "GOJU5EJBOP";
      }
      public java.lang.String gwtToggleButtonDown(){
        return "GOJU5EJBPP";
      }
      public java.lang.String gwtToggleButtonDownDisabled(){
        return "GOJU5EJBAQ";
      }
      public java.lang.String gwtToggleButtonDownHovering(){
        return "GOJU5EJBBQ";
      }
      public java.lang.String gwtToggleButtonUp(){
        return "GOJU5EJBCQ";
      }
      public java.lang.String gwtToggleButtonUpDisabled(){
        return "GOJU5EJBDQ";
      }
      public java.lang.String gwtToggleButtonUpHovering(){
        return "GOJU5EJBEQ";
      }
      public java.lang.String gwtTree(){
        return "GOJU5EJBFQ";
      }
      public java.lang.String gwtTreeItem(){
        return "GOJU5EJBGQ";
      }
      public java.lang.String gwtTreeItemSelected(){
        return "GOJU5EJBHQ";
      }
      public java.lang.String headerPanel1(){
        return "GOJU5EJBIQ";
      }
      public java.lang.String headerPanel2(){
        return "GOJU5EJBJQ";
      }
      public java.lang.String mainPanel(){
        return "GOJU5EJBKQ";
      }
      public java.lang.String messageList(){
        return "GOJU5EJBLQ";
      }
      public java.lang.String pageContent(){
        return "GOJU5EJBMQ";
      }
      public java.lang.String pageHeader(){
        return "GOJU5EJBNQ";
      }
      public java.lang.String pagerPanel(){
        return "GOJU5EJBOQ";
      }
      public java.lang.String searchText(){
        return "GOJU5EJBPQ";
      }
      public java.lang.String simplePager(){
        return "GOJU5EJBAR";
      }
      public java.lang.String titleBar(){
        return "GOJU5EJBBR";
      }
      public java.lang.String toolbarButton(){
        return "GOJU5EJBCR";
      }
      public java.lang.String toolbarButton2a(){
        return "GOJU5EJBDR";
      }
      public java.lang.String toolbarButton2b(){
        return "GOJU5EJBER";
      }
      public java.lang.String toolbarButton2c(){
        return "GOJU5EJBFR";
      }
      public java.lang.String toolbarButtonPanel(){
        return "GOJU5EJBGR";
      }
      public java.lang.String toolbarPanel(){
        return "GOJU5EJBHR";
      }
      public java.lang.String topBorder(){
        return "GOJU5EJBIR";
      }
      public java.lang.String treeButtonPanel(){
        return "GOJU5EJBJR";
      }
      public java.lang.String treeLinks(){
        return "GOJU5EJBKR";
      }
      public java.lang.String treeToolbarButtonPanel(){
        return "GOJU5EJBLR";
      }
      public java.lang.String treeToolbarPanel(){
        return "GOJU5EJBMR";
      }
      public java.lang.String westPanel(){
        return "GOJU5EJBNR";
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
