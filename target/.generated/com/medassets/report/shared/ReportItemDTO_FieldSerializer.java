package com.medassets.report.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ReportItemDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.lang.String getCategory(com.medassets.report.shared.ReportItemDTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.medassets.report.shared.ReportItemDTO.class, instance, "category");
  }
  
  private static void setCategory(com.medassets.report.shared.ReportItemDTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.medassets.report.shared.ReportItemDTO.class, instance, "category", value);
  }
  
  private static java.lang.String getCreatedCode(com.medassets.report.shared.ReportItemDTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.medassets.report.shared.ReportItemDTO.class, instance, "createdCode");
  }
  
  private static void setCreatedCode(com.medassets.report.shared.ReportItemDTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.medassets.report.shared.ReportItemDTO.class, instance, "createdCode", value);
  }
  
  private static java.lang.Long getCreatedDate(com.medassets.report.shared.ReportItemDTO instance) {
    return (java.lang.Long) ReflectionHelper.getField(com.medassets.report.shared.ReportItemDTO.class, instance, "createdDate");
  }
  
  private static void setCreatedDate(com.medassets.report.shared.ReportItemDTO instance, java.lang.Long value) 
  {
    ReflectionHelper.setField(com.medassets.report.shared.ReportItemDTO.class, instance, "createdDate", value);
  }
  
  private static java.lang.String getDescription(com.medassets.report.shared.ReportItemDTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.medassets.report.shared.ReportItemDTO.class, instance, "description");
  }
  
  private static void setDescription(com.medassets.report.shared.ReportItemDTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.medassets.report.shared.ReportItemDTO.class, instance, "description", value);
  }
  
  private static java.lang.Long getFolderId(com.medassets.report.shared.ReportItemDTO instance) {
    return (java.lang.Long) ReflectionHelper.getField(com.medassets.report.shared.ReportItemDTO.class, instance, "folderId");
  }
  
  private static void setFolderId(com.medassets.report.shared.ReportItemDTO instance, java.lang.Long value) 
  {
    ReflectionHelper.setField(com.medassets.report.shared.ReportItemDTO.class, instance, "folderId", value);
  }
  
  private static java.lang.String getFolderName(com.medassets.report.shared.ReportItemDTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.medassets.report.shared.ReportItemDTO.class, instance, "folderName");
  }
  
  private static void setFolderName(com.medassets.report.shared.ReportItemDTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.medassets.report.shared.ReportItemDTO.class, instance, "folderName", value);
  }
  
  private static java.lang.String getModifiedCode(com.medassets.report.shared.ReportItemDTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.medassets.report.shared.ReportItemDTO.class, instance, "modifiedCode");
  }
  
  private static void setModifiedCode(com.medassets.report.shared.ReportItemDTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.medassets.report.shared.ReportItemDTO.class, instance, "modifiedCode", value);
  }
  
  private static java.lang.Long getModifiedDate(com.medassets.report.shared.ReportItemDTO instance) {
    return (java.lang.Long) ReflectionHelper.getField(com.medassets.report.shared.ReportItemDTO.class, instance, "modifiedDate");
  }
  
  private static void setModifiedDate(com.medassets.report.shared.ReportItemDTO instance, java.lang.Long value) 
  {
    ReflectionHelper.setField(com.medassets.report.shared.ReportItemDTO.class, instance, "modifiedDate", value);
  }
  
  private static java.lang.String getName(com.medassets.report.shared.ReportItemDTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.medassets.report.shared.ReportItemDTO.class, instance, "name");
  }
  
  private static void setName(com.medassets.report.shared.ReportItemDTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.medassets.report.shared.ReportItemDTO.class, instance, "name", value);
  }
  
  private static java.lang.String getPublished(com.medassets.report.shared.ReportItemDTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.medassets.report.shared.ReportItemDTO.class, instance, "published");
  }
  
  private static void setPublished(com.medassets.report.shared.ReportItemDTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.medassets.report.shared.ReportItemDTO.class, instance, "published", value);
  }
  
  private static java.lang.Long getReportInstanceId(com.medassets.report.shared.ReportItemDTO instance) {
    return (java.lang.Long) ReflectionHelper.getField(com.medassets.report.shared.ReportItemDTO.class, instance, "reportInstanceId");
  }
  
  private static void setReportInstanceId(com.medassets.report.shared.ReportItemDTO instance, java.lang.Long value) 
  {
    ReflectionHelper.setField(com.medassets.report.shared.ReportItemDTO.class, instance, "reportInstanceId", value);
  }
  
  private static java.lang.Long getReportTemplateId(com.medassets.report.shared.ReportItemDTO instance) {
    return (java.lang.Long) ReflectionHelper.getField(com.medassets.report.shared.ReportItemDTO.class, instance, "reportTemplateId");
  }
  
  private static void setReportTemplateId(com.medassets.report.shared.ReportItemDTO instance, java.lang.Long value) 
  {
    ReflectionHelper.setField(com.medassets.report.shared.ReportItemDTO.class, instance, "reportTemplateId", value);
  }
  
  private static java.lang.String getReportType(com.medassets.report.shared.ReportItemDTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.medassets.report.shared.ReportItemDTO.class, instance, "reportType");
  }
  
  private static void setReportType(com.medassets.report.shared.ReportItemDTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.medassets.report.shared.ReportItemDTO.class, instance, "reportType", value);
  }
  
  private static java.lang.String getSubTitle(com.medassets.report.shared.ReportItemDTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.medassets.report.shared.ReportItemDTO.class, instance, "subTitle");
  }
  
  private static void setSubTitle(com.medassets.report.shared.ReportItemDTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.medassets.report.shared.ReportItemDTO.class, instance, "subTitle", value);
  }
  
  private static java.lang.String getTemplateName(com.medassets.report.shared.ReportItemDTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.medassets.report.shared.ReportItemDTO.class, instance, "templateName");
  }
  
  private static void setTemplateName(com.medassets.report.shared.ReportItemDTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.medassets.report.shared.ReportItemDTO.class, instance, "templateName", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.medassets.report.shared.ReportItemDTO instance) throws SerializationException {
    setCategory(instance, streamReader.readString());
    setCreatedCode(instance, streamReader.readString());
    setCreatedDate(instance, (java.lang.Long) streamReader.readObject());
    setDescription(instance, streamReader.readString());
    setFolderId(instance, (java.lang.Long) streamReader.readObject());
    setFolderName(instance, streamReader.readString());
    setModifiedCode(instance, streamReader.readString());
    setModifiedDate(instance, (java.lang.Long) streamReader.readObject());
    setName(instance, streamReader.readString());
    setPublished(instance, streamReader.readString());
    setReportInstanceId(instance, (java.lang.Long) streamReader.readObject());
    setReportTemplateId(instance, (java.lang.Long) streamReader.readObject());
    setReportType(instance, streamReader.readString());
    setSubTitle(instance, streamReader.readString());
    setTemplateName(instance, streamReader.readString());
    
  }
  
  public static com.medassets.report.shared.ReportItemDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.medassets.report.shared.ReportItemDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.medassets.report.shared.ReportItemDTO instance) throws SerializationException {
    streamWriter.writeString(getCategory(instance));
    streamWriter.writeString(getCreatedCode(instance));
    streamWriter.writeObject(getCreatedDate(instance));
    streamWriter.writeString(getDescription(instance));
    streamWriter.writeObject(getFolderId(instance));
    streamWriter.writeString(getFolderName(instance));
    streamWriter.writeString(getModifiedCode(instance));
    streamWriter.writeObject(getModifiedDate(instance));
    streamWriter.writeString(getName(instance));
    streamWriter.writeString(getPublished(instance));
    streamWriter.writeObject(getReportInstanceId(instance));
    streamWriter.writeObject(getReportTemplateId(instance));
    streamWriter.writeString(getReportType(instance));
    streamWriter.writeString(getSubTitle(instance));
    streamWriter.writeString(getTemplateName(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.medassets.report.shared.ReportItemDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.medassets.report.shared.ReportItemDTO_FieldSerializer.deserialize(reader, (com.medassets.report.shared.ReportItemDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.medassets.report.shared.ReportItemDTO_FieldSerializer.serialize(writer, (com.medassets.report.shared.ReportItemDTO)object);
  }
  
}
