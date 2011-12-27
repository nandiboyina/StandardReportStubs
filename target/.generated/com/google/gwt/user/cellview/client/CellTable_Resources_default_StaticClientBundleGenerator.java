package com.google.gwt.user.cellview.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class CellTable_Resources_default_StaticClientBundleGenerator implements com.google.gwt.user.cellview.client.CellTable.Resources {
  private static CellTable_Resources_default_StaticClientBundleGenerator _instance0 = new CellTable_Resources_default_StaticClientBundleGenerator();
  private void cellTableFooterBackgroundInitializer() {
    cellTableFooterBackground = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "cellTableFooterBackground",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ?bundledImage_Horizontal_rtl : bundledImage_Horizontal),
      0, 0, 82, 23, false, false
    );
  }
  private static class cellTableFooterBackgroundInitializer {
    static {
      _instance0.cellTableFooterBackgroundInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return cellTableFooterBackground;
    }
  }
  public com.google.gwt.resources.client.ImageResource cellTableFooterBackground() {
    return cellTableFooterBackgroundInitializer.get();
  }
  private void cellTableHeaderBackgroundInitializer() {
    cellTableHeaderBackground = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "cellTableHeaderBackground",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ?bundledImage_Horizontal_rtl : bundledImage_Horizontal),
      0, 0, 82, 23, false, false
    );
  }
  private static class cellTableHeaderBackgroundInitializer {
    static {
      _instance0.cellTableHeaderBackgroundInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return cellTableHeaderBackground;
    }
  }
  public com.google.gwt.resources.client.ImageResource cellTableHeaderBackground() {
    return cellTableHeaderBackgroundInitializer.get();
  }
  private void cellTableLoadingInitializer() {
    cellTableLoading = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "cellTableLoading",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ?externalImage_rtl : externalImage),
      0, 0, 43, 11, true, false
    );
  }
  private static class cellTableLoadingInitializer {
    static {
      _instance0.cellTableLoadingInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return cellTableLoading;
    }
  }
  public com.google.gwt.resources.client.ImageResource cellTableLoading() {
    return cellTableLoadingInitializer.get();
  }
  private void cellTableSelectedBackgroundInitializer() {
    cellTableSelectedBackground = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "cellTableSelectedBackground",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ?bundledImage_Horizontal_rtl : bundledImage_Horizontal),
      0, 23, 82, 26, false, false
    );
  }
  private static class cellTableSelectedBackgroundInitializer {
    static {
      _instance0.cellTableSelectedBackgroundInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return cellTableSelectedBackground;
    }
  }
  public com.google.gwt.resources.client.ImageResource cellTableSelectedBackground() {
    return cellTableSelectedBackgroundInitializer.get();
  }
  private void cellTableSortAscendingInitializer() {
    cellTableSortAscending = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "cellTableSortAscending",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ?bundledImage_None_rtl : bundledImage_None),
      11, 0, 11, 7, false, false
    );
  }
  private static class cellTableSortAscendingInitializer {
    static {
      _instance0.cellTableSortAscendingInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return cellTableSortAscending;
    }
  }
  public com.google.gwt.resources.client.ImageResource cellTableSortAscending() {
    return cellTableSortAscendingInitializer.get();
  }
  private void cellTableSortDescendingInitializer() {
    cellTableSortDescending = new com.google.gwt.resources.client.impl.ImageResourcePrototype(
      "cellTableSortDescending",
      com.google.gwt.safehtml.shared.UriUtils.fromTrustedString(com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ?bundledImage_None_rtl : bundledImage_None),
      0, 0, 11, 7, false, false
    );
  }
  private static class cellTableSortDescendingInitializer {
    static {
      _instance0.cellTableSortDescendingInitializer();
    }
    static com.google.gwt.resources.client.ImageResource get() {
      return cellTableSortDescending;
    }
  }
  public com.google.gwt.resources.client.ImageResource cellTableSortDescending() {
    return cellTableSortDescendingInitializer.get();
  }
  private void cellTableStyleInitializer() {
    cellTableStyle = new com.google.gwt.user.cellview.client.CellTable.Style() {
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
        return "cellTableStyle";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GDCSE03CED{border-top:" + ("2px"+ " " +"solid"+ " " +"#6f7277")  + ";padding:" + ("3px"+ " " +"15px")  + ";text-align:" + ("right")  + ";color:" + ("#4b4a4a")  + ";text-shadow:" + ("#ddf"+ " " +"1px"+ " " +"1px"+ " " +"0")  + ";overflow:" + ("hidden")  + ";}.GDCSE03CFD{border-bottom:" + ("2px"+ " " +"solid"+ " " +"#6f7277")  + ";padding:" + ("3px"+ " " +"15px")  + ";text-align:" + ("right")  + ";color:" + ("#4b4a4a")  + ";text-shadow:") + (("#ddf"+ " " +"1px"+ " " +"1px"+ " " +"0")  + ";overflow:" + ("hidden")  + ";}.GDCSE03COC{padding:" + ("2px"+ " " +"15px")  + ";overflow:" + ("hidden")  + ";}.GDCSE03CDE{cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";}.GDCSE03CDE:hover{color:" + ("#6c6b6b")  + ";}.GDCSE03CPC{background:" + ("#fff")  + ";}.GDCSE03CAD{border:" + ("2px"+ " " +"solid"+ " " +"#fff")  + ";}.GDCSE03CPD{background:" + ("#f3f7fb")  + ";}.GDCSE03CAE{border:" + ("2px"+ " " +"solid"+ " " +"#f3f7fb") ) + (";}.GDCSE03CGD{background:" + ("#eee")  + ";}.GDCSE03CHD{border:" + ("2px"+ " " +"solid"+ " " +"#eee")  + ";}.GDCSE03CJD{background:" + ("#ffc")  + ";}.GDCSE03CKD{border:" + ("2px"+ " " +"solid"+ " " +"#ffc")  + ";}.GDCSE03CBE{background:" + ("#628cd5")  + ";color:" + ("white")  + ";height:" + ("auto")  + ";overflow:" + ("auto")  + ";}.GDCSE03CCE{border:" + ("2px"+ " " +"solid"+ " " +"#628cd5")  + ";}.GDCSE03CID{border:" + ("2px"+ " " +"solid"+ " " +"#d7dde8")  + ";}.GDCSE03COD{margin:") + (("30px")  + ";}")) : ((".GDCSE03CED{border-top:" + ("2px"+ " " +"solid"+ " " +"#6f7277")  + ";padding:" + ("3px"+ " " +"15px")  + ";text-align:" + ("left")  + ";color:" + ("#4b4a4a")  + ";text-shadow:" + ("#ddf"+ " " +"1px"+ " " +"1px"+ " " +"0")  + ";overflow:" + ("hidden")  + ";}.GDCSE03CFD{border-bottom:" + ("2px"+ " " +"solid"+ " " +"#6f7277")  + ";padding:" + ("3px"+ " " +"15px")  + ";text-align:" + ("left")  + ";color:" + ("#4b4a4a")  + ";text-shadow:") + (("#ddf"+ " " +"1px"+ " " +"1px"+ " " +"0")  + ";overflow:" + ("hidden")  + ";}.GDCSE03COC{padding:" + ("2px"+ " " +"15px")  + ";overflow:" + ("hidden")  + ";}.GDCSE03CDE{cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";}.GDCSE03CDE:hover{color:" + ("#6c6b6b")  + ";}.GDCSE03CPC{background:" + ("#fff")  + ";}.GDCSE03CAD{border:" + ("2px"+ " " +"solid"+ " " +"#fff")  + ";}.GDCSE03CPD{background:" + ("#f3f7fb")  + ";}.GDCSE03CAE{border:" + ("2px"+ " " +"solid"+ " " +"#f3f7fb") ) + (";}.GDCSE03CGD{background:" + ("#eee")  + ";}.GDCSE03CHD{border:" + ("2px"+ " " +"solid"+ " " +"#eee")  + ";}.GDCSE03CJD{background:" + ("#ffc")  + ";}.GDCSE03CKD{border:" + ("2px"+ " " +"solid"+ " " +"#ffc")  + ";}.GDCSE03CBE{background:" + ("#628cd5")  + ";color:" + ("white")  + ";height:" + ("auto")  + ";overflow:" + ("auto")  + ";}.GDCSE03CCE{border:" + ("2px"+ " " +"solid"+ " " +"#628cd5")  + ";}.GDCSE03CID{border:" + ("2px"+ " " +"solid"+ " " +"#d7dde8")  + ";}.GDCSE03COD{margin:") + (("30px")  + ";}"));
      }
      public java.lang.String cellTableCell(){
        return "GDCSE03COC";
      }
      public java.lang.String cellTableEvenRow(){
        return "GDCSE03CPC";
      }
      public java.lang.String cellTableEvenRowCell(){
        return "GDCSE03CAD";
      }
      public java.lang.String cellTableFirstColumn(){
        return "GDCSE03CBD";
      }
      public java.lang.String cellTableFirstColumnFooter(){
        return "GDCSE03CCD";
      }
      public java.lang.String cellTableFirstColumnHeader(){
        return "GDCSE03CDD";
      }
      public java.lang.String cellTableFooter(){
        return "GDCSE03CED";
      }
      public java.lang.String cellTableHeader(){
        return "GDCSE03CFD";
      }
      public java.lang.String cellTableHoveredRow(){
        return "GDCSE03CGD";
      }
      public java.lang.String cellTableHoveredRowCell(){
        return "GDCSE03CHD";
      }
      public java.lang.String cellTableKeyboardSelectedCell(){
        return "GDCSE03CID";
      }
      public java.lang.String cellTableKeyboardSelectedRow(){
        return "GDCSE03CJD";
      }
      public java.lang.String cellTableKeyboardSelectedRowCell(){
        return "GDCSE03CKD";
      }
      public java.lang.String cellTableLastColumn(){
        return "GDCSE03CLD";
      }
      public java.lang.String cellTableLastColumnFooter(){
        return "GDCSE03CMD";
      }
      public java.lang.String cellTableLastColumnHeader(){
        return "GDCSE03CND";
      }
      public java.lang.String cellTableLoading(){
        return "GDCSE03COD";
      }
      public java.lang.String cellTableOddRow(){
        return "GDCSE03CPD";
      }
      public java.lang.String cellTableOddRowCell(){
        return "GDCSE03CAE";
      }
      public java.lang.String cellTableSelectedRow(){
        return "GDCSE03CBE";
      }
      public java.lang.String cellTableSelectedRowCell(){
        return "GDCSE03CCE";
      }
      public java.lang.String cellTableSortableHeader(){
        return "GDCSE03CDE";
      }
      public java.lang.String cellTableSortedHeaderAscending(){
        return "GDCSE03CEE";
      }
      public java.lang.String cellTableSortedHeaderDescending(){
        return "GDCSE03CFE";
      }
      public java.lang.String cellTableWidget(){
        return "GDCSE03CGE";
      }
    }
    ;
  }
  private static class cellTableStyleInitializer {
    static {
      _instance0.cellTableStyleInitializer();
    }
    static com.google.gwt.user.cellview.client.CellTable.Style get() {
      return cellTableStyle;
    }
  }
  public com.google.gwt.user.cellview.client.CellTable.Style cellTableStyle() {
    return cellTableStyleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static final java.lang.String bundledImage_Horizontal = GWT.getModuleBaseURL() + "223E04DC70F69BC559571D1C0E0667E5.cache.png";
  private static final java.lang.String bundledImage_Horizontal_rtl = GWT.getModuleBaseURL() + "0326AF455425F6065C00E0361659A798.cache.png";
  private static final java.lang.String bundledImage_None = GWT.getModuleBaseURL() + "AB196D9D7834625802449A82C5811B43.cache.png";
  private static final java.lang.String bundledImage_None_rtl = GWT.getModuleBaseURL() + "3E13412DD77AE068AAF96B6978824A75.cache.png";
  private static final java.lang.String externalImage = GWT.getModuleBaseURL() + "0F89659FF3F324AE4116F700257E32BD.cache.gif";
  private static final java.lang.String externalImage_rtl = GWT.getModuleBaseURL() + "13D2931874E71D07F248A0CDF051CC85.cache.png";
  private static com.google.gwt.resources.client.ImageResource cellTableFooterBackground;
  private static com.google.gwt.resources.client.ImageResource cellTableHeaderBackground;
  private static com.google.gwt.resources.client.ImageResource cellTableLoading;
  private static com.google.gwt.resources.client.ImageResource cellTableSelectedBackground;
  private static com.google.gwt.resources.client.ImageResource cellTableSortAscending;
  private static com.google.gwt.resources.client.ImageResource cellTableSortDescending;
  private static com.google.gwt.user.cellview.client.CellTable.Style cellTableStyle;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      cellTableFooterBackground(), 
      cellTableHeaderBackground(), 
      cellTableLoading(), 
      cellTableSelectedBackground(), 
      cellTableSortAscending(), 
      cellTableSortDescending(), 
      cellTableStyle(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("cellTableFooterBackground", cellTableFooterBackground());
        resourceMap.put("cellTableHeaderBackground", cellTableHeaderBackground());
        resourceMap.put("cellTableLoading", cellTableLoading());
        resourceMap.put("cellTableSelectedBackground", cellTableSelectedBackground());
        resourceMap.put("cellTableSortAscending", cellTableSortAscending());
        resourceMap.put("cellTableSortDescending", cellTableSortDescending());
        resourceMap.put("cellTableStyle", cellTableStyle());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'cellTableFooterBackground': return this.@com.google.gwt.user.cellview.client.CellTable.Resources::cellTableFooterBackground()();
      case 'cellTableHeaderBackground': return this.@com.google.gwt.user.cellview.client.CellTable.Resources::cellTableHeaderBackground()();
      case 'cellTableLoading': return this.@com.google.gwt.user.cellview.client.CellTable.Resources::cellTableLoading()();
      case 'cellTableSelectedBackground': return this.@com.google.gwt.user.cellview.client.CellTable.Resources::cellTableSelectedBackground()();
      case 'cellTableSortAscending': return this.@com.google.gwt.user.cellview.client.CellTable.Resources::cellTableSortAscending()();
      case 'cellTableSortDescending': return this.@com.google.gwt.user.cellview.client.CellTable.Resources::cellTableSortDescending()();
      case 'cellTableStyle': return this.@com.google.gwt.user.cellview.client.CellTable.Resources::cellTableStyle()();
    }
    return null;
  }-*/;
}
