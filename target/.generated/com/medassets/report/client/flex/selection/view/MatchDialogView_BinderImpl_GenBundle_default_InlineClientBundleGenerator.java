package com.medassets.report.client.flex.selection.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class MatchDialogView_BinderImpl_GenBundle_default_InlineClientBundleGenerator implements com.medassets.report.client.flex.selection.view.MatchDialogView_BinderImpl_GenBundle {
  private static MatchDialogView_BinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new MatchDialogView_BinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new com.medassets.report.client.flex.selection.view.MatchDialogView_BinderImpl_GenCss_style() {
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
        return (".GDCSE03CLJB{background-color:" + ("ivory")  + ";}");
      }
      public java.lang.String panel(){
        return "GDCSE03CLJB";
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static com.medassets.report.client.flex.selection.view.MatchDialogView_BinderImpl_GenCss_style get() {
      return style;
    }
  }
  public com.medassets.report.client.flex.selection.view.MatchDialogView_BinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static com.medassets.report.client.flex.selection.view.MatchDialogView_BinderImpl_GenCss_style style;
  
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
      case 'style': return this.@com.medassets.report.client.flex.selection.view.MatchDialogView_BinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
