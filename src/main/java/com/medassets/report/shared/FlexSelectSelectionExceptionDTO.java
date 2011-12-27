package com.medassets.report.shared;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * This Transfer Object represents the Match Selections for 1 RptDictionary item
 * of type Date/Numeric in the Select Tab. All The attributes are collections
 * with each element of the collection representing one match selection. The
 * reason for this approach is to keep it similar to the Classic Code, to reduce
 * impact on View Generator Re-Write
 * 
 * @author hbala
 * 
 */

public class FlexSelectSelectionExceptionDTO implements IsSerializable {

	private List<String> optionTypes = new ArrayList<String>(); // Values are AND, OR AND NOT, OR NOT
	private List<String> cboIs = new ArrayList<String>(); // type of match based on the UI
										// Selection
	private List<String> criteria2s = new ArrayList<String>(); // lower bound value selection
	private List<String> criteria3s = new ArrayList<String>(); // upper bound value selection
	private List<String> dbFields = new ArrayList<String>(); // fieldName from FlexSelectParamDTO
	private List<String> actualFormulas = new ArrayList<String>(); // Empty String
	private List<String> aliasFormulas = new ArrayList<String>(); // Generated String
	private boolean populated; // true if value match selections are populated,
								// false otherwise
	private List<String> keys = new ArrayList<String>(); // keyName from FlexSelectParamDTO
	
	private Map<String, String> optionTypeMap = new HashMap<String, String>();

	public List<String> getOptionTypes() {
		return optionTypes;
	}

	public void setOptionTypes(List<String> optionTypes) {
		this.optionTypes = optionTypes;
	}

	public List<String> getCboIs() {
		if (cboIs == null || cboIs.size() == 0) {
			List<String> matchOptions = new ArrayList<String>();
			matchOptions.add("equal to");
			matchOptions.add("not equal to");
			matchOptions.add("greater than");
			matchOptions.add("less than");
			matchOptions.add("greater than or equal to");
			matchOptions.add("less than or equal to");
			matchOptions.add("between including");
			matchOptions.add("between excluding");
			matchOptions.add("outside");
			setCboIs(matchOptions);
		}
		return cboIs;
	}

	public void setCboIs(List<String> cboIs) {
		this.cboIs = cboIs;
	}

	public List<String> getCriteria2s() {
		return criteria2s;
	}

	public void setCriteria2s(List<String> criteria2s) {
		this.criteria2s = criteria2s;
	}

	public List<String> getCriteria3s() {
		return criteria3s;
	}

	public void setCriteria3s(List<String> criteria3s) {
		this.criteria3s = criteria3s;
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
	
    // Use this method to add a new selection from the Match Dialog 	
	public void addSelection(String optionType, String cboIs,  
			                 String criteria2, String criteria3,
			                 String dbField, String key){
		
		this.optionTypes.add(optionType);
		this.cboIs.add(cboIs);
		this.criteria2s.add(criteria2);
		this.criteria3s.add(criteria3);
		this.dbFields.add(dbField);
		this.keys.add(key);
		String aliasFormula = this.generateAliasFormula(optionType, cboIs, criteria2, criteria3, dbField, key);
		this.aliasFormulas.add(aliasFormula);
		this.actualFormulas.add("");
		this.setPopulated(true);
	}
	
    // Use this method when updating an existing selection from the Match Dialog	
	public void updateSelection(String optionType, String cboIs,  
			                    String criteria2, String criteria3,
			                    String dbField, String key, int selectionIndex){
		
		// First check if this combination already exists
	    int index = this.findIndexForSelection(optionType, cboIs, criteria2, criteria3, dbField, key);
	    if (index != -1){
	    	throw new IllegalArgumentException("This modification duplicates an existing criterion");
	    }	    	
	    // Proceed with the update
		this.optionTypes.set(selectionIndex, optionType);
		this.cboIs.set(selectionIndex, cboIs);
		this.criteria2s.set(selectionIndex, criteria2);
		this.criteria3s.set(selectionIndex, criteria3);
		this.dbFields.set(selectionIndex, dbField);
		this.keys.set(selectionIndex, key);
		String aliasFormula = this.generateAliasFormula(optionType, cboIs, criteria2, criteria3, dbField, key);
		this.aliasFormulas.set(selectionIndex, aliasFormula);
		this.actualFormulas.set(selectionIndex, "");
		this.setPopulated(true);
	}
	
	
	
	public void removeSelection(String optionType, String cboIs,  
                                String criteria2, String criteria3,
                                String dbField, String key){
      int index = this.findIndexForSelection(optionType, cboIs, criteria2, criteria3, dbField, key);
      this.removeSelection(index);
    }
	
	
	public void removeSelection(int index){
		
		this.optionTypes.remove(index);
		this.cboIs.remove(index);
		this.criteria2s.remove(index);
		this.criteria3s.remove(index);
		this.dbFields.remove(index);
		this.keys.remove(index);
		
		this.optionTypeMap.remove(aliasFormulas.get(index));
		
		this.aliasFormulas.remove(index);
		this.actualFormulas.remove(index);
		
		if (this.dbFields.size() == 0)
		   this.setPopulated(false);
		
    }
	
	
	
	private int findIndexForSelection(String optionType, String cboIs,  
                                      String criteria2, String criteria3,
                                      String dbField, String key){
		
		String aliasFormula = this.generateAliasFormula(optionType, cboIs, criteria2, criteria3, dbField, key);
		return this.aliasFormulas.indexOf(aliasFormula);

	}
	
	// Check for existing Selection when adding from the Match Dialog
	public boolean isSelectionExisting(String optionType, String cboIs,  
                                       String criteria2, String criteria3,
                                       String dbField, String key){
		
		String aliasFormula = this.generateAliasFormula(optionType, cboIs, criteria2, criteria3, dbField, key);
		int index = this.aliasFormulas.indexOf(aliasFormula);
		
		return (index==-1)?false:true;

	}
	
	

	// This method gets called internally every time a new Match Selection
	// is added or a exisitng selection is modified
	public String generateAliasFormula(String optionType,String cboIs,  
                                        String criteria2, String criteria3,
                                        String dbField, String key){
	   StringBuffer aliasFormula = new StringBuffer();
	   
 	   aliasFormula.append(optionType);
 	   aliasFormula.append(" ");
 	   aliasFormula.append(key);
 	   aliasFormula.append(" ");
 	   aliasFormula.append(cboIs);
 	   aliasFormula.append(" ");
 	   aliasFormula.append(criteria2);
 	   
 	   if (cboIs != null) {
	 	   if (cboIs.contains("between including") || cboIs.contains("between excluding") || cboIs.contains("outside")){
	 	 	   aliasFormula.append(" and ");
	 	 	   aliasFormula.append(criteria3); 		   
	 	   }	   
 	   }
 	  if (cboIs.contains("\n")) {
 		 cboIs.replace("\\", "");
 		 cboIs.replace("n", "");
	  }
 	  this.optionTypeMap.put(cboIs, aliasFormula.toString());
 	   
 	   return aliasFormula.toString();
	}

	public Map<String, String> getOptionTypeMap() {
		return optionTypeMap;
	}

	public void setOptionTypeMap(Map<String, String> optionTypeMap) {
		this.optionTypeMap = optionTypeMap;
	}

	

}
