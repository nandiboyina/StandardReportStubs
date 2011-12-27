package com.medassets.report.client.library;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class ReportTable_TableResources_default_StaticClientBundleGenerator implements com.medassets.report.client.library.ReportTable.TableResources {
  private static ReportTable_TableResources_default_StaticClientBundleGenerator _instance0 = new ReportTable_TableResources_default_StaticClientBundleGenerator();
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
    cellTableStyle = new com.medassets.report.client.library.ReportTable.TableStyle() {
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
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? ((".GDCSE03COL{background-color:" + ("#f1f1f1")  + ";color:" + ("black")  + ";}.GDCSE03CGL{padding-top:" + ("3px")  + ";padding-right:" + ("10px")  + ";padding-bottom:" + ("3px")  + ";border-bottom:" + ("1px")  + ";border-bottom-style:" + ("solid")  + ";border-bottom-color:" + ("#f0f0f0")  + ";border-top:" + ("1px")  + ";border-top-color:" + ("red")  + ";overflow:") + (("hidden")  + ";white-space:" + ("nowrap")  + ";}.GDCSE03CJM{background:" + ("#e3eefb")  + ";color:" + ("black")  + ";height:" + ("auto")  + ";overflow:" + ("auto")  + ";}.GDCSE03CLM{cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";}.GDCSE03CNL{background-color:" + ("#e2e2e2")  + ";background-image:" + ("url(table_background.png)")  + ";background-repeat:" + ("repeat-x") ) + (";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";padding:" + ("2px"+ " " +"10px"+ " " +"2px"+ " " +"10px")  + ";text-align:" + ("right")  + ";color:" + ("#fff")  + ";overflow:" + ("hidden")  + ";white-space:" + ("nowrap")  + ";font-weight:" + ("normal")  + ";font-family:" + ("\"Arial Unicode MS\""+ ","+ " " +"Arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("9pt")  + ";}.GDCSE03COM{white-space:" + ("nowrap")  + ";}")) : ((".GDCSE03COL{background-color:" + ("#f1f1f1")  + ";color:" + ("black")  + ";}.GDCSE03CGL{padding-top:" + ("3px")  + ";padding-left:" + ("10px")  + ";padding-bottom:" + ("3px")  + ";border-bottom:" + ("1px")  + ";border-bottom-style:" + ("solid")  + ";border-bottom-color:" + ("#f0f0f0")  + ";border-top:" + ("1px")  + ";border-top-color:" + ("red")  + ";overflow:") + (("hidden")  + ";white-space:" + ("nowrap")  + ";}.GDCSE03CJM{background:" + ("#e3eefb")  + ";color:" + ("black")  + ";height:" + ("auto")  + ";overflow:" + ("auto")  + ";}.GDCSE03CLM{cursor:" + ("pointer")  + ";cursor:" + ("hand")  + ";}.GDCSE03CNL{background-color:" + ("#e2e2e2")  + ";background-image:" + ("url(table_background.png)")  + ";background-repeat:" + ("repeat-x") ) + (";border-bottom:" + ("1px"+ " " +"solid"+ " " +"#000")  + ";padding:" + ("2px"+ " " +"10px"+ " " +"2px"+ " " +"10px")  + ";text-align:" + ("left")  + ";color:" + ("#fff")  + ";overflow:" + ("hidden")  + ";white-space:" + ("nowrap")  + ";font-weight:" + ("normal")  + ";font-family:" + ("\"Arial Unicode MS\""+ ","+ " " +"Arial"+ ","+ " " +"sans-serif")  + ";font-size:" + ("9pt")  + ";}.GDCSE03COM{white-space:" + ("nowrap")  + ";}"));
      }
      public java.lang.String cellTableCell(){
        return "GDCSE03CGL";
      }
      public java.lang.String cellTableEvenRow(){
        return "GDCSE03CHL";
      }
      public java.lang.String cellTableEvenRowCell(){
        return "GDCSE03CIL";
      }
      public java.lang.String cellTableFirstColumn(){
        return "GDCSE03CJL";
      }
      public java.lang.String cellTableFirstColumnFooter(){
        return "GDCSE03CKL";
      }
      public java.lang.String cellTableFirstColumnHeader(){
        return "GDCSE03CLL";
      }
      public java.lang.String cellTableFooter(){
        return "GDCSE03CML";
      }
      public java.lang.String cellTableHeader(){
        return "GDCSE03CNL";
      }
      public java.lang.String cellTableHoveredRow(){
        return "GDCSE03COL";
      }
      public java.lang.String cellTableHoveredRowCell(){
        return "GDCSE03CPL";
      }
      public java.lang.String cellTableKeyboardSelectedCell(){
        return "GDCSE03CAM";
      }
      public java.lang.String cellTableKeyboardSelectedRow(){
        return "GDCSE03CBM";
      }
      public java.lang.String cellTableKeyboardSelectedRowCell(){
        return "GDCSE03CCM";
      }
      public java.lang.String cellTableLastColumn(){
        return "GDCSE03CDM";
      }
      public java.lang.String cellTableLastColumnFooter(){
        return "GDCSE03CEM";
      }
      public java.lang.String cellTableLastColumnHeader(){
        return "GDCSE03CFM";
      }
      public java.lang.String cellTableLoading(){
        return "GDCSE03CGM";
      }
      public java.lang.String cellTableOddRow(){
        return "GDCSE03CHM";
      }
      public java.lang.String cellTableOddRowCell(){
        return "GDCSE03CIM";
      }
      public java.lang.String cellTableSelectedRow(){
        return "GDCSE03CJM";
      }
      public java.lang.String cellTableSelectedRowCell(){
        return "GDCSE03CKM";
      }
      public java.lang.String cellTableSortableHeader(){
        return "GDCSE03CLM";
      }
      public java.lang.String cellTableSortedHeaderAscending(){
        return "GDCSE03CMM";
      }
      public java.lang.String cellTableSortedHeaderDescending(){
        return "GDCSE03CNM";
      }
      public java.lang.String cellTableWidget(){
        return "GDCSE03COM";
      }
    }
    ;
  }
  private static class cellTableStyleInitializer {
    static {
      _instance0.cellTableStyleInitializer();
    }
    static com.medassets.report.client.library.ReportTable.TableStyle get() {
      return cellTableStyle;
    }
  }
  public com.medassets.report.client.library.ReportTable.TableStyle cellTableStyle() {
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
  private static com.medassets.report.client.library.ReportTable.TableStyle cellTableStyle;
  
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
      case 'cellTableStyle': return this.@com.medassets.report.client.library.ReportTable.TableResources::cellTableStyle()();
    }
    return null;
  }-*/;
}
