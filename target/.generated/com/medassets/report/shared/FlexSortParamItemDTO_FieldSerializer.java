package com.medassets.report.shared;

import com.google.gwt.user.client.rpc.SerializationException;
import com.google.gwt.user.client.rpc.SerializationStreamReader;
import com.google.gwt.user.client.rpc.SerializationStreamWriter;
import com.google.gwt.user.client.rpc.impl.ReflectionHelper;

@SuppressWarnings("deprecation")
public class FlexSortParamItemDTO_FieldSerializer implements com.google.gwt.user.client.rpc.impl.TypeHandler {
  private static native java.lang.String getAliasName(com.medassets.report.shared.FlexSortParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSortParamItemDTO::aliasName;
  }-*/;
  
  private static native void setAliasName(com.medassets.report.shared.FlexSortParamItemDTO instance, java.lang.String value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSortParamItemDTO::aliasName = value;
  }-*/;
  
  private static native java.lang.Boolean getCbField(com.medassets.report.shared.FlexSortParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSortParamItemDTO::cbField;
  }-*/;
  
  private static native void setCbField(com.medassets.report.shared.FlexSortParamItemDTO instance, java.lang.Boolean value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSortParamItemDTO::cbField = value;
  }-*/;
  
  private static native com.medassets.report.shared.FlexSortParamItemDTO.GroupOrder getColumnOrder(com.medassets.report.shared.FlexSortParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSortParamItemDTO::columnOrder;
  }-*/;
  
  private static native void setColumnOrder(com.medassets.report.shared.FlexSortParamItemDTO instance, com.medassets.report.shared.FlexSortParamItemDTO.GroupOrder value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSortParamItemDTO::columnOrder = value;
  }-*/;
  
  private static native java.lang.String getDefaultSortKeyName(com.medassets.report.shared.FlexSortParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSortParamItemDTO::defaultSortKeyName;
  }-*/;
  
  private static native void setDefaultSortKeyName(com.medassets.report.shared.FlexSortParamItemDTO instance, java.lang.String value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSortParamItemDTO::defaultSortKeyName = value;
  }-*/;
  
  private static native java.lang.String getDescription(com.medassets.report.shared.FlexSortParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSortParamItemDTO::description;
  }-*/;
  
  private static native void setDescription(com.medassets.report.shared.FlexSortParamItemDTO instance, java.lang.String value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSortParamItemDTO::description = value;
  }-*/;
  
  private static native com.medassets.report.shared.FlexSortParamItemDTO.DisplayMethod getDisplayMethod(com.medassets.report.shared.FlexSortParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSortParamItemDTO::displayMethod;
  }-*/;
  
  private static native void setDisplayMethod(com.medassets.report.shared.FlexSortParamItemDTO instance, com.medassets.report.shared.FlexSortParamItemDTO.DisplayMethod value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSortParamItemDTO::displayMethod = value;
  }-*/;
  
  private static native java.lang.String getFieldName(com.medassets.report.shared.FlexSortParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSortParamItemDTO::fieldName;
  }-*/;
  
  private static native void setFieldName(com.medassets.report.shared.FlexSortParamItemDTO instance, java.lang.String value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSortParamItemDTO::fieldName = value;
  }-*/;
  
  private static native java.lang.String getFieldType(com.medassets.report.shared.FlexSortParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSortParamItemDTO::fieldType;
  }-*/;
  
  private static native void setFieldType(com.medassets.report.shared.FlexSortParamItemDTO instance, java.lang.String value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSortParamItemDTO::fieldType = value;
  }-*/;
  
  private static native java.lang.String getKeyName(com.medassets.report.shared.FlexSortParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSortParamItemDTO::keyName;
  }-*/;
  
  private static native void setKeyName(com.medassets.report.shared.FlexSortParamItemDTO instance, java.lang.String value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSortParamItemDTO::keyName = value;
  }-*/;
  
  private static native java.lang.String getLimitBy(com.medassets.report.shared.FlexSortParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSortParamItemDTO::limitBy;
  }-*/;
  
