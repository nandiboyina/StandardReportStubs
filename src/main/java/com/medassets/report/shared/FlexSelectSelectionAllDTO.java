package com.medassets.report.shared;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import com.google.gwt.user.client.rpc.IsSerializable;
import com.medassets.report.client.flex.utils.FlexUtils;

/**
 * This Transfer Object represents the value Selections for 1 RptDictionary item
 * in the Select Tab. Note that if multiple value selections are made in the UI,
 * all the values are concatenated using | and stored in the selectedItems field
 * All The attributes are collections with each element of the collection
 * representing one item selection. Thre reason for this approach is to keep it
 * similar to the Classic Code, to reduce impact on View Generator Re-Write
 * 
 * @author hbala
 * 
 */

public class FlexSelectSelectionAllDTO implements IsSerializable {

	// Values are AND, OR AND NOT, OR NOT
	private List<String> optionTypes = new ArrayList<String>(); 
	
	// fieldName from FlexSelectParamDTO
	private List<String> dbFields = new ArrayList<String>(); 
	
	// Empty
	private List<String> actualFormulas = new ArrayList<String>(); 
	
	// Generate String
	private List<String> aliasFormulas = new ArrayList<String>(); 
	
	// true if values populated, false otherwise
	private boolean populated; 
	
	// keyName from FlexSelectParamDTO
	private List<String> keys = new ArrayList<String>(); 

	// If single selections were mode, it will have the format : |code1|code2, capturing all the Single Selections empty otherwise
	private List<String> singleValues = new ArrayList<String>(); 
	
	// empty for only single selection, otherwise format is : |code m|code p, capturing all the staring values
	private List<String> rangeStarts = new ArrayList<String>();
	
	// empty if only single selections, otherwise format is : |code n|code q, capturing all the ending selections
	private List<String> rangeEnds = new ArrayList<String>(); 
	
	// String of form code1|code2|code3 (When namesStoredWithCodes = false) 
	// Note that after Sprint 8 it can be of the form: code1|name1|code2|name2|code3|name3
	// (When namesStoredWithCodes = true)
	private List<String> selectedItems = new ArrayList<String>(); 
	
	// false most of the times After Sprint 8 : true when duplicate codes exist and some (not all) of them have been selected
	private List<Boolean> namesStoredWithCodes = new ArrayList<Boolean>(); 
	
	// true if None/Does not exist is selected, false otherwise
	private List<Boolean> includeNulls = new ArrayList<Boolean>();

	private List<Map<String, String>> codeNameMapList = new ArrayList<Map<String, String>>();
	
	private SortedMap<Integer, ParamAvailableItemValue> paramCodeIndexMap = new TreeMap<Integer, ParamAvailableItemValue>();
	
	private Boolean isNameAvailable = false;

	public SortedMap<Integer, ParamAvailableItemValue> getParamCodeIndexMap() {
		if (paramCodeIndexMap == null) {
			paramCodeIndexMap = new TreeMap<Integer, ParamAvailableItemValue>();
		}
		return paramCodeIndexMap;
	}

	public void setParamCodeIndexMap(SortedMap<Integer, ParamAvailableItemValue> paramCodeIndexMap) {
		this.paramCodeIndexMap = paramCodeIndexMap;
	}

	public List<String> getOptionTypes() {
		return optionTypes;
	}

	public void setOptionTypes(List<String> optionTypes) {
		this.optionTypes = optionTypes;
	}

	public List<String> getDbFields() {
		return dbFields;
	}

	public void setDbFields(List<String> dbFields) {
		this.dbFields = dbFields;
	}

	public List<String> getActualFormulas() {
		return actualFormulas;
	}

	public void setActualFormulas(List<String> actualFormulas) {
		this.actualFormulas = actualFormulas;
	}

	public List<String> getAliasFormulas() {
		return aliasFormulas;
	}

	public void setAliasFormulas(List<String> aliasFormulas) {
		this.aliasFormulas = aliasFormulas;
	}

	public boolean isPopulated() {
		return populated;
	}

	public void setPopulated(boolean populated) {
		this.populated = populated;
	}

	public List<String> getKeys() {
		return keys;
	}

	public void setKeys(List<String> keys) {
		this.keys = keys;
	}

	public List<String> getSingleValues() {
		return singleValues;
	}

