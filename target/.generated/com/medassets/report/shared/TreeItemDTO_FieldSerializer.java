package com.medassets.report.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class TreeItemDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.lang.Long getObjectId(com.medassets.report.shared.TreeItemDTO instance) {
    return (java.lang.Long) ReflectionHelper.getField(com.medassets.report.shared.TreeItemDTO.class, instance, "ObjectId");
  }
  
  private static void setObjectId(com.medassets.report.shared.TreeItemDTO instance, java.lang.Long value) 
  {
    ReflectionHelper.setField(com.medassets.report.shared.TreeItemDTO.class, instance, "ObjectId", value);
  }
  
  private static java.lang.String getCategory(com.medassets.report.shared.TreeItemDTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.medassets.report.shared.TreeItemDTO.class, instance, "category");
  }
  
  private static void setCategory(com.medassets.report.shared.TreeItemDTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.medassets.report.shared.TreeItemDTO.class, instance, "category", value);
  }
  
  private static java.util.List getChildren(com.medassets.report.shared.TreeItemDTO instance) {
    return (java.util.List) ReflectionHelper.getField(com.medassets.report.shared.TreeItemDTO.class, instance, "children");
  }
  
  private static void setChildren(com.medassets.report.shared.TreeItemDTO instance, java.util.List value) 
  {
    ReflectionHelper.setField(com.medassets.report.shared.TreeItemDTO.class, instance, "children", value);
  }
  
  private static java.lang.String getName(com.medassets.report.shared.TreeItemDTO instance) {
    return (java.lang.String) ReflectionHelper.getField(com.medassets.report.shared.TreeItemDTO.class, instance, "name");
  }
  
  private static void setName(com.medassets.report.shared.TreeItemDTO instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.medassets.report.shared.TreeItemDTO.class, instance, "name", value);
  }
  
  private static com.medassets.report.shared.TreeItemDTO getParent(com.medassets.report.shared.TreeItemDTO instance) {
    return (com.medassets.report.shared.TreeItemDTO) ReflectionHelper.getField(com.medassets.report.shared.TreeItemDTO.class, instance, "parent");
  }
  
  private static void setParent(com.medassets.report.shared.TreeItemDTO instance, com.medassets.report.shared.TreeItemDTO value) 
  {
    ReflectionHelper.setField(com.medassets.report.shared.TreeItemDTO.class, instance, "parent", value);
  }
  
  private static java.lang.Long getParentFolderId(com.medassets.report.shared.TreeItemDTO instance) {
    return (java.lang.Long) ReflectionHelper.getField(com.medassets.report.shared.TreeItemDTO.class, instance, "parentFolderId");
  }
  
  private static void setParentFolderId(com.medassets.report.shared.TreeItemDTO instance, java.lang.Long value) 
  {
    ReflectionHelper.setField(com.medassets.report.shared.TreeItemDTO.class, instance, "parentFolderId", value);
  }
  
  private static int getType(com.medassets.report.shared.TreeItemDTO instance) {
    return (java.lang.Integer) ReflectionHelper.getField(com.medassets.report.shared.TreeItemDTO.class, instance, "type");
  }
  
  private static void setType(com.medassets.report.shared.TreeItemDTO instance, int value) 
  {
    ReflectionHelper.setField(com.medassets.report.shared.TreeItemDTO.class, instance, "type", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.medassets.report.shared.TreeItemDTO instance) throws SerializationException {
    setObjectId(instance, (java.lang.Long) streamReader.readObject());
    setCategory(instance, streamReader.readString());
    setChildren(instance, (java.util.List) streamReader.readObject());
    setName(instance, streamReader.readString());
    setParent(instance, (com.medassets.report.shared.TreeItemDTO) streamReader.readObject());
    setParentFolderId(instance, (java.lang.Long) streamReader.readObject());
    setType(instance, streamReader.readInt());
    
  }
  
  public static com.medassets.report.shared.TreeItemDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.medassets.report.shared.TreeItemDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.medassets.report.shared.TreeItemDTO instance) throws SerializationException {
    streamWriter.writeObject(getObjectId(instance));
    streamWriter.writeString(getCategory(instance));
    streamWriter.writeObject(getChildren(instance));
    streamWriter.writeString(getName(instance));
    streamWriter.writeObject(getParent(instance));
    streamWriter.writeObject(getParentFolderId(instance));
    streamWriter.writeInt(getType(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.medassets.report.shared.TreeItemDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.medassets.report.shared.TreeItemDTO_FieldSerializer.deserialize(reader, (com.medassets.report.shared.TreeItemDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.medassets.report.shared.TreeItemDTO_FieldSerializer.serialize(writer, (com.medassets.report.shared.TreeItemDTO)object);
  }
  
}
