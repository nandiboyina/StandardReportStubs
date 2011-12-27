package com.medassets.report.client.service;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.user.client.rpc.impl.TypeHandler;
import java.util.HashMap;
import java.util.Map;
import com.google.gwt.core.client.GwtScriptOnly;

public class StandardService_TypeSerializer extends com.google.gwt.user.client.rpc.impl.SerializerBase {
  private static final Map<String, String> methodMapJava;
  private static final Map<String, String> signatureMapJava;
  
  static {
    methodMapJava = loadMethodsJava();
    signatureMapJava = loadSignaturesJava();
  }
  
  @SuppressWarnings("deprecation")
  private static Map<String, String> loadMethodsJava() {
    Map<String, String> result = new HashMap<String, String>();
    result.put("com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533", "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException_FieldSerializer");
    result.put("com.google.gwt.user.client.rpc.RpcTokenException/2345075298", "com.google.gwt.user.client.rpc.RpcTokenException_FieldSerializer");
    result.put("com.google.gwt.user.client.rpc.XsrfToken/4254043109", "com.google.gwt.user.client.rpc.XsrfToken_FieldSerializer");
    result.put("com.medassets.report.shared.ParamAvailableItemValue/1195754384", "com.medassets.report.shared.ParamAvailableItemValue_FieldSerializer");
    result.put("com.medassets.report.shared.ParamAvailableItems/1326172186", "com.medassets.report.shared.ParamAvailableItems_FieldSerializer");
    result.put("com.medassets.report.shared.ReportItemDTO/1433433493", "com.medassets.report.shared.ReportItemDTO_FieldSerializer");
    result.put("com.medassets.report.shared.StandardParamItemDTO/29518310", "com.medassets.report.shared.StandardParamItemDTO_FieldSerializer");
    result.put("com.medassets.report.shared.StandardParamItemDTO$WizStyleEnum/1246514247", "com.medassets.report.shared.StandardParamItemDTO_WizStyleEnum_FieldSerializer");
    result.put("[Lcom.medassets.report.shared.StandardParamItemDTO;/2026155841", "com.medassets.report.shared.StandardParamItemDTO_Array_Rank_1_FieldSerializer");
    result.put("com.medassets.report.shared.StandardRptInstanceSupportItemDTO/3385814453", "com.medassets.report.shared.StandardRptInstanceSupportItemDTO_FieldSerializer");
    result.put("java.lang.Integer/3438268394", "com.google.gwt.user.client.rpc.core.java.lang.Integer_FieldSerializer");
    result.put("java.lang.Long/4227064769", "com.google.gwt.user.client.rpc.core.java.lang.Long_FieldSerializer");
    result.put("java.lang.String/2004016611", "com.google.gwt.user.client.rpc.core.java.lang.String_FieldSerializer");
    result.put("[Ljava.lang.String;/2600011424", "com.google.gwt.user.client.rpc.core.java.lang.String_Array_Rank_1_FieldSerializer");
    result.put("java.util.ArrayList/4159755760", "com.google.gwt.user.client.rpc.core.java.util.ArrayList_FieldSerializer");
    result.put("java.util.Arrays$ArrayList/2507071751", "com.google.gwt.user.client.rpc.core.java.util.Arrays_ArrayList_FieldSerializer");
    result.put("java.util.Collections$EmptyList/4157118744", "com.google.gwt.user.client.rpc.core.java.util.Collections_EmptyList_FieldSerializer");
    result.put("java.util.Collections$SingletonList/1586180994", "com.google.gwt.user.client.rpc.core.java.util.Collections_SingletonList_FieldSerializer");
    result.put("java.util.LinkedList/3953877921", "com.google.gwt.user.client.rpc.core.java.util.LinkedList_FieldSerializer");
    result.put("java.util.Stack/1346942793", "com.google.gwt.user.client.rpc.core.java.util.Stack_FieldSerializer");
    result.put("java.util.Vector/3057315478", "com.google.gwt.user.client.rpc.core.java.util.Vector_FieldSerializer");
    return result;
  }
  
  @SuppressWarnings("deprecation")
  private static Map<String, String> loadSignaturesJava() {
    Map<String, String> result = new HashMap<String, String>();
    result.put("com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException", "com.google.gwt.user.client.rpc.IncompatibleRemoteServiceException/3936916533");
    result.put("com.google.gwt.user.client.rpc.RpcTokenException", "com.google.gwt.user.client.rpc.RpcTokenException/2345075298");
    result.put("com.google.gwt.user.client.rpc.XsrfToken", "com.google.gwt.user.client.rpc.XsrfToken/4254043109");
    result.put("com.medassets.report.shared.ParamAvailableItemValue", "com.medassets.report.shared.ParamAvailableItemValue/1195754384");
    result.put("com.medassets.report.shared.ParamAvailableItems", "com.medassets.report.shared.ParamAvailableItems/1326172186");
    result.put("com.medassets.report.shared.ReportItemDTO", "com.medassets.report.shared.ReportItemDTO/1433433493");
    result.put("com.medassets.report.shared.StandardParamItemDTO", "com.medassets.report.shared.StandardParamItemDTO/29518310");
    result.put("com.medassets.report.shared.StandardParamItemDTO$WizStyleEnum", "com.medassets.report.shared.StandardParamItemDTO$WizStyleEnum/1246514247");
    result.put("[Lcom.medassets.report.shared.StandardParamItemDTO;", "[Lcom.medassets.report.shared.StandardParamItemDTO;/2026155841");
    result.put("com.medassets.report.shared.StandardRptInstanceSupportItemDTO", "com.medassets.report.shared.StandardRptInstanceSupportItemDTO/3385814453");
    result.put("java.lang.Integer", "java.lang.Integer/3438268394");
    result.put("java.lang.Long", "java.lang.Long/4227064769");
    result.put("java.lang.String", "java.lang.String/2004016611");
    result.put("[Ljava.lang.String;", "[Ljava.lang.String;/2600011424");
    result.put("java.util.ArrayList", "java.util.ArrayList/4159755760");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Arrays.ArrayList_CustomFieldSerializer.concreteType(), "java.util.Arrays$ArrayList/2507071751");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Collections.EmptyList_CustomFieldSerializer.concreteType(), "java.util.Collections$EmptyList/4157118744");
    result.put(com.google.gwt.user.client.rpc.core.java.util.Collections.SingletonList_CustomFieldSerializer.concreteType(), "java.util.Collections$SingletonList/1586180994");
    result.put("java.util.LinkedList", "java.util.LinkedList/3953877921");
    result.put("java.util.Stack", "java.util.Stack/1346942793");
    result.put("java.util.Vector", "java.util.Vector/3057315478");
    return result;
  }
  
  public StandardService_TypeSerializer() {
    super(methodMapJava, null, signatureMapJava, null);
  }
  
}
