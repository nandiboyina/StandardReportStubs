package com.medassets.report.client.standard;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class StandardReportDialog_StandardReportDialogUiBinderImpl_GenBundle_default_InlineClientBundleGenerator implements com.medassets.report.client.standard.StandardReportDialog_StandardReportDialogUiBinderImpl_GenBundle {
  private static StandardReportDialog_StandardReportDialogUiBinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new StandardReportDialog_StandardReportDialogUiBinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.medassets.report.client.standard.StandardReportDialog_StandardReportDialogUiBinderImpl_GenCss_style() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? (("body{font-family:" + ("Arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("9pt")  + ";color:" + ("black")  + ";margin:" + ("0")  + ";border:" + ("0")  + ";padding:" + ("0")  + ";background:" + ("#fff")  + ";direction:" + ("rtl")  + ";}table td,select{font-family:" + ("Arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("9pt")  + ";}.GOJU5EJBG3{border:") + (("1px"+ " " +"solid"+ " " +"#2291c8")  + ";}.GOJU5EJBJ3{background:" + ("#fff"+ " " +"url(headerTitleBG.png)"+ " " +"repeat-x")  + ";color:" + ("#fff")  + ";margin-top:" + ("5px")  + ";margin-right:" + ("5px")  + ";margin-left:" + ("5px")  + ";padding-right:" + ("5px")  + ";padding-top:" + ("4px")  + ";height:" + ("22px")  + ";vertical-align:" + ("middle")  + ";font-size:" + ("10pt") ) + (";}.GOJU5EJBI3{margin-top:" + ("1px")  + ";margin-right:" + ("5px")  + ";margin-bottom:" + ("5px")  + ";margin-left:" + ("5px")  + ";}.GOJU5EJBK3{border-top:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";vertical-align:" + ("middle")  + ";padding:" + ("0")  + ";margin:" + ("0")  + ";spacing:" + ("0")  + ";text-align:" + ("left")  + ";}.GOJU5EJBM3{vertical-align:") + (("middle")  + ";padding:" + ("0")  + ";margin:" + ("0")  + ";spacing:" + ("0")  + ";text-align:" + ("left")  + ";}.GOJU5EJBL1{margin:" + ("0")  + ";padding:" + ("5px")  + ";text-align:" + ("left")  + ";background-color:" + ("#fff")  + ";font-size:" + ("smaller")  + ";}.GOJU5EJBE3{font-weight:" + ("bold") ) + (";font-size:" + ("large")  + ";font-family:" + ("helvetica")  + ";margin-right:" + ("0")  + ";padding:" + ("10px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";background-color:" + ("#fff")  + ";}.GOJU5EJBF3{text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBJ4{padding:" + ("0")  + ";border:") + (("1px"+ " " +"solid"+ " " +"#2291c8")  + ";background-color:" + ("#fff")  + ";}.GOJU5EJBH3{width:" + ("100%")  + ";padding:" + ("10px")  + ";}.GOJU5EJBN3{background-color:" + ("#e0e0e0")  + ";color:" + ("#000")  + ";padding-right:" + ("5px")  + ";font-weight:" + ("bold")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";}.GOJU5EJBL3{background:" + ("#fff"+ " " +"url(zoom.png)"+ " " +"no-repeat"+ " " +"3px")  + ";padding:" + ("3px"+ " " +"24px"+ " " +"3px"+ " " +"3px") ) + (";border:" + ("1px"+ " " +"solid"+ " " +"#7f9db9")  + ";margin:" + ("5px")  + ";float:" + ("left")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBK3{padding:" + ("0")  + ";margin:" + ("0")  + ";text-align:" + ("center")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBD4{background:" + ("#e1e1e1")  + ";vertical-align:" + ("middle")  + ";border-bottom:") + (("1px"+ " " +"solid"+ " " +"#000")  + ";white-space:" + ("nowrap")  + ";}.GOJU5EJBC4{display:" + ("inline")  + ";margin-top:" + ("8px")  + ";margin-right:" + ("5px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";float:" + ("right")  + ";}.GOJU5EJBI4{background:" + ("#e1e1e1")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#000") ) + (";}.GOJU5EJBH4{width:" + ("100%")  + ";margin-top:" + ("8px")  + ";margin-right:" + ("5px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";}.GOJU5EJBF4{margin-top:" + ("8px")  + ";margin-right:" + ("5px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";white-space:") + (("nowrap")  + ";}.GOJU5EJBG4{text-decoration:" + ("underline")  + ";margin-right:" + ("5px")  + ";margin-left:" + ("5px")  + ";cursor:" + ("hand")  + ";}.GOJU5EJBE4{border-top:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";}.GOJU5EJBO3{padding:" + ("0"+ " " +"5px"+ " " +"0"+ " " +"5px")  + ";margin:" + ("0"+ " " +"0"+ " " +"0"+ " " +"0")  + ";width:" + ("auto")  + " !important;overflow:" + ("visible")  + ";}.GOJU5EJBP3{padding:" + ("4px"+ " " +"8px") ) + (";background:" + ("#eee")  + ";vertical-align:" + ("baseline")  + ";border-top-right-radius:" + ("4px")  + ";border-bottom-right-radius:" + ("4px")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";}.GOJU5EJBA4{padding:" + ("4px"+ " " +"8px")  + ";background:" + ("#eee")  + ";vertical-align:") + (("baseline")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-left:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-right-width:" + ("0")  + ";}.GOJU5EJBB4{padding:" + ("4px"+ " " +"8px")  + ";background:" + ("#eee")  + ";vertical-align:" + ("baseline") ) + (";-moz-border-radius:" + ("0")  + ";-webkit-border-radius:" + ("0")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border-left:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-right-width:" + ("0")  + ";}.GOJU5EJBK1{padding:" + ("10px")  + ";text-align:") + (("right")  + ";float:" + ("right")  + ";}.GOJU5EJBI1{float:" + ("right")  + ";text-align:" + ("right")  + ";padding:" + ("10px")  + ";white-space:" + ("nowrap")  + ";}.GOJU5EJBJ1{float:" + ("right")  + ";text-align:" + ("right")  + ";padding:" + ("5px")  + ";white-space:" + ("nowrap")  + ";}.GOJU5EJBP1{padding:" + ("5px") ) + (";padding-top:" + ("5px")  + ";text-align:" + ("right")  + ";width:" + ("300px")  + ";}.GOJU5EJBA2{padding:" + ("5px")  + ";padding-top:" + ("8px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("top")  + ";width:" + ("300px")  + ";}.GOJU5EJBF2{padding:" + ("5px")  + ";width:" + ("600px")  + ";vertical-align:") + (("top")  + ";}.GOJU5EJBB2{padding:" + ("7px")  + ";text-align:" + ("right")  + ";width:" + ("200px")  + ";}.GOJU5EJBC2{padding:" + ("7px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("top")  + ";width:" + ("200px")  + ";}.GOJU5EJBG2{width:" + ("300px")  + ";vertical-align:" + ("top")  + ";text-align:" + ("right") ) + (";}.GOJU5EJBD2{padding:" + ("7px")  + ";text-align:" + ("right")  + ";width:" + ("300px")  + ";}.GOJU5EJBE2{padding:" + ("7px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("top")  + ";width:" + ("300px")  + ";}.GOJU5EJBN1{font-weight:" + ("bold")  + ";padding:" + ("7px")  + ";padding-top:" + ("20px")  + ";padding-bottom:") + (("10px")  + ";}.GOJU5EJBJ2,.GOJU5EJBK2{background-color:" + ("#fff")  + ";}.GOJU5EJBB3 .GOJU5EJBC3{padding:" + ("0")  + ";margin:" + ("0")  + ";white-space:" + ("nowrap")  + ";cursor:" + ("hand")  + ";cursor:" + ("pointer")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBB3 .GOJU5EJBD3{background:" + ("#3f8dd1")  + ";color:" + ("white")  + ";height:" + ("auto") ) + (";padding:" + ("0")  + ";margin:" + ("0")  + ";white-space:" + ("nowrap")  + ";cursor:" + ("hand")  + ";cursor:" + ("pointer")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBI2 .GOJU5EJBG1{font-weight:" + ("bold")  + ";}a,a:visited,a:hover{color:" + ("#004785")  + ";}")) : (("body{font-family:" + ("Arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("9pt")  + ";color:" + ("black")  + ";margin:" + ("0")  + ";border:" + ("0")  + ";padding:" + ("0")  + ";background:" + ("#fff")  + ";direction:" + ("ltr")  + ";}table td,select{font-family:" + ("Arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("9pt")  + ";}.GOJU5EJBG3{border:") + (("1px"+ " " +"solid"+ " " +"#2291c8")  + ";}.GOJU5EJBJ3{background:" + ("#fff"+ " " +"url(headerTitleBG.png)"+ " " +"repeat-x")  + ";color:" + ("#fff")  + ";margin-top:" + ("5px")  + ";margin-left:" + ("5px")  + ";margin-right:" + ("5px")  + ";padding-left:" + ("5px")  + ";padding-top:" + ("4px")  + ";height:" + ("22px")  + ";vertical-align:" + ("middle")  + ";font-size:" + ("10pt") ) + (";}.GOJU5EJBI3{margin-top:" + ("1px")  + ";margin-left:" + ("5px")  + ";margin-bottom:" + ("5px")  + ";margin-right:" + ("5px")  + ";}.GOJU5EJBK3{border-top:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";vertical-align:" + ("middle")  + ";padding:" + ("0")  + ";margin:" + ("0")  + ";spacing:" + ("0")  + ";text-align:" + ("right")  + ";}.GOJU5EJBM3{vertical-align:") + (("middle")  + ";padding:" + ("0")  + ";margin:" + ("0")  + ";spacing:" + ("0")  + ";text-align:" + ("right")  + ";}.GOJU5EJBL1{margin:" + ("0")  + ";padding:" + ("5px")  + ";text-align:" + ("right")  + ";background-color:" + ("#fff")  + ";font-size:" + ("smaller")  + ";}.GOJU5EJBE3{font-weight:" + ("bold") ) + (";font-size:" + ("large")  + ";font-family:" + ("helvetica")  + ";margin-left:" + ("0")  + ";padding:" + ("10px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";background-color:" + ("#fff")  + ";}.GOJU5EJBF3{text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBJ4{padding:" + ("0")  + ";border:") + (("1px"+ " " +"solid"+ " " +"#2291c8")  + ";background-color:" + ("#fff")  + ";}.GOJU5EJBH3{width:" + ("100%")  + ";padding:" + ("10px")  + ";}.GOJU5EJBN3{background-color:" + ("#e0e0e0")  + ";color:" + ("#000")  + ";padding-left:" + ("5px")  + ";font-weight:" + ("bold")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";}.GOJU5EJBL3{background:" + ("#fff"+ " " +"url(zoom.png)"+ " " +"no-repeat"+ " " +"3px")  + ";padding:" + ("3px"+ " " +"3px"+ " " +"3px"+ " " +"24px") ) + (";border:" + ("1px"+ " " +"solid"+ " " +"#7f9db9")  + ";margin:" + ("5px")  + ";float:" + ("right")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBK3{padding:" + ("0")  + ";margin:" + ("0")  + ";text-align:" + ("center")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBD4{background:" + ("#e1e1e1")  + ";vertical-align:" + ("middle")  + ";border-bottom:") + (("1px"+ " " +"solid"+ " " +"#000")  + ";white-space:" + ("nowrap")  + ";}.GOJU5EJBC4{display:" + ("inline")  + ";margin-top:" + ("8px")  + ";margin-left:" + ("5px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";float:" + ("left")  + ";}.GOJU5EJBI4{background:" + ("#e1e1e1")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#000") ) + (";}.GOJU5EJBH4{width:" + ("100%")  + ";margin-top:" + ("8px")  + ";margin-left:" + ("5px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";}.GOJU5EJBF4{margin-top:" + ("8px")  + ";margin-left:" + ("5px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";white-space:") + (("nowrap")  + ";}.GOJU5EJBG4{text-decoration:" + ("underline")  + ";margin-left:" + ("5px")  + ";margin-right:" + ("5px")  + ";cursor:" + ("hand")  + ";}.GOJU5EJBE4{border-top:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";}.GOJU5EJBO3{padding:" + ("0"+ " " +"5px"+ " " +"0"+ " " +"5px")  + ";margin:" + ("0"+ " " +"0"+ " " +"0"+ " " +"0")  + ";width:" + ("auto")  + " !important;overflow:" + ("visible")  + ";}.GOJU5EJBP3{padding:" + ("4px"+ " " +"8px") ) + (";background:" + ("#eee")  + ";vertical-align:" + ("baseline")  + ";border-top-left-radius:" + ("4px")  + ";border-bottom-left-radius:" + ("4px")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";}.GOJU5EJBA4{padding:" + ("4px"+ " " +"8px")  + ";background:" + ("#eee")  + ";vertical-align:") + (("baseline")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-right:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-left-width:" + ("0")  + ";}.GOJU5EJBB4{padding:" + ("4px"+ " " +"8px")  + ";background:" + ("#eee")  + ";vertical-align:" + ("baseline") ) + (";-moz-border-radius:" + ("0")  + ";-webkit-border-radius:" + ("0")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border-right:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-left-width:" + ("0")  + ";}.GOJU5EJBK1{padding:" + ("10px")  + ";text-align:") + (("left")  + ";float:" + ("left")  + ";}.GOJU5EJBI1{float:" + ("left")  + ";text-align:" + ("left")  + ";padding:" + ("10px")  + ";white-space:" + ("nowrap")  + ";}.GOJU5EJBJ1{float:" + ("left")  + ";text-align:" + ("left")  + ";padding:" + ("5px")  + ";white-space:" + ("nowrap")  + ";}.GOJU5EJBP1{padding:" + ("5px") ) + (";padding-top:" + ("5px")  + ";text-align:" + ("left")  + ";width:" + ("300px")  + ";}.GOJU5EJBA2{padding:" + ("5px")  + ";padding-top:" + ("8px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("top")  + ";width:" + ("300px")  + ";}.GOJU5EJBF2{padding:" + ("5px")  + ";width:" + ("600px")  + ";vertical-align:") + (("top")  + ";}.GOJU5EJBB2{padding:" + ("7px")  + ";text-align:" + ("left")  + ";width:" + ("200px")  + ";}.GOJU5EJBC2{padding:" + ("7px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("top")  + ";width:" + ("200px")  + ";}.GOJU5EJBG2{width:" + ("300px")  + ";vertical-align:" + ("top")  + ";text-align:" + ("left") ) + (";}.GOJU5EJBD2{padding:" + ("7px")  + ";text-align:" + ("left")  + ";width:" + ("300px")  + ";}.GOJU5EJBE2{padding:" + ("7px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("top")  + ";width:" + ("300px")  + ";}.GOJU5EJBN1{font-weight:" + ("bold")  + ";padding:" + ("7px")  + ";padding-top:" + ("20px")  + ";padding-bottom:") + (("10px")  + ";}.GOJU5EJBJ2,.GOJU5EJBK2{background-color:" + ("#fff")  + ";}.GOJU5EJBB3 .GOJU5EJBC3{padding:" + ("0")  + ";margin:" + ("0")  + ";white-space:" + ("nowrap")  + ";cursor:" + ("hand")  + ";cursor:" + ("pointer")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBB3 .GOJU5EJBD3{background:" + ("#3f8dd1")  + ";color:" + ("white")  + ";height:" + ("auto") ) + (";padding:" + ("0")  + ";margin:" + ("0")  + ";white-space:" + ("nowrap")  + ";cursor:" + ("hand")  + ";cursor:" + ("pointer")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBI2 .GOJU5EJBG1{font-weight:" + ("bold")  + ";}a,a:visited,a:hover{color:" + ("#004785")  + ";}"));
      }
      public java.lang.String Caption(){
        return "GOJU5EJBG1";
      }
      public java.lang.String bottomBorder(){
        return "GOJU5EJBH1";
      }
      public java.lang.String dialogButtonPanel(){
        return "GOJU5EJBI1";
      }
      public java.lang.String dialogButtonPanel2(){
        return "GOJU5EJBJ1";
      }
      public java.lang.String dialogForm(){
        return "GOJU5EJBK1";
      }
      public java.lang.String footerPanel(){
        return "GOJU5EJBL1";
      }
      public java.lang.String formPanel(){
        return "GOJU5EJBM1";
      }
      public java.lang.String formSectionLabel(){
        return "GOJU5EJBN1";
      }
      public java.lang.String formTable(){
        return "GOJU5EJBO1";
      }
      public java.lang.String formTableCell0(){
        return "GOJU5EJBP1";
      }
      public java.lang.String formTableCell0ListBox(){
        return "GOJU5EJBA2";
      }
      public java.lang.String formTableCell0a(){
        return "GOJU5EJBB2";
      }
      public java.lang.String formTableCell0aListBox(){
        return "GOJU5EJBC2";
      }
      public java.lang.String formTableCell0b(){
        return "GOJU5EJBD2";
      }
      public java.lang.String formTableCell0bListBox(){
        return "GOJU5EJBE2";
      }
      public java.lang.String formTableCell1(){
        return "GOJU5EJBF2";
      }
      public java.lang.String formTableCell1a(){
        return "GOJU5EJBG2";
      }
      public java.lang.String gwtButton(){
        return "GOJU5EJBH2";
      }
      public java.lang.String gwtDialogBox(){
        return "GOJU5EJBI2";
      }
      public java.lang.String gwtSplitLayoutPanelHDragger(){
        return "GOJU5EJBJ2";
      }
      public java.lang.String gwtSplitLayoutPanelVDragger(){
        return "GOJU5EJBK2";
      }
      public java.lang.String gwtToggleButtonDown(){
        return "GOJU5EJBL2";
      }
      public java.lang.String gwtToggleButtonDownDisabled(){
        return "GOJU5EJBM2";
      }
      public java.lang.String gwtToggleButtonDownHovering(){
        return "GOJU5EJBN2";
      }
      public java.lang.String gwtToggleButtonUp(){
        return "GOJU5EJBO2";
      }
      public java.lang.String gwtToggleButtonUpDisabled(){
        return "GOJU5EJBP2";
      }
      public java.lang.String gwtToggleButtonUpHovering(){
        return "GOJU5EJBA3";
      }
      public java.lang.String gwtTree(){
        return "GOJU5EJBB3";
      }
      public java.lang.String gwtTreeItem(){
        return "GOJU5EJBC3";
      }
      public java.lang.String gwtTreeItemSelected(){
        return "GOJU5EJBD3";
      }
      public java.lang.String headerPanel1(){
        return "GOJU5EJBE3";
      }
      public java.lang.String headerPanel2(){
        return "GOJU5EJBF3";
      }
      public java.lang.String mainPanel(){
        return "GOJU5EJBG3";
      }
      public java.lang.String messageList(){
        return "GOJU5EJBH3";
      }
      public java.lang.String pageContent(){
        return "GOJU5EJBI3";
      }
      public java.lang.String pageHeader(){
        return "GOJU5EJBJ3";
      }
      public java.lang.String pagerPanel(){
        return "GOJU5EJBK3";
      }
      public java.lang.String searchText(){
        return "GOJU5EJBL3";
      }
      public java.lang.String simplePager(){
        return "GOJU5EJBM3";
      }
      public java.lang.String titleBar(){
        return "GOJU5EJBN3";
      }
      public java.lang.String toolbarButton(){
        return "GOJU5EJBO3";
      }
      public java.lang.String toolbarButton2a(){
        return "GOJU5EJBP3";
      }
      public java.lang.String toolbarButton2b(){
        return "GOJU5EJBA4";
      }
      public java.lang.String toolbarButton2c(){
        return "GOJU5EJBB4";
      }
      public java.lang.String toolbarButtonPanel(){
        return "GOJU5EJBC4";
      }
      public java.lang.String toolbarPanel(){
        return "GOJU5EJBD4";
      }
      public java.lang.String topBorder(){
        return "GOJU5EJBE4";
      }
      public java.lang.String treeButtonPanel(){
        return "GOJU5EJBF4";
      }
      public java.lang.String treeLinks(){
        return "GOJU5EJBG4";
      }
      public java.lang.String treeToolbarButtonPanel(){
        return "GOJU5EJBH4";
      }
      public java.lang.String treeToolbarPanel(){
        return "GOJU5EJBI4";
      }
      public java.lang.String westPanel(){
        return "GOJU5EJBJ4";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.medassets.report.client.standard.StandardReportDialog_StandardReportDialogUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.medassets.report.client.standard.StandardReportDialog_StandardReportDialogUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.medassets.report.client.standard.StandardReportDialog_StandardReportDialogUiBinderImpl_GenCss_style style;
  
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
      case 'style': return this.@com.medassets.report.client.standard.StandardReportDialog_StandardReportDialogUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
