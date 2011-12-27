package com.medassets.report.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class FlexSortParamItemDTO_GroupOrder_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getGroupOrder(com.medassets.report.shared.FlexSortParamItemDTO.GroupOrder instance) /*-{
    return instance.@com.medassets.report.shared.FlexSortParamItemDTO$GroupOrder::groupOrder;
  }-*/;
  
  private static native void setGroupOrder(com.medassets.report.shared.FlexSortParamItemDTO.GroupOrder instance, java.lang.String value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSortParamItemDTO$GroupOrder::groupOrder = value;
  }-*/;
  
  private static native java.lang.String getOrderBy(com.medassets.report.shared.FlexSortParamItemDTO.GroupOrder instance) /*-{
    return instance.@com.medassets.report.shared.FlexSortParamItemDTO$GroupOrder::orderBy;
  }-*/;
  
  private static native void setOrderBy(com.medassets.report.shared.FlexSortParamItemDTO.GroupOrder instance, java.lang.String value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSortParamItemDTO$GroupOrder::orderBy = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.medassets.report.shared.FlexSortParamItemDTO.GroupOrder instance) throws SerializationException {
    // Enum deserialization is handled via the instantiate method
  }
  
  public static com.medassets.report.shared.FlexSortParamItemDTO.GroupOrder instantiate(SerializationStreamReader streamReader) throws SerializationException {
    int ordinal = streamReader.readInt();
    com.medassets.report.shared.FlexSortParamItemDTO.GroupOrder[] values = com.medassets.report.shared.FlexSortParamItemDTO.GroupOrder.values();
    assert (ordinal >= 0 && ordinal < values.length);
    return values[ordinal];
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.medassets.report.shared.FlexSortParamItemDTO.GroupOrder instance) throws SerializationException {
    assert (instance != null);
    streamWriter.writeInt(instance.ordinal());
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.medassets.report.shared.FlexSortParamItemDTO_GroupOrder_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.medassets.report.shared.FlexSortParamItemDTO_GroupOrder_FieldSerializer.deserialize(reader, (com.medassets.report.shared.FlexSortParamItemDTO.GroupOrder)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.medassets.report.shared.FlexSortParamItemDTO_GroupOrder_FieldSerializer.serialize(writer, (com.medassets.report.shared.FlexSortParamItemDTO.GroupOrder)object);
  }
  
}
