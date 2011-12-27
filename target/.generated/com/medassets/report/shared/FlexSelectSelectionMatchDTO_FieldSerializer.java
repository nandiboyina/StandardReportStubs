package com.medassets.report.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class FlexSelectSelectionMatchDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.List getActualFormulas(com.medassets.report.shared.FlexSelectSelectionMatchDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectSelectionMatchDTO::actualFormulas;
  }-*/;
  
  private static native void setActualFormulas(com.medassets.report.shared.FlexSelectSelectionMatchDTO instance, java.util.List value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectSelectionMatchDTO::actualFormulas = value;
  }-*/;
  
  private static native java.util.List getAliasFormulas(com.medassets.report.shared.FlexSelectSelectionMatchDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectSelectionMatchDTO::aliasFormulas;
  }-*/;
  
  private static native void setAliasFormulas(com.medassets.report.shared.FlexSelectSelectionMatchDTO instance, java.util.List value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectSelectionMatchDTO::aliasFormulas = value;
  }-*/;
  
  private static native java.util.List getCboCodeNames(com.medassets.report.shared.FlexSelectSelectionMatchDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectSelectionMatchDTO::cboCodeNames;
  }-*/;
  
  private static native void setCboCodeNames(com.medassets.report.shared.FlexSelectSelectionMatchDTO instance, java.util.List value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectSelectionMatchDTO::cboCodeNames = value;
  }-*/;
  
  private static native java.util.List getCboThats(com.medassets.report.shared.FlexSelectSelectionMatchDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectSelectionMatchDTO::cboThats;
  }-*/;
  
  private static native void setCboThats(com.medassets.report.shared.FlexSelectSelectionMatchDTO instance, java.util.List value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectSelectionMatchDTO::cboThats = value;
  }-*/;
  
  private static native java.util.List getDbFields(com.medassets.report.shared.FlexSelectSelectionMatchDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectSelectionMatchDTO::dbFields;
  }-*/;
  
  private static native void setDbFields(com.medassets.report.shared.FlexSelectSelectionMatchDTO instance, java.util.List value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectSelectionMatchDTO::dbFields = value;
  }-*/;
  
  private static native java.util.List getIgnoreCapits(com.medassets.report.shared.FlexSelectSelectionMatchDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectSelectionMatchDTO::ignoreCapits;
  }-*/;
  
  private static native void setIgnoreCapits(com.medassets.report.shared.FlexSelectSelectionMatchDTO instance, java.util.List value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectSelectionMatchDTO::ignoreCapits = value;
  }-*/;
  
  private static native java.util.List getKeys(com.medassets.report.shared.FlexSelectSelectionMatchDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectSelectionMatchDTO::keys;
  }-*/;
  
  private static native void setKeys(com.medassets.report.shared.FlexSelectSelectionMatchDTO instance, java.util.List value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectSelectionMatchDTO::keys = value;
  }-*/;
  
  private static native java.util.Map getOptionTypeMap(com.medassets.report.shared.FlexSelectSelectionMatchDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectSelectionMatchDTO::optionTypeMap;
  }-*/;
  
  private static native void setOptionTypeMap(com.medassets.report.shared.FlexSelectSelectionMatchDTO instance, java.util.Map value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectSelectionMatchDTO::optionTypeMap = value;
  }-*/;
  
  private static native java.util.List getOptionTypes(com.medassets.report.shared.FlexSelectSelectionMatchDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectSelectionMatchDTO::optionTypes;
  }-*/;
  
  private static native void setOptionTypes(com.medassets.report.shared.FlexSelectSelectionMatchDTO instance, java.util.List value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectSelectionMatchDTO::optionTypes = value;
  }-*/;
  
  private static native boolean getPopulated(com.medassets.report.shared.FlexSelectSelectionMatchDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectSelectionMatchDTO::populated;
  }-*/;
  
  private static native void setPopulated(com.medassets.report.shared.FlexSelectSelectionMatchDTO instance, boolean value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectSelectionMatchDTO::populated = value;
  }-*/;
  
  private static native java.util.List getTxtTheChars(com.medassets.report.shared.FlexSelectSelectionMatchDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectSelectionMatchDTO::txtTheChars;
  }-*/;
  
  private static native void setTxtTheChars(com.medassets.report.shared.FlexSelectSelectionMatchDTO instance, java.util.List value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectSelectionMatchDTO::txtTheChars = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.medassets.report.shared.FlexSelectSelectionMatchDTO instance) throws SerializationException {
    setActualFormulas(instance, (java.util.List) streamReader.readObject());
    setAliasFormulas(instance, (java.util.List) streamReader.readObject());
    setCboCodeNames(instance, (java.util.List) streamReader.readObject());
    setCboThats(instance, (java.util.List) streamReader.readObject());
    setDbFields(instance, (java.util.List) streamReader.readObject());
    setIgnoreCapits(instance, (java.util.List) streamReader.readObject());
    setKeys(instance, (java.util.List) streamReader.readObject());
    setOptionTypeMap(instance, (java.util.Map) streamReader.readObject());
    setOptionTypes(instance, (java.util.List) streamReader.readObject());
    setPopulated(instance, streamReader.readBoolean());
    setTxtTheChars(instance, (java.util.List) streamReader.readObject());
    
  }
  
  public static com.medassets.report.shared.FlexSelectSelectionMatchDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.medassets.report.shared.FlexSelectSelectionMatchDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.medassets.report.shared.FlexSelectSelectionMatchDTO instance) throws SerializationException {
    streamWriter.writeObject(getActualFormulas(instance));
    streamWriter.writeObject(getAliasFormulas(instance));
    streamWriter.writeObject(getCboCodeNames(instance));
    streamWriter.writeObject(getCboThats(instance));
    streamWriter.writeObject(getDbFields(instance));
    streamWriter.writeObject(getIgnoreCapits(instance));
    streamWriter.writeObject(getKeys(instance));
    streamWriter.writeObject(getOptionTypeMap(instance));
    streamWriter.writeObject(getOptionTypes(instance));
    streamWriter.writeBoolean(getPopulated(instance));
    streamWriter.writeObject(getTxtTheChars(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.medassets.report.shared.FlexSelectSelectionMatchDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.medassets.report.shared.FlexSelectSelectionMatchDTO_FieldSerializer.deserialize(reader, (com.medassets.report.shared.FlexSelectSelectionMatchDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.medassets.report.shared.FlexSelectSelectionMatchDTO_FieldSerializer.serialize(writer, (com.medassets.report.shared.FlexSelectSelectionMatchDTO)object);
  }
  
}
