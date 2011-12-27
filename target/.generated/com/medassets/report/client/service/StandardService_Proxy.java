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

public class StandardService_Proxy extends RemoteServiceProxy implements com.medassets.report.client.service.StandardServiceAsync {
  private static final String REMOTE_SERVICE_INTERFACE_NAME = "com.medassets.report.client.service.StandardService";
  private static final String SERIALIZATION_POLICY ="ACFA1F6D84D5AB2FB5EA1867135F82E8";
  private static final com.medassets.report.client.service.StandardService_TypeSerializer SERIALIZER = new com.medassets.report.client.service.StandardService_TypeSerializer();
  
  public StandardService_Proxy() {
    super(GWT.getModuleBaseURL(),
      "standardService", 
      SERIALIZATION_POLICY, 
      SERIALIZER);
  }
  
  public void getAvailableValuesForCBOorLIST(com.medassets.report.shared.StandardParamItemDTO dto, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("StandardService_Proxy", "getAvailableValuesForCBOorLIST");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 1);
      streamWriter.writeString("com.medassets.report.shared.StandardParamItemDTO/29518310");
      streamWriter.writeObject(dto);
      helper.finish(callback, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void getStandardParamDTOList(java.lang.Long reportId, boolean isInstance, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("StandardService_Proxy", "getStandardParamDTOList");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 2);
      streamWriter.writeString("java.lang.Long/4227064769");
      streamWriter.writeString("Z");
      streamWriter.writeObject(reportId);
      streamWriter.writeBoolean(isInstance);
      helper.finish(callback, ResponseReader.OBJECT);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void runStandardReport(com.medassets.report.shared.ReportItemDTO reportItemDTO, java.util.List dtoList, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("StandardService_Proxy", "runStandardReport");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 2);
      streamWriter.writeString("com.medassets.report.shared.ReportItemDTO/1433433493");
      streamWriter.writeString("java.util.List");
      streamWriter.writeObject(reportItemDTO);
      streamWriter.writeObject(dtoList);
      helper.finish(callback, ResponseReader.VOID);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void saveStandardReportInstance(java.lang.String reportInstanceName, java.util.List standardParamDTOList, com.medassets.report.shared.StandardRptInstanceSupportItemDTO supportDTO, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("StandardService_Proxy", "saveStandardReportInstance");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 3);
      streamWriter.writeString("java.lang.String/2004016611");
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("com.medassets.report.shared.StandardRptInstanceSupportItemDTO/3385814453");
      streamWriter.writeString(reportInstanceName);
      streamWriter.writeObject(standardParamDTOList);
      streamWriter.writeObject(supportDTO);
      helper.finish(callback, ResponseReader.VOID);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void updateStandardReportInstance(java.util.List standardParamDTOList, com.medassets.report.shared.StandardRptInstanceSupportItemDTO supportDTO, com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("StandardService_Proxy", "updateStandardReportInstance");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 2);
      streamWriter.writeString("java.util.List");
      streamWriter.writeString("com.medassets.report.shared.StandardRptInstanceSupportItemDTO/3385814453");
      streamWriter.writeObject(standardParamDTOList);
      streamWriter.writeObject(supportDTO);
      helper.finish(callback, ResponseReader.VOID);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
    }
  }
  
  public void voidSessionCloseDocument(com.google.gwt.user.client.rpc.AsyncCallback callback) {
    com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper helper = new com.google.gwt.user.client.rpc.impl.RemoteServiceProxy.ServiceHelper("StandardService_Proxy", "voidSessionCloseDocument");
    try {
      SerializationStreamWriter streamWriter = helper.start(REMOTE_SERVICE_INTERFACE_NAME, 0);
      helper.finish(callback, ResponseReader.VOID);
    } catch (SerializationException ex) {
      callback.onFailure(ex);
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
