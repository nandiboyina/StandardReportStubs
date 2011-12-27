package com.medassets.report.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class FlexGlobalSettingsParamItemDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getCurrentValue(com.medassets.report.shared.FlexGlobalSettingsParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexGlobalSettingsParamItemDTO::currentValue;
  }-*/;
  
  private static native void setCurrentValue(com.medassets.report.shared.FlexGlobalSettingsParamItemDTO instance, java.lang.String value) 
  /*-{
    instance.@com.medassets.report.shared.FlexGlobalSettingsParamItemDTO::currentValue = value;
  }-*/;
  
  private static native java.lang.String getDisplayLabelName(com.medassets.report.shared.FlexGlobalSettingsParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexGlobalSettingsParamItemDTO::displayLabelName;
  }-*/;
  
  private static native void setDisplayLabelName(com.medassets.report.shared.FlexGlobalSettingsParamItemDTO instance, java.lang.String value) 
  /*-{
    instance.@com.medassets.report.shared.FlexGlobalSettingsParamItemDTO::displayLabelName = value;
  }-*/;
  
  private static native java.lang.String getFieldName(com.medassets.report.shared.FlexGlobalSettingsParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexGlobalSettingsParamItemDTO::fieldName;
  }-*/;
  
  private static native void setFieldName(com.medassets.report.shared.FlexGlobalSettingsParamItemDTO instance, java.lang.String value) 
  /*-{
    instance.@com.medassets.report.shared.FlexGlobalSettingsParamItemDTO::fieldName = value;
  }-*/;
  
  private static native java.lang.String getFieldType(com.medassets.report.shared.FlexGlobalSettingsParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexGlobalSettingsParamItemDTO::fieldType;
  }-*/;
  
  private static native void setFieldType(com.medassets.report.shared.FlexGlobalSettingsParamItemDTO instance, java.lang.String value) 
  /*-{
    instance.@com.medassets.report.shared.FlexGlobalSettingsParamItemDTO::fieldType = value;
  }-*/;
  
  private static native java.lang.Long getFlags(com.medassets.report.shared.FlexGlobalSettingsParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexGlobalSettingsParamItemDTO::flags;
  }-*/;
  
  private static native void setFlags(com.medassets.report.shared.FlexGlobalSettingsParamItemDTO instance, java.lang.Long value) 
  /*-{
    instance.@com.medassets.report.shared.FlexGlobalSettingsParamItemDTO::flags = value;
  }-*/;
  
  private static native java.lang.Long getHelpId(com.medassets.report.shared.FlexGlobalSettingsParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexGlobalSettingsParamItemDTO::helpId;
  }-*/;
  
  private static native void setHelpId(com.medassets.report.shared.FlexGlobalSettingsParamItemDTO instance, java.lang.Long value) 
  /*-{
    instance.@com.medassets.report.shared.FlexGlobalSettingsParamItemDTO::helpId = value;
  }-*/;
  
  private static native java.lang.String getLabelName(com.medassets.report.shared.FlexGlobalSettingsParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexGlobalSettingsParamItemDTO::labelName;
  }-*/;
  
  private static native void setLabelName(com.medassets.report.shared.FlexGlobalSettingsParamItemDTO instance, java.lang.String value) 
  /*-{
    instance.@com.medassets.report.shared.FlexGlobalSettingsParamItemDTO::labelName = value;
  }-*/;
  
  private static native java.util.Map getListOfValues(com.medassets.report.shared.FlexGlobalSettingsParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexGlobalSettingsParamItemDTO::listOfValues;
  }-*/;
  
  private static native void setListOfValues(com.medassets.report.shared.FlexGlobalSettingsParamItemDTO instance, java.util.Map value) 
  /*-{
    instance.@com.medassets.report.shared.FlexGlobalSettingsParamItemDTO::listOfValues = value;
  }-*/;
  
  private static native java.lang.String getLookup(com.medassets.report.shared.FlexGlobalSettingsParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexGlobalSettingsParamItemDTO::lookup;
  }-*/;
  
  private static native void setLookup(com.medassets.report.shared.FlexGlobalSettingsParamItemDTO instance, java.lang.String value) 
  /*-{
    instance.@com.medassets.report.shared.FlexGlobalSettingsParamItemDTO::lookup = value;
  }-*/;
  
  private static native java.lang.Long getMasterSettingObjectId(com.medassets.report.shared.FlexGlobalSettingsParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexGlobalSettingsParamItemDTO::masterSettingObjectId;
  }-*/;
  
  private static native void setMasterSettingObjectId(com.medassets.report.shared.FlexGlobalSettingsParamItemDTO instance, java.lang.Long value) 
  /*-{
    instance.@com.medassets.report.shared.FlexGlobalSettingsParamItemDTO::masterSettingObjectId = value;
  }-*/;
  
  private static native java.lang.Long getOrderIndex(com.medassets.report.shared.FlexGlobalSettingsParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexGlobalSettingsParamItemDTO::orderIndex;
  }-*/;
  
  private static native void setOrderIndex(com.medassets.report.shared.FlexGlobalSettingsParamItemDTO instance, java.lang.Long value) 
  /*-{
    instance.@com.medassets.report.shared.FlexGlobalSettingsParamItemDTO::orderIndex = value;
  }-*/;
  
  private static native java.lang.String getParameterName(com.medassets.report.shared.FlexGlobalSettingsParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexGlobalSettingsParamItemDTO::parameterName;
  }-*/;
  
  private static native void setParameterName(com.medassets.report.shared.FlexGlobalSettingsParamItemDTO instance, java.lang.String value) 
  /*-{
    instance.@com.medassets.report.shared.FlexGlobalSettingsParamItemDTO::parameterName = value;
  }-*/;
  
  private static native java.lang.String getSetTo(com.medassets.report.shared.FlexGlobalSettingsParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexGlobalSettingsParamItemDTO::setTo;
  }-*/;
  
  private static native void setSetTo(com.medassets.report.shared.FlexGlobalSettingsParamItemDTO instance, java.lang.String value) 
  /*-{
    instance.@com.medassets.report.shared.FlexGlobalSettingsParamItemDTO::setTo = value;
  }-*/;
  
  private static native int getWizStyle(com.medassets.report.shared.FlexGlobalSettingsParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexGlobalSettingsParamItemDTO::wizStyle;
  }-*/;
  
  private static native void setWizStyle(com.medassets.report.shared.FlexGlobalSettingsParamItemDTO instance, int value) 
  /*-{
    instance.@com.medassets.report.shared.FlexGlobalSettingsParamItemDTO::wizStyle = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.medassets.report.shared.FlexGlobalSettingsParamItemDTO instance) throws SerializationException {
    setCurrentValue(instance, streamReader.readString());
    setDisplayLabelName(instance, streamReader.readString());
    setFieldName(instance, streamReader.readString());
    setFieldType(instance, streamReader.readString());
    setFlags(instance, (java.lang.Long) streamReader.readObject());
    setHelpId(instance, (java.lang.Long) streamReader.readObject());
    setLabelName(instance, streamReader.readString());
    setListOfValues(instance, (java.util.Map) streamReader.readObject());
    setLookup(instance, streamReader.readString());
    setMasterSettingObjectId(instance, (java.lang.Long) streamReader.readObject());
    setOrderIndex(instance, (java.lang.Long) streamReader.readObject());
    setParameterName(instance, streamReader.readString());
    setSetTo(instance, streamReader.readString());
    setWizStyle(instance, streamReader.readInt());
    
  }
  
  public static com.medassets.report.shared.FlexGlobalSettingsParamItemDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.medassets.report.shared.FlexGlobalSettingsParamItemDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.medassets.report.shared.FlexGlobalSettingsParamItemDTO instance) throws SerializationException {
    streamWriter.writeString(getCurrentValue(instance));
    streamWriter.writeString(getDisplayLabelName(instance));
    streamWriter.writeString(getFieldName(instance));
    streamWriter.writeString(getFieldType(instance));
    streamWriter.writeObject(getFlags(instance));
    streamWriter.writeObject(getHelpId(instance));
    streamWriter.writeString(getLabelName(instance));
    streamWriter.writeObject(getListOfValues(instance));
    streamWriter.writeString(getLookup(instance));
    streamWriter.writeObject(getMasterSettingObjectId(instance));
    streamWriter.writeObject(getOrderIndex(instance));
    streamWriter.writeString(getParameterName(instance));
    streamWriter.writeString(getSetTo(instance));
    streamWriter.writeInt(getWizStyle(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.medassets.report.shared.FlexGlobalSettingsParamItemDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.medassets.report.shared.FlexGlobalSettingsParamItemDTO_FieldSerializer.deserialize(reader, (com.medassets.report.shared.FlexGlobalSettingsParamItemDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.medassets.report.shared.FlexGlobalSettingsParamItemDTO_FieldSerializer.serialize(writer, (com.medassets.report.shared.FlexGlobalSettingsParamItemDTO)object);
  }
  
}
