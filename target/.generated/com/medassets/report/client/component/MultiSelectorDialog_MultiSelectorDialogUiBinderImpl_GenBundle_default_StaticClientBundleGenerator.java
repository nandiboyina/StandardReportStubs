package com.medassets.report.client.component;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class MultiSelectorDialog_MultiSelectorDialogUiBinderImpl_GenBundle_default_StaticClientBundleGenerator implements com.medassets.report.client.component.MultiSelectorDialog_MultiSelectorDialogUiBinderImpl_GenBundle {
  private static MultiSelectorDialog_MultiSelectorDialogUiBinderImpl_GenBundle_default_StaticClientBundleGenerator _instance0 = new MultiSelectorDialog_MultiSelectorDialogUiBinderImpl_GenBundle_default_StaticClientBundleGenerator();
  private void styleInitializer() {
    style = new com.medassets.report.client.component.MultiSelectorDialog_MultiSelectorDialogUiBinderImpl_GenCss_style() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GDCSE03CMIB{border:" + ("1px"+ " " +"solid")  + ";}.GDCSE03CPIB{margin-left:" + ("20px")  + ";margin-top:" + ("40px")  + ";margin-bottom:" + ("20px")  + ";}.GDCSE03CKIB{padding-right:" + ("-30px")  + ";margin:" + ("0"+ " " +"auto")  + ";text-align:" + ("center")  + ";}.GDCSE03CAJB{padding:" + ("10px")  + ";margin-top:" + ("4px")  + ";width:" + ("40px")  + ";}.GDCSE03CNIB{margin:") + (("4px")  + ";width:" + ("70px")  + ";text-align:" + ("center")  + ";}.GDCSE03CIIB{margin-top:" + ("4px")  + ";padding:" + ("4px")  + ";}.GDCSE03COIB{margin-right:" + ("4px")  + ";}.GDCSE03CJIB{margin-top:" + ("4px")  + ";text-align:" + ("left")  + ";}.GDCSE03CLIB{margin-right:" + ("5px")  + ";}")) : ((".GDCSE03CMIB{border:" + ("1px"+ " " +"solid")  + ";}.GDCSE03CPIB{margin-right:" + ("20px")  + ";margin-top:" + ("40px")  + ";margin-bottom:" + ("20px")  + ";}.GDCSE03CKIB{padding-left:" + ("-30px")  + ";margin:" + ("0"+ " " +"auto")  + ";text-align:" + ("center")  + ";}.GDCSE03CAJB{padding:" + ("10px")  + ";margin-top:" + ("4px")  + ";width:" + ("40px")  + ";}.GDCSE03CNIB{margin:") + (("4px")  + ";width:" + ("70px")  + ";text-align:" + ("center")  + ";}.GDCSE03CIIB{margin-top:" + ("4px")  + ";padding:" + ("4px")  + ";}.GDCSE03COIB{margin-left:" + ("4px")  + ";}.GDCSE03CJIB{margin-top:" + ("4px")  + ";text-align:" + ("right")  + ";}.GDCSE03CLIB{margin-left:" + ("5px")  + ";}"));
      }
      public java.lang.String bottomPanel(){
        return "GDCSE03CIIB";
      }
      public java.lang.String buttonPanel(){
        return "GDCSE03CJIB";
      }
      public java.lang.String centerBar(){
        return "GDCSE03CKIB";
      }
      public java.lang.String html_panel(){
        return "GDCSE03CLIB";
      }
      public java.lang.String listPanels(){
        return "GDCSE03CMIB";
      }
      public java.lang.String okButton(){
        return "GDCSE03CNIB";
      }
      public java.lang.String searchBox(){
        return "GDCSE03COIB";
      }
      public java.lang.String selectAll(){
        return "GDCSE03CPIB";
      }
      public java.lang.String selectorButton(){
        return "GDCSE03CAJB";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.medassets.report.client.component.MultiSelectorDialog_MultiSelectorDialogUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.medassets.report.client.component.MultiSelectorDialog_MultiSelectorDialogUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.medassets.report.client.component.MultiSelectorDialog_MultiSelectorDialogUiBinderImpl_GenCss_style style;
  
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
      case 'style': return this.@com.medassets.report.client.component.MultiSelectorDialog_MultiSelectorDialogUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
