package com.medassets.report.shared;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author hbala
 * Transfer Object for Flex Sort Tab Parameters and Selections
 *
 */

public class FlexSortParamItemDTO implements Serializable {
	
	
	public enum GroupOrder {
		ASC("Ascending","A"), DESC("Descending","D");
		
		private String orderBy;
		private String groupOrder;

		private GroupOrder(String orderBy, String groupOrder) {
			this.orderBy = orderBy;
			this.groupOrder = groupOrder;
		}

		private GroupOrder() {
		}

		public String getOrderBy() {
			return orderBy;
		}

		public String getGroupOrder() {
			return groupOrder;
		}
	}

	public enum OrderByColumn {
		CODE("Code"), NAME("Name");
		
		private String orderByColumn;
		
		public String getOrderByColumn() {
			return orderByColumn;
		}

		private OrderByColumn(String orderByColumn){
			this.orderByColumn = orderByColumn;
		}
		
	}
	
	public enum OrderByType {
		CODE("code"), NAME("name"), RANK("rank");
		
		private String orderType;

		private OrderByType(String orderType){
			this.orderType = orderType;
		}
		
		private String getOrderType(){
			return orderType;
		}
	}
	

	public enum DisplayMethod {
		CODE("Code"), NAME("Name"), CDNM("Code and Name");
		
		private String desc;

		private DisplayMethod(String desc){
			this.desc = desc;
		}
		
		public String getDescription(){
			return this.desc;
		}
	}

	public enum LimitTo {
		NONE("none"), TOP("top"), BOTTOM("bottom"), EXCL_TOP_BTM(
				"exclude top and bottom"), GT_EQ("greater than or equal to"), LESS_EQ(
				"less than or equal to"), BTW_EXCL("between excluding");
		
		private static final Map<String,LimitTo> lookup = new HashMap<String,LimitTo>();
		
		static{
			for (LimitTo l : LimitTo.values()){
				lookup.put(l.getLimitTo(), l);
			}
		}

		private String limitTo;
		
		public String getLimitTo(){
			return this.limitTo;
		}

		private LimitTo(String limitTo){
			this.limitTo = limitTo;
		}
		
		public static LimitTo get(String limitToStr){
			return lookup.get(limitToStr);
		}

	}
	

	private String parentName;
	private String keyName;
	private String aliasName;
	private String description;	
	private String fieldName;
	private Integer orderBy;
	private String fieldType;
	
	private Boolean subTotal = true; //??
	private String reportType;
	private Long objectId;
	private String defaultSortKeyName = "";
	private Boolean useConsolidateCodeSetting;
		
	private Boolean selected;
	private Boolean cbField;
	private Boolean visible = true;	//?? when true when false

	private GroupOrder columnOrder = GroupOrder.ASC;
	private String rankBy = "none"; // Column: columnlabel in table rptdisplayfield2, default value is none
	private LimitTo limitTo = LimitTo.NONE; // to identify the type of limit ex: top, bottom
	private Double limitLowerValue = 0d; //  to hold the lower value for LimitTo
	private Double limitUpperValue = 0d; //  to hold the upper value for LimitTo
	private Boolean limitIsPercent = false; //  to identify whether limit is percent or not
	private String limitBy = "none"; // Column: columnlabel in table rptdisplayfield2,  default value is none
	private DisplayMethod displayMethod = DisplayMethod.CDNM; // already existed, to decide whether to show code (CODE), name (NAME) or both (CDNM)
	private Boolean rankExists = false; // to identify if rank was specified for a sort level
	private Boolean limitExists = false; // to identify if limits were specified for a sort level
	private OrderByColumn orderNoRank = OrderByColumn.CODE; //  to store order by code or name for a non ranked field
	//private String summaryLabel; //  ?? to hold the sort level description that will be set to report header
	private Boolean pageBreak = false; 
	private String pickListOrderBy; // to identify the order of pick list. If it is "W" or "M" (means week or month) instead of "A" (alphabetical) then we will use DECODE function in order by section in query.

