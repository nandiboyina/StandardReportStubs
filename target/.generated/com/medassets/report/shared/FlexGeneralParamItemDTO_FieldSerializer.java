package com.medassets.report.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class FlexGeneralParamItemDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getCurrentValue(com.medassets.report.shared.FlexGeneralParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexGeneralParamItemDTO::currentValue;
  }-*/;
  
  private static native void setCurrentValue(com.medassets.report.shared.FlexGeneralParamItemDTO instance, java.lang.String value) 
  /*-{
    instance.@com.medassets.report.shared.FlexGeneralParamItemDTO::currentValue = value;
  }-*/;
  
  private static native java.lang.String getDefaultSelection(com.medassets.report.shared.FlexGeneralParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexGeneralParamItemDTO::defaultSelection;
  }-*/;
  
  private static native void setDefaultSelection(com.medassets.report.shared.FlexGeneralParamItemDTO instance, java.lang.String value) 
  /*-{
    instance.@com.medassets.report.shared.FlexGeneralParamItemDTO::defaultSelection = value;
  }-*/;
  
  private static native java.lang.String getFieldName(com.medassets.report.shared.FlexGeneralParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexGeneralParamItemDTO::fieldName;
  }-*/;
  
  private static native void setFieldName(com.medassets.report.shared.FlexGeneralParamItemDTO instance, java.lang.String value) 
  /*-{
    instance.@com.medassets.report.shared.FlexGeneralParamItemDTO::fieldName = value;
  }-*/;
  
  private static native java.lang.String getFieldType(com.medassets.report.shared.FlexGeneralParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexGeneralParamItemDTO::fieldType;
  }-*/;
  
  private static native void setFieldType(com.medassets.report.shared.FlexGeneralParamItemDTO instance, java.lang.String value) 
  /*-{
    instance.@com.medassets.report.shared.FlexGeneralParamItemDTO::fieldType = value;
  }-*/;
  
  private static native java.lang.String getFormulaDestination(com.medassets.report.shared.FlexGeneralParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexGeneralParamItemDTO::formulaDestination;
  }-*/;
  
  private static native void setFormulaDestination(com.medassets.report.shared.FlexGeneralParamItemDTO instance, java.lang.String value) 
  /*-{
    instance.@com.medassets.report.shared.FlexGeneralParamItemDTO::formulaDestination = value;
  }-*/;
  
  private static native java.lang.String getFunctionType(com.medassets.report.shared.FlexGeneralParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexGeneralParamItemDTO::functionType;
  }-*/;
  
  private static native void setFunctionType(com.medassets.report.shared.FlexGeneralParamItemDTO instance, java.lang.String value) 
  /*-{
    instance.@com.medassets.report.shared.FlexGeneralParamItemDTO::functionType = value;
  }-*/;
  
  private static native java.lang.Long getHelpId(com.medassets.report.shared.FlexGeneralParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexGeneralParamItemDTO::helpId;
  }-*/;
  
  private static native void setHelpId(com.medassets.report.shared.FlexGeneralParamItemDTO instance, java.lang.Long value) 
  /*-{
    instance.@com.medassets.report.shared.FlexGeneralParamItemDTO::helpId = value;
  }-*/;
  
  private static native java.lang.String getLabelName(com.medassets.report.shared.FlexGeneralParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexGeneralParamItemDTO::labelName;
  }-*/;
  
  private static native void setLabelName(com.medassets.report.shared.FlexGeneralParamItemDTO instance, java.lang.String value) 
  /*-{
    instance.@com.medassets.report.shared.FlexGeneralParamItemDTO::labelName = value;
  }-*/;
  
  private static native java.util.Map getListOfValues(com.medassets.report.shared.FlexGeneralParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexGeneralParamItemDTO::listOfValues;
  }-*/;
  
  private static native void setListOfValues(com.medassets.report.shared.FlexGeneralParamItemDTO instance, java.util.Map value) 
  /*-{
    instance.@com.medassets.report.shared.FlexGeneralParamItemDTO::listOfValues = value;
  }-*/;
  
  private static native java.lang.Long getRptDictionaryId(com.medassets.report.shared.FlexGeneralParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexGeneralParamItemDTO::rptDictionaryId;
  }-*/;
  
  private static native void setRptDictionaryId(com.medassets.report.shared.FlexGeneralParamItemDTO instance, java.lang.Long value) 
  /*-{
    instance.@com.medassets.report.shared.FlexGeneralParamItemDTO::rptDictionaryId = value;
  }-*/;
  
  private static native java.lang.Long getRptGeneralObjectId(com.medassets.report.shared.FlexGeneralParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexGeneralParamItemDTO::rptGeneralObjectId;
  }-*/;
  
  private static native void setRptGeneralObjectId(com.medassets.report.shared.FlexGeneralParamItemDTO instance, java.lang.Long value) 
  /*-{
    instance.@com.medassets.report.shared.FlexGeneralParamItemDTO::rptGeneralObjectId = value;
  }-*/;
  
  private static native java.lang.Boolean getSetEachGroup(com.medassets.report.shared.FlexGeneralParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexGeneralParamItemDTO::setEachGroup;
  }-*/;
  
  private static native void setSetEachGroup(com.medassets.report.shared.FlexGeneralParamItemDTO instance, java.lang.Boolean value) 
  /*-{
    instance.@com.medassets.report.shared.FlexGeneralParamItemDTO::setEachGroup = value;
  }-*/;
  
  private static native java.lang.String getSetTo(com.medassets.report.shared.FlexGeneralParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexGeneralParamItemDTO::setTo;
  }-*/;
  
  private static native void setSetTo(com.medassets.report.shared.FlexGeneralParamItemDTO instance, java.lang.String value) 
  /*-{
    instance.@com.medassets.report.shared.FlexGeneralParamItemDTO::setTo = value;
  }-*/;
  
  private static native int getWizStyle(com.medassets.report.shared.FlexGeneralParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexGeneralParamItemDTO::wizStyle;
  }-*/;
  
  private static native void setWizStyle(com.medassets.report.shared.FlexGeneralParamItemDTO instance, int value) 
  /*-{
    instance.@com.medassets.report.shared.FlexGeneralParamItemDTO::wizStyle = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.medassets.report.shared.FlexGeneralParamItemDTO instance) throws SerializationException {
    setCurrentValue(instance, streamReader.readString());
    setDefaultSelection(instance, streamReader.readString());
    setFieldName(instance, streamReader.readString());
    setFieldType(instance, streamReader.readString());
    setFormulaDestination(instance, streamReader.readString());
    setFunctionType(instance, streamReader.readString());
    setHelpId(instance, (java.lang.Long) streamReader.readObject());
    setLabelName(instance, streamReader.readString());
    setListOfValues(instance, (java.util.Map) streamReader.readObject());
    setRptDictionaryId(instance, (java.lang.Long) streamReader.readObject());
    setRptGeneralObjectId(instance, (java.lang.Long) streamReader.readObject());
    setSetEachGroup(instance, (java.lang.Boolean) streamReader.readObject());
    setSetTo(instance, streamReader.readString());
    setWizStyle(instance, streamReader.readInt());
    
  }
  
  public static com.medassets.report.shared.FlexGeneralParamItemDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.medassets.report.shared.FlexGeneralParamItemDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.medassets.report.shared.FlexGeneralParamItemDTO instance) throws SerializationException {
    streamWriter.writeString(getCurrentValue(instance));
    streamWriter.writeString(getDefaultSelection(instance));
    streamWriter.writeString(getFieldName(instance));
    streamWriter.writeString(getFieldType(instance));
    streamWriter.writeString(getFormulaDestination(instance));
    streamWriter.writeString(getFunctionType(instance));
    streamWriter.writeObject(getHelpId(instance));
    streamWriter.writeString(getLabelName(instance));
    streamWriter.writeObject(getListOfValues(instance));
    streamWriter.writeObject(getRptDictionaryId(instance));
    streamWriter.writeObject(getRptGeneralObjectId(instance));
    streamWriter.writeObject(getSetEachGroup(instance));
    streamWriter.writeString(getSetTo(instance));
    streamWriter.writeInt(getWizStyle(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.medassets.report.shared.FlexGeneralParamItemDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.medassets.report.shared.FlexGeneralParamItemDTO_FieldSerializer.deserialize(reader, (com.medassets.report.shared.FlexGeneralParamItemDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.medassets.report.shared.FlexGeneralParamItemDTO_FieldSerializer.serialize(writer, (com.medassets.report.shared.FlexGeneralParamItemDTO)object);
  }
  
}
