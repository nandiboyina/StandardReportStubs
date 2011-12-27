package com.medassets.report.client.library;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class MainNavTree_Images_default_StaticClientBundleGenerator implements com.medassets.report.client.library.MainNavTree.Images {
  private static MainNavTree_Images_default_StaticClientBundleGenerator _instance0 = new MainNavTree_Images_default_StaticClientBundleGenerator();
  private void folderInitializer() {
    folder = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "folder",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(bundledImage_None),
      32, 0, 16, 16, false, false
    );
  }
  private static class folderInitializer {
    static {
      _instance0.folderInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return folder;
    }
  }
  public com.google.gwt.resources.client.ImageResource folder() {
    return folderInitializer.get();
  }
  private void reportInitializer() {
    report = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "report",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(bundledImage_None),
      16, 0, 16, 16, false, false
    );
  }
  private static class reportInitializer {
    static {
      _instance0.reportInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return report;
    }
  }
  public com.google.gwt.resources.client.ImageResource report() {
    return reportInitializer.get();
  }
  private void templateInitializer() {
    template = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "template",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(bundledImage_None),
      0, 0, 16, 16, false, false
    );
  }
  private static class templateInitializer {
    static {
      _instance0.templateInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return template;
    }
  }
  public com.google.gwt.resources.client.ImageResource template() {
    return templateInitializer.get();
  }
  private void treeClosedInitializer() {
    treeClosed = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "treeClosed",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(bundledImage_None),
      64, 0, 16, 16, false, false
    );
  }
  private static class treeClosedInitializer {
    static {
      _instance0.treeClosedInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return treeClosed;
    }
  }
  public com.google.gwt.resources.client.ImageResource treeClosed() {
    return treeClosedInitializer.get();
  }
  private void treeLeafInitializer() {
    treeLeaf = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "treeLeaf",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(bundledImage_None),
      80, 0, 1, 1, false, false
    );
  }
  private static class treeLeafInitializer {
    static {
      _instance0.treeLeafInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return treeLeaf;
    }
  }
  public com.google.gwt.resources.client.ImageResource treeLeaf() {
    return treeLeafInitializer.get();
  }
  private void treeOpenInitializer() {
    treeOpen = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "treeOpen",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(bundledImage_None),
      48, 0, 16, 16, false, false
    );
  }
  private static class treeOpenInitializer {
    static {
      _instance0.treeOpenInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return treeOpen;
    }
  }
  public com.google.gwt.resources.client.ImageResource treeOpen() {
    return treeOpenInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String bundledImage_None = GWT.getModuleBaseURL() + "7E3F59C1AF34A55AB560A9F12EFE5FFF.cache.png";
  private static com.google.gwt.resources.client.ImageResource folder;
  private static com.google.gwt.resources.client.ImageResource report;
  private static com.google.gwt.resources.client.ImageResource template;
  private static com.google.gwt.resources.client.ImageResource treeClosed;
  private static com.google.gwt.resources.client.ImageResource treeLeaf;
  private static com.google.gwt.resources.client.ImageResource treeOpen;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      folder(), 
      report(), 
      template(), 
      treeClosed(), 
      treeLeaf(), 
      treeOpen(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("folder", folder());
        resourceMap.put("report", report());
        resourceMap.put("template", template());
        resourceMap.put("treeClosed", treeClosed());
        resourceMap.put("treeLeaf", treeLeaf());
        resourceMap.put("treeOpen", treeOpen());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'folder': return this.@com.medassets.report.client.library.MainNavTree.Images::folder()();
      case 'report': return this.@com.medassets.report.client.library.MainNavTree.Images::report()();
      case 'template': return this.@com.medassets.report.client.library.MainNavTree.Images::template()();
      case 'treeClosed': return this.@com.google.gwt.user.client.ui.Tree.Resources::treeClosed()();
      case 'treeLeaf': return this.@com.medassets.report.client.library.MainNavTree.Images::treeLeaf()();
      case 'treeOpen': return this.@com.google.gwt.user.client.ui.Tree.Resources::treeOpen()();
    }
    return null;
  }-*/;
}