    private String order = "Ascending";

	public String getParentName() {
		return parentName;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
	public String getKeyName() {
		return keyName;
	}
	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}
	public String getAliasName() {
		return aliasName;
	}
	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public Integer getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(Integer orderBy) {
		this.orderBy = orderBy;
	}
	public String getFieldType() {
		return fieldType;
	}
	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}
	public Boolean getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(Boolean subTotal) {
		this.subTotal = subTotal;
	}
	public String getReportType() {
		return reportType;
	}
	public void setReportType(String reportType) {
		this.reportType = reportType;
	}
	public Long getObjectId() {
		return objectId;
	}
	public void setObjectId(Long objectId) {
		this.objectId = objectId;
	}
	public String getDefaultSortKeyName() {
		return defaultSortKeyName;
	}
	public void setDefaultSortKeyName(String defaultSortKeyName) {
		this.defaultSortKeyName = defaultSortKeyName;
	}
	public Boolean getUseConsolidateCodeSetting() {
		return useConsolidateCodeSetting;
	}
	public void setUseConsolidateCodeSetting(Boolean useConsolidateCodeSetting) {
		this.useConsolidateCodeSetting = useConsolidateCodeSetting;
	}
	public Boolean getSelected() {
		return selected;
	}
	public void setSelected(Boolean selected) {
		this.selected = selected;
	}
	public Boolean getCbField() {
		return cbField;
	}
	public void setCbField(Boolean cbField) {
		this.cbField = cbField;
	}
	public Boolean getVisible() {
		return visible;
	}
	public void setVisible(Boolean visible) {
		this.visible = visible;
	}
	public String getRankBy() {
		return rankBy;
	}
	public void setRankBy(String rankBy) {
		this.rankBy = rankBy;
	}
	public LimitTo getLimitTo() {
		return limitTo;
	}
	public void setLimitTo(LimitTo limitTo) {
		this.limitTo = limitTo;
	}

    public String getLinitToStr() {
        return limitTo.getLimitTo();        
    }

	public Double getLimitLowerValue() {
		return limitLowerValue;
	}
	public void setLimitLowerValue(Double limitLowerValue) {
		this.limitLowerValue = limitLowerValue;
	}
	public Double getLimitUpperValue() {
		return limitUpperValue;
	}
	public void setLimitUpperValue(Double limitUpperValue) {
		this.limitUpperValue = limitUpperValue;
	}
	public Boolean getLimitIsPercent() {
		return limitIsPercent;
	}
	public void setLimitIsPercent(Boolean limitIsPercent) {
		this.limitIsPercent = limitIsPercent;
	}
	public String getLimitBy() {
		return limitBy;
	}
	public void setLimitBy(String limitBy) {
		this.limitBy = limitBy;
	}
	public DisplayMethod getDisplayMethod() {
		return displayMethod;
	}
	public void setDisplayMethod(DisplayMethod displayMethod) {
		this.displayMethod = displayMethod;
	}
	public Boolean getRankExists() {
		return rankExists;
	}
	public void setRankExists(Boolean rankExists) {
		this.rankExists = rankExists;
	}
	public Boolean getLimitExists() {
		return limitExists;
	}
	public void setLimitExists(Boolean limitExists) {
		this.limitExists = limitExists;
	}
	public OrderByColumn getOrderNoRank() {
		return orderNoRank;
	}
	public void setOrderNoRank(OrderByColumn orderNoRank) {
		this.orderNoRank = orderNoRank;
	}
	public Boolean getPageBreak() {
		return pageBreak;
	}
	public void setPageBreak(Boolean pageBreak) {
		this.pageBreak = pageBreak;
	}
	public String getPickListOrderBy() {
		return pickListOrderBy;
	}
	public void setPickListOrderBy(String pickListOrderBy) {
		this.pickListOrderBy = pickListOrderBy;
	}

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getSummaryLabel() {
		// This needs to be generated on the fly using a Combination of Fields
		StringBuffer sb = new StringBuffer();
		sb.append(this.getKeyName());
		sb.append("\n");
		// Check if Rank By option has been selected
		if (this.getRankExists()){
			sb.append("Rank by ");
			sb.append(this.getRankBy());
		}
		else{
			sb.append("Order by " + this.getOrderNoRank().toString());
		}		
		sb.append("\n");		
		sb.append("in  " + this.getColumnOrder().getOrderBy() + " order");
		// Check if Limit to option has been selected		
		if (this.getLimitExists()){
			sb.append("\n");					
			sb.append("Limit to " + this.getLimitTo().getLimitTo());
			sb.append(" ");
			if (LimitTo.BTW_EXCL == this.getLimitTo()){
				sb.append(this.getLimitLowerValue() + " and " + this.getLimitUpperValue());
			}
			else{
				sb.append(this.getLimitLowerValue());				
			}
			sb.append(" based on ");			
			sb.append(this.getLimitBy());
		}
		sb.append("\n");		
		sb.append("Show " + this.getDisplayMethod().getDescription());
		return sb.toString();
	}
	
    // To be Called by the UI when moving a Selected Item back to the Available List 
	public void resetSelections(){
	    this.orderNoRank = OrderByColumn.CODE;
	    this.displayMethod = DisplayMethod.CDNM;
	    this.columnOrder = GroupOrder.ASC;
	    this.rankBy="none";
	    this.rankExists = false;
	    this.limitTo = LimitTo.NONE;
	    this.limitBy="none";
	    this.limitLowerValue = 0d;
	    this.limitUpperValue = 0d;
	    this.limitIsPercent = false;
	    this.limitExists = false;
	    this.orderBy=0;
	}
	public GroupOrder getColumnOrder() {
		return columnOrder;
	}
	public void setColumnOrder(GroupOrder columnOrder) {
		this.columnOrder = columnOrder;
	}

    public Boolean shouldDisplayCodeOnly() {
        return (this.getDisplayMethod() == DisplayMethod.CODE);
    }

    public Boolean shouldDisplayNameOnly() {
        return (this.getDisplayMethod() == DisplayMethod.NAME);
    }

    public Boolean shouldDisplayCodeAndName() {
        return (this.getDisplayMethod() == DisplayMethod.CDNM);
    }

    public Boolean shouldOrderByCode() {
        return (this.getOrderNoRank() == OrderByColumn.CODE);
    }
    

	@Override
	public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        // Equality check on objectId is safe because the RptDictionary row
        // will always have an objectId
        Long objObjectId = null;
        if (!(obj instanceof FlexSortParamItemDTO)) {
            return false;
        } else {
            objObjectId = ((FlexSortParamItemDTO) obj).getObjectId();
        }
        return objectId.equals(objObjectId);
	}
	
	@Override
	public int hashCode() {
		return objectId.intValue();
	}
	    
	// To be used by the UI for Populating the Order by radio button selections
    public void setOrderByType(OrderByType orderByType){
    	if (OrderByType.RANK == orderByType){
    		this.rankExists = true;
    	}
    	else{
    		this.rankExists = false;
    		this.rankBy="none";
    		this.orderNoRank = OrderByColumn.valueOf(orderByType.getOrderType().toUpperCase());
    		if (OrderByType.CODE == orderByType){
    			if (DisplayMethod.NAME == this.displayMethod){
    				this.displayMethod = DisplayMethod.CDNM; 
    			}
    		}
    		else if (OrderByType.NAME == orderByType){
    			if (DisplayMethod.CODE == this.displayMethod){
    				this.displayMethod = DisplayMethod.CDNM; 
    			}
    		}
    		
    	}
    }
    
	// To be used by the UI for getting the Order by radio button selections    
    public OrderByType getOrderByType(){
    	if (this.rankExists){
    		return OrderByType.RANK;
    	}
    	if (OrderByColumn.CODE == this.orderNoRank){
    		return OrderByType.CODE;
    	}
		return OrderByType.NAME;    	
    }
	
}
