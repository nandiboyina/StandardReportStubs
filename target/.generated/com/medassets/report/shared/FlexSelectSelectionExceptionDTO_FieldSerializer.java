package com.medassets.report.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class FlexSelectSelectionExceptionDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.List getActualFormulas(com.medassets.report.shared.FlexSelectSelectionExceptionDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectSelectionExceptionDTO::actualFormulas;
  }-*/;
  
  private static native void setActualFormulas(com.medassets.report.shared.FlexSelectSelectionExceptionDTO instance, java.util.List value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectSelectionExceptionDTO::actualFormulas = value;
  }-*/;
  
  private static native java.util.List getAliasFormulas(com.medassets.report.shared.FlexSelectSelectionExceptionDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectSelectionExceptionDTO::aliasFormulas;
  }-*/;
  
  private static native void setAliasFormulas(com.medassets.report.shared.FlexSelectSelectionExceptionDTO instance, java.util.List value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectSelectionExceptionDTO::aliasFormulas = value;
  }-*/;
  
  private static native java.util.List getCboIs(com.medassets.report.shared.FlexSelectSelectionExceptionDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectSelectionExceptionDTO::cboIs;
  }-*/;
  
  private static native void setCboIs(com.medassets.report.shared.FlexSelectSelectionExceptionDTO instance, java.util.List value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectSelectionExceptionDTO::cboIs = value;
  }-*/;
  
  private static native java.util.List getCriteria2s(com.medassets.report.shared.FlexSelectSelectionExceptionDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectSelectionExceptionDTO::criteria2s;
  }-*/;
  
  private static native void setCriteria2s(com.medassets.report.shared.FlexSelectSelectionExceptionDTO instance, java.util.List value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectSelectionExceptionDTO::criteria2s = value;
  }-*/;
  
  private static native java.util.List getCriteria3s(com.medassets.report.shared.FlexSelectSelectionExceptionDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectSelectionExceptionDTO::criteria3s;
  }-*/;
  
  private static native void setCriteria3s(com.medassets.report.shared.FlexSelectSelectionExceptionDTO instance, java.util.List value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectSelectionExceptionDTO::criteria3s = value;
  }-*/;
  
  private static native java.util.List getDbFields(com.medassets.report.shared.FlexSelectSelectionExceptionDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectSelectionExceptionDTO::dbFields;
  }-*/;
  
  private static native void setDbFields(com.medassets.report.shared.FlexSelectSelectionExceptionDTO instance, java.util.List value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectSelectionExceptionDTO::dbFields = value;
  }-*/;
  
  private static native java.util.List getKeys(com.medassets.report.shared.FlexSelectSelectionExceptionDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectSelectionExceptionDTO::keys;
  }-*/;
  
  private static native void setKeys(com.medassets.report.shared.FlexSelectSelectionExceptionDTO instance, java.util.List value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectSelectionExceptionDTO::keys = value;
  }-*/;
  
  private static native java.util.Map getOptionTypeMap(com.medassets.report.shared.FlexSelectSelectionExceptionDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectSelectionExceptionDTO::optionTypeMap;
  }-*/;
  
  private static native void setOptionTypeMap(com.medassets.report.shared.FlexSelectSelectionExceptionDTO instance, java.util.Map value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectSelectionExceptionDTO::optionTypeMap = value;
  }-*/;
  
  private static native java.util.List getOptionTypes(com.medassets.report.shared.FlexSelectSelectionExceptionDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectSelectionExceptionDTO::optionTypes;
  }-*/;
  
  private static native void setOptionTypes(com.medassets.report.shared.FlexSelectSelectionExceptionDTO instance, java.util.List value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectSelectionExceptionDTO::optionTypes = value;
  }-*/;
  
  private static native boolean getPopulated(com.medassets.report.shared.FlexSelectSelectionExceptionDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectSelectionExceptionDTO::populated;
  }-*/;
  
  private static native void setPopulated(com.medassets.report.shared.FlexSelectSelectionExceptionDTO instance, boolean value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectSelectionExceptionDTO::populated = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.medassets.report.shared.FlexSelectSelectionExceptionDTO instance) throws SerializationException {
    setActualFormulas(instance, (java.util.List) streamReader.readObject());
    setAliasFormulas(instance, (java.util.List) streamReader.readObject());
    setCboIs(instance, (java.util.List) streamReader.readObject());
    setCriteria2s(instance, (java.util.List) streamReader.readObject());
    setCriteria3s(instance, (java.util.List) streamReader.readObject());
    setDbFields(instance, (java.util.List) streamReader.readObject());
    setKeys(instance, (java.util.List) streamReader.readObject());
    setOptionTypeMap(instance, (java.util.Map) streamReader.readObject());
    setOptionTypes(instance, (java.util.List) streamReader.readObject());
    setPopulated(instance, streamReader.readBoolean());
    
  }
  
  public static com.medassets.report.shared.FlexSelectSelectionExceptionDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.medassets.report.shared.FlexSelectSelectionExceptionDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.medassets.report.shared.FlexSelectSelectionExceptionDTO instance) throws SerializationException {
    streamWriter.writeObject(getActualFormulas(instance));
    streamWriter.writeObject(getAliasFormulas(instance));
    streamWriter.writeObject(getCboIs(instance));
    streamWriter.writeObject(getCriteria2s(instance));
    streamWriter.writeObject(getCriteria3s(instance));
    streamWriter.writeObject(getDbFields(instance));
    streamWriter.writeObject(getKeys(instance));
    streamWriter.writeObject(getOptionTypeMap(instance));
    streamWriter.writeObject(getOptionTypes(instance));
    streamWriter.writeBoolean(getPopulated(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.medassets.report.shared.FlexSelectSelectionExceptionDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.medassets.report.shared.FlexSelectSelectionExceptionDTO_FieldSerializer.deserialize(reader, (com.medassets.report.shared.FlexSelectSelectionExceptionDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.medassets.report.shared.FlexSelectSelectionExceptionDTO_FieldSerializer.serialize(writer, (com.medassets.report.shared.FlexSelectSelectionExceptionDTO)object);
  }
  
}
