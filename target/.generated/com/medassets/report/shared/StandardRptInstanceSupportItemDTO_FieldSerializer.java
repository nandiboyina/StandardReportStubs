package com.medassets.report.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class StandardRptInstanceSupportItemDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.lang.String getCreatingUser(com.medassets.report.shared.StandardRptInstanceSupportItemDTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.medassets.report.shared.StandardRptInstanceSupportItemDTO.class, instance, "creatingUser");
  }
  
  private static void setCreatingUser(com.medassets.report.shared.StandardRptInstanceSupportItemDTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.medassets.report.shared.StandardRptInstanceSupportItemDTO.class, instance, "creatingUser", value);
  }
  
  private static java.lang.Long getFolderID(com.medassets.report.shared.StandardRptInstanceSupportItemDTO instance) {
    return (java.lang.Long) ReflectionHelper.getField(com.medassets.report.shared.StandardRptInstanceSupportItemDTO.class, instance, "folderID");
  }
  
  private static void setFolderID(com.medassets.report.shared.StandardRptInstanceSupportItemDTO instance, java.lang.Long value) 
  {
    ReflectionHelper.setField(com.medassets.report.shared.StandardRptInstanceSupportItemDTO.class, instance, "folderID", value);
  }
  
  private static java.lang.Long getInstanceID(com.medassets.report.shared.StandardRptInstanceSupportItemDTO instance) {
    return (java.lang.Long) ReflectionHelper.getField(com.medassets.report.shared.StandardRptInstanceSupportItemDTO.class, instance, "instanceID");
  }
  
  private static void setInstanceID(com.medassets.report.shared.StandardRptInstanceSupportItemDTO instance, java.lang.Long value) 
  {
    ReflectionHelper.setField(com.medassets.report.shared.StandardRptInstanceSupportItemDTO.class, instance, "instanceID", value);
  }
  
  private static java.lang.String getModifyingUser(com.medassets.report.shared.StandardRptInstanceSupportItemDTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.medassets.report.shared.StandardRptInstanceSupportItemDTO.class, instance, "modifyingUser");
  }
  
  private static void setModifyingUser(com.medassets.report.shared.StandardRptInstanceSupportItemDTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.medassets.report.shared.StandardRptInstanceSupportItemDTO.class, instance, "modifyingUser", value);
  }
  
  private static char getPublished(com.medassets.report.shared.StandardRptInstanceSupportItemDTO instance) {
    return (java.lang.Character) ReflectionHelper.getField(com.medassets.report.shared.StandardRptInstanceSupportItemDTO.class, instance, "published");
  }
  
  private static void setPublished(com.medassets.report.shared.StandardRptInstanceSupportItemDTO instance, char value) 
  {
    ReflectionHelper.setField(com.medassets.report.shared.StandardRptInstanceSupportItemDTO.class, instance, "published", value);
  }
  
  private static java.lang.String getRptInstanceDescription(com.medassets.report.shared.StandardRptInstanceSupportItemDTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.medassets.report.shared.StandardRptInstanceSupportItemDTO.class, instance, "rptInstanceDescription");
  }
  
  private static void setRptInstanceDescription(com.medassets.report.shared.StandardRptInstanceSupportItemDTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.medassets.report.shared.StandardRptInstanceSupportItemDTO.class, instance, "rptInstanceDescription", value);
  }
  
  private static java.lang.String getRptInstanceName(com.medassets.report.shared.StandardRptInstanceSupportItemDTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.medassets.report.shared.StandardRptInstanceSupportItemDTO.class, instance, "rptInstanceName");
  }
  
  private static void setRptInstanceName(com.medassets.report.shared.StandardRptInstanceSupportItemDTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.medassets.report.shared.StandardRptInstanceSupportItemDTO.class, instance, "rptInstanceName", value);
  }
  
  private static java.lang.String getSubTitleName(com.medassets.report.shared.StandardRptInstanceSupportItemDTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.medassets.report.shared.StandardRptInstanceSupportItemDTO.class, instance, "subTitleName");
  }
  
  private static void setSubTitleName(com.medassets.report.shared.StandardRptInstanceSupportItemDTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.medassets.report.shared.StandardRptInstanceSupportItemDTO.class, instance, "subTitleName", value);
  }
  
  private static java.lang.Long getTemplateID(com.medassets.report.shared.StandardRptInstanceSupportItemDTO instance) {
    return (java.lang.Long) ReflectionHelper.getField(com.medassets.report.shared.StandardRptInstanceSupportItemDTO.class, instance, "templateID");
  }
  
  private static void setTemplateID(com.medassets.report.shared.StandardRptInstanceSupportItemDTO instance, java.lang.Long value) 
  {
    ReflectionHelper.setField(com.medassets.report.shared.StandardRptInstanceSupportItemDTO.class, instance, "templateID", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.medassets.report.shared.StandardRptInstanceSupportItemDTO instance) throws SerializationException {
    setCreatingUser(instance, streamReader.readString());
    setFolderID(instance, (java.lang.Long) streamReader.readObject());
    setInstanceID(instance, (java.lang.Long) streamReader.readObject());
    setModifyingUser(instance, streamReader.readString());
    setPublished(instance, streamReader.readChar());
    setRptInstanceDescription(instance, streamReader.readString());
    setRptInstanceName(instance, streamReader.readString());
    setSubTitleName(instance, streamReader.readString());
    setTemplateID(instance, (java.lang.Long) streamReader.readObject());
    
  }
  
  public static com.medassets.report.shared.StandardRptInstanceSupportItemDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.medassets.report.shared.StandardRptInstanceSupportItemDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.medassets.report.shared.StandardRptInstanceSupportItemDTO instance) throws SerializationException {
    streamWriter.writeString(getCreatingUser(instance));
    streamWriter.writeObject(getFolderID(instance));
    streamWriter.writeObject(getInstanceID(instance));
    streamWriter.writeString(getModifyingUser(instance));
    streamWriter.writeChar(getPublished(instance));
    streamWriter.writeString(getRptInstanceDescription(instance));
    streamWriter.writeString(getRptInstanceName(instance));
    streamWriter.writeString(getSubTitleName(instance));
    streamWriter.writeObject(getTemplateID(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.medassets.report.shared.StandardRptInstanceSupportItemDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.medassets.report.shared.StandardRptInstanceSupportItemDTO_FieldSerializer.deserialize(reader, (com.medassets.report.shared.StandardRptInstanceSupportItemDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.medassets.report.shared.StandardRptInstanceSupportItemDTO_FieldSerializer.serialize(writer, (com.medassets.report.shared.StandardRptInstanceSupportItemDTO)object);
  }
  
}
