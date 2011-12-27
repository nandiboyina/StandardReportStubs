package com.medassets.report.shared;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gwt.user.client.rpc.IsSerializable;
import com.google.gwt.user.client.ui.DialogBox;

/**
 * This Transfer Object represents the Match Selections for 1 RptDictionary item
 * of type String in the Select Tab. All The attributes are collections with
 * each element of the collection representing one match selection. Thre reason
 * for this approach is to keep it similar to the Classic Code, to reduce impact
 * on View Generator Re-Write
 * 
 * @author hbala
 * 
 */
public class FlexSelectSelectionMatchDTO implements IsSerializable {

	/*public enum MatchType {
		STARTS_WITH, ENDS_WITH, CONTAINS, MATCHES_EXACTLY;

		private String match;

		MatchType(String match) {
			this.match = match;
		}

		MatchType() {
		}

		public String getMatch() {
			return match;
		}
		
	    public static MatchType getByName(String name) {
	    	MatchType[] all = MatchType.values();
	        for (MatchType mtype : all) {
	            if (mtype.getMatch().equalsIgnoreCase(name)) {
	                return mtype;
	            }
	        }

	        return MatchType.STARTS_WITH;
	    }
		
	}*/

	// Format of Each element of the Collection has been Documented Below

	private List<String> optionTypes = new ArrayList<String>(); // Values are AND, OR AND NOT, OR NOT
	private List<String> cboCodeNames = new ArrayList<String>(); // Values are Code or Name, based on the
										// UI Selection
	private List<String> cboThats = new ArrayList<String>(); // type of match based on the UI Selection
	private List<String> txtTheChars = new ArrayList<String>(); // match String entered on the UI
	private List<Boolean> ignoreCapits = new ArrayList<Boolean>(); // true or false based on Ignore
										// Capitilzation
										// check box on the UI

	private List<String> dbFields = new ArrayList<String>(); // fieldName from FlexSelectParamDTO
	private List<String> actualFormulas = new ArrayList<String>(); // Empty String
	private List<String> aliasFormulas = new ArrayList<String>(); // Generated String
	private boolean populated; // true if match selections are populated, false
								// otherwise
	private List<String> keys = new ArrayList<String>(); // keyName from FlexSelectParamDTO
	
	private Map<String, String> optionTypeMap = new HashMap<String, String>();

	public List<String> getOptionTypes() {
		return optionTypes;
	}

	public void setOptionTypes(List<String> optionTypes) {
		this.optionTypes = optionTypes;
	}

	public List<String> getCboCodeNames() {
		return cboCodeNames;
	}

	public void setCboCodeNames(List<String> cboCodeNames) {
		this.cboCodeNames = cboCodeNames;
	}

	public List<String> getCboThats() {
		if (cboThats == null || cboThats.size() == 0) {
			List<String> matchOptions = new ArrayList<String>();
			matchOptions.add("starts with");
			matchOptions.add("ends with");
			matchOptions.add("contains");
			matchOptions.add("matches exactly");
			setCboThats(matchOptions);
		}
		return cboThats;
	}

	public void setCboThats(List<String> cboThats) {
		this.cboThats = cboThats;
	}

	public List<String> getTxtTheChars() {
		return txtTheChars;
	}

	public void setTxtTheChars(List<String> txtTheChars) {
		this.txtTheChars = txtTheChars;
	}

	public List<Boolean> getIgnoreCapits() {
		return ignoreCapits;
	}

