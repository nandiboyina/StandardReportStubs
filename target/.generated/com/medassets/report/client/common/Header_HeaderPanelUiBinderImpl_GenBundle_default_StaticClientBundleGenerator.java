package com.medassets.report.client.common;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class Header_HeaderPanelUiBinderImpl_GenBundle_default_StaticClientBundleGenerator implements com.medassets.report.client.common.Header_HeaderPanelUiBinderImpl_GenBundle {
  private static Header_HeaderPanelUiBinderImpl_GenBundle_default_StaticClientBundleGenerator _instance0 = new Header_HeaderPanelUiBinderImpl_GenBundle_default_StaticClientBundleGenerator();
  private void styleInitializer() {
    style = new com.medassets.report.client.common.Header_HeaderPanelUiBinderImpl_GenCss_style() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? (("#header{background-color:" + ("#fff")  + ";background-image:" + ("url(header.png)")  + ";background-repeat:" + ("repeat-x")  + ";height:" + ("25px")  + ";width:" + ("100%")  + ";}.GDCSE03CF1{color:" + ("#fff")  + ";background-image:" + ("url(linkImg.gif)")  + ";background-repeat:" + ("no-repeat")  + ";background-position:" + ("left"+ " " +"3px")  + ";padding:" + ("0"+ " " +"5px"+ " " +"0"+ " " +"10px")  + ";}.GDCSE03CE1::after{content:") + (("\".\"")  + ";display:" + ("block")  + ";width:" + ("100%")  + ";}")) : (("#header{background-color:" + ("#fff")  + ";background-image:" + ("url(header.png)")  + ";background-repeat:" + ("repeat-x")  + ";height:" + ("25px")  + ";width:" + ("100%")  + ";}.GDCSE03CF1{color:" + ("#fff")  + ";background-image:" + ("url(linkImg.gif)")  + ";background-repeat:" + ("no-repeat")  + ";background-position:" + ("right"+ " " +"3px")  + ";padding:" + ("0"+ " " +"10px"+ " " +"0"+ " " +"5px")  + ";}.GDCSE03CE1::after{content:") + (("\".\"")  + ";display:" + ("block")  + ";width:" + ("100%")  + ";}"));
      }
      public java.lang.String group(){
        return "GDCSE03CE1";
      }
      public java.lang.String navCheckLink(){
        return "GDCSE03CF1";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.medassets.report.client.common.Header_HeaderPanelUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.medassets.report.client.common.Header_HeaderPanelUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.medassets.report.client.common.Header_HeaderPanelUiBinderImpl_GenCss_style style;
  
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
      case 'style': return this.@com.medassets.report.client.common.Header_HeaderPanelUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
