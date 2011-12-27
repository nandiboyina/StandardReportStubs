package com.medassets.report.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class FlexSelectionParamItemDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getAliasName(com.medassets.report.shared.FlexSelectionParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectionParamItemDTO::aliasName;
  }-*/;
  
  private static native void setAliasName(com.medassets.report.shared.FlexSelectionParamItemDTO instance, java.lang.String value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectionParamItemDTO::aliasName = value;
  }-*/;
  
  private static native java.lang.Boolean getAllowNullSelection(com.medassets.report.shared.FlexSelectionParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectionParamItemDTO::allowNullSelection;
  }-*/;
  
  private static native void setAllowNullSelection(com.medassets.report.shared.FlexSelectionParamItemDTO instance, java.lang.Boolean value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectionParamItemDTO::allowNullSelection = value;
  }-*/;
  
  private static native java.lang.Boolean getCbField(com.medassets.report.shared.FlexSelectionParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectionParamItemDTO::cbField;
  }-*/;
  
  private static native void setCbField(com.medassets.report.shared.FlexSelectionParamItemDTO instance, java.lang.Boolean value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectionParamItemDTO::cbField = value;
  }-*/;
  
  private static native java.lang.String getDescription(com.medassets.report.shared.FlexSelectionParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectionParamItemDTO::description;
  }-*/;
  
  private static native void setDescription(com.medassets.report.shared.FlexSelectionParamItemDTO instance, java.lang.String value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectionParamItemDTO::description = value;
  }-*/;
  
  private static native java.lang.String getFieldName(com.medassets.report.shared.FlexSelectionParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectionParamItemDTO::fieldName;
  }-*/;
  
  private static native void setFieldName(com.medassets.report.shared.FlexSelectionParamItemDTO instance, java.lang.String value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectionParamItemDTO::fieldName = value;
  }-*/;
  
  private static native java.lang.String getFieldType(com.medassets.report.shared.FlexSelectionParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectionParamItemDTO::fieldType;
  }-*/;
  
  private static native void setFieldType(com.medassets.report.shared.FlexSelectionParamItemDTO instance, java.lang.String value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectionParamItemDTO::fieldType = value;
  }-*/;
  
  private static native java.lang.Boolean getIsRequiredForExists(com.medassets.report.shared.FlexSelectionParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectionParamItemDTO::isRequiredForExists;
  }-*/;
  
  private static native void setIsRequiredForExists(com.medassets.report.shared.FlexSelectionParamItemDTO instance, java.lang.Boolean value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectionParamItemDTO::isRequiredForExists = value;
  }-*/;
  
  private static native com.medassets.report.shared.FlexSelectSelectionAllDTO getItemSelections(com.medassets.report.shared.FlexSelectionParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectionParamItemDTO::itemSelections;
  }-*/;
  
  private static native void setItemSelections(com.medassets.report.shared.FlexSelectionParamItemDTO instance, com.medassets.report.shared.FlexSelectSelectionAllDTO value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectionParamItemDTO::itemSelections = value;
  }-*/;
  
  private static native java.lang.String getKeyName(com.medassets.report.shared.FlexSelectionParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectionParamItemDTO::keyName;
  }-*/;
  
  private static native void setKeyName(com.medassets.report.shared.FlexSelectionParamItemDTO instance, java.lang.String value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectionParamItemDTO::keyName = value;
  }-*/;
  
  private static native java.lang.String getLookup(com.medassets.report.shared.FlexSelectionParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectionParamItemDTO::lookup;
  }-*/;
  
  private static native void setLookup(com.medassets.report.shared.FlexSelectionParamItemDTO instance, java.lang.String value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectionParamItemDTO::lookup = value;
  }-*/;
  
  private static native com.medassets.report.shared.FlexSelectSelectionMatchDTO getMatchSelections(com.medassets.report.shared.FlexSelectionParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectionParamItemDTO::matchSelections;
  }-*/;
  
  private static native void setMatchSelections(com.medassets.report.shared.FlexSelectionParamItemDTO instance, com.medassets.report.shared.FlexSelectSelectionMatchDTO value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectionParamItemDTO::matchSelections = value;
  }-*/;
  
  private static native java.lang.Long getObjectId(com.medassets.report.shared.FlexSelectionParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectionParamItemDTO::objectId;
  }-*/;
  
  private static native void setObjectId(com.medassets.report.shared.FlexSelectionParamItemDTO instance, java.lang.Long value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectionParamItemDTO::objectId = value;
  }-*/;
  
  private static native java.lang.String getParentName(com.medassets.report.shared.FlexSelectionParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectionParamItemDTO::parentName;
  }-*/;
  
  private static native void setParentName(com.medassets.report.shared.FlexSelectionParamItemDTO instance, java.lang.String value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectionParamItemDTO::parentName = value;
  }-*/;
  
  private static native java.lang.String getPickListOrderBy(com.medassets.report.shared.FlexSelectionParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectionParamItemDTO::pickListOrderBy;
  }-*/;
  
  private static native void setPickListOrderBy(com.medassets.report.shared.FlexSelectionParamItemDTO instance, java.lang.String value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectionParamItemDTO::pickListOrderBy = value;
  }-*/;
  
  private static native java.lang.Boolean getPopulated(com.medassets.report.shared.FlexSelectionParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectionParamItemDTO::populated;
  }-*/;
  
  private static native void setPopulated(com.medassets.report.shared.FlexSelectionParamItemDTO instance, java.lang.Boolean value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectionParamItemDTO::populated = value;
  }-*/;
  
  private static native java.lang.String getReportType(com.medassets.report.shared.FlexSelectionParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectionParamItemDTO::reportType;
  }-*/;
  
  private static native void setReportType(com.medassets.report.shared.FlexSelectionParamItemDTO instance, java.lang.String value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectionParamItemDTO::reportType = value;
  }-*/;
  
  private static native java.lang.String getToolName(com.medassets.report.shared.FlexSelectionParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectionParamItemDTO::toolName;
  }-*/;
  
  private static native void setToolName(com.medassets.report.shared.FlexSelectionParamItemDTO instance, java.lang.String value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectionParamItemDTO::toolName = value;
  }-*/;
  
  private static native com.medassets.report.shared.FlexSelectSelectionExceptionDTO getValueSelections(com.medassets.report.shared.FlexSelectionParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSelectionParamItemDTO::valueSelections;
  }-*/;
  
  private static native void setValueSelections(com.medassets.report.shared.FlexSelectionParamItemDTO instance, com.medassets.report.shared.FlexSelectSelectionExceptionDTO value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSelectionParamItemDTO::valueSelections = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.medassets.report.shared.FlexSelectionParamItemDTO instance) throws SerializationException {
    setAliasName(instance, streamReader.readString());
    setAllowNullSelection(instance, (java.lang.Boolean) streamReader.readObject());
    setCbField(instance, (java.lang.Boolean) streamReader.readObject());
    setDescription(instance, streamReader.readString());
    setFieldName(instance, streamReader.readString());
    setFieldType(instance, streamReader.readString());
    setIsRequiredForExists(instance, (java.lang.Boolean) streamReader.readObject());
    setItemSelections(instance, (com.medassets.report.shared.FlexSelectSelectionAllDTO) streamReader.readObject());
    setKeyName(instance, streamReader.readString());
    setLookup(instance, streamReader.readString());
    setMatchSelections(instance, (com.medassets.report.shared.FlexSelectSelectionMatchDTO) streamReader.readObject());
    setObjectId(instance, (java.lang.Long) streamReader.readObject());
    setParentName(instance, streamReader.readString());
    setPickListOrderBy(instance, streamReader.readString());
    setPopulated(instance, (java.lang.Boolean) streamReader.readObject());
    setReportType(instance, streamReader.readString());
    setToolName(instance, streamReader.readString());
    setValueSelections(instance, (com.medassets.report.shared.FlexSelectSelectionExceptionDTO) streamReader.readObject());
    
  }
  
  public static com.medassets.report.shared.FlexSelectionParamItemDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.medassets.report.shared.FlexSelectionParamItemDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.medassets.report.shared.FlexSelectionParamItemDTO instance) throws SerializationException {
    streamWriter.writeString(getAliasName(instance));
    streamWriter.writeObject(getAllowNullSelection(instance));
    streamWriter.writeObject(getCbField(instance));
    streamWriter.writeString(getDescription(instance));
    streamWriter.writeString(getFieldName(instance));
    streamWriter.writeString(getFieldType(instance));
    streamWriter.writeObject(getIsRequiredForExists(instance));
    streamWriter.writeObject(getItemSelections(instance));
    streamWriter.writeString(getKeyName(instance));
    streamWriter.writeString(getLookup(instance));
    streamWriter.writeObject(getMatchSelections(instance));
    streamWriter.writeObject(getObjectId(instance));
    streamWriter.writeString(getParentName(instance));
    streamWriter.writeString(getPickListOrderBy(instance));
    streamWriter.writeObject(getPopulated(instance));
    streamWriter.writeString(getReportType(instance));
    streamWriter.writeString(getToolName(instance));
    streamWriter.writeObject(getValueSelections(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.medassets.report.shared.FlexSelectionParamItemDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.medassets.report.shared.FlexSelectionParamItemDTO_FieldSerializer.deserialize(reader, (com.medassets.report.shared.FlexSelectionParamItemDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.medassets.report.shared.FlexSelectionParamItemDTO_FieldSerializer.serialize(writer, (com.medassets.report.shared.FlexSelectionParamItemDTO)object);
  }
  
}
