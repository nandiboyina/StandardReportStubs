package com.medassets.report.client.standard;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class StandardReportDialog_StandardReportDialogUiBinderImpl_GenBundle_default_StaticClientBundleGenerator implements com.medassets.report.client.standard.StandardReportDialog_StandardReportDialogUiBinderImpl_GenBundle {
  private static StandardReportDialog_StandardReportDialogUiBinderImpl_GenBundle_default_StaticClientBundleGenerator _instance0 = new StandardReportDialog_StandardReportDialogUiBinderImpl_GenBundle_default_StaticClientBundleGenerator();
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? (("body{font-family:" + ("Arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("9pt")  + ";color:" + ("black")  + ";margin:" + ("0")  + ";border:" + ("0")  + ";padding:" + ("0")  + ";background:" + ("#fff")  + ";direction:" + ("rtl")  + ";}table td,select{font-family:" + ("Arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("9pt")  + ";}.GDCSE03CKAB{border:") + (("1px"+ " " +"solid"+ " " +"#2291c8")  + ";}.GDCSE03CNAB{background:" + ("#fff"+ " " +"url(headerTitleBG.png)"+ " " +"repeat-x")  + ";color:" + ("#fff")  + ";margin-top:" + ("5px")  + ";margin-right:" + ("5px")  + ";margin-left:" + ("5px")  + ";padding-right:" + ("5px")  + ";padding-top:" + ("4px")  + ";height:" + ("22px")  + ";vertical-align:" + ("middle")  + ";font-size:" + ("10pt") ) + (";}.GDCSE03CMAB{margin-top:" + ("1px")  + ";margin-right:" + ("5px")  + ";margin-bottom:" + ("5px")  + ";margin-left:" + ("5px")  + ";}.GDCSE03COAB{border-top:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";vertical-align:" + ("middle")  + ";padding:" + ("0")  + ";margin:" + ("0")  + ";spacing:" + ("0")  + ";text-align:" + ("left")  + ";}.GDCSE03CABB{vertical-align:") + (("middle")  + ";padding:" + ("0")  + ";margin:" + ("0")  + ";spacing:" + ("0")  + ";text-align:" + ("left")  + ";}.GDCSE03CP4{margin:" + ("0")  + ";padding:" + ("5px")  + ";text-align:" + ("left")  + ";background-color:" + ("#fff")  + ";font-size:" + ("smaller")  + ";}.GDCSE03CIAB{font-weight:" + ("bold") ) + (";font-size:" + ("large")  + ";font-family:" + ("helvetica")  + ";margin-right:" + ("0")  + ";padding:" + ("10px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";background-color:" + ("#fff")  + ";}.GDCSE03CJAB{text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03CNBB{padding:" + ("0")  + ";border:") + (("1px"+ " " +"solid"+ " " +"#2291c8")  + ";background-color:" + ("#fff")  + ";}.GDCSE03CLAB{width:" + ("100%")  + ";padding:" + ("10px")  + ";}.GDCSE03CBBB{background-color:" + ("#e0e0e0")  + ";color:" + ("#000")  + ";padding-right:" + ("5px")  + ";font-weight:" + ("bold")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";}.GDCSE03CPAB{background:" + ("#fff"+ " " +"url(zoom.png)"+ " " +"no-repeat"+ " " +"3px")  + ";padding:" + ("3px"+ " " +"24px"+ " " +"3px"+ " " +"3px") ) + (";border:" + ("1px"+ " " +"solid"+ " " +"#7f9db9")  + ";margin:" + ("5px")  + ";float:" + ("left")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03COAB{padding:" + ("0")  + ";margin:" + ("0")  + ";text-align:" + ("center")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03CHBB{background:" + ("#e1e1e1")  + ";vertical-align:" + ("middle")  + ";border-bottom:") + (("1px"+ " " +"solid"+ " " +"#000")  + ";white-space:" + ("nowrap")  + ";}.GDCSE03CGBB{display:" + ("inline")  + ";margin-top:" + ("8px")  + ";margin-right:" + ("5px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";float:" + ("right")  + ";}.GDCSE03CMBB{background:" + ("#e1e1e1")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#000") ) + (";}.GDCSE03CLBB{width:" + ("100%")  + ";margin-top:" + ("8px")  + ";margin-right:" + ("5px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";}.GDCSE03CJBB{margin-top:" + ("8px")  + ";margin-right:" + ("5px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("middle")  + ";white-space:") + (("nowrap")  + ";}.GDCSE03CKBB{text-decoration:" + ("underline")  + ";margin-right:" + ("5px")  + ";margin-left:" + ("5px")  + ";cursor:" + ("hand")  + ";}.GDCSE03CIBB{border-top:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";}.GDCSE03CCBB{padding:" + ("0"+ " " +"5px"+ " " +"0"+ " " +"5px")  + ";margin:" + ("0"+ " " +"0"+ " " +"0"+ " " +"0")  + ";width:" + ("auto")  + " !important;overflow:" + ("visible")  + ";}.GDCSE03CDBB{padding:" + ("4px"+ " " +"8px") ) + (";background:" + ("#eee")  + ";vertical-align:" + ("baseline")  + ";border-top-right-radius:" + ("4px")  + ";border-bottom-right-radius:" + ("4px")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";}.GDCSE03CEBB{padding:" + ("4px"+ " " +"8px")  + ";background:" + ("#eee")  + ";vertical-align:") + (("baseline")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-left:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-right-width:" + ("0")  + ";}.GDCSE03CFBB{padding:" + ("4px"+ " " +"8px")  + ";background:" + ("#eee")  + ";vertical-align:" + ("baseline") ) + (";-moz-border-radius:" + ("0")  + ";-webkit-border-radius:" + ("0")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border-left:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-right-width:" + ("0")  + ";}.GDCSE03CO4{padding:" + ("10px")  + ";text-align:") + (("right")  + ";float:" + ("right")  + ";}.GDCSE03CM4{float:" + ("right")  + ";text-align:" + ("right")  + ";padding:" + ("10px")  + ";white-space:" + ("nowrap")  + ";}.GDCSE03CN4{float:" + ("right")  + ";text-align:" + ("right")  + ";padding:" + ("5px")  + ";white-space:" + ("nowrap")  + ";}.GDCSE03CD5{padding:" + ("5px") ) + (";padding-top:" + ("5px")  + ";text-align:" + ("right")  + ";width:" + ("300px")  + ";}.GDCSE03CE5{padding:" + ("5px")  + ";padding-top:" + ("8px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("top")  + ";width:" + ("300px")  + ";}.GDCSE03CJ5{padding:" + ("5px")  + ";width:" + ("600px")  + ";vertical-align:") + (("top")  + ";}.GDCSE03CF5{padding:" + ("7px")  + ";text-align:" + ("right")  + ";width:" + ("200px")  + ";}.GDCSE03CG5{padding:" + ("7px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("top")  + ";width:" + ("200px")  + ";}.GDCSE03CK5{width:" + ("300px")  + ";vertical-align:" + ("top")  + ";text-align:" + ("right") ) + (";}.GDCSE03CH5{padding:" + ("7px")  + ";text-align:" + ("right")  + ";width:" + ("300px")  + ";}.GDCSE03CI5{padding:" + ("7px")  + ";text-align:" + ("right")  + ";vertical-align:" + ("top")  + ";width:" + ("300px")  + ";}.GDCSE03CB5{font-weight:" + ("bold")  + ";padding:" + ("7px")  + ";padding-top:" + ("20px")  + ";padding-bottom:") + (("10px")  + ";}.GDCSE03CN5,.GDCSE03CO5{background-color:" + ("#fff")  + ";}.GDCSE03CFAB .GDCSE03CGAB{padding:" + ("0")  + ";margin:" + ("0")  + ";white-space:" + ("nowrap")  + ";cursor:" + ("hand")  + ";cursor:" + ("pointer")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03CFAB .GDCSE03CHAB{background:" + ("#3f8dd1")  + ";color:" + ("white")  + ";height:" + ("auto") ) + (";padding:" + ("0")  + ";margin:" + ("0")  + ";white-space:" + ("nowrap")  + ";cursor:" + ("hand")  + ";cursor:" + ("pointer")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03CM5 .GDCSE03CK4{font-weight:" + ("bold")  + ";}a,a:visited,a:hover{color:" + ("#004785")  + ";}")) : (("body{font-family:" + ("Arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("9pt")  + ";color:" + ("black")  + ";margin:" + ("0")  + ";border:" + ("0")  + ";padding:" + ("0")  + ";background:" + ("#fff")  + ";direction:" + ("ltr")  + ";}table td,select{font-family:" + ("Arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("9pt")  + ";}.GDCSE03CKAB{border:") + (("1px"+ " " +"solid"+ " " +"#2291c8")  + ";}.GDCSE03CNAB{background:" + ("#fff"+ " " +"url(headerTitleBG.png)"+ " " +"repeat-x")  + ";color:" + ("#fff")  + ";margin-top:" + ("5px")  + ";margin-left:" + ("5px")  + ";margin-right:" + ("5px")  + ";padding-left:" + ("5px")  + ";padding-top:" + ("4px")  + ";height:" + ("22px")  + ";vertical-align:" + ("middle")  + ";font-size:" + ("10pt") ) + (";}.GDCSE03CMAB{margin-top:" + ("1px")  + ";margin-left:" + ("5px")  + ";margin-bottom:" + ("5px")  + ";margin-right:" + ("5px")  + ";}.GDCSE03COAB{border-top:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";vertical-align:" + ("middle")  + ";padding:" + ("0")  + ";margin:" + ("0")  + ";spacing:" + ("0")  + ";text-align:" + ("right")  + ";}.GDCSE03CABB{vertical-align:") + (("middle")  + ";padding:" + ("0")  + ";margin:" + ("0")  + ";spacing:" + ("0")  + ";text-align:" + ("right")  + ";}.GDCSE03CP4{margin:" + ("0")  + ";padding:" + ("5px")  + ";text-align:" + ("right")  + ";background-color:" + ("#fff")  + ";font-size:" + ("smaller")  + ";}.GDCSE03CIAB{font-weight:" + ("bold") ) + (";font-size:" + ("large")  + ";font-family:" + ("helvetica")  + ";margin-left:" + ("0")  + ";padding:" + ("10px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";background-color:" + ("#fff")  + ";}.GDCSE03CJAB{text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03CNBB{padding:" + ("0")  + ";border:") + (("1px"+ " " +"solid"+ " " +"#2291c8")  + ";background-color:" + ("#fff")  + ";}.GDCSE03CLAB{width:" + ("100%")  + ";padding:" + ("10px")  + ";}.GDCSE03CBBB{background-color:" + ("#e0e0e0")  + ";color:" + ("#000")  + ";padding-left:" + ("5px")  + ";font-weight:" + ("bold")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";}.GDCSE03CPAB{background:" + ("#fff"+ " " +"url(zoom.png)"+ " " +"no-repeat"+ " " +"3px")  + ";padding:" + ("3px"+ " " +"3px"+ " " +"3px"+ " " +"24px") ) + (";border:" + ("1px"+ " " +"solid"+ " " +"#7f9db9")  + ";margin:" + ("5px")  + ";float:" + ("right")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03COAB{padding:" + ("0")  + ";margin:" + ("0")  + ";text-align:" + ("center")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03CHBB{background:" + ("#e1e1e1")  + ";vertical-align:" + ("middle")  + ";border-bottom:") + (("1px"+ " " +"solid"+ " " +"#000")  + ";white-space:" + ("nowrap")  + ";}.GDCSE03CGBB{display:" + ("inline")  + ";margin-top:" + ("8px")  + ";margin-left:" + ("5px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";float:" + ("left")  + ";}.GDCSE03CMBB{background:" + ("#e1e1e1")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#000") ) + (";}.GDCSE03CLBB{width:" + ("100%")  + ";margin-top:" + ("8px")  + ";margin-left:" + ("5px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";white-space:" + ("nowrap")  + ";}.GDCSE03CJBB{margin-top:" + ("8px")  + ";margin-left:" + ("5px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("middle")  + ";white-space:") + (("nowrap")  + ";}.GDCSE03CKBB{text-decoration:" + ("underline")  + ";margin-left:" + ("5px")  + ";margin-right:" + ("5px")  + ";cursor:" + ("hand")  + ";}.GDCSE03CIBB{border-top:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";}.GDCSE03CCBB{padding:" + ("0"+ " " +"5px"+ " " +"0"+ " " +"5px")  + ";margin:" + ("0"+ " " +"0"+ " " +"0"+ " " +"0")  + ";width:" + ("auto")  + " !important;overflow:" + ("visible")  + ";}.GDCSE03CDBB{padding:" + ("4px"+ " " +"8px") ) + (";background:" + ("#eee")  + ";vertical-align:" + ("baseline")  + ";border-top-left-radius:" + ("4px")  + ";border-bottom-left-radius:" + ("4px")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";}.GDCSE03CEBB{padding:" + ("4px"+ " " +"8px")  + ";background:" + ("#eee")  + ";vertical-align:") + (("baseline")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-right:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-left-width:" + ("0")  + ";}.GDCSE03CFBB{padding:" + ("4px"+ " " +"8px")  + ";background:" + ("#eee")  + ";vertical-align:" + ("baseline") ) + (";-moz-border-radius:" + ("0")  + ";-webkit-border-radius:" + ("0")  + ";margin:" + ("0")  + ";cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";border-right:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-top:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#ccc")  + ";border-left-width:" + ("0")  + ";}.GDCSE03CO4{padding:" + ("10px")  + ";text-align:") + (("left")  + ";float:" + ("left")  + ";}.GDCSE03CM4{float:" + ("left")  + ";text-align:" + ("left")  + ";padding:" + ("10px")  + ";white-space:" + ("nowrap")  + ";}.GDCSE03CN4{float:" + ("left")  + ";text-align:" + ("left")  + ";padding:" + ("5px")  + ";white-space:" + ("nowrap")  + ";}.GDCSE03CD5{padding:" + ("5px") ) + (";padding-top:" + ("5px")  + ";text-align:" + ("left")  + ";width:" + ("300px")  + ";}.GDCSE03CE5{padding:" + ("5px")  + ";padding-top:" + ("8px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("top")  + ";width:" + ("300px")  + ";}.GDCSE03CJ5{padding:" + ("5px")  + ";width:" + ("600px")  + ";vertical-align:") + (("top")  + ";}.GDCSE03CF5{padding:" + ("7px")  + ";text-align:" + ("left")  + ";width:" + ("200px")  + ";}.GDCSE03CG5{padding:" + ("7px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("top")  + ";width:" + ("200px")  + ";}.GDCSE03CK5{width:" + ("300px")  + ";vertical-align:" + ("top")  + ";text-align:" + ("left") ) + (";}.GDCSE03CH5{padding:" + ("7px")  + ";text-align:" + ("left")  + ";width:" + ("300px")  + ";}.GDCSE03CI5{padding:" + ("7px")  + ";text-align:" + ("left")  + ";vertical-align:" + ("top")  + ";width:" + ("300px")  + ";}.GDCSE03CB5{font-weight:" + ("bold")  + ";padding:" + ("7px")  + ";padding-top:" + ("20px")  + ";padding-bottom:") + (("10px")  + ";}.GDCSE03CN5,.GDCSE03CO5{background-color:" + ("#fff")  + ";}.GDCSE03CFAB .GDCSE03CGAB{padding:" + ("0")  + ";margin:" + ("0")  + ";white-space:" + ("nowrap")  + ";cursor:" + ("hand")  + ";cursor:" + ("pointer")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03CFAB .GDCSE03CHAB{background:" + ("#3f8dd1")  + ";color:" + ("white")  + ";height:" + ("auto") ) + (";padding:" + ("0")  + ";margin:" + ("0")  + ";white-space:" + ("nowrap")  + ";cursor:" + ("hand")  + ";cursor:" + ("pointer")  + ";vertical-align:" + ("middle")  + ";}.GDCSE03CM5 .GDCSE03CK4{font-weight:" + ("bold")  + ";}a,a:visited,a:hover{color:" + ("#004785")  + ";}"));
      }
      public java.lang.String Caption(){
        return "GDCSE03CK4";
      }
      public java.lang.String bottomBorder(){
        return "GDCSE03CL4";
      }
      public java.lang.String dialogButtonPanel(){
        return "GDCSE03CM4";
      }
      public java.lang.String dialogButtonPanel2(){
        return "GDCSE03CN4";
      }
      public java.lang.String dialogForm(){
        return "GDCSE03CO4";
      }
      public java.lang.String footerPanel(){
        return "GDCSE03CP4";
      }
      public java.lang.String formPanel(){
        return "GDCSE03CA5";
      }
      public java.lang.String formSectionLabel(){
        return "GDCSE03CB5";
      }
      public java.lang.String formTable(){
        return "GDCSE03CC5";
      }
      public java.lang.String formTableCell0(){
        return "GDCSE03CD5";
      }
      public java.lang.String formTableCell0ListBox(){
        return "GDCSE03CE5";
      }
      public java.lang.String formTableCell0a(){
        return "GDCSE03CF5";
      }
      public java.lang.String formTableCell0aListBox(){
        return "GDCSE03CG5";
      }
      public java.lang.String formTableCell0b(){
        return "GDCSE03CH5";
      }
      public java.lang.String formTableCell0bListBox(){
        return "GDCSE03CI5";
      }
      public java.lang.String formTableCell1(){
        return "GDCSE03CJ5";
      }
      public java.lang.String formTableCell1a(){
        return "GDCSE03CK5";
      }
      public java.lang.String gwtButton(){
        return "GDCSE03CL5";
      }
      public java.lang.String gwtDialogBox(){
        return "GDCSE03CM5";
      }
      public java.lang.String gwtSplitLayoutPanelHDragger(){
        return "GDCSE03CN5";
      }
      public java.lang.String gwtSplitLayoutPanelVDragger(){
        return "GDCSE03CO5";
      }
      public java.lang.String gwtToggleButtonDown(){
        return "GDCSE03CP5";
      }
      public java.lang.String gwtToggleButtonDownDisabled(){
        return "GDCSE03CAAB";
      }
      public java.lang.String gwtToggleButtonDownHovering(){
        return "GDCSE03CBAB";
      }
      public java.lang.String gwtToggleButtonUp(){
        return "GDCSE03CCAB";
      }
      public java.lang.String gwtToggleButtonUpDisabled(){
        return "GDCSE03CDAB";
      }
      public java.lang.String gwtToggleButtonUpHovering(){
        return "GDCSE03CEAB";
      }
      public java.lang.String gwtTree(){
        return "GDCSE03CFAB";
      }
      public java.lang.String gwtTreeItem(){
        return "GDCSE03CGAB";
      }
      public java.lang.String gwtTreeItemSelected(){
        return "GDCSE03CHAB";
      }
      public java.lang.String headerPanel1(){
        return "GDCSE03CIAB";
      }
      public java.lang.String headerPanel2(){
        return "GDCSE03CJAB";
      }
      public java.lang.String mainPanel(){
        return "GDCSE03CKAB";
      }
      public java.lang.String messageList(){
        return "GDCSE03CLAB";
      }
      public java.lang.String pageContent(){
        return "GDCSE03CMAB";
      }
      public java.lang.String pageHeader(){
        return "GDCSE03CNAB";
      }
      public java.lang.String pagerPanel(){
        return "GDCSE03COAB";
      }
      public java.lang.String searchText(){
        return "GDCSE03CPAB";
      }
      public java.lang.String simplePager(){
        return "GDCSE03CABB";
      }
      public java.lang.String titleBar(){
        return "GDCSE03CBBB";
      }
      public java.lang.String toolbarButton(){
        return "GDCSE03CCBB";
      }
      public java.lang.String toolbarButton2a(){
        return "GDCSE03CDBB";
      }
      public java.lang.String toolbarButton2b(){
        return "GDCSE03CEBB";
      }
      public java.lang.String toolbarButton2c(){
        return "GDCSE03CFBB";
      }
      public java.lang.String toolbarButtonPanel(){
        return "GDCSE03CGBB";
      }
      public java.lang.String toolbarPanel(){
        return "GDCSE03CHBB";
      }
      public java.lang.String topBorder(){
        return "GDCSE03CIBB";
      }
      public java.lang.String treeButtonPanel(){
        return "GDCSE03CJBB";
      }
      public java.lang.String treeLinks(){
        return "GDCSE03CKBB";
      }
      public java.lang.String treeToolbarButtonPanel(){
        return "GDCSE03CLBB";
      }
      public java.lang.String treeToolbarPanel(){
        return "GDCSE03CMBB";
      }
      public java.lang.String westPanel(){
        return "GDCSE03CNBB";
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
