package com.medassets.report.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class FlexSelectSelectionAllDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.util.List getActualFormulas(com.medassets.report.shared.FlexSelectSelectionAllDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectSelectionAllDTO::actualFormulas;
  }-*/;
  
  private static native void setActualFormulas(com.medassets.report.shared.FlexSelectSelectionAllDTO instance, java.util.List value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectSelectionAllDTO::actualFormulas = value;
  }-*/;
  
  private static native java.util.List getAliasFormulas(com.medassets.report.shared.FlexSelectSelectionAllDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectSelectionAllDTO::aliasFormulas;
  }-*/;
  
  private static native void setAliasFormulas(com.medassets.report.shared.FlexSelectSelectionAllDTO instance, java.util.List value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectSelectionAllDTO::aliasFormulas = value;
  }-*/;
  
  private static native java.util.List getCodeNameMapList(com.medassets.report.shared.FlexSelectSelectionAllDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectSelectionAllDTO::codeNameMapList;
  }-*/;
  
  private static native void setCodeNameMapList(com.medassets.report.shared.FlexSelectSelectionAllDTO instance, java.util.List value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectSelectionAllDTO::codeNameMapList = value;
  }-*/;
  
  private static native java.util.List getDbFields(com.medassets.report.shared.FlexSelectSelectionAllDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectSelectionAllDTO::dbFields;
  }-*/;
  
  private static native void setDbFields(com.medassets.report.shared.FlexSelectSelectionAllDTO instance, java.util.List value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectSelectionAllDTO::dbFields = value;
  }-*/;
  
  private static native java.util.List getIncludeNulls(com.medassets.report.shared.FlexSelectSelectionAllDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectSelectionAllDTO::includeNulls;
  }-*/;
  
  private static native void setIncludeNulls(com.medassets.report.shared.FlexSelectSelectionAllDTO instance, java.util.List value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectSelectionAllDTO::includeNulls = value;
  }-*/;
  
  private static native java.lang.Boolean getIsNameAvailable(com.medassets.report.shared.FlexSelectSelectionAllDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectSelectionAllDTO::isNameAvailable;
  }-*/;
  
  private static native void setIsNameAvailable(com.medassets.report.shared.FlexSelectSelectionAllDTO instance, java.lang.Boolean value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectSelectionAllDTO::isNameAvailable = value;
  }-*/;
  
  private static native java.util.List getKeys(com.medassets.report.shared.FlexSelectSelectionAllDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectSelectionAllDTO::keys;
  }-*/;
  
  private static native void setKeys(com.medassets.report.shared.FlexSelectSelectionAllDTO instance, java.util.List value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectSelectionAllDTO::keys = value;
  }-*/;
  
  private static native java.util.List getNamesStoredWithCodes(com.medassets.report.shared.FlexSelectSelectionAllDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectSelectionAllDTO::namesStoredWithCodes;
  }-*/;
  
  private static native void setNamesStoredWithCodes(com.medassets.report.shared.FlexSelectSelectionAllDTO instance, java.util.List value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectSelectionAllDTO::namesStoredWithCodes = value;
  }-*/;
  
  private static native java.util.List getOptionTypes(com.medassets.report.shared.FlexSelectSelectionAllDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectSelectionAllDTO::optionTypes;
  }-*/;
  
  private static native void setOptionTypes(com.medassets.report.shared.FlexSelectSelectionAllDTO instance, java.util.List value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectSelectionAllDTO::optionTypes = value;
  }-*/;
  
  private static native java.util.SortedMap getParamCodeIndexMap(com.medassets.report.shared.FlexSelectSelectionAllDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectSelectionAllDTO::paramCodeIndexMap;
  }-*/;
  
  private static native void setParamCodeIndexMap(com.medassets.report.shared.FlexSelectSelectionAllDTO instance, java.util.SortedMap value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectSelectionAllDTO::paramCodeIndexMap = value;
  }-*/;
  
  private static native boolean getPopulated(com.medassets.report.shared.FlexSelectSelectionAllDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectSelectionAllDTO::populated;
  }-*/;
  
  private static native void setPopulated(com.medassets.report.shared.FlexSelectSelectionAllDTO instance, boolean value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectSelectionAllDTO::populated = value;
  }-*/;
  
  private static native java.util.List getRangeEnds(com.medassets.report.shared.FlexSelectSelectionAllDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectSelectionAllDTO::rangeEnds;
  }-*/;
  
  private static native void setRangeEnds(com.medassets.report.shared.FlexSelectSelectionAllDTO instance, java.util.List value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectSelectionAllDTO::rangeEnds = value;
  }-*/;
  
  private static native java.util.List getRangeStarts(com.medassets.report.shared.FlexSelectSelectionAllDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectSelectionAllDTO::rangeStarts;
  }-*/;
  
  private static native void setRangeStarts(com.medassets.report.shared.FlexSelectSelectionAllDTO instance, java.util.List value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectSelectionAllDTO::rangeStarts = value;
  }-*/;
  
  private static native java.util.List getSelectedItems(com.medassets.report.shared.FlexSelectSelectionAllDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectSelectionAllDTO::selectedItems;
  }-*/;
  
  private static native void setSelectedItems(com.medassets.report.shared.FlexSelectSelectionAllDTO instance, java.util.List value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectSelectionAllDTO::selectedItems = value;
  }-*/;
  
  private static native java.util.List getSingleValues(com.medassets.report.shared.FlexSelectSelectionAllDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectSelectionAllDTO::singleValues;
  }-*/;
  
  private static native void setSingleValues(com.medassets.report.shared.FlexSelectSelectionAllDTO instance, java.util.List value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectSelectionAllDTO::singleValues = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.medassets.report.shared.FlexSelectSelectionAllDTO instance) throws SerializationException {
    setActualFormulas(instance, (java.util.List) streamReader.readObject());
    setAliasFormulas(instance, (java.util.List) streamReader.readObject());
    setCodeNameMapList(instance, (java.util.List) streamReader.readObject());
    setDbFields(instance, (java.util.List) streamReader.readObject());
    setIncludeNulls(instance, (java.util.List) streamReader.readObject());
    setIsNameAvailable(instance, (java.lang.Boolean) streamReader.readObject());
    setKeys(instance, (java.util.List) streamReader.readObject());
    setNamesStoredWithCodes(instance, (java.util.List) streamReader.readObject());
    setOptionTypes(instance, (java.util.List) streamReader.readObject());
    setParamCodeIndexMap(instance, (java.util.SortedMap) streamReader.readObject());
    setPopulated(instance, streamReader.readBoolean());
    setRangeEnds(instance, (java.util.List) streamReader.readObject());
    setRangeStarts(instance, (java.util.List) streamReader.readObject());
    setSelectedItems(instance, (java.util.List) streamReader.readObject());
    setSingleValues(instance, (java.util.List) streamReader.readObject());
    
  }
  
  public static com.medassets.report.shared.FlexSelectSelectionAllDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.medassets.report.shared.FlexSelectSelectionAllDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.medassets.report.shared.FlexSelectSelectionAllDTO instance) throws SerializationException {
    streamWriter.writeObject(getActualFormulas(instance));
    streamWriter.writeObject(getAliasFormulas(instance));
    streamWriter.writeObject(getCodeNameMapList(instance));
    streamWriter.writeObject(getDbFields(instance));
    streamWriter.writeObject(getIncludeNulls(instance));
    streamWriter.writeObject(getIsNameAvailable(instance));
    streamWriter.writeObject(getKeys(instance));
    streamWriter.writeObject(getNamesStoredWithCodes(instance));
    streamWriter.writeObject(getOptionTypes(instance));
    streamWriter.writeObject(getParamCodeIndexMap(instance));
    streamWriter.writeBoolean(getPopulated(instance));
    streamWriter.writeObject(getRangeEnds(instance));
    streamWriter.writeObject(getRangeStarts(instance));
    streamWriter.writeObject(getSelectedItems(instance));
    streamWriter.writeObject(getSingleValues(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.medassets.report.shared.FlexSelectSelectionAllDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.medassets.report.shared.FlexSelectSelectionAllDTO_FieldSerializer.deserialize(reader, (com.medassets.report.shared.FlexSelectSelectionAllDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.medassets.report.shared.FlexSelectSelectionAllDTO_FieldSerializer.serialize(writer, (com.medassets.report.shared.FlexSelectSelectionAllDTO)object);
  }
  
}
