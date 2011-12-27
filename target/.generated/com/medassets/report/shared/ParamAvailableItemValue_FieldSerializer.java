package com.medassets.report.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ParamAvailableItemValue_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static java.lang.String getCode(com.medassets.report.shared.ParamAvailableItemValue instance) {
    return (java.lang.String) ReflectionHelper.getField(com.medassets.report.shared.ParamAvailableItemValue.class, instance, "code");
  }
  
  private static void setCode(com.medassets.report.shared.ParamAvailableItemValue instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.medassets.report.shared.ParamAvailableItemValue.class, instance, "code", value);
  }
  
  private static int getHashCode(com.medassets.report.shared.ParamAvailableItemValue instance) {
    return (java.lang.Integer) ReflectionHelper.getField(com.medassets.report.shared.ParamAvailableItemValue.class, instance, "hashCode");
  }
  
  private static void setHashCode(com.medassets.report.shared.ParamAvailableItemValue instance, int value) 
  {
    ReflectionHelper.setField(com.medassets.report.shared.ParamAvailableItemValue.class, instance, "hashCode", value);
  }
  
  private static java.lang.Integer getIndex(com.medassets.report.shared.ParamAvailableItemValue instance) {
    return (java.lang.Integer) ReflectionHelper.getField(com.medassets.report.shared.ParamAvailableItemValue.class, instance, "index");
  }
  
  private static void setIndex(com.medassets.report.shared.ParamAvailableItemValue instance, java.lang.Integer value) 
  {
    ReflectionHelper.setField(com.medassets.report.shared.ParamAvailableItemValue.class, instance, "index", value);
  }
  
  private static java.lang.String getName(com.medassets.report.shared.ParamAvailableItemValue instance) {
    return (java.lang.String) ReflectionHelper.getField(com.medassets.report.shared.ParamAvailableItemValue.class, instance, "name");
  }
  
  private static void setName(com.medassets.report.shared.ParamAvailableItemValue instance, java.lang.String value) 
  {
    ReflectionHelper.setField(com.medassets.report.shared.ParamAvailableItemValue.class, instance, "name", value);
  }
  
  public static void deserialize(SerializationStreamReader streamReader, com.medassets.report.shared.ParamAvailableItemValue instance) throws SerializationException {
    setCode(instance, streamReader.readString());
    setHashCode(instance, streamReader.readInt());
    setIndex(instance, (java.lang.Integer) streamReader.readObject());
    setName(instance, streamReader.readString());
    
  }
  
  public static com.medassets.report.shared.ParamAvailableItemValue instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.medassets.report.shared.ParamAvailableItemValue();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.medassets.report.shared.ParamAvailableItemValue instance) throws SerializationException {
    streamWriter.writeString(getCode(instance));
    streamWriter.writeInt(getHashCode(instance));
    streamWriter.writeObject(getIndex(instance));
    streamWriter.writeString(getName(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.medassets.report.shared.ParamAvailableItemValue_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.medassets.report.shared.ParamAvailableItemValue_FieldSerializer.deserialize(reader, (com.medassets.report.shared.ParamAvailableItemValue)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.medassets.report.shared.ParamAvailableItemValue_FieldSerializer.serialize(writer, (com.medassets.report.shared.ParamAvailableItemValue)object);
  }
  
}
