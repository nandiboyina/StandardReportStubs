package com.medassets.report.client.component;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class MAImageResources_default_StaticClientBundleGenerator implements com.medassets.report.client.component.MAImageResources {
  private static MAImageResources_default_StaticClientBundleGenerator _instance0 = new MAImageResources_default_StaticClientBundleGenerator();
  private void alert_48Initializer() {
    alert_48 = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "alert_48",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(bundledImage_None),
      144, 0, 48, 48, false, false
    );
  }
  private static class alert_48Initializer {
    static {
      _instance0.alert_48Initializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return alert_48;
    }
  }
  public com.google.gwt.resources.client.ImageResource alert_48() {
    return alert_48Initializer.get();
  }
  private void information_48Initializer() {
    information_48 = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "information_48",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(bundledImage_None),
      96, 0, 48, 48, false, false
    );
  }
  private static class information_48Initializer {
    static {
      _instance0.information_48Initializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return information_48;
    }
  }
  public com.google.gwt.resources.client.ImageResource information_48() {
    return information_48Initializer.get();
  }
  private void question_48Initializer() {
    question_48 = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "question_48",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(bundledImage_None),
      48, 0, 48, 48, false, false
    );
  }
  private static class question_48Initializer {
    static {
      _instance0.question_48Initializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return question_48;
    }
  }
  public com.google.gwt.resources.client.ImageResource question_48() {
    return question_48Initializer.get();
  }
  private void warning_48Initializer() {
    warning_48 = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "warning_48",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(bundledImage_None),
      0, 0, 48, 48, false, false
    );
  }
  private static class warning_48Initializer {
    static {
      _instance0.warning_48Initializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return warning_48;
    }
  }
  public com.google.gwt.resources.client.ImageResource warning_48() {
    return warning_48Initializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String bundledImage_None = GWT.getModuleBaseURL() + "A46D197FE4BE3A15BDE7AE786873AA0F.cache.png";
  private static com.google.gwt.resources.client.ImageResource alert_48;
  private static com.google.gwt.resources.client.ImageResource information_48;
  private static com.google.gwt.resources.client.ImageResource question_48;
  private static com.google.gwt.resources.client.ImageResource warning_48;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      alert_48(), 
      information_48(), 
      question_48(), 
      warning_48(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("alert_48", alert_48());
        resourceMap.put("information_48", information_48());
        resourceMap.put("question_48", question_48());
        resourceMap.put("warning_48", warning_48());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'alert_48': return this.@com.medassets.report.client.component.MAImageResources::alert_48()();
      case 'information_48': return this.@com.medassets.report.client.component.MAImageResources::information_48()();
      case 'question_48': return this.@com.medassets.report.client.component.MAImageResources::question_48()();
      case 'warning_48': return this.@com.medassets.report.client.component.MAImageResources::warning_48()();
    }
    return null;
  }-*/;
}