	public void setSingleValues(List<String> singleValues) {
		this.singleValues = singleValues;
	}

	public List<String> getRangeStarts() {
		return rangeStarts;
	}

	public void setRangeStarts(List<String> rangeStarts) {
		this.rangeStarts = rangeStarts;
	}

	public List<String> getRangeEnds() {
		return rangeEnds;
	}

	public void setRangeEnds(List<String> rangeEnds) {
		this.rangeEnds = rangeEnds;
	}

	public List<String> getSelectedItems() {
		return selectedItems;
	}

	public void setSelectedItems(List<String> selectedItems) {
		this.selectedItems = selectedItems;
	}

	public List<Boolean> getNamesStoredWithCodes() {
		return namesStoredWithCodes;
	}

	public void setNamesStoredWithCodes(List<Boolean> namesStoredWithCodes) {
		this.namesStoredWithCodes = namesStoredWithCodes;
	}

	public List<Boolean> getIncludeNulls() {
		return includeNulls;
	}

	public void setIncludeNull(List<Boolean> includeNulls) {
		this.includeNulls = includeNulls;
	}

	// Method to be used When Removing all Value Selections for a particular
	// field
	public void removeSelections() {
		this.optionTypes.clear();
		this.dbFields.clear();
		this.actualFormulas.clear();
		this.aliasFormulas.clear();
		this.setPopulated(false);
		this.keys.clear();
		this.singleValues.clear();
		this.rangeStarts.clear();
		this.rangeEnds.clear();
		this.selectedItems.clear();
		this.namesStoredWithCodes.clear();
		this.includeNulls.clear();
		this.codeNameMapList.clear();
		this.paramCodeIndexMap.clear();
	}

	// For UI usage
	// Method to be used when adding one or more item selections for a
	// particular field
	// Used for both first time selections or adding to existing selections
	// namesStoredWithCode has to be determined by the UI layer : For Sprint 8
	// always pass false
	public void addSelection(String optionType, String dbField, String key, List<String> items, boolean namesStoredWithCode, Boolean includeNull,
			boolean selectItemAllowNullSelection, boolean selectItemIsRequiredForExists, Map<String, String> codeNameMap) {

		// Check if something is there is any existing selection at all
		if (this.selectedItems.size() == 0) {
			// Add for first time
			this.optionTypes.add(optionType);
			this.dbFields.add(dbField);
			this.actualFormulas.add("");
			this.aliasFormulas.add("");
			this.setPopulated(true);
			this.keys.add(key);
			StringBuffer sb = new StringBuffer("");
			if (items != null && items.size() > 0) {
				for (String item : items) {
					sb.append(item);
					sb.append("|");
				}
				sb.deleteCharAt(sb.length() - 1);
			}
			this.selectedItems.add(sb.toString());

			// Upto Sprint 8, all the selections are always treated as single
			// values
			if (!"".equals(this.selectedItems.get(0))) {
				this.singleValues.add("|" + this.selectedItems.get(0));
			} else {
				this.singleValues.add("");
			}

			// After Sprint 8, rangeStarts and rangeEnds will have the
			// appropriate values
			this.rangeStarts.add("");
			this.rangeEnds.add("");

			this.namesStoredWithCodes.add(namesStoredWithCode);
			this.includeNulls.add(includeNull);
			this.codeNameMapList.add(codeNameMap);
		} else {
			// Add to existing
			this.optionTypes.clear();
			this.optionTypes.add(optionType);

			// Ensure that the current selectedItemsList does not have a null
			// value
			if (this.selectedItems.get(0) == null) {
				this.selectedItems.set(0, "");
			}

			// Check if there are any items that currently exist
			// If so add to existing Selections

			if (this.selectedItems.get(0).length() >= 0) {
				StringBuffer sb = new StringBuffer(this.selectedItems.get(0));
				for (String item : items) {
					sb.append("|");
					sb.append(item);
				}
				if ("|".equals(sb.substring(0, 1))) {
					sb.deleteCharAt(0);
				}
				this.getSelectedItems().set(0, sb.toString());
				this.singleValues.set(0, "|" + this.selectedItems.get(0));

				// Merge to existing CodeNameMap in List
				for (String code : codeNameMap.keySet()) {
					this.codeNameMapList.get(0).put(code, codeNameMap.get(code));
				}

				if (includeNull) {
					this.getIncludeNulls().set(0, true);
				}
			}
		}

		this.generateAliasFormulas(selectItemAllowNullSelection, selectItemIsRequiredForExists);

	}