  private static native void setLimitBy(com.medassets.report.shared.FlexSortParamItemDTO instance, java.lang.String value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSortParamItemDTO::limitBy = value;
  }-*/;
  
  private static native java.lang.Boolean getLimitExists(com.medassets.report.shared.FlexSortParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSortParamItemDTO::limitExists;
  }-*/;
  
  private static native void setLimitExists(com.medassets.report.shared.FlexSortParamItemDTO instance, java.lang.Boolean value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSortParamItemDTO::limitExists = value;
  }-*/;
  
  private static native java.lang.Boolean getLimitIsPercent(com.medassets.report.shared.FlexSortParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSortParamItemDTO::limitIsPercent;
  }-*/;
  
  private static native void setLimitIsPercent(com.medassets.report.shared.FlexSortParamItemDTO instance, java.lang.Boolean value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSortParamItemDTO::limitIsPercent = value;
  }-*/;
  
  private static native java.lang.Double getLimitLowerValue(com.medassets.report.shared.FlexSortParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSortParamItemDTO::limitLowerValue;
  }-*/;
  
  private static native void setLimitLowerValue(com.medassets.report.shared.FlexSortParamItemDTO instance, java.lang.Double value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSortParamItemDTO::limitLowerValue = value;
  }-*/;
  
  private static native com.medassets.report.shared.FlexSortParamItemDTO.LimitTo getLimitTo(com.medassets.report.shared.FlexSortParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSortParamItemDTO::limitTo;
  }-*/;
  
  private static native void setLimitTo(com.medassets.report.shared.FlexSortParamItemDTO instance, com.medassets.report.shared.FlexSortParamItemDTO.LimitTo value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSortParamItemDTO::limitTo = value;
  }-*/;
  
  private static native java.lang.Double getLimitUpperValue(com.medassets.report.shared.FlexSortParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSortParamItemDTO::limitUpperValue;
  }-*/;
  
  private static native void setLimitUpperValue(com.medassets.report.shared.FlexSortParamItemDTO instance, java.lang.Double value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSortParamItemDTO::limitUpperValue = value;
  }-*/;
  
  private static native java.lang.Long getObjectId(com.medassets.report.shared.FlexSortParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSortParamItemDTO::objectId;
  }-*/;
  
  private static native void setObjectId(com.medassets.report.shared.FlexSortParamItemDTO instance, java.lang.Long value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSortParamItemDTO::objectId = value;
  }-*/;
  
  private static native java.lang.String getOrder(com.medassets.report.shared.FlexSortParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSortParamItemDTO::order;
  }-*/;
  
  private static native void setOrder(com.medassets.report.shared.FlexSortParamItemDTO instance, java.lang.String value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSortParamItemDTO::order = value;
  }-*/;
  
  private static native java.lang.Integer getOrderBy(com.medassets.report.shared.FlexSortParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSortParamItemDTO::orderBy;
  }-*/;
  
  private static native void setOrderBy(com.medassets.report.shared.FlexSortParamItemDTO instance, java.lang.Integer value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSortParamItemDTO::orderBy = value;
  }-*/;
  
  private static native com.medassets.report.shared.FlexSortParamItemDTO.OrderByColumn getOrderNoRank(com.medassets.report.shared.FlexSortParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSortParamItemDTO::orderNoRank;
  }-*/;
  
  private static native void setOrderNoRank(com.medassets.report.shared.FlexSortParamItemDTO instance, com.medassets.report.shared.FlexSortParamItemDTO.OrderByColumn value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSortParamItemDTO::orderNoRank = value;
  }-*/;
  
  private static native java.lang.Boolean getPageBreak(com.medassets.report.shared.FlexSortParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSortParamItemDTO::pageBreak;
  }-*/;
  
  private static native void setPageBreak(com.medassets.report.shared.FlexSortParamItemDTO instance, java.lang.Boolean value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSortParamItemDTO::pageBreak = value;
  }-*/;
  
  private static native java.lang.String getParentName(com.medassets.report.shared.FlexSortParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSortParamItemDTO::parentName;
  }-*/;
  
