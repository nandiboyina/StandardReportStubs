package com.medassets.report.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class ParamAvailableItems_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  public static void deserialize(SerializationStreamReader streamReader, com.medassets.report.shared.ParamAvailableItems instance) throws SerializationException {
    instance.codeOnly = streamReader.readBoolean();
    instance.params = (java.util.ArrayList) streamReader.readObject();
    
  }
  
  public static com.medassets.report.shared.ParamAvailableItems instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.medassets.report.shared.ParamAvailableItems();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.medassets.report.shared.ParamAvailableItems instance) throws SerializationException {
    streamWriter.writeBoolean(instance.codeOnly);
    streamWriter.writeObject(instance.params);
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.medassets.report.shared.ParamAvailableItems_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.medassets.report.shared.ParamAvailableItems_FieldSerializer.deserialize(reader, (com.medassets.report.shared.ParamAvailableItems)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.medassets.report.shared.ParamAvailableItems_FieldSerializer.serialize(writer, (com.medassets.report.shared.ParamAvailableItems)object);
  }
  
}
