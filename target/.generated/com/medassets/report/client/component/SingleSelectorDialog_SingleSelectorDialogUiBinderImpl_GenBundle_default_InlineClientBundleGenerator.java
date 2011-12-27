package com.medassets.report.client.component;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class SingleSelectorDialog_SingleSelectorDialogUiBinderImpl_GenBundle_default_InlineClientBundleGenerator implements com.medassets.report.client.component.SingleSelectorDialog_SingleSelectorDialogUiBinderImpl_GenBundle {
  private static SingleSelectorDialog_SingleSelectorDialogUiBinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new SingleSelectorDialog_SingleSelectorDialogUiBinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.medassets.report.client.component.SingleSelectorDialog_SingleSelectorDialogUiBinderImpl_GenCss_style() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GDCSE03CFJB{border:" + ("1px"+ " " +"solid")  + ";}.GDCSE03CIJB{margin-left:" + ("20px")  + ";margin-top:" + ("40px")  + ";margin-bottom:" + ("20px")  + ";}.GDCSE03CDJB{padding-right:" + ("-30px")  + ";margin:" + ("0"+ " " +"auto")  + ";text-align:" + ("center")  + ";}.GDCSE03CJJB{padding:" + ("10px")  + ";margin-top:" + ("4px")  + ";width:" + ("40px")  + ";}.GDCSE03CGJB{margin:") + (("4px")  + ";width:" + ("70px")  + ";text-align:" + ("center")  + ";}.GDCSE03CBJB{margin-top:" + ("4px")  + ";padding:" + ("4px")  + ";}.GDCSE03CHJB{margin-right:" + ("4px")  + ";}.GDCSE03CCJB{margin-top:" + ("4px")  + ";text-align:" + ("left")  + ";}.GDCSE03CEJB{margin-right:" + ("5px")  + ";}")) : ((".GDCSE03CFJB{border:" + ("1px"+ " " +"solid")  + ";}.GDCSE03CIJB{margin-right:" + ("20px")  + ";margin-top:" + ("40px")  + ";margin-bottom:" + ("20px")  + ";}.GDCSE03CDJB{padding-left:" + ("-30px")  + ";margin:" + ("0"+ " " +"auto")  + ";text-align:" + ("center")  + ";}.GDCSE03CJJB{padding:" + ("10px")  + ";margin-top:" + ("4px")  + ";width:" + ("40px")  + ";}.GDCSE03CGJB{margin:") + (("4px")  + ";width:" + ("70px")  + ";text-align:" + ("center")  + ";}.GDCSE03CBJB{margin-top:" + ("4px")  + ";padding:" + ("4px")  + ";}.GDCSE03CHJB{margin-left:" + ("4px")  + ";}.GDCSE03CCJB{margin-top:" + ("4px")  + ";text-align:" + ("right")  + ";}.GDCSE03CEJB{margin-left:" + ("5px")  + ";}"));
      }
      public java.lang.String bottomPanel(){
        return "GDCSE03CBJB";
      }
      public java.lang.String buttonPanel(){
        return "GDCSE03CCJB";
      }
      public java.lang.String centerBar(){
        return "GDCSE03CDJB";
      }
      public java.lang.String html_panel(){
        return "GDCSE03CEJB";
      }
      public java.lang.String listPanels(){
        return "GDCSE03CFJB";
      }
      public java.lang.String okButton(){
        return "GDCSE03CGJB";
      }
      public java.lang.String searchBox(){
        return "GDCSE03CHJB";
      }
      public java.lang.String selectAll(){
        return "GDCSE03CIJB";
      }
      public java.lang.String selectorButton(){
        return "GDCSE03CJJB";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.medassets.report.client.component.SingleSelectorDialog_SingleSelectorDialogUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.medassets.report.client.component.SingleSelectorDialog_SingleSelectorDialogUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.medassets.report.client.component.SingleSelectorDialog_SingleSelectorDialogUiBinderImpl_GenCss_style style;
  
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
      case 'style': return this.@com.medassets.report.client.component.SingleSelectorDialog_SingleSelectorDialogUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