  private static native void setParentName(com.medassets.report.shared.FlexSortParamItemDTO instance, java.lang.String value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSortParamItemDTO::parentName = value;
  }-*/;
  
  private static native java.lang.String getPickListOrderBy(com.medassets.report.shared.FlexSortParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSortParamItemDTO::pickListOrderBy;
  }-*/;
  
  private static native void setPickListOrderBy(com.medassets.report.shared.FlexSortParamItemDTO instance, java.lang.String value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSortParamItemDTO::pickListOrderBy = value;
  }-*/;
  
  private static native java.lang.String getRankBy(com.medassets.report.shared.FlexSortParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSortParamItemDTO::rankBy;
  }-*/;
  
  private static native void setRankBy(com.medassets.report.shared.FlexSortParamItemDTO instance, java.lang.String value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSortParamItemDTO::rankBy = value;
  }-*/;
  
  private static native java.lang.Boolean getRankExists(com.medassets.report.shared.FlexSortParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSortParamItemDTO::rankExists;
  }-*/;
  
  private static native void setRankExists(com.medassets.report.shared.FlexSortParamItemDTO instance, java.lang.Boolean value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSortParamItemDTO::rankExists = value;
  }-*/;
  
  private static native java.lang.String getReportType(com.medassets.report.shared.FlexSortParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSortParamItemDTO::reportType;
  }-*/;
  
  private static native void setReportType(com.medassets.report.shared.FlexSortParamItemDTO instance, java.lang.String value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSortParamItemDTO::reportType = value;
  }-*/;
  
  private static native java.lang.Boolean getSelected(com.medassets.report.shared.FlexSortParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSortParamItemDTO::selected;
  }-*/;
  
  private static native void setSelected(com.medassets.report.shared.FlexSortParamItemDTO instance, java.lang.Boolean value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSortParamItemDTO::selected = value;
  }-*/;
  
  private static native java.lang.Boolean getSubTotal(com.medassets.report.shared.FlexSortParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSortParamItemDTO::subTotal;
  }-*/;
  
  private static native void setSubTotal(com.medassets.report.shared.FlexSortParamItemDTO instance, java.lang.Boolean value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSortParamItemDTO::subTotal = value;
  }-*/;
  
  private static native java.lang.Boolean getUseConsolidateCodeSetting(com.medassets.report.shared.FlexSortParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSortParamItemDTO::useConsolidateCodeSetting;
  }-*/;
  
  private static native void setUseConsolidateCodeSetting(com.medassets.report.shared.FlexSortParamItemDTO instance, java.lang.Boolean value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSortParamItemDTO::useConsolidateCodeSetting = value;
  }-*/;
  
  private static native java.lang.Boolean getVisible(com.medassets.report.shared.FlexSortParamItemDTO instance) /*-{
    return instance.@com.medassets.report.shared.FlexSortParamItemDTO::visible;
  }-*/;
  
  private static native void setVisible(com.medassets.report.shared.FlexSortParamItemDTO instance, java.lang.Boolean value) 
  /*-{
    instance.@com.medassets.report.shared.FlexSortParamItemDTO::visible = value;
  }-*/;
  
