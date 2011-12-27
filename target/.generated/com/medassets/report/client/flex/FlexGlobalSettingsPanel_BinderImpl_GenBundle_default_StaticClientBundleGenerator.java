package com.medassets.report.client.flex;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class FlexGlobalSettingsPanel_BinderImpl_GenBundle_default_StaticClientBundleGenerator implements com.medassets.report.client.flex.FlexGlobalSettingsPanel_BinderImpl_GenBundle {
  private static FlexGlobalSettingsPanel_BinderImpl_GenBundle_default_StaticClientBundleGenerator _instance0 = new FlexGlobalSettingsPanel_BinderImpl_GenBundle_default_StaticClientBundleGenerator();
  private void styleInitializer() {
    style = new com.medassets.report.client.flex.FlexGlobalSettingsPanel_BinderImpl_GenCss_style() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? (("body{font-family:" + ("Arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("9pt")  + ";color:" + ("black")  + ";margin:" + ("0")  + ";border:" + ("0")  + ";padding:" + ("0")  + ";background:" + ("#fff")  + ";direction:" + ("rtl")  + ";}table td,select{font-family:" + ("Arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("9pt")  + ";}.GDCSE03CCHB{border:") + (("1px"+ " " +"solid"+ " " +"#2291c8")  + ";}.GDCSE03CFHB{background:" + ("#fff"+ " " +"url(headerTitleBG.png)"+ " " +"repeat-x")  + ";color:" + ("#fff")  + ";margin-top:" + ("5px")  + ";margin-right:" + ("5px")  + ";margin-left:" + ("5px")  + ";padding-right:" + ("5px")  + ";padding-top:" + ("4px")  + ";height:" + ("22px")  + ";vertical-align:" + ("middle")  + ";font-size:" + ("10pt") ) + (";}.GDCSE03CEHB{margin-top:" + ("1px")  + ";margin-right:" + ("5px")  + ";margin-bottom:" + ("5px")  + ";margin-left:" + ("5px")  + ";}.GDCSE03CGHB{border-top:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";vertical-align:" + ("middle")  + ";padding:" + ("0")  + ";margin:" + ("0")  + ";spacing:" + ("0")  + ";text-align:" + ("left")  + ";}.GDCSE03CIHB{vertical-align:") + (("middle")  + ";padding:" + ("0")  + ";margin:" + ("0")  + ";spacing:" + ("0")  + ";text-align:" + ("left")  + ";}.GDCSE03CHFB{margin:" + ("0")  + ";padding:" + ("5px")  + ";text-align:" + ("left")  + ";background-color:" + ("#fff")  + ";font-size:" + ("smaller")  + ";}.GDCSE03CAHB{font-weight:" + ("bold") ) + (";font-size:" + ("large")  + ";font-family:" + ("helvetica")  + ";margin-right:" + ("0")  + ";padding:" + ("10px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";background-color:" + ("#fff")  + ";}.GDCSE03CBHB{text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03CFIB{padding:" + ("0")  + ";border:") + (("1px"+ " " +"solid"+ " " +"#2291c8")  + ";background-color:" + ("#fff")  + ";}.GDCSE03CDHB{width:" + ("100%")  + ";padding:" + ("10px")  + ";}.GDCSE03CJHB{background-color:" + ("#e0e0e0")  + ";color:" + ("#000")  + ";padding-right:" + ("5px")  + ";font-weight:" + ("bold")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";}.GDCSE03CHHB{background:" + ("#fff"+ " " +"url(zoom.png)"+ " " +"no-repeat"+ " " +"3px")  + ";padding:" + ("3px"+ " " +"24px"+ " " +"3px"+ " " +"3px") ) + (";border:" + ("1px"+ " " +"solid"+ " " +"#7f9db9")  + ";margin:" + ("5px")  + ";float:" + ("left")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03CGHB{padding:" + ("0")  + ";margin:" + ("0")  + ";text-align:" + ("center")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03CPHB{background:" + ("#e1e1e1")  + ";vertical-align:" + ("middle")  + ";border-bottom:") + (("1px"+ " " +"solid"+ " " +"#000")  + ";white-space:" + ("nowrap")  + ";}.GDCSE03COHB{display:" + ("inline")  + ";margin-top:" + ("8px")  + ";margin-right:" + ("5px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";float:" + ("right")  + ";}.GDCSE03CEIB{background:" + ("#e1e1e1")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#000") ) + (";}.GDCSE03CDIB{width:" + ("100%")  + ";margin-top:" + ("8px")  + ";margin-right:" + ("5px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";}.GDCSE03CBIB{margin-top:" + ("8px")  + ";margin-right:" + ("5px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";white-space:") + (("nowrap")  + ";}.GDCSE03CCIB{text-decoration:" + ("underline")  + ";margin-right:" + ("5px")  + ";margin-left:" + ("5px")  + ";cursor:" + ("hand")  + ";}.GDCSE03CAIB{border-top:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";}.GDCSE03CKHB{padding:" + ("0"+ " " +"5px"+ " " +"0"+ " " +"5px")  + ";margin:" + ("0"+ " " +"0"+ " " +"0"+ " " +"0")  + ";width:" + ("auto")  + " !important;overflow:" + ("visible")  + ";}.GDCSE03CLHB{padding:" + ("4px"+ " " +"8px") ) + (";background:" + ("#eee")  + ";vertical-align:" + ("baseline")  + ";border-top-right-radius:" + ("4px")  + ";border-bottom-right-radius:" + ("4px")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";}.GDCSE03CMHB{padding:" + ("4px"+ " " +"8px")  + ";background:" + ("#eee")  + ";vertical-align:") + (("baseline")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-left:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-right-width:" + ("0")  + ";}.GDCSE03CNHB{padding:" + ("4px"+ " " +"8px")  + ";background:" + ("#eee")  + ";vertical-align:" + ("baseline") ) + (";-moz-border-radius:" + ("0")  + ";-webkit-border-radius:" + ("0")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border-left:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-right-width:" + ("0")  + ";}.GDCSE03CGFB{padding:" + ("10px")  + ";text-align:") + (("right")  + ";float:" + ("right")  + ";}.GDCSE03CEFB{float:" + ("right")  + ";text-align:" + ("right")  + ";padding:" + ("10px")  + ";white-space:" + ("nowrap")  + ";}.GDCSE03CFFB{float:" + ("right")  + ";text-align:" + ("right")  + ";padding:" + ("5px")  + ";white-space:" + ("nowrap")  + ";}.GDCSE03CLFB{padding:" + ("5px") ) + (";padding-top:" + ("5px")  + ";text-align:" + ("right")  + ";width:" + ("300px")  + ";}.GDCSE03CMFB{padding:" + ("5px")  + ";padding-top:" + ("8px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("top")  + ";width:" + ("300px")  + ";}.GDCSE03CBGB{padding:" + ("5px")  + ";width:" + ("600px")  + ";vertical-align:") + (("top")  + ";}.GDCSE03CNFB{padding:" + ("7px")  + ";text-align:" + ("right")  + ";width:" + ("200px")  + ";}.GDCSE03COFB{padding:" + ("7px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("top")  + ";width:" + ("200px")  + ";}.GDCSE03CCGB{width:" + ("300px")  + ";vertical-align:" + ("top")  + ";text-align:" + ("right") ) + (";}.GDCSE03CPFB{padding:" + ("7px")  + ";text-align:" + ("right")  + ";width:" + ("300px")  + ";}.GDCSE03CAGB{padding:" + ("7px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("top")  + ";width:" + ("300px")  + ";}.GDCSE03CJFB{font-weight:" + ("bold")  + ";padding:" + ("7px")  + ";padding-top:" + ("20px")  + ";padding-bottom:") + (("10px")  + ";}.GDCSE03CFGB,.GDCSE03CGGB{background-color:" + ("#fff")  + ";}.GDCSE03CNGB .GDCSE03COGB{padding:" + ("0")  + ";margin:" + ("0")  + ";white-space:" + ("nowrap")  + ";cursor:" + ("hand")  + ";cursor:" + ("pointer")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03CNGB .GDCSE03CPGB{background:" + ("#3f8dd1")  + ";color:" + ("white")  + ";height:" + ("auto") ) + (";padding:" + ("0")  + ";margin:" + ("0")  + ";white-space:" + ("nowrap")  + ";cursor:" + ("hand")  + ";cursor:" + ("pointer")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03CEGB .GDCSE03CCFB{font-weight:" + ("bold")  + ";}a,a:visited,a:hover{color:" + ("#004785")  + ";}")) : (("body{font-family:" + ("Arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("9pt")  + ";color:" + ("black")  + ";margin:" + ("0")  + ";border:" + ("0")  + ";padding:" + ("0")  + ";background:" + ("#fff")  + ";direction:" + ("ltr")  + ";}table td,select{font-family:" + ("Arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("9pt")  + ";}.GDCSE03CCHB{border:") + (("1px"+ " " +"solid"+ " " +"#2291c8")  + ";}.GDCSE03CFHB{background:" + ("#fff"+ " " +"url(headerTitleBG.png)"+ " " +"repeat-x")  + ";color:" + ("#fff")  + ";margin-top:" + ("5px")  + ";margin-left:" + ("5px")  + ";margin-right:" + ("5px")  + ";padding-left:" + ("5px")  + ";padding-top:" + ("4px")  + ";height:" + ("22px")  + ";vertical-align:" + ("middle")  + ";font-size:" + ("10pt") ) + (";}.GDCSE03CEHB{margin-top:" + ("1px")  + ";margin-left:" + ("5px")  + ";margin-bottom:" + ("5px")  + ";margin-right:" + ("5px")  + ";}.GDCSE03CGHB{border-top:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";vertical-align:" + ("middle")  + ";padding:" + ("0")  + ";margin:" + ("0")  + ";spacing:" + ("0")  + ";text-align:" + ("right")  + ";}.GDCSE03CIHB{vertical-align:") + (("middle")  + ";padding:" + ("0")  + ";margin:" + ("0")  + ";spacing:" + ("0")  + ";text-align:" + ("right")  + ";}.GDCSE03CHFB{margin:" + ("0")  + ";padding:" + ("5px")  + ";text-align:" + ("right")  + ";background-color:" + ("#fff")  + ";font-size:" + ("smaller")  + ";}.GDCSE03CAHB{font-weight:" + ("bold") ) + (";font-size:" + ("large")  + ";font-family:" + ("helvetica")  + ";margin-left:" + ("0")  + ";padding:" + ("10px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";background-color:" + ("#fff")  + ";}.GDCSE03CBHB{text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03CFIB{padding:" + ("0")  + ";border:") + (("1px"+ " " +"solid"+ " " +"#2291c8")  + ";background-color:" + ("#fff")  + ";}.GDCSE03CDHB{width:" + ("100%")  + ";padding:" + ("10px")  + ";}.GDCSE03CJHB{background-color:" + ("#e0e0e0")  + ";color:" + ("#000")  + ";padding-left:" + ("5px")  + ";font-weight:" + ("bold")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";}.GDCSE03CHHB{background:" + ("#fff"+ " " +"url(zoom.png)"+ " " +"no-repeat"+ " " +"3px")  + ";padding:" + ("3px"+ " " +"3px"+ " " +"3px"+ " " +"24px") ) + (";border:" + ("1px"+ " " +"solid"+ " " +"#7f9db9")  + ";margin:" + ("5px")  + ";float:" + ("right")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03CGHB{padding:" + ("0")  + ";margin:" + ("0")  + ";text-align:" + ("center")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03CPHB{background:" + ("#e1e1e1")  + ";vertical-align:" + ("middle")  + ";border-bottom:") + (("1px"+ " " +"solid"+ " " +"#000")  + ";white-space:" + ("nowrap")  + ";}.GDCSE03COHB{display:" + ("inline")  + ";margin-top:" + ("8px")  + ";margin-left:" + ("5px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";float:" + ("left")  + ";}.GDCSE03CEIB{background:" + ("#e1e1e1")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#000") ) + (";}.GDCSE03CDIB{width:" + ("100%")  + ";margin-top:" + ("8px")  + ";margin-left:" + ("5px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";}.GDCSE03CBIB{margin-top:" + ("8px")  + ";margin-left:" + ("5px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";white-space:") + (("nowrap")  + ";}.GDCSE03CCIB{text-decoration:" + ("underline")  + ";margin-left:" + ("5px")  + ";margin-right:" + ("5px")  + ";cursor:" + ("hand")  + ";}.GDCSE03CAIB{border-top:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";}.GDCSE03CKHB{padding:" + ("0"+ " " +"5px"+ " " +"0"+ " " +"5px")  + ";margin:" + ("0"+ " " +"0"+ " " +"0"+ " " +"0")  + ";width:" + ("auto")  + " !important;overflow:" + ("visible")  + ";}.GDCSE03CLHB{padding:" + ("4px"+ " " +"8px") ) + (";background:" + ("#eee")  + ";vertical-align:" + ("baseline")  + ";border-top-left-radius:" + ("4px")  + ";border-bottom-left-radius:" + ("4px")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";}.GDCSE03CMHB{padding:" + ("4px"+ " " +"8px")  + ";background:" + ("#eee")  + ";vertical-align:") + (("baseline")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-right:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-left-width:" + ("0")  + ";}.GDCSE03CNHB{padding:" + ("4px"+ " " +"8px")  + ";background:" + ("#eee")  + ";vertical-align:" + ("baseline") ) + (";-moz-border-radius:" + ("0")  + ";-webkit-border-radius:" + ("0")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border-right:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-left-width:" + ("0")  + ";}.GDCSE03CGFB{padding:" + ("10px")  + ";text-align:") + (("left")  + ";float:" + ("left")  + ";}.GDCSE03CEFB{float:" + ("left")  + ";text-align:" + ("left")  + ";padding:" + ("10px")  + ";white-space:" + ("nowrap")  + ";}.GDCSE03CFFB{float:" + ("left")  + ";text-align:" + ("left")  + ";padding:" + ("5px")  + ";white-space:" + ("nowrap")  + ";}.GDCSE03CLFB{padding:" + ("5px") ) + (";padding-top:" + ("5px")  + ";text-align:" + ("left")  + ";width:" + ("300px")  + ";}.GDCSE03CMFB{padding:" + ("5px")  + ";padding-top:" + ("8px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("top")  + ";width:" + ("300px")  + ";}.GDCSE03CBGB{padding:" + ("5px")  + ";width:" + ("600px")  + ";vertical-align:") + (("top")  + ";}.GDCSE03CNFB{padding:" + ("7px")  + ";text-align:" + ("left")  + ";width:" + ("200px")  + ";}.GDCSE03COFB{padding:" + ("7px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("top")  + ";width:" + ("200px")  + ";}.GDCSE03CCGB{width:" + ("300px")  + ";vertical-align:" + ("top")  + ";text-align:" + ("left") ) + (";}.GDCSE03CPFB{padding:" + ("7px")  + ";text-align:" + ("left")  + ";width:" + ("300px")  + ";}.GDCSE03CAGB{padding:" + ("7px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("top")  + ";width:" + ("300px")  + ";}.GDCSE03CJFB{font-weight:" + ("bold")  + ";padding:" + ("7px")  + ";padding-top:" + ("20px")  + ";padding-bottom:") + (("10px")  + ";}.GDCSE03CFGB,.GDCSE03CGGB{background-color:" + ("#fff")  + ";}.GDCSE03CNGB .GDCSE03COGB{padding:" + ("0")  + ";margin:" + ("0")  + ";white-space:" + ("nowrap")  + ";cursor:" + ("hand")  + ";cursor:" + ("pointer")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03CNGB .GDCSE03CPGB{background:" + ("#3f8dd1")  + ";color:" + ("white")  + ";height:" + ("auto") ) + (";padding:" + ("0")  + ";margin:" + ("0")  + ";white-space:" + ("nowrap")  + ";cursor:" + ("hand")  + ";cursor:" + ("pointer")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03CEGB .GDCSE03CCFB{font-weight:" + ("bold")  + ";}a,a:visited,a:hover{color:" + ("#004785")  + ";}"));
      }
      public java.lang.String Caption(){
        return "GDCSE03CCFB";
      }
      public java.lang.String bottomBorder(){
        return "GDCSE03CDFB";
      }
      public java.lang.String dialogButtonPanel(){
        return "GDCSE03CEFB";
      }
      public java.lang.String dialogButtonPanel2(){
        return "GDCSE03CFFB";
      }
      public java.lang.String dialogForm(){
        return "GDCSE03CGFB";
      }
      public java.lang.String footerPanel(){
        return "GDCSE03CHFB";
      }
      public java.lang.String formPanel(){
        return "GDCSE03CIFB";
      }
      public java.lang.String formSectionLabel(){
        return "GDCSE03CJFB";
      }
      public java.lang.String formTable(){
        return "GDCSE03CKFB";
      }
      public java.lang.String formTableCell0(){
        return "GDCSE03CLFB";
      }
      public java.lang.String formTableCell0ListBox(){
        return "GDCSE03CMFB";
      }
      public java.lang.String formTableCell0a(){
        return "GDCSE03CNFB";
      }
      public java.lang.String formTableCell0aListBox(){
        return "GDCSE03COFB";
      }
      public java.lang.String formTableCell0b(){
        return "GDCSE03CPFB";
      }
      public java.lang.String formTableCell0bListBox(){
        return "GDCSE03CAGB";
      }
      public java.lang.String formTableCell1(){
        return "GDCSE03CBGB";
      }
      public java.lang.String formTableCell1a(){
        return "GDCSE03CCGB";
      }
      public java.lang.String gwtButton(){
        return "GDCSE03CDGB";
      }
      public java.lang.String gwtDialogBox(){
        return "GDCSE03CEGB";
      }
      public java.lang.String gwtSplitLayoutPanelHDragger(){
        return "GDCSE03CFGB";
      }
      public java.lang.String gwtSplitLayoutPanelVDragger(){
        return "GDCSE03CGGB";
      }
      public java.lang.String gwtToggleButtonDown(){
        return "GDCSE03CHGB";
      }
      public java.lang.String gwtToggleButtonDownDisabled(){
        return "GDCSE03CIGB";
      }
      public java.lang.String gwtToggleButtonDownHovering(){
        return "GDCSE03CJGB";
      }
      public java.lang.String gwtToggleButtonUp(){
        return "GDCSE03CKGB";
      }
      public java.lang.String gwtToggleButtonUpDisabled(){
        return "GDCSE03CLGB";
      }
      public java.lang.String gwtToggleButtonUpHovering(){
        return "GDCSE03CMGB";
      }
      public java.lang.String gwtTree(){
        return "GDCSE03CNGB";
      }
      public java.lang.String gwtTreeItem(){
        return "GDCSE03COGB";
      }
      public java.lang.String gwtTreeItemSelected(){
        return "GDCSE03CPGB";
      }
      public java.lang.String headerPanel1(){
        return "GDCSE03CAHB";
      }
      public java.lang.String headerPanel2(){
        return "GDCSE03CBHB";
      }
      public java.lang.String mainPanel(){
        return "GDCSE03CCHB";
      }
      public java.lang.String messageList(){
        return "GDCSE03CDHB";
      }
      public java.lang.String pageContent(){
        return "GDCSE03CEHB";
      }
      public java.lang.String pageHeader(){
        return "GDCSE03CFHB";
      }
      public java.lang.String pagerPanel(){
        return "GDCSE03CGHB";
      }
      public java.lang.String searchText(){
        return "GDCSE03CHHB";
      }
      public java.lang.String simplePager(){
        return "GDCSE03CIHB";
      }
      public java.lang.String titleBar(){
        return "GDCSE03CJHB";
      }
      public java.lang.String toolbarButton(){
        return "GDCSE03CKHB";
      }
      public java.lang.String toolbarButton2a(){
        return "GDCSE03CLHB";
      }
      public java.lang.String toolbarButton2b(){
        return "GDCSE03CMHB";
      }
      public java.lang.String toolbarButton2c(){
        return "GDCSE03CNHB";
      }
      public java.lang.String toolbarButtonPanel(){
        return "GDCSE03COHB";
      }
      public java.lang.String toolbarPanel(){
        return "GDCSE03CPHB";
      }
      public java.lang.String topBorder(){
        return "GDCSE03CAIB";
      }
      public java.lang.String treeButtonPanel(){
        return "GDCSE03CBIB";
      }
      public java.lang.String treeLinks(){
        return "GDCSE03CCIB";
      }
      public java.lang.String treeToolbarButtonPanel(){
        return "GDCSE03CDIB";
      }
      public java.lang.String treeToolbarPanel(){
        return "GDCSE03CEIB";
      }
      public java.lang.String westPanel(){
        return "GDCSE03CFIB";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.medassets.report.client.flex.FlexGlobalSettingsPanel_BinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.medassets.report.client.flex.FlexGlobalSettingsPanel_BinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.medassets.report.client.flex.FlexGlobalSettingsPanel_BinderImpl_GenCss_style style;
  
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
      case 'style': return this.@com.medassets.report.client.flex.FlexGlobalSettingsPanel_BinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
