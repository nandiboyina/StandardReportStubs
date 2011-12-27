package com.medassets.report.client.service;

import com.google.gwt.user.client.rpc.impl.RemoteServiceProxy;
import com.google.gwt.user.client.rpc.impl.ClientSerializationStreamWriter;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.impl.RequestCallbackAdapter.ResponseReader;
import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.RpcToken;
import com.google.gwt.user.client.rpc.RpcTokenException;
import com.google.gwt.core.client.impl.Impl;
import com.google.gwt.user.client.rpc.impl.RpcStatsContext;

public class FlexService_Proxy extends RemoteServiceProxy implements com.medassets.report.client.service.FlexServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "com.medassets.report.client.service.FlexService";
  private static final String SERIALIZATION_POLICY ="7A2F751F5AD83B7445D90FEBA0F6D583";
  private static final com.medassets.report.client.service.FlexService_TypeSerializer SERIALIZER = new com.medassets.report.client.service.FlexService_TypeSerializer();
  
  public FlexService_Proxy() {
    super(GWT.getModuleBaseURL(),
      "flexService", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void fetchSavedSelections(java.lang.Long reportTemplateId, java.lang.Long reportInstanceId, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("FlexService_Proxy", "fetchSavedSelections");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 2);
      streamWriter.writeString("java.lang.Long/4227064769");
      streamWriter.writeString("java.lang.Long/4227064769");
      streamWriter.writeObject(reportTemplateId);
      streamWriter.writeObject(reportInstanceId);
      helper.finish(callback, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void getFlexGlobalSettingsData(com.medassets.report.shared.ReportItemDTO report, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("FlexService_Proxy", "getFlexGlobalSettingsData");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("com.medassets.report.shared.ReportItemDTO/1433433493");
      streamWriter.writeObject(report);
      helper.finish(callback, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void getGeneralData(com.medassets.report.shared.ReportItemDTO report, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("FlexService_Proxy", "getGeneralData");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("com.medassets.report.shared.ReportItemDTO/1433433493");
      streamWriter.writeObject(report);
      helper.finish(callback, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void getReportTemplateName(java.lang.Long reportTemplateId, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("FlexService_Proxy", "getReportTemplateName");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("java.lang.Long/4227064769");
      streamWriter.writeObject(reportTemplateId);
      helper.finish(callback, ResponseReader.STRING);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void getSelectTabAvailableParamList(java.lang.Long reportTemplateId, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("FlexService_Proxy", "getSelectTabAvailableParamList");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("java.lang.Long/4227064769");
      streamWriter.writeObject(reportTemplateId);
      helper.finish(callback, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void getSelectTabParamCodeList(com.medassets.report.shared.FlexSelectionParamItemDTO selectedParamDTO, java.util.List globalSettingsTabDtoList, java.lang.String[] statusMsg, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("FlexService_Proxy", "getSelectTabParamCodeList");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 3);
      streamWriter.writeString("com.medassets.report.shared.FlexSelectionParamItemDTO/510744238");
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("[Ljava.lang.String;/2600011424");
      streamWriter.writeObject(selectedParamDTO);
      streamWriter.writeObject(globalSettingsTabDtoList);
      streamWriter.writeObject(statusMsg);
      helper.finish(callback, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void populateGlobalSettingsTabParametersByType(java.lang.Long reportTemplateId, java.lang.Long reportInstanceId, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("FlexService_Proxy", "populateGlobalSettingsTabParametersByType");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 2);
      streamWriter.writeString("java.lang.Long/4227064769");
      streamWriter.writeString("java.lang.Long/4227064769");
      streamWriter.writeObject(reportTemplateId);
      streamWriter.writeObject(reportInstanceId);
      helper.finish(callback, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void runFlexReport(java.lang.Long reportTemplateId, java.lang.Long reportInstanceId, java.lang.String templateName, java.util.List fieldList, java.util.List flexSelectionParamList, java.util.List fieldList2, java.util.List sortParamList, com.google.gwt.user.client.rpc.AsyncCallback runflexReportCallback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("FlexService_Proxy", "runFlexReport");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 7);
      streamWriter.writeString("java.lang.Long/4227064769");
      streamWriter.writeString("java.lang.Long/4227064769");
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("java.util.List");
      streamWriter.writeObject(reportTemplateId);
      streamWriter.writeObject(reportInstanceId);
      streamWriter.writeString(templateName);
      streamWriter.writeObject(fieldList);
      streamWriter.writeObject(flexSelectionParamList);
      streamWriter.writeObject(fieldList2);
      streamWriter.writeObject(sortParamList);
      helper.finish(runflexReportCallback, ResponseReader.VOID);
    } catch (SerializationException ex) {
      runflexReportCallback.onFailure(ex);
    }
  }
  @Override
  public SerializationStreamWriter createStreamWriter() {
    ClientSerializationStreamWriter toReturn =
      (ClientSerializationStreamWriter) super.createStreamWriter();
    if (getRpcToken() != null) {
      toReturn.addFlags(ClientSerializationStreamWriter.FLAG_RPC_TOKEN_INCLUDED);
    }
    return toReturn;
  }
  @Override
  protected void checkRpcTokenType(RpcToken token) {
    if (!(token instanceof com.google.gwt.user.client.rpc.XsrfToken)) {
      throw new RpcTokenException("Invalid RpcToken type: expected 'com.google.gwt.user.client.rpc.XsrfToken' but got '" + token.getClass() + "'");
    }
  }
}