  public static void deserialize(SerializationStreamReader streamReader, com.medassets.report.shared.FlexSortParamItemDTO instance) throws SerializationException {
    setAliasName(instance, streamReader.readString());
    setCbField(instance, (java.lang.Boolean) streamReader.readObject());
    setColumnOrder(instance, (com.medassets.report.shared.FlexSortParamItemDTO.GroupOrder) streamReader.readObject());
    setDefaultSortKeyName(instance, streamReader.readString());
    setDescription(instance, streamReader.readString());
    setDisplayMethod(instance, (com.medassets.report.shared.FlexSortParamItemDTO.DisplayMethod) streamReader.readObject());
    setFieldName(instance, streamReader.readString());
    setFieldType(instance, streamReader.readString());
    setKeyName(instance, streamReader.readString());
    setLimitBy(instance, streamReader.readString());
    setLimitExists(instance, (java.lang.Boolean) streamReader.readObject());
    setLimitIsPercent(instance, (java.lang.Boolean) streamReader.readObject());
    setLimitLowerValue(instance, (java.lang.Double) streamReader.readObject());
    setLimitTo(instance, (com.medassets.report.shared.FlexSortParamItemDTO.LimitTo) streamReader.readObject());
    setLimitUpperValue(instance, (java.lang.Double) streamReader.readObject());
    setObjectId(instance, (java.lang.Long) streamReader.readObject());
    setOrder(instance, streamReader.readString());
    setOrderBy(instance, (java.lang.Integer) streamReader.readObject());
    setOrderNoRank(instance, (com.medassets.report.shared.FlexSortParamItemDTO.OrderByColumn) streamReader.readObject());
    setPageBreak(instance, (java.lang.Boolean) streamReader.readObject());
    setParentName(instance, streamReader.readString());
    setPickListOrderBy(instance, streamReader.readString());
    setRankBy(instance, streamReader.readString());
    setRankExists(instance, (java.lang.Boolean) streamReader.readObject());
    setReportType(instance, streamReader.readString());
    setSelected(instance, (java.lang.Boolean) streamReader.readObject());
    setSubTotal(instance, (java.lang.Boolean) streamReader.readObject());
    setUseConsolidateCodeSetting(instance, (java.lang.Boolean) streamReader.readObject());
    setVisible(instance, (java.lang.Boolean) streamReader.readObject());
    
  }
  
  public static com.medassets.report.shared.FlexSortParamItemDTO instantiate(SerializationStreamReader streamReader) throws SerializationException {
    return new com.medassets.report.shared.FlexSortParamItemDTO();
  }
  
  public static void serialize(SerializationStreamWriter streamWriter, com.medassets.report.shared.FlexSortParamItemDTO instance) throws SerializationException {
    streamWriter.writeString(getAliasName(instance));
    streamWriter.writeObject(getCbField(instance));
    streamWriter.writeObject(getColumnOrder(instance));
    streamWriter.writeString(getDefaultSortKeyName(instance));
    streamWriter.writeString(getDescription(instance));
    streamWriter.writeObject(getDisplayMethod(instance));
    streamWriter.writeString(getFieldName(instance));
    streamWriter.writeString(getFieldType(instance));
    streamWriter.writeString(getKeyName(instance));
    streamWriter.writeString(getLimitBy(instance));
    streamWriter.writeObject(getLimitExists(instance));
    streamWriter.writeObject(getLimitIsPercent(instance));
    streamWriter.writeObject(getLimitLowerValue(instance));
    streamWriter.writeObject(getLimitTo(instance));
    streamWriter.writeObject(getLimitUpperValue(instance));
    streamWriter.writeObject(getObjectId(instance));
    streamWriter.writeString(getOrder(instance));
    streamWriter.writeObject(getOrderBy(instance));
    streamWriter.writeObject(getOrderNoRank(instance));
    streamWriter.writeObject(getPageBreak(instance));
    streamWriter.writeString(getParentName(instance));
    streamWriter.writeString(getPickListOrderBy(instance));
    streamWriter.writeString(getRankBy(instance));
    streamWriter.writeObject(getRankExists(instance));
    streamWriter.writeString(getReportType(instance));
    streamWriter.writeObject(getSelected(instance));
    streamWriter.writeObject(getSubTotal(instance));
    streamWriter.writeObject(getUseConsolidateCodeSetting(instance));
    streamWriter.writeObject(getVisible(instance));
    
  }
  
  public Object create(SerializationStreamReader reader) throws SerializationException {
    return com.medassets.report.shared.FlexSortParamItemDTO_FieldSerializer.instantiate(reader);
  }
  
  public void deserial(SerializationStreamReader reader, Object object) throws SerializationException {
    com.medassets.report.shared.FlexSortParamItemDTO_FieldSerializer.deserialize(reader, (com.medassets.report.shared.FlexSortParamItemDTO)object);
  }
  
  public void serial(SerializationStreamWriter writer, Object object) throws SerializationException {
    com.medassets.report.shared.FlexSortParamItemDTO_FieldSerializer.serialize(writer, (com.medassets.report.shared.FlexSortParamItemDTO)object);
  }
  
}
