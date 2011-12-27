package com.medassets.report.client.library;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class ReportTable_MyImageResources_default_StaticClientBundleGenerator implements com.medassets.report.client.library.ReportTable.MyImageResources {
  private static ReportTable_MyImageResources_default_StaticClientBundleGenerator _instance0 = new ReportTable_MyImageResources_default_StaticClientBundleGenerator();
  private void copyInitializer() {
    copy = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "copy",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(bundledImage_None),
      0, 0, 18, 18, false, false
    );
  }
  private static class copyInitializer {
    static {
      _instance0.copyInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return copy;
    }
  }
  public com.google.gwt.resources.client.ImageResource copy() {
    return copyInitializer.get();
  }
  private void deleteInitializer() {
    delete = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "delete",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(bundledImage_None),
      50, 0, 16, 16, false, false
    );
  }
  private static class deleteInitializer {
    static {
      _instance0.deleteInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return delete;
    }
  }
  public com.google.gwt.resources.client.ImageResource delete() {
    return deleteInitializer.get();
  }
  private void editInitializer() {
    edit = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "edit",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(bundledImage_None),
      34, 0, 16, 16, false, false
    );
  }
  private static class editInitializer {
    static {
      _instance0.editInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return edit;
    }
  }
  public com.google.gwt.resources.client.ImageResource edit() {
    return editInitializer.get();
  }
  private void refreshInitializer() {
    refresh = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "refresh",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(bundledImage_None),
      18, 0, 16, 16, false, false
    );
  }
  private static class refreshInitializer {
    static {
      _instance0.refreshInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return refresh;
    }
  }
  public com.google.gwt.resources.client.ImageResource refresh() {
    return refreshInitializer.get();
  }
  private void searchInitializer() {
    search = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "search",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(bundledImage_None),
      66, 0, 15, 15, false, false
    );
  }
  private static class searchInitializer {
    static {
      _instance0.searchInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return search;
    }
  }
  public com.google.gwt.resources.client.ImageResource search() {
    return searchInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String bundledImage_None = GWT.getModuleBaseURL() + "D8A250BD868307C645CFADA4ED058307.cache.png";
  private static com.google.gwt.resources.client.ImageResource copy;
  private static com.google.gwt.resources.client.ImageResource delete;
  private static com.google.gwt.resources.client.ImageResource edit;
  private static com.google.gwt.resources.client.ImageResource refresh;
  private static com.google.gwt.resources.client.ImageResource search;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      copy(), 
      delete(), 
      edit(), 
      refresh(), 
      search(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("copy", copy());
        resourceMap.put("delete", delete());
        resourceMap.put("edit", edit());
        resourceMap.put("refresh", refresh());
        resourceMap.put("search", search());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'copy': return this.@com.medassets.report.client.library.ReportTable.MyImageResources::copy()();
      case 'delete': return this.@com.medassets.report.client.library.ReportTable.MyImageResources::delete()();
      case 'edit': return this.@com.medassets.report.client.library.ReportTable.MyImageResources::edit()();
      case 'refresh': return this.@com.medassets.report.client.library.ReportTable.MyImageResources::refresh()();
      case 'search': return this.@com.medassets.report.client.library.ReportTable.MyImageResources::search()();
    }
    return null;
  }-*/;
}