	// For DAO use only
	public void addSelection(String optionType, String dbField, String key,
			String items, boolean namesStoredWithCode, Boolean includeNull,
			boolean selectItemAllowNullSelection,
			boolean selectItemIsRequiredForExists,
			Map<String, String> codeNameMap,
			Map<String, String> rangeMap) {
		this.optionTypes.add(optionType);
		this.dbFields.add(dbField);
		this.actualFormulas.add("");
		this.aliasFormulas.add("");
		this.setPopulated(true);
		this.keys.add(key);
		if (items == null) {
			this.selectedItems.add("");
		} else {
			this.selectedItems.add(items);
		}
		// Upto Sprint 8, all the selections are always treated as single values

		if (items != null && !"".equals(items)) {
		  		   String[] strs = items.replace("|", "/").split("/");
		  		   List<String> strsList = new ArrayList<String>();
		  		   for (String strVal : strs){
		  			   strsList.add(strVal);
		  		   }
		  		   if (rangeMap != null){
			  		   for (String strKey : rangeMap.keySet()){
			  			   if (strsList.contains(strKey))
			  				   strsList.remove(strKey);
			  		   }		  			   
		  		   }
		  		   if (strsList.size()>0){
		  			   String singleValueItems = FlexUtils.join(strsList.iterator(), "|");
				       this.singleValues.add("|" + singleValueItems);		  			   
		  		   }
		  		   else{
						this.singleValues.add("");		  			   
		  		   }				
			}
			else{
				this.singleValues.add("");				
			}
	       
	       // Handle Range Start and Range End. For Sprint 9, handles only when names are not stored with codes
		   if (rangeMap == null){
		       this.rangeStarts.add("");
		       this.rangeEnds.add("");	       			   
		   }
		   else{
			   Collection<String> ranges = rangeMap.values();
			   Set<String> rangeSet = new LinkedHashSet<String>();
			   rangeSet.addAll(ranges);
			   StringBuffer startRange = new StringBuffer();
			   StringBuffer endRange = new StringBuffer();
			   
			   for (String range : rangeSet){
				   String[] rangeVals = range.split(","); 
				   startRange.append("|" + rangeVals[0]);
				   endRange.append("|" + rangeVals[1]);
			   }
		       this.rangeStarts.add(startRange.toString());
		       this.rangeEnds.add(endRange.toString());	       			   
		   }
	       this.namesStoredWithCodes.add(namesStoredWithCode);
	       this.includeNulls.add(includeNull);
	       this.codeNameMapList.add(codeNameMap);
	       this.generateAliasFormulas(selectItemAllowNullSelection, selectItemIsRequiredForExists);
	}

	private void generateAliasFormulas(boolean selectItemAllowNullSelection, boolean selectItemIsRequiredForExists) {
		// Get the keys field
		if (this.keys.size() > 0) {
			StringBuffer sb = new StringBuffer();
			sb.append(this.optionTypes.get(0));
			sb.append(" ");
			sb.append(this.keys.get(0));
			sb.append(" ");
			if (this.includeNulls.size() > 0 && this.includeNulls.get(0) == true) {
				sb.append("\n");
				sb.append(this.generateNoneString(selectItemAllowNullSelection, selectItemIsRequiredForExists));
			}
			// Check if Names are not Stored with Codes
			if (!this.namesStoredWithCodes.get(0)) {

				if (this.selectedItems.get(0) != null && this.selectedItems.get(0).length() > 0) {
					String[] selections = this.selectedItems.get(0).replace("|", "/").split("/");
					formatInclusion(sb, selections);
				}
			} else {
				// TODO when names storing with codes for some special parameters 
				if (this.selectedItems.get(0) != null && this.selectedItems.get(0).length() > 0) {
					String[] selections = this.selectedItems.get(0).replace("|", "/").split("/");
					for (String s : selections) {
						sb.append("\n");
						sb.append(s);
					}
				}

			}

			this.aliasFormulas.set(0, sb.toString());
		}

	}

