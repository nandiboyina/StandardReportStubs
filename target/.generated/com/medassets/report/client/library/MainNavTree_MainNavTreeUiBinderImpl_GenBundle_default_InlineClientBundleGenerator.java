package com.medassets.report.client.library;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class MainNavTree_MainNavTreeUiBinderImpl_GenBundle_default_InlineClientBundleGenerator implements com.medassets.report.client.library.MainNavTree_MainNavTreeUiBinderImpl_GenBundle {
  private static MainNavTree_MainNavTreeUiBinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new MainNavTree_MainNavTreeUiBinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.medassets.report.client.library.MainNavTree_MainNavTreeUiBinderImpl_GenCss_style() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? (("body{font-family:" + ("Arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("9pt")  + ";color:" + ("black")  + ";margin:" + ("0")  + ";border:" + ("0")  + ";padding:" + ("0")  + ";background:" + ("#fff")  + ";direction:" + ("rtl")  + ";}table td,select{font-family:" + ("Arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("9pt")  + ";}.GOJU5EJBMW{border:") + (("1px"+ " " +"solid"+ " " +"#2291c8")  + ";}.GOJU5EJBPW{background:" + ("#fff"+ " " +"url(headerTitleBG.png)"+ " " +"repeat-x")  + ";color:" + ("#fff")  + ";margin-top:" + ("5px")  + ";margin-right:" + ("5px")  + ";margin-left:" + ("5px")  + ";padding-right:" + ("5px")  + ";padding-top:" + ("4px")  + ";height:" + ("22px")  + ";vertical-align:" + ("middle")  + ";font-size:" + ("10pt") ) + (";}.GOJU5EJBOW{margin-top:" + ("1px")  + ";margin-right:" + ("5px")  + ";margin-bottom:" + ("5px")  + ";margin-left:" + ("5px")  + ";}.GOJU5EJBAX{border-top:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";vertical-align:" + ("middle")  + ";padding:" + ("0")  + ";margin:" + ("0")  + ";spacing:" + ("0")  + ";text-align:" + ("left")  + ";}.GOJU5EJBCX{vertical-align:") + (("middle")  + ";padding:" + ("0")  + ";margin:" + ("0")  + ";spacing:" + ("0")  + ";text-align:" + ("left")  + ";}.GOJU5EJBBV{margin:" + ("0")  + ";padding:" + ("5px")  + ";text-align:" + ("left")  + ";background-color:" + ("#fff")  + ";font-size:" + ("smaller")  + ";}.GOJU5EJBKW{font-weight:" + ("bold") ) + (";font-size:" + ("large")  + ";font-family:" + ("helvetica")  + ";margin-right:" + ("0")  + ";padding:" + ("10px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";background-color:" + ("#fff")  + ";}.GOJU5EJBLW{text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBPX{padding:" + ("0")  + ";border:") + (("1px"+ " " +"solid"+ " " +"#2291c8")  + ";background-color:" + ("#fff")  + ";}.GOJU5EJBNW{width:" + ("100%")  + ";padding:" + ("10px")  + ";}.GOJU5EJBDX{background-color:" + ("#e0e0e0")  + ";color:" + ("#000")  + ";padding-right:" + ("5px")  + ";font-weight:" + ("bold")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";}.GOJU5EJBBX{background:" + ("#fff"+ " " +"url(zoom.png)"+ " " +"no-repeat"+ " " +"3px")  + ";padding:" + ("3px"+ " " +"24px"+ " " +"3px"+ " " +"3px") ) + (";border:" + ("1px"+ " " +"solid"+ " " +"#7f9db9")  + ";margin:" + ("5px")  + ";float:" + ("left")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBAX{padding:" + ("0")  + ";margin:" + ("0")  + ";text-align:" + ("center")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBJX{background:" + ("#e1e1e1")  + ";vertical-align:" + ("middle")  + ";border-bottom:") + (("1px"+ " " +"solid"+ " " +"#000")  + ";white-space:" + ("nowrap")  + ";}.GOJU5EJBIX{display:" + ("inline")  + ";margin-top:" + ("8px")  + ";margin-right:" + ("5px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";float:" + ("right")  + ";}.GOJU5EJBOX{background:" + ("#e1e1e1")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#000") ) + (";}.GOJU5EJBNX{width:" + ("100%")  + ";margin-top:" + ("8px")  + ";margin-right:" + ("5px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";}.GOJU5EJBLX{margin-top:" + ("8px")  + ";margin-right:" + ("5px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";white-space:") + (("nowrap")  + ";}.GOJU5EJBMX{text-decoration:" + ("underline")  + ";margin-right:" + ("5px")  + ";margin-left:" + ("5px")  + ";cursor:" + ("hand")  + ";}.GOJU5EJBKX{border-top:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";}.GOJU5EJBEX{padding:" + ("0"+ " " +"5px"+ " " +"0"+ " " +"5px")  + ";margin:" + ("0"+ " " +"0"+ " " +"0"+ " " +"0")  + ";width:" + ("auto")  + " !important;overflow:" + ("visible")  + ";}.GOJU5EJBFX{padding:" + ("4px"+ " " +"8px") ) + (";background:" + ("#eee")  + ";vertical-align:" + ("baseline")  + ";border-top-right-radius:" + ("4px")  + ";border-bottom-right-radius:" + ("4px")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";}.GOJU5EJBGX{padding:" + ("4px"+ " " +"8px")  + ";background:" + ("#eee")  + ";vertical-align:") + (("baseline")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-left:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-right-width:" + ("0")  + ";}.GOJU5EJBHX{padding:" + ("4px"+ " " +"8px")  + ";background:" + ("#eee")  + ";vertical-align:" + ("baseline") ) + (";-moz-border-radius:" + ("0")  + ";-webkit-border-radius:" + ("0")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border-left:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-right-width:" + ("0")  + ";}.GOJU5EJBAV{padding:" + ("10px")  + ";text-align:") + (("right")  + ";float:" + ("right")  + ";}.GOJU5EJBOU{float:" + ("right")  + ";text-align:" + ("right")  + ";padding:" + ("10px")  + ";white-space:" + ("nowrap")  + ";}.GOJU5EJBPU{float:" + ("right")  + ";text-align:" + ("right")  + ";padding:" + ("5px")  + ";white-space:" + ("nowrap")  + ";}.GOJU5EJBFV{padding:" + ("5px") ) + (";padding-top:" + ("5px")  + ";text-align:" + ("right")  + ";width:" + ("300px")  + ";}.GOJU5EJBGV{padding:" + ("5px")  + ";padding-top:" + ("8px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("top")  + ";width:" + ("300px")  + ";}.GOJU5EJBLV{padding:" + ("5px")  + ";width:" + ("600px")  + ";vertical-align:") + (("top")  + ";}.GOJU5EJBHV{padding:" + ("7px")  + ";text-align:" + ("right")  + ";width:" + ("200px")  + ";}.GOJU5EJBIV{padding:" + ("7px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("top")  + ";width:" + ("200px")  + ";}.GOJU5EJBMV{width:" + ("300px")  + ";vertical-align:" + ("top")  + ";text-align:" + ("right") ) + (";}.GOJU5EJBJV{padding:" + ("7px")  + ";text-align:" + ("right")  + ";width:" + ("300px")  + ";}.GOJU5EJBKV{padding:" + ("7px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("top")  + ";width:" + ("300px")  + ";}.GOJU5EJBDV{font-weight:" + ("bold")  + ";padding:" + ("7px")  + ";padding-top:" + ("20px")  + ";padding-bottom:") + (("10px")  + ";}.GOJU5EJBPV,.GOJU5EJBAW{background-color:" + ("#fff")  + ";}.GOJU5EJBHW .GOJU5EJBIW{padding:" + ("0")  + ";margin:" + ("0")  + ";white-space:" + ("nowrap")  + ";cursor:" + ("hand")  + ";cursor:" + ("pointer")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBHW .GOJU5EJBJW{background:" + ("#3f8dd1")  + ";color:" + ("white")  + ";height:" + ("auto") ) + (";padding:" + ("0")  + ";margin:" + ("0")  + ";white-space:" + ("nowrap")  + ";cursor:" + ("hand")  + ";cursor:" + ("pointer")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBOV .GOJU5EJBMU{font-weight:" + ("bold")  + ";}a,a:visited,a:hover{color:" + ("#004785")  + ";}")) : (("body{font-family:" + ("Arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("9pt")  + ";color:" + ("black")  + ";margin:" + ("0")  + ";border:" + ("0")  + ";padding:" + ("0")  + ";background:" + ("#fff")  + ";direction:" + ("ltr")  + ";}table td,select{font-family:" + ("Arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("9pt")  + ";}.GOJU5EJBMW{border:") + (("1px"+ " " +"solid"+ " " +"#2291c8")  + ";}.GOJU5EJBPW{background:" + ("#fff"+ " " +"url(headerTitleBG.png)"+ " " +"repeat-x")  + ";color:" + ("#fff")  + ";margin-top:" + ("5px")  + ";margin-left:" + ("5px")  + ";margin-right:" + ("5px")  + ";padding-left:" + ("5px")  + ";padding-top:" + ("4px")  + ";height:" + ("22px")  + ";vertical-align:" + ("middle")  + ";font-size:" + ("10pt") ) + (";}.GOJU5EJBOW{margin-top:" + ("1px")  + ";margin-left:" + ("5px")  + ";margin-bottom:" + ("5px")  + ";margin-right:" + ("5px")  + ";}.GOJU5EJBAX{border-top:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";vertical-align:" + ("middle")  + ";padding:" + ("0")  + ";margin:" + ("0")  + ";spacing:" + ("0")  + ";text-align:" + ("right")  + ";}.GOJU5EJBCX{vertical-align:") + (("middle")  + ";padding:" + ("0")  + ";margin:" + ("0")  + ";spacing:" + ("0")  + ";text-align:" + ("right")  + ";}.GOJU5EJBBV{margin:" + ("0")  + ";padding:" + ("5px")  + ";text-align:" + ("right")  + ";background-color:" + ("#fff")  + ";font-size:" + ("smaller")  + ";}.GOJU5EJBKW{font-weight:" + ("bold") ) + (";font-size:" + ("large")  + ";font-family:" + ("helvetica")  + ";margin-left:" + ("0")  + ";padding:" + ("10px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";background-color:" + ("#fff")  + ";}.GOJU5EJBLW{text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBPX{padding:" + ("0")  + ";border:") + (("1px"+ " " +"solid"+ " " +"#2291c8")  + ";background-color:" + ("#fff")  + ";}.GOJU5EJBNW{width:" + ("100%")  + ";padding:" + ("10px")  + ";}.GOJU5EJBDX{background-color:" + ("#e0e0e0")  + ";color:" + ("#000")  + ";padding-left:" + ("5px")  + ";font-weight:" + ("bold")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";}.GOJU5EJBBX{background:" + ("#fff"+ " " +"url(zoom.png)"+ " " +"no-repeat"+ " " +"3px")  + ";padding:" + ("3px"+ " " +"3px"+ " " +"3px"+ " " +"24px") ) + (";border:" + ("1px"+ " " +"solid"+ " " +"#7f9db9")  + ";margin:" + ("5px")  + ";float:" + ("right")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBAX{padding:" + ("0")  + ";margin:" + ("0")  + ";text-align:" + ("center")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBJX{background:" + ("#e1e1e1")  + ";vertical-align:" + ("middle")  + ";border-bottom:") + (("1px"+ " " +"solid"+ " " +"#000")  + ";white-space:" + ("nowrap")  + ";}.GOJU5EJBIX{display:" + ("inline")  + ";margin-top:" + ("8px")  + ";margin-left:" + ("5px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";float:" + ("left")  + ";}.GOJU5EJBOX{background:" + ("#e1e1e1")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#000") ) + (";}.GOJU5EJBNX{width:" + ("100%")  + ";margin-top:" + ("8px")  + ";margin-left:" + ("5px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";}.GOJU5EJBLX{margin-top:" + ("8px")  + ";margin-left:" + ("5px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";white-space:") + (("nowrap")  + ";}.GOJU5EJBMX{text-decoration:" + ("underline")  + ";margin-left:" + ("5px")  + ";margin-right:" + ("5px")  + ";cursor:" + ("hand")  + ";}.GOJU5EJBKX{border-top:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";}.GOJU5EJBEX{padding:" + ("0"+ " " +"5px"+ " " +"0"+ " " +"5px")  + ";margin:" + ("0"+ " " +"0"+ " " +"0"+ " " +"0")  + ";width:" + ("auto")  + " !important;overflow:" + ("visible")  + ";}.GOJU5EJBFX{padding:" + ("4px"+ " " +"8px") ) + (";background:" + ("#eee")  + ";vertical-align:" + ("baseline")  + ";border-top-left-radius:" + ("4px")  + ";border-bottom-left-radius:" + ("4px")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";}.GOJU5EJBGX{padding:" + ("4px"+ " " +"8px")  + ";background:" + ("#eee")  + ";vertical-align:") + (("baseline")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-right:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-left-width:" + ("0")  + ";}.GOJU5EJBHX{padding:" + ("4px"+ " " +"8px")  + ";background:" + ("#eee")  + ";vertical-align:" + ("baseline") ) + (";-moz-border-radius:" + ("0")  + ";-webkit-border-radius:" + ("0")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border-right:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-left-width:" + ("0")  + ";}.GOJU5EJBAV{padding:" + ("10px")  + ";text-align:") + (("left")  + ";float:" + ("left")  + ";}.GOJU5EJBOU{float:" + ("left")  + ";text-align:" + ("left")  + ";padding:" + ("10px")  + ";white-space:" + ("nowrap")  + ";}.GOJU5EJBPU{float:" + ("left")  + ";text-align:" + ("left")  + ";padding:" + ("5px")  + ";white-space:" + ("nowrap")  + ";}.GOJU5EJBFV{padding:" + ("5px") ) + (";padding-top:" + ("5px")  + ";text-align:" + ("left")  + ";width:" + ("300px")  + ";}.GOJU5EJBGV{padding:" + ("5px")  + ";padding-top:" + ("8px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("top")  + ";width:" + ("300px")  + ";}.GOJU5EJBLV{padding:" + ("5px")  + ";width:" + ("600px")  + ";vertical-align:") + (("top")  + ";}.GOJU5EJBHV{padding:" + ("7px")  + ";text-align:" + ("left")  + ";width:" + ("200px")  + ";}.GOJU5EJBIV{padding:" + ("7px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("top")  + ";width:" + ("200px")  + ";}.GOJU5EJBMV{width:" + ("300px")  + ";vertical-align:" + ("top")  + ";text-align:" + ("left") ) + (";}.GOJU5EJBJV{padding:" + ("7px")  + ";text-align:" + ("left")  + ";width:" + ("300px")  + ";}.GOJU5EJBKV{padding:" + ("7px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("top")  + ";width:" + ("300px")  + ";}.GOJU5EJBDV{font-weight:" + ("bold")  + ";padding:" + ("7px")  + ";padding-top:" + ("20px")  + ";padding-bottom:") + (("10px")  + ";}.GOJU5EJBPV,.GOJU5EJBAW{background-color:" + ("#fff")  + ";}.GOJU5EJBHW .GOJU5EJBIW{padding:" + ("0")  + ";margin:" + ("0")  + ";white-space:" + ("nowrap")  + ";cursor:" + ("hand")  + ";cursor:" + ("pointer")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBHW .GOJU5EJBJW{background:" + ("#3f8dd1")  + ";color:" + ("white")  + ";height:" + ("auto") ) + (";padding:" + ("0")  + ";margin:" + ("0")  + ";white-space:" + ("nowrap")  + ";cursor:" + ("hand")  + ";cursor:" + ("pointer")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBOV .GOJU5EJBMU{font-weight:" + ("bold")  + ";}a,a:visited,a:hover{color:" + ("#004785")  + ";}"));
      }
      public java.lang.String Caption(){
        return "GOJU5EJBMU";
      }
      public java.lang.String bottomBorder(){
        return "GOJU5EJBNU";
      }
      public java.lang.String dialogButtonPanel(){
        return "GOJU5EJBOU";
      }
      public java.lang.String dialogButtonPanel2(){
        return "GOJU5EJBPU";
      }
      public java.lang.String dialogForm(){
        return "GOJU5EJBAV";
      }
      public java.lang.String footerPanel(){
        return "GOJU5EJBBV";
      }
      public java.lang.String formPanel(){
        return "GOJU5EJBCV";
      }
      public java.lang.String formSectionLabel(){
        return "GOJU5EJBDV";
      }
      public java.lang.String formTable(){
        return "GOJU5EJBEV";
      }
      public java.lang.String formTableCell0(){
        return "GOJU5EJBFV";
      }
      public java.lang.String formTableCell0ListBox(){
        return "GOJU5EJBGV";
      }
      public java.lang.String formTableCell0a(){
        return "GOJU5EJBHV";
      }
      public java.lang.String formTableCell0aListBox(){
        return "GOJU5EJBIV";
      }
      public java.lang.String formTableCell0b(){
        return "GOJU5EJBJV";
      }
      public java.lang.String formTableCell0bListBox(){
        return "GOJU5EJBKV";
      }
      public java.lang.String formTableCell1(){
        return "GOJU5EJBLV";
      }
      public java.lang.String formTableCell1a(){
        return "GOJU5EJBMV";
      }
      public java.lang.String gwtButton(){
        return "GOJU5EJBNV";
      }
      public java.lang.String gwtDialogBox(){
        return "GOJU5EJBOV";
      }
      public java.lang.String gwtSplitLayoutPanelHDragger(){
        return "GOJU5EJBPV";
      }
      public java.lang.String gwtSplitLayoutPanelVDragger(){
        return "GOJU5EJBAW";
      }
      public java.lang.String gwtToggleButtonDown(){
        return "GOJU5EJBBW";
      }
      public java.lang.String gwtToggleButtonDownDisabled(){
        return "GOJU5EJBCW";
      }
      public java.lang.String gwtToggleButtonDownHovering(){
        return "GOJU5EJBDW";
      }
      public java.lang.String gwtToggleButtonUp(){
        return "GOJU5EJBEW";
      }
      public java.lang.String gwtToggleButtonUpDisabled(){
        return "GOJU5EJBFW";
      }
      public java.lang.String gwtToggleButtonUpHovering(){
        return "GOJU5EJBGW";
      }
      public java.lang.String gwtTree(){
        return "GOJU5EJBHW";
      }
      public java.lang.String gwtTreeItem(){
        return "GOJU5EJBIW";
      }
      public java.lang.String gwtTreeItemSelected(){
        return "GOJU5EJBJW";
      }
      public java.lang.String headerPanel1(){
        return "GOJU5EJBKW";
      }
      public java.lang.String headerPanel2(){
        return "GOJU5EJBLW";
      }
      public java.lang.String mainPanel(){
        return "GOJU5EJBMW";
      }
      public java.lang.String messageList(){
        return "GOJU5EJBNW";
      }
      public java.lang.String pageContent(){
        return "GOJU5EJBOW";
      }
      public java.lang.String pageHeader(){
        return "GOJU5EJBPW";
      }
      public java.lang.String pagerPanel(){
        return "GOJU5EJBAX";
      }
      public java.lang.String searchText(){
        return "GOJU5EJBBX";
      }
      public java.lang.String simplePager(){
        return "GOJU5EJBCX";
      }
      public java.lang.String titleBar(){
        return "GOJU5EJBDX";
      }
      public java.lang.String toolbarButton(){
        return "GOJU5EJBEX";
      }
      public java.lang.String toolbarButton2a(){
        return "GOJU5EJBFX";
      }
      public java.lang.String toolbarButton2b(){
        return "GOJU5EJBGX";
      }
      public java.lang.String toolbarButton2c(){
        return "GOJU5EJBHX";
      }
      public java.lang.String toolbarButtonPanel(){
        return "GOJU5EJBIX";
      }
      public java.lang.String toolbarPanel(){
        return "GOJU5EJBJX";
      }
      public java.lang.String topBorder(){
        return "GOJU5EJBKX";
      }
      public java.lang.String treeButtonPanel(){
        return "GOJU5EJBLX";
      }
      public java.lang.String treeLinks(){
        return "GOJU5EJBMX";
      }
      public java.lang.String treeToolbarButtonPanel(){
        return "GOJU5EJBNX";
      }
      public java.lang.String treeToolbarPanel(){
        return "GOJU5EJBOX";
      }
      public java.lang.String westPanel(){
        return "GOJU5EJBPX";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.medassets.report.client.library.MainNavTree_MainNavTreeUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.medassets.report.client.library.MainNavTree_MainNavTreeUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.medassets.report.client.library.MainNavTree_MainNavTreeUiBinderImpl_GenCss_style style;
  
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
      case 'style': return this.@com.medassets.report.client.library.MainNavTree_MainNavTreeUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