	public void setIgnoreCapits(List<Boolean> ignoreCapits) {
		this.ignoreCapits = ignoreCapits;
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

	private void setAliasFormulas(List<String> aliasFormulas) {
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
	public void addSelection(String optionType, String cboCodeName, 
			                 String cboThat, String textToMatch, Boolean ignoreCapitalization,
			                 String dbField, String key){
		
		this.optionTypes.add(optionType);
		this.cboCodeNames.add(cboCodeName);
		this.cboThats.add(cboThat);
		this.txtTheChars.add(textToMatch);
		this.ignoreCapits.add(ignoreCapitalization);
		this.dbFields.add(dbField);
		this.keys.add(key);
		String aliasFormula = this.generateAliasFormula(optionType, cboCodeName, cboThat, textToMatch, ignoreCapitalization, dbField, key);
		this.aliasFormulas.add(aliasFormula);
		this.actualFormulas.add("");
		this.setPopulated(true);
	}
	
	
	// Check for existing Selection when adding from the Match Dialog	
	public boolean isSelectionExisting(String optionType, String cboCodeName, 
			                           String cboThat, String textToMatch, Boolean ignoreCapitalization,
			                           String dbField, String key){
		
		String aliasFormula = this.generateAliasFormula(optionType, cboCodeName, cboThat, textToMatch, ignoreCapitalization, dbField, key);
		int index = this.aliasFormulas.indexOf(aliasFormula);
		
		return (index==-1)?false:true;
	}
	
	
	
    // Use this method when updating an existing selection from the Match Dialog	
	public void updateSelection(String optionType, String cboCodeName, 
								String cboThat, String textToMatch, Boolean ignoreCapitalization,
			                    String dbField, String key, int selectionIndex){
		
		
		// First check if this combination already exists
	    int index = this.findIndexForSelection(optionType, cboCodeName, cboThat, textToMatch, ignoreCapitalization, dbField, key);
	    if (index != -1){
	    	throw new IllegalArgumentException("This modification duplicates an existing criterion");
	    }	    	
	    // Proceed with the update
		
		this.optionTypes.set(selectionIndex, optionType);
		this.cboCodeNames.set(selectionIndex,cboCodeName);
		this.cboThats.set(selectionIndex, cboThat);
		this.txtTheChars.set(selectionIndex, textToMatch);
		this.ignoreCapits.set(selectionIndex,ignoreCapitalization);
		this.dbFields.set(selectionIndex,dbField);
		this.keys.set(selectionIndex,key);
		String aliasFormula = this.generateAliasFormula(optionType, cboCodeName, cboThat, textToMatch, ignoreCapitalization, dbField, key);
		this.aliasFormulas.set(selectionIndex,aliasFormula);
		this.actualFormulas.set(selectionIndex,"");
		this.setPopulated(true);
	}
	
	
	public void removeSelection(String optionType, String cboCodeName, 
								String cboThat, String textToMatch, Boolean ignoreCapitalization,
                                String dbField, String key){
      int index = this.findIndexForSelection(optionType, cboCodeName, cboThat, textToMatch, ignoreCapitalization, dbField, key);
      this.removeSelection(index);
    }
	
	
	public void removeSelection(int index){
		
		this.optionTypes.remove(index);
		this.cboCodeNames.remove(index);
		this.cboThats.remove(index);
		this.txtTheChars.remove(index);
		this.ignoreCapits.remove(index);
		this.dbFields.remove(index);
		this.keys.remove(index);
		
		optionTypeMap.remove(this.aliasFormulas.get(index));
		
		this.aliasFormulas.remove(index);
		this.actualFormulas.remove(index);
		
		if (this.dbFields.size() == 0)
		   this.setPopulated(false);
		
    }
	
	
	
	private int findIndexForSelection(String optionType, String cboCodeName, 
									  String cboThat, String textToMatch, Boolean ignoreCapitalization,
                                      String dbField, String key){
		
		String aliasFormula = this.generateAliasFormula(optionType, cboCodeName, cboThat, textToMatch, ignoreCapitalization, dbField, key);
		return this.aliasFormulas.indexOf(aliasFormula);

	}
	
	// This method gets called internally every time a new Match Selection
	// is added or a exisitng selection is modified	
	public String generateAliasFormula(String optionType, String cboCodeName, 
                                        String cboThat, String textToMatch, Boolean ignoreCapitalization,
                                        String dbField, String key){
	   StringBuffer aliasFormula = new StringBuffer();
	   String cboCodeNameTemp = "";
	   if ("Charegable  Activity".equals(key) || "Charegable Activity".equals(key)){
		   cboCodeNameTemp="";		   
	   }
	   else{
		   cboCodeNameTemp= cboCodeName;
	   }
	   
 	   aliasFormula.append(optionType);
 	   aliasFormula.append(" ");
 	   aliasFormula.append(key);
 	   aliasFormula.append(" ");
 	   aliasFormula.append(cboCodeNameTemp);
 	   aliasFormula.append(" ");
 	   aliasFormula.append(cboThat);
 	   aliasFormula.append(" ");
 	   aliasFormula.append("\""); 	   
 	   aliasFormula.append(textToMatch);
 	   aliasFormula.append("\""); 	   
 	   
 	   if (ignoreCapitalization){
 	 	   aliasFormula.append(" ");
 	 	   aliasFormula.append("Ignore Capitalization"); 		   
	   }
 	   
 	  optionTypeMap.put(cboThat, aliasFormula.toString());
 	   
 	   return aliasFormula.toString();
	}

	public Map<String, String> getOptionTypeMap() {
		return optionTypeMap;
	}

	public DialogBox getDialogWindow() {
		// TODO Auto-generated method stub
		return null;
	}

}
	
	