	private void formatInclusion(StringBuffer sb, String[] selections) {
		SortedSet<Integer> singleRecordSelectionIndexSet = new TreeSet<Integer>();
		SortedMap<Integer, Integer> rangeRecordSelectionMap = new TreeMap<Integer, Integer>();
		int rangeStartIndex = -1; 
		for (Integer paramValueIndex : paramCodeIndexMap.keySet()) {
			
			if (!rangeRecordSelectionMap.containsValue(paramValueIndex)) {
				rangeStartIndex = paramValueIndex;
				singleRecordSelectionIndexSet.add(paramValueIndex);
			}
			
			if (paramCodeIndexMap.keySet().contains(paramValueIndex + 1)) {
				singleRecordSelectionIndexSet.remove(paramValueIndex);
				if (!rangeRecordSelectionMap.containsValue(paramValueIndex + 1)) {
					rangeRecordSelectionMap.put(rangeStartIndex, paramValueIndex + 1);
				}
			}
		}
		
		// Include Single Selection Records
		for (Integer singleRecordIndex : singleRecordSelectionIndexSet) {
			sb.append("\n");
			sb.append(paramCodeIndexMap.get(singleRecordIndex).getCode());
			sb.append("\t");
			sb.append(paramCodeIndexMap.get(singleRecordIndex).getName());
			sb.append(",");
		}
		
		// Include Range Selection Records
		for (Integer rangeStartRecordIndex : rangeRecordSelectionMap.keySet()) {
			int rangeEndRcordSelectionIndex = rangeRecordSelectionMap.get(rangeStartRecordIndex);
			int noOfRecords = (rangeEndRcordSelectionIndex - rangeStartRecordIndex) + 1;
			sb.append("\n between includes (" + noOfRecords + ") \n");
			sb.append(paramCodeIndexMap.get(rangeStartRecordIndex).getCode());
			sb.append("\t");
			sb.append(paramCodeIndexMap.get(rangeStartRecordIndex).getName());
			sb.append("\tand \n");
			sb.append(paramCodeIndexMap.get(rangeEndRcordSelectionIndex).getCode());
			sb.append("\t");
			sb.append(paramCodeIndexMap.get(rangeEndRcordSelectionIndex).getName());
		}
		
	}

	private String generateNoneString(boolean selectItemAllowNullSelection, boolean selectItemIsRequiredForExists) {
		String noneString = "";
		if (selectItemAllowNullSelection) {
			if (selectItemIsRequiredForExists) {
				noneString = "<Does Not Exist>";
			} else {
				noneString = "<None>";
			}
		}
		return noneString;
	}

	/** 
	 * Added this function to indicate the case where the only
	 * 	value selected by the user is the NULL value.
	 * 	Answers TRUE if all of the following are true:
	 * 	IncludeNull(includeNullIdx) = true for all includeNullIdx
	 * 	For all of the variants below, their lower bound = their upper bound, and
	 * 	the single	element in them is the null string.
	 * 	RangeEnd, RangeStart, SelectedItems, SingleValue, Otherwise, answers FALSE.
	*/
	public boolean isOnlyIncludesIsNullCriteria() {

		List<List<String>> varsList = new ArrayList<List<String>>();
		varsList.add(this.rangeEnds);
		varsList.add(this.rangeStarts);
		varsList.add(this.selectedItems);
		varsList.add(this.singleValues);

		// If IncludeNull is false for any index, then answer false and exit
		for (boolean inclNull : this.includeNulls) {
			if (!inclNull)
				return false;
		}

		// We now know that all of the IncludeNull() elements are true.
		// For each var in vars() check if
		// lower bound = upper bound and the single
		// element in var is the null string

		for (List<String> strList : varsList) {
			if (!(strList.size() == 1 && "".equals(strList.get(0)))) {
				// ' If vars() contains more than one element or contains
				// non-null
				// ' elements, then answer false and exit
				return false;
			}
		}

		// ' If we get this far, then all of the criteria were met, so answer
		// true
		return true;
	}
	
	public List<Map<String, String>> getCodeNameMapList() {
		return codeNameMapList;
	}

	public void setCodeNameMapList(List<Map<String, String>> codeNameMapList) {
		this.codeNameMapList = codeNameMapList;
	}

	public Boolean getIsNameAvailable() {
		return isNameAvailable;
	}

	public void setIsNameAvailable(Boolean isNameAvailable) {
		this.isNameAvailable = isNameAvailable;
	}
	
}
