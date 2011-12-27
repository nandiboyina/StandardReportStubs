package com.medassets.report.client.library;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class ReportTable_ReportTableUiBinderImpl_GenBundle_default_InlineClientBundleGenerator implements com.medassets.report.client.library.ReportTable_ReportTableUiBinderImpl_GenBundle {
  private static ReportTable_ReportTableUiBinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new ReportTable_ReportTableUiBinderImpl_GenBundle_default_InlineClientBundleGenerator();
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? (("body{font-family:" + ("Arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("9pt")  + ";color:" + ("black")  + ";margin:" + ("0")  + ";border:" + ("0")  + ";padding:" + ("0")  + ";background:" + ("#fff")  + ";direction:" + ("rtl")  + ";}table td,select{font-family:" + ("Arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("9pt")  + ";}.GOJU5EJBA0{border:") + (("1px"+ " " +"solid"+ " " +"#2291c8")  + ";}.GOJU5EJBD0{background:" + ("#fff"+ " " +"url(headerTitleBG.png)"+ " " +"repeat-x")  + ";color:" + ("#fff")  + ";margin-top:" + ("5px")  + ";margin-right:" + ("5px")  + ";margin-left:" + ("5px")  + ";padding-right:" + ("5px")  + ";padding-top:" + ("4px")  + ";height:" + ("22px")  + ";vertical-align:" + ("middle")  + ";font-size:" + ("10pt") ) + (";}.GOJU5EJBC0{margin-top:" + ("1px")  + ";margin-right:" + ("5px")  + ";margin-bottom:" + ("5px")  + ";margin-left:" + ("5px")  + ";}.GOJU5EJBE0{border-top:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";vertical-align:" + ("middle")  + ";padding:" + ("0")  + ";margin:" + ("0")  + ";spacing:" + ("0")  + ";text-align:" + ("left")  + ";}.GOJU5EJBG0{vertical-align:") + (("middle")  + ";padding:" + ("0")  + ";margin:" + ("0")  + ";spacing:" + ("0")  + ";text-align:" + ("left")  + ";}.GOJU5EJBFY{margin:" + ("0")  + ";padding:" + ("5px")  + ";text-align:" + ("left")  + ";background-color:" + ("#fff")  + ";font-size:" + ("smaller")  + ";}.GOJU5EJBO-{font-weight:" + ("bold") ) + (";font-size:" + ("large")  + ";font-family:" + ("helvetica")  + ";margin-right:" + ("0")  + ";padding:" + ("10px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";background-color:" + ("#fff")  + ";}.GOJU5EJBP-{text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBD1{padding:" + ("0")  + ";border:") + (("1px"+ " " +"solid"+ " " +"#2291c8")  + ";background-color:" + ("#fff")  + ";}.GOJU5EJBB0{width:" + ("100%")  + ";padding:" + ("10px")  + ";}.GOJU5EJBH0{background-color:" + ("#e0e0e0")  + ";color:" + ("#000")  + ";padding-right:" + ("5px")  + ";font-weight:" + ("bold")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";}.GOJU5EJBF0{background:" + ("#fff"+ " " +"url(zoom.png)"+ " " +"no-repeat"+ " " +"3px")  + ";padding:" + ("3px"+ " " +"24px"+ " " +"3px"+ " " +"3px") ) + (";border:" + ("1px"+ " " +"solid"+ " " +"#7f9db9")  + ";margin:" + ("5px")  + ";float:" + ("left")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBE0{padding:" + ("0")  + ";margin:" + ("0")  + ";text-align:" + ("center")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBN0{background:" + ("#e1e1e1")  + ";vertical-align:" + ("middle")  + ";border-bottom:") + (("1px"+ " " +"solid"+ " " +"#000")  + ";white-space:" + ("nowrap")  + ";}.GOJU5EJBM0{display:" + ("inline")  + ";margin-top:" + ("8px")  + ";margin-right:" + ("5px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";float:" + ("right")  + ";}.GOJU5EJBC1{background:" + ("#e1e1e1")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#000") ) + (";}.GOJU5EJBB1{width:" + ("100%")  + ";margin-top:" + ("8px")  + ";margin-right:" + ("5px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";}.GOJU5EJBP0{margin-top:" + ("8px")  + ";margin-right:" + ("5px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";white-space:") + (("nowrap")  + ";}.GOJU5EJBA1{text-decoration:" + ("underline")  + ";margin-right:" + ("5px")  + ";margin-left:" + ("5px")  + ";cursor:" + ("hand")  + ";}.GOJU5EJBO0{border-top:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";}.GOJU5EJBI0{padding:" + ("0"+ " " +"5px"+ " " +"0"+ " " +"5px")  + ";margin:" + ("0"+ " " +"0"+ " " +"0"+ " " +"0")  + ";width:" + ("auto")  + " !important;overflow:" + ("visible")  + ";}.GOJU5EJBJ0{padding:" + ("4px"+ " " +"8px") ) + (";background:" + ("#eee")  + ";vertical-align:" + ("baseline")  + ";border-top-right-radius:" + ("4px")  + ";border-bottom-right-radius:" + ("4px")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";}.GOJU5EJBK0{padding:" + ("4px"+ " " +"8px")  + ";background:" + ("#eee")  + ";vertical-align:") + (("baseline")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-left:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-right-width:" + ("0")  + ";}.GOJU5EJBL0{padding:" + ("4px"+ " " +"8px")  + ";background:" + ("#eee")  + ";vertical-align:" + ("baseline") ) + (";-moz-border-radius:" + ("0")  + ";-webkit-border-radius:" + ("0")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border-left:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-right-width:" + ("0")  + ";}.GOJU5EJBEY{padding:" + ("10px")  + ";text-align:") + (("right")  + ";float:" + ("right")  + ";}.GOJU5EJBCY{float:" + ("right")  + ";text-align:" + ("right")  + ";padding:" + ("10px")  + ";white-space:" + ("nowrap")  + ";}.GOJU5EJBDY{float:" + ("right")  + ";text-align:" + ("right")  + ";padding:" + ("5px")  + ";white-space:" + ("nowrap")  + ";}.GOJU5EJBJY{padding:" + ("5px") ) + (";padding-top:" + ("5px")  + ";text-align:" + ("right")  + ";width:" + ("300px")  + ";}.GOJU5EJBKY{padding:" + ("5px")  + ";padding-top:" + ("8px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("top")  + ";width:" + ("300px")  + ";}.GOJU5EJBPY{padding:" + ("5px")  + ";width:" + ("600px")  + ";vertical-align:") + (("top")  + ";}.GOJU5EJBLY{padding:" + ("7px")  + ";text-align:" + ("right")  + ";width:" + ("200px")  + ";}.GOJU5EJBMY{padding:" + ("7px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("top")  + ";width:" + ("200px")  + ";}.GOJU5EJBA-{width:" + ("300px")  + ";vertical-align:" + ("top")  + ";text-align:" + ("right") ) + (";}.GOJU5EJBNY{padding:" + ("7px")  + ";text-align:" + ("right")  + ";width:" + ("300px")  + ";}.GOJU5EJBOY{padding:" + ("7px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("top")  + ";width:" + ("300px")  + ";}.GOJU5EJBHY{font-weight:" + ("bold")  + ";padding:" + ("7px")  + ";padding-top:" + ("20px")  + ";padding-bottom:") + (("10px")  + ";}.GOJU5EJBD-,.GOJU5EJBE-{background-color:" + ("#fff")  + ";}.GOJU5EJBL- .GOJU5EJBM-{padding:" + ("0")  + ";margin:" + ("0")  + ";white-space:" + ("nowrap")  + ";cursor:" + ("hand")  + ";cursor:" + ("pointer")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBL- .GOJU5EJBN-{background:" + ("#3f8dd1")  + ";color:" + ("white")  + ";height:" + ("auto") ) + (";padding:" + ("0")  + ";margin:" + ("0")  + ";white-space:" + ("nowrap")  + ";cursor:" + ("hand")  + ";cursor:" + ("pointer")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBC- .GOJU5EJBAY{font-weight:" + ("bold")  + ";}a,a:visited,a:hover{color:" + ("#004785")  + ";}")) : (("body{font-family:" + ("Arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("9pt")  + ";color:" + ("black")  + ";margin:" + ("0")  + ";border:" + ("0")  + ";padding:" + ("0")  + ";background:" + ("#fff")  + ";direction:" + ("ltr")  + ";}table td,select{font-family:" + ("Arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("9pt")  + ";}.GOJU5EJBA0{border:") + (("1px"+ " " +"solid"+ " " +"#2291c8")  + ";}.GOJU5EJBD0{background:" + ("#fff"+ " " +"url(headerTitleBG.png)"+ " " +"repeat-x")  + ";color:" + ("#fff")  + ";margin-top:" + ("5px")  + ";margin-left:" + ("5px")  + ";margin-right:" + ("5px")  + ";padding-left:" + ("5px")  + ";padding-top:" + ("4px")  + ";height:" + ("22px")  + ";vertical-align:" + ("middle")  + ";font-size:" + ("10pt") ) + (";}.GOJU5EJBC0{margin-top:" + ("1px")  + ";margin-left:" + ("5px")  + ";margin-bottom:" + ("5px")  + ";margin-right:" + ("5px")  + ";}.GOJU5EJBE0{border-top:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";vertical-align:" + ("middle")  + ";padding:" + ("0")  + ";margin:" + ("0")  + ";spacing:" + ("0")  + ";text-align:" + ("right")  + ";}.GOJU5EJBG0{vertical-align:") + (("middle")  + ";padding:" + ("0")  + ";margin:" + ("0")  + ";spacing:" + ("0")  + ";text-align:" + ("right")  + ";}.GOJU5EJBFY{margin:" + ("0")  + ";padding:" + ("5px")  + ";text-align:" + ("right")  + ";background-color:" + ("#fff")  + ";font-size:" + ("smaller")  + ";}.GOJU5EJBO-{font-weight:" + ("bold") ) + (";font-size:" + ("large")  + ";font-family:" + ("helvetica")  + ";margin-left:" + ("0")  + ";padding:" + ("10px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";background-color:" + ("#fff")  + ";}.GOJU5EJBP-{text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBD1{padding:" + ("0")  + ";border:") + (("1px"+ " " +"solid"+ " " +"#2291c8")  + ";background-color:" + ("#fff")  + ";}.GOJU5EJBB0{width:" + ("100%")  + ";padding:" + ("10px")  + ";}.GOJU5EJBH0{background-color:" + ("#e0e0e0")  + ";color:" + ("#000")  + ";padding-left:" + ("5px")  + ";font-weight:" + ("bold")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";}.GOJU5EJBF0{background:" + ("#fff"+ " " +"url(zoom.png)"+ " " +"no-repeat"+ " " +"3px")  + ";padding:" + ("3px"+ " " +"3px"+ " " +"3px"+ " " +"24px") ) + (";border:" + ("1px"+ " " +"solid"+ " " +"#7f9db9")  + ";margin:" + ("5px")  + ";float:" + ("right")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBE0{padding:" + ("0")  + ";margin:" + ("0")  + ";text-align:" + ("center")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBN0{background:" + ("#e1e1e1")  + ";vertical-align:" + ("middle")  + ";border-bottom:") + (("1px"+ " " +"solid"+ " " +"#000")  + ";white-space:" + ("nowrap")  + ";}.GOJU5EJBM0{display:" + ("inline")  + ";margin-top:" + ("8px")  + ";margin-left:" + ("5px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";float:" + ("left")  + ";}.GOJU5EJBC1{background:" + ("#e1e1e1")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#000") ) + (";}.GOJU5EJBB1{width:" + ("100%")  + ";margin-top:" + ("8px")  + ";margin-left:" + ("5px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";}.GOJU5EJBP0{margin-top:" + ("8px")  + ";margin-left:" + ("5px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";white-space:") + (("nowrap")  + ";}.GOJU5EJBA1{text-decoration:" + ("underline")  + ";margin-left:" + ("5px")  + ";margin-right:" + ("5px")  + ";cursor:" + ("hand")  + ";}.GOJU5EJBO0{border-top:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";}.GOJU5EJBI0{padding:" + ("0"+ " " +"5px"+ " " +"0"+ " " +"5px")  + ";margin:" + ("0"+ " " +"0"+ " " +"0"+ " " +"0")  + ";width:" + ("auto")  + " !important;overflow:" + ("visible")  + ";}.GOJU5EJBJ0{padding:" + ("4px"+ " " +"8px") ) + (";background:" + ("#eee")  + ";vertical-align:" + ("baseline")  + ";border-top-left-radius:" + ("4px")  + ";border-bottom-left-radius:" + ("4px")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";}.GOJU5EJBK0{padding:" + ("4px"+ " " +"8px")  + ";background:" + ("#eee")  + ";vertical-align:") + (("baseline")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-right:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-left-width:" + ("0")  + ";}.GOJU5EJBL0{padding:" + ("4px"+ " " +"8px")  + ";background:" + ("#eee")  + ";vertical-align:" + ("baseline") ) + (";-moz-border-radius:" + ("0")  + ";-webkit-border-radius:" + ("0")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border-right:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-left-width:" + ("0")  + ";}.GOJU5EJBEY{padding:" + ("10px")  + ";text-align:") + (("left")  + ";float:" + ("left")  + ";}.GOJU5EJBCY{float:" + ("left")  + ";text-align:" + ("left")  + ";padding:" + ("10px")  + ";white-space:" + ("nowrap")  + ";}.GOJU5EJBDY{float:" + ("left")  + ";text-align:" + ("left")  + ";padding:" + ("5px")  + ";white-space:" + ("nowrap")  + ";}.GOJU5EJBJY{padding:" + ("5px") ) + (";padding-top:" + ("5px")  + ";text-align:" + ("left")  + ";width:" + ("300px")  + ";}.GOJU5EJBKY{padding:" + ("5px")  + ";padding-top:" + ("8px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("top")  + ";width:" + ("300px")  + ";}.GOJU5EJBPY{padding:" + ("5px")  + ";width:" + ("600px")  + ";vertical-align:") + (("top")  + ";}.GOJU5EJBLY{padding:" + ("7px")  + ";text-align:" + ("left")  + ";width:" + ("200px")  + ";}.GOJU5EJBMY{padding:" + ("7px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("top")  + ";width:" + ("200px")  + ";}.GOJU5EJBA-{width:" + ("300px")  + ";vertical-align:" + ("top")  + ";text-align:" + ("left") ) + (";}.GOJU5EJBNY{padding:" + ("7px")  + ";text-align:" + ("left")  + ";width:" + ("300px")  + ";}.GOJU5EJBOY{padding:" + ("7px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("top")  + ";width:" + ("300px")  + ";}.GOJU5EJBHY{font-weight:" + ("bold")  + ";padding:" + ("7px")  + ";padding-top:" + ("20px")  + ";padding-bottom:") + (("10px")  + ";}.GOJU5EJBD-,.GOJU5EJBE-{background-color:" + ("#fff")  + ";}.GOJU5EJBL- .GOJU5EJBM-{padding:" + ("0")  + ";margin:" + ("0")  + ";white-space:" + ("nowrap")  + ";cursor:" + ("hand")  + ";cursor:" + ("pointer")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBL- .GOJU5EJBN-{background:" + ("#3f8dd1")  + ";color:" + ("white")  + ";height:" + ("auto") ) + (";padding:" + ("0")  + ";margin:" + ("0")  + ";white-space:" + ("nowrap")  + ";cursor:" + ("hand")  + ";cursor:" + ("pointer")  + ";vertical-align:" + ("middle")  + ";}.GOJU5EJBC- .GOJU5EJBAY{font-weight:" + ("bold")  + ";}a,a:visited,a:hover{color:" + ("#004785")  + ";}"));
      }
      public java.lang.String Caption(){
        return "GOJU5EJBAY";
      }
      public java.lang.String bottomBorder(){
        return "GOJU5EJBBY";
      }
      public java.lang.String dialogButtonPanel(){
        return "GOJU5EJBCY";
      }
      public java.lang.String dialogButtonPanel2(){
        return "GOJU5EJBDY";
      }
      public java.lang.String dialogForm(){
        return "GOJU5EJBEY";
      }
      public java.lang.String footerPanel(){
        return "GOJU5EJBFY";
      }
      public java.lang.String formPanel(){
        return "GOJU5EJBGY";
      }
      public java.lang.String formSectionLabel(){
        return "GOJU5EJBHY";
      }
      public java.lang.String formTable(){
        return "GOJU5EJBIY";
      }
      public java.lang.String formTableCell0(){
        return "GOJU5EJBJY";
      }
      public java.lang.String formTableCell0ListBox(){
        return "GOJU5EJBKY";
      }
      public java.lang.String formTableCell0a(){
        return "GOJU5EJBLY";
      }
      public java.lang.String formTableCell0aListBox(){
        return "GOJU5EJBMY";
      }
      public java.lang.String formTableCell0b(){
        return "GOJU5EJBNY";
      }
      public java.lang.String formTableCell0bListBox(){
        return "GOJU5EJBOY";
      }
      public java.lang.String formTableCell1(){
        return "GOJU5EJBPY";
      }
      public java.lang.String formTableCell1a(){
        return "GOJU5EJBA-";
      }
      public java.lang.String gwtButton(){
        return "GOJU5EJBB-";
      }
      public java.lang.String gwtDialogBox(){
        return "GOJU5EJBC-";
      }
      public java.lang.String gwtSplitLayoutPanelHDragger(){
        return "GOJU5EJBD-";
      }
      public java.lang.String gwtSplitLayoutPanelVDragger(){
        return "GOJU5EJBE-";
      }
      public java.lang.String gwtToggleButtonDown(){
        return "GOJU5EJBF-";
      }
      public java.lang.String gwtToggleButtonDownDisabled(){
        return "GOJU5EJBG-";
      }
      public java.lang.String gwtToggleButtonDownHovering(){
        return "GOJU5EJBH-";
      }
      public java.lang.String gwtToggleButtonUp(){
        return "GOJU5EJBI-";
      }
      public java.lang.String gwtToggleButtonUpDisabled(){
        return "GOJU5EJBJ-";
      }
      public java.lang.String gwtToggleButtonUpHovering(){
        return "GOJU5EJBK-";
      }
      public java.lang.String gwtTree(){
        return "GOJU5EJBL-";
      }
      public java.lang.String gwtTreeItem(){
        return "GOJU5EJBM-";
      }
      public java.lang.String gwtTreeItemSelected(){
        return "GOJU5EJBN-";
      }
      public java.lang.String headerPanel1(){
        return "GOJU5EJBO-";
      }
      public java.lang.String headerPanel2(){
        return "GOJU5EJBP-";
      }
      public java.lang.String mainPanel(){
        return "GOJU5EJBA0";
      }
      public java.lang.String messageList(){
        return "GOJU5EJBB0";
      }
      public java.lang.String pageContent(){
        return "GOJU5EJBC0";
      }
      public java.lang.String pageHeader(){
        return "GOJU5EJBD0";
      }
      public java.lang.String pagerPanel(){
        return "GOJU5EJBE0";
      }
      public java.lang.String searchText(){
        return "GOJU5EJBF0";
      }
      public java.lang.String simplePager(){
        return "GOJU5EJBG0";
      }
      public java.lang.String titleBar(){
        return "GOJU5EJBH0";
      }
      public java.lang.String toolbarButton(){
        return "GOJU5EJBI0";
      }
      public java.lang.String toolbarButton2a(){
        return "GOJU5EJBJ0";
      }
      public java.lang.String toolbarButton2b(){
        return "GOJU5EJBK0";
      }
      public java.lang.String toolbarButton2c(){
        return "GOJU5EJBL0";
      }
      public java.lang.String toolbarButtonPanel(){
        return "GOJU5EJBM0";
      }
      public java.lang.String toolbarPanel(){
        return "GOJU5EJBN0";
      }
      public java.lang.String topBorder(){
        return "GOJU5EJBO0";
      }
      public java.lang.String treeButtonPanel(){
        return "GOJU5EJBP0";
      }
      public java.lang.String treeLinks(){
        return "GOJU5EJBA1";
      }
      public java.lang.String treeToolbarButtonPanel(){
        return "GOJU5EJBB1";
      }
      public java.lang.String treeToolbarPanel(){
        return "GOJU5EJBC1";
      }
      public java.lang.String westPanel(){
        return "GOJU5EJBD1";
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
