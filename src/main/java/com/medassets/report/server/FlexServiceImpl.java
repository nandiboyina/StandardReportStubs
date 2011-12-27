package com.medassets.report.server;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.servlet.ServletException;

import org.springframework.beans.BeanUtils;

import com.avega.util.SpringBeanLocator;
import com.crystaldecisions.sdk.occa.report.application.ReportClientDocument;
import com.crystaldecisions.sdk.occa.report.lib.ReportSDKException;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.medassets.report.client.service.FlexService;
import com.medassets.report.flex.dao.FlexReportParamDAO;
import com.medassets.report.flex.domain.FlexGeneralParamDTO;
import com.medassets.report.flex.domain.FlexGlobalSettingsParamDTO;
import com.medassets.report.flex.domain.FlexSelectParamDTO;
import com.medassets.report.flex.domain.FlexSelectSelectionAllDTO;
import com.medassets.report.flex.domain.FlexSelectSelectionExceptionDTO.ValueMatchType;
import com.medassets.report.flex.domain.FlexSelectSelectionMatchDTO;
import com.medassets.report.flex.domain.FlexSelectSelectionMatchDTO.MatchType;
import com.medassets.report.flex.domain.FlexSortParamDTO;
import com.medassets.report.flex.service.FlexReportService;
import com.medassets.report.flex.service.FlexReportServiceImpl;
import com.medassets.report.shared.FlexGeneralParamItemDTO;
import com.medassets.report.shared.FlexGlobalSettingsParamItemDTO;
import com.medassets.report.shared.FlexSelectSelectionExceptionDTO;
import com.medassets.report.shared.FlexSelectionParamItemDTO;
import com.medassets.report.shared.FlexSortParamItemDTO;
import com.medassets.report.shared.ParamAvailableItemValue;
import com.medassets.report.shared.ReportItemDTO;
import com.medassets.report.viewgenerator.domain.ViewGeneratorParameterExeception;

public class FlexServiceImpl extends RemoteServiceServlet implements FlexService {

    private static final Logger LOGGER = Logger.getLogger(FlexServiceImpl.class.getName());
    private boolean USE_MOCK_DATA = false;
    private static FlexReportParamDAO flexDAO = null;
    
    private static FlexReportService flexReportServiceDAO = null;

    @Override
    public void init() throws ServletException {
    	
    	String initParameter = getServletConfig().getInitParameter("USE_MOCK_DATA");
    	
    	if (initParameter != null && Boolean.valueOf(initParameter)) {
    		USE_MOCK_DATA = true;
    	}
    	
		if (!USE_MOCK_DATA) {
	        flexDAO = (FlexReportParamDAO) SpringBeanLocator.getBean("flexReportParameterDAO");
	        flexReportServiceDAO =  (FlexReportService) SpringBeanLocator.getBean("flexReportService");
	    }
    	super.init();
    }

    public List<FlexGeneralParamItemDTO> getGeneralData(ReportItemDTO report) {
        List<FlexGeneralParamItemDTO> returnList = new ArrayList<FlexGeneralParamItemDTO>();
        for (FlexGeneralParamDTO dto : flexDAO.getGeneralTabParameters(
            report.getReportTemplateId(), report.getReportInstanceId())) {
            returnList.add(toDTO(dto));
        }
        return returnList;
    }

    /**
     * See populateGlobalSettingsTabParametersByType()
     * @param report
     * @return
     * @deprecated
     */
    public List<FlexGlobalSettingsParamItemDTO> getFlexGlobalSettingsData(ReportItemDTO report) {
        List<FlexGlobalSettingsParamItemDTO> returnList = new ArrayList<FlexGlobalSettingsParamItemDTO>();
        for (FlexGlobalSettingsParamDTO dto : flexDAO.getGlobalSettingsTabParameters(
            report.getReportTemplateId(), report.getReportInstanceId())) {
            returnList.add(toDTO(dto));
        }
        return returnList;
    }

    public static FlexGeneralParamItemDTO toDTO(FlexGeneralParamDTO dto) {
        FlexGeneralParamItemDTO retDTO = new FlexGeneralParamItemDTO();
        retDTO.setCurrentValue(dto.getCurrentValue());
        retDTO.setDefaultSelection(dto.getDefaultSelection());
        retDTO.setFieldName(dto.getFieldName());
        retDTO.setFieldType(dto.getFieldType());
        retDTO.setFormulaDestination(dto.getFormulaDestination());
        retDTO.setFunctionType(dto.getFunctionType());
        retDTO.setHelpId(dto.getHelpId());
        retDTO.setLabelName(dto.getLabelName());
        retDTO.setListOfValues(dto.getListOfValues());
        retDTO.setRptDictionaryId(dto.getRptDictionaryId());
        retDTO.setRptGeneralObjectId(dto.getRptGeneralObjectId());
        retDTO.setSetEachGroup(dto.getSetEachGroup());
        retDTO.setSetTo(dto.getSetTo());
        return retDTO;
    }
    
    public static FlexGeneralParamDTO toDTO(FlexGeneralParamItemDTO dto) {
    	FlexGeneralParamDTO retDTO = new FlexGeneralParamDTO();
        retDTO.setCurrentValue(dto.getCurrentValue());
        retDTO.setDefaultSelection(dto.getDefaultSelection());
        retDTO.setFieldName(dto.getFieldName());
        retDTO.setFieldType(dto.getFieldType());
        retDTO.setFormulaDestination(dto.getFormulaDestination());
        retDTO.setFunctionType(dto.getFunctionType());
        retDTO.setHelpId(dto.getHelpId());
        retDTO.setLabelName(dto.getLabelName());
        retDTO.setListOfValues(dto.getListOfValues());
        retDTO.setRptDictionaryId(dto.getRptDictionaryId());
        retDTO.setRptGeneralObjectId(dto.getRptGeneralObjectId());
        retDTO.setSetEachGroup(dto.getSetEachGroup());
        retDTO.setSetTo(dto.getSetTo());
        return retDTO;
    }

    public static FlexGlobalSettingsParamItemDTO toDTO(FlexGlobalSettingsParamDTO dto) {
        FlexGlobalSettingsParamItemDTO retDTO = new FlexGlobalSettingsParamItemDTO();
        retDTO.setCurrentValue(dto.getCurrentValue());
        retDTO.setFieldName(dto.getFieldName());
        retDTO.setFieldType(dto.getFieldType());
        retDTO.setFlags(dto.getFlags());
        retDTO.setHelpId(dto.getHelpId());
        retDTO.setLabelName(dto.getLabelName());
        retDTO.setDisplayLabelName(dto.getDisplayLabelName());
        retDTO.setListOfValues(dto.getListOfValues());
        retDTO.setLookup(dto.getLookup());
        retDTO.setMasterSettingObjectId(dto.getMasterSettingObjectId());
        retDTO.setOrderIndex(dto.getOrderIndex());
        retDTO.setParameterName(dto.getParameterName());
        retDTO.setSetTo(dto.getSetTo());
        return retDTO;
    }

    public static FlexGlobalSettingsParamDTO toDTO(FlexGlobalSettingsParamItemDTO dto) {
    	FlexGlobalSettingsParamDTO retDTO = new FlexGlobalSettingsParamDTO();
    	if (dto != null) {
	        retDTO.setCurrentValue(dto.getCurrentValue());
	        retDTO.setFieldName(dto.getFieldName());
	        retDTO.setFieldType(dto.getFieldType());
	        retDTO.setFlags(dto.getFlags());
	        retDTO.setHelpId(dto.getHelpId());
	        retDTO.setLabelName(dto.getLabelName());
	        retDTO.setDisplayLabelName(dto.getDisplayLabelName());
	        retDTO.setListOfValues(dto.getListOfValues());
	        retDTO.setLookup(dto.getLookup());
	        retDTO.setMasterSettingObjectId(dto.getMasterSettingObjectId());
	        retDTO.setOrderIndex(dto.getOrderIndex());
	        retDTO.setParameterName(dto.getParameterName());
	        retDTO.setSetTo(dto.getSetTo());
    	}
        return retDTO;
    }

    /**
     * Return report template name.
     * @param reportTemplateId
     * @return
     */
    public String getReportTemplateName(Long reportTemplateId) {
		return flexDAO.getReportTemplateName(reportTemplateId);
    }

    /**
     * Return fields for the Flex Report Global Settings tab. Three lists will be populated to
     * correspond with the three sections in the UI. Since only 1 list can be returned, a <null>
     * reference will be added to the list as a placeholder for a section break.
     * @param reportTemplateId
     * @param reportInstanceId
     * @return 
     */
    public List<FlexGlobalSettingsParamItemDTO> populateGlobalSettingsTabParametersByType(
        Long reportTemplateId, Long reportInstanceId) {

        List<FlexGlobalSettingsParamDTO> sdf = new ArrayList<FlexGlobalSettingsParamDTO>();
        List<FlexGlobalSettingsParamDTO> enc = new ArrayList<FlexGlobalSettingsParamDTO>();
        List<FlexGlobalSettingsParamDTO> ci = new ArrayList<FlexGlobalSettingsParamDTO>();

        flexDAO.populateGlobalSettingsTabParametersByType(reportTemplateId, reportInstanceId, sdf, enc, ci);

        List<FlexGlobalSettingsParamItemDTO> retList = new ArrayList<FlexGlobalSettingsParamItemDTO>();
        for (FlexGlobalSettingsParamDTO dto : sdf) {
            retList.add(toDTO(dto));
        }

        retList.add(null);

        for (FlexGlobalSettingsParamDTO dto : enc) {
            retList.add(toDTO(dto));
        }

        retList.add(null);

        for (FlexGlobalSettingsParamDTO dto : ci) {
            retList.add(toDTO(dto));
        }

        return retList;
    }

    /**
     * Return available parameters list to the flex selection tab.
     * 
     * @param reportTemplateId Long
     * @return List<FlexSelectTabParamDTO>
     */
	@Override
	public List<FlexSelectionParamItemDTO> getSelectTabAvailableParamList(Long reportTemplateId) {
		List<FlexSelectionParamItemDTO> paramList = new ArrayList<FlexSelectionParamItemDTO>();
		List<FlexSelectParamDTO> flexParamDTOList =  new ArrayList<FlexSelectParamDTO>();
		
		if (flexDAO == null) {
			mockSelectTabAvailableParameters(flexParamDTOList);
		} else {			
	    	flexParamDTOList = flexDAO.getSelectTabAvailableList(reportTemplateId);
		}
		
		for (FlexSelectParamDTO flexParamDTO: flexParamDTOList) {
			paramList.add(toFlexSelectTabSharedDTO(flexParamDTO));
		}
		return paramList;
    	
    }
	
	/**
     * Return parameter codes list to the flex selection tab.
     * 
     * @param reportTemplateId Long
     * @return List<FlexSelectTabParamDTO>
     */
	public List<ParamAvailableItemValue> getSelectTabParamCodeList(FlexSelectionParamItemDTO selectedParamDTO, 
			List<FlexGlobalSettingsParamItemDTO> globalSettingsTabDtoList,
			String[] statusMessage) {
		List<ParamAvailableItemValue> paramList = new ArrayList<ParamAvailableItemValue>();
		List<FlexGlobalSettingsParamDTO> flexGlobalSettingsDtoList = new ArrayList<FlexGlobalSettingsParamDTO>();
		List<String[]> paramCodeList = new ArrayList<String[]>();

		if (globalSettingsTabDtoList != null) {
			for (FlexGlobalSettingsParamItemDTO dtoObj : globalSettingsTabDtoList) {
				flexGlobalSettingsDtoList.add(toDTO(dtoObj));
			}
		}
		
		if (flexDAO == null) {
			mockSelectTabParamCodeList(paramCodeList);
		} else {
			flexGlobalSettingsDtoList = null; // TODO to remove the line when integration with global settigns tab
			paramCodeList = flexDAO.getSelectTabAvailableValues(toFlexSelectDomainDTO(selectedParamDTO), flexGlobalSettingsDtoList, statusMessage);
		}
    	
		for (String[] paramCode: paramCodeList) {
			ParamAvailableItemValue paramCodeObj = new ParamAvailableItemValue();
			paramCodeObj.setCode(paramCode[0]);
			paramCodeObj.setName(paramCode[1]);
			paramList.add(paramCodeObj);
		}
    	return paramList;
    }

	/**
	 * Return saved selections to the flex selection tab
	 * @param reportTemplateId Long
	 * @param reportInstanceId Long
	 * @return List<FlexSelectionParamItemDTO>
	 */
	public List<FlexSelectionParamItemDTO> fetchSavedSelections(Long reportTemplateId, Long reportInstanceId) {
		List<FlexSelectionParamItemDTO> savedSelectionsSharedDtoList = new ArrayList<FlexSelectionParamItemDTO>();
		List<FlexSelectParamDTO> savedSelectionsDomainDtoList = new ArrayList<FlexSelectParamDTO>();
		
		if (flexDAO == null) {
			mockSelectTabSelctedParameters(savedSelectionsDomainDtoList);
		} else {
			savedSelectionsDomainDtoList = flexDAO.getSelectTabSelectedList(reportTemplateId, reportInstanceId);
		}
		
		for (FlexSelectParamDTO flexParamDTO: savedSelectionsDomainDtoList) {
			savedSelectionsSharedDtoList.add(toFlexSelectTabSharedDTO(flexParamDTO));
		}
		
		return savedSelectionsSharedDtoList;
	}
	
	/**
	 * Transform from domainDTO to sharedDTO
	 * 
	 * @param domainDTO FlexSelectParamDTO
	 * @return sharedDTO FlexSelectionParamItemDTO
	 */
	private FlexSelectionParamItemDTO toFlexSelectTabSharedDTO(FlexSelectParamDTO domainDTO) {
		FlexSelectionParamItemDTO sharedDTO = new FlexSelectionParamItemDTO();
		
		sharedDTO.setAliasName(domainDTO.getAliasName());
		sharedDTO.setAllowNullSelection(domainDTO.getAllowNullSelection());
		sharedDTO.setCbField(domainDTO.getCbField());

		sharedDTO.setDescription(domainDTO.getDescription());
		sharedDTO.setFieldName(domainDTO.getFieldName());
		sharedDTO.setFieldType(domainDTO.getFieldType());

		sharedDTO.setIsRequiredForExists(domainDTO.getIsRequiredForExists());
		sharedDTO.setKeyName(domainDTO.getKeyName());
		sharedDTO.setLookup(domainDTO.getLookup());

		sharedDTO.setObjectId(domainDTO.getObjectId());
		sharedDTO.setParentName(domainDTO.getParentName());
		sharedDTO.setPickListOrderBy(domainDTO.getPickListOrderBy());

		sharedDTO.setPopulated(domainDTO.getPopulated());
		sharedDTO.setReportType(domainDTO.getReportType());
		sharedDTO.setToolName(domainDTO.getToolName());
		
		com.medassets.report.shared.FlexSelectSelectionAllDTO itemSelections = sharedDTO.getItemSelections();
		FlexSelectSelectionAllDTO domainItemSelections = domainDTO.getItemSelections();
		// item selections
		BeanUtils.copyProperties(domainItemSelections, itemSelections);
		sharedDTO.setItemSelections(itemSelections);
		
		// match selections
		BeanUtils.copyProperties(domainDTO.getMatchSelections(), sharedDTO.getMatchSelections());
		if (sharedDTO.getMatchSelections() != null){
			sharedDTO.getMatchSelections().setCboThats(transformAlphaNumericMatchOptionValue(domainDTO.getMatchSelections().getCboThats()));
		}
		
		// value selections
		if (domainDTO != null && domainDTO.getValueSelections() != null) {
			BeanUtils.copyProperties(domainDTO.getValueSelections(), sharedDTO.getValueSelections());
			if (sharedDTO.getValueSelections() != null) {
				sharedDTO.getValueSelections().setCboIs(transformDaterOrNumericMatchOptionValue(domainDTO.getValueSelections().getCboIs()));
			}
		} else {
			sharedDTO.setValueSelections(new FlexSelectSelectionExceptionDTO());
		}
		
		// TODO - Begin - the following lines of code would be removed after domainDTO migration
		if (domainDTO.getItemSelections() != null) {
			if (flexDAO == null) {
				String expectedAlias = "AND " + domainDTO.getKeyName() + " \n"
						+ "<Does Not Exist>" + "\n" + "APC102007" + "\n"
						+ "APC2009" + "\n" + "APC2010LONG" + "\n" + "APC01" + "\n"
						+ "APC2007" + "\n" + "APC2011";
				List<String> aliasFormulaList = new ArrayList<String>();
				aliasFormulaList.add(expectedAlias);
				sharedDTO.getItemSelections().setAliasFormulas(aliasFormulaList);
			}
		}
		// End
		return sharedDTO;
	}
	
	private List<String> transformAlphaNumericMatchOptionValue(List<MatchType> cboThats) {
		List<String> matchOptions = new ArrayList<String>();
		if (cboThats != null) {
			for (MatchType matchOption : cboThats) {
				matchOptions.add(matchOption.getMatch());
			}
		}
		return matchOptions;
	}

	private List<String> transformDaterOrNumericMatchOptionValue(List<ValueMatchType> cboIs) {
		List<String> matchOptions = new ArrayList<String>();
		if (cboIs != null) {
			for (ValueMatchType matchOption : cboIs) {
				matchOptions.add(matchOption.getValueMatch());
			}
		}
		return matchOptions;
	}

	/**
	 * Transform from sharedDTO to domainDTO
	 * 
	 * @param sharedDTO FlexSelectionParamItemDTO
	 * @return domainDTO FlexSelectParamDTO
	 */
	private FlexSelectParamDTO toFlexSelectDomainDTO(FlexSelectionParamItemDTO sharedDTO) {
		FlexSelectParamDTO domainDTO = new FlexSelectParamDTO();
		
		domainDTO.setAliasName(sharedDTO.getAliasName());
		domainDTO.setAllowNullSelection(sharedDTO.getAllowNullSelection());
		domainDTO.setCbField(sharedDTO.getCbField());

		domainDTO.setDescription(sharedDTO.getDescription());
		domainDTO.setFieldName(sharedDTO.getFieldName());
		domainDTO.setFieldType(sharedDTO.getFieldType());

		domainDTO.setIsRequiredForExists(sharedDTO.getIsRequiredForExists());
		domainDTO.setKeyName(sharedDTO.getKeyName());
		domainDTO.setLookup(sharedDTO.getLookup());

		domainDTO.setObjectId(sharedDTO.getObjectId());
		domainDTO.setParentName(sharedDTO.getParentName());
		domainDTO.setPickListOrderBy(sharedDTO.getPickListOrderBy());

		domainDTO.setPopulated(sharedDTO.getPopulated());
		domainDTO.setReportType(sharedDTO.getReportType());
		domainDTO.setToolName(sharedDTO.getToolName());
		
		// item selections
		BeanUtils.copyProperties(domainDTO.getItemSelections(), sharedDTO.getItemSelections());
		
		// match selections
		BeanUtils.copyProperties(domainDTO.getMatchSelections(), sharedDTO.getMatchSelections());
		
		// value selections
		BeanUtils.copyProperties(domainDTO.getValueSelections(), sharedDTO.getValueSelections());
		
		return domainDTO;
	}
	
	/**
	 * Mock data for available parameters
	 * 
	 * @param flexParamDTOList List<FlexSelectParamDTO>
	 */
	private void mockSelectTabAvailableParameters(List<FlexSelectParamDTO> flexParamDTOList) {
		for (int i=1; i<=50; i++) {
			FlexSelectParamDTO domainDTO = new FlexSelectParamDTO();
			
			domainDTO.setAliasName("Admission Source" + i);
			domainDTO.setAllowNullSelection(false);
			domainDTO.setCbField(false);

			domainDTO.setDescription("Admission Source" + i);
			domainDTO.setFieldName("Admission Source" + i);
			domainDTO.setFieldType("C");
			
			if (i%2 == 0) {
				domainDTO.setFieldType("C");
			} 
			if (i%4 == 0) {
				domainDTO.setFieldType("N");
			}
			
			if (i == 1 || i%2 != 0) {
				domainDTO.setFieldType("D");
			}

			domainDTO.setIsRequiredForExists(false);
			domainDTO.setKeyName("Admission Source" + i);
			domainDTO.setLookup("Admission Source" + i);

			domainDTO.setObjectId(Long.valueOf(1));
			domainDTO.setParentName("");
			domainDTO.setPickListOrderBy("");

			domainDTO.setPopulated(false);
			domainDTO.setReportType("");
			domainDTO.setToolName("Admission Source" + i);
			
			FlexSelectSelectionAllDTO itemSelections = new FlexSelectSelectionAllDTO();
			itemSelections.setOptionTypes(new ArrayList<String>());
			itemSelections.setDbFields(new ArrayList<String>());
			itemSelections.setIncludeNull(new ArrayList<Boolean>());
			itemSelections.setKeys(new ArrayList<String>());
			itemSelections.setNamesStoredWithCodes(new ArrayList<Boolean>());
			itemSelections.setPopulated(false);
			itemSelections.setSelectedItems(new ArrayList<String>());
			domainDTO.setItemSelections(itemSelections);
			
			FlexSelectSelectionMatchDTO matchDTO = new FlexSelectSelectionMatchDTO();
			matchDTO.setOptionTypes(new ArrayList<String>());
			matchDTO.setDbFields(new ArrayList<String>());
			matchDTO.setKeys(new ArrayList<String>());
			matchDTO.setPopulated(false);
			
			flexParamDTOList.add(domainDTO);
		}
	}
	
	/**
	 * Mock data for saved parameter values
	 * 
	 * @param flexParamDTOList List<FlexSelectParamDTO>
	 */
	private void mockSelectTabSelctedParameters(List<FlexSelectParamDTO> flexParamDTOList) {
		for (int i=1; i<=2; i++) {
			FlexSelectParamDTO paramObj = new FlexSelectParamDTO();
			paramObj.setKeyName("Admission Source" + i);
			paramObj.setDescription("Admission Source" + i);
			paramObj.setLookup("Admission Source Lookup" + i);
			
			FlexSelectSelectionAllDTO itemSelections = new FlexSelectSelectionAllDTO();
			
			List<String> selectedItems = new ArrayList<String>();
			String str = "1|" + "2|" + "3|";
			selectedItems.add(str);
			itemSelections.setSelectedItems(selectedItems);
			
			paramObj.setItemSelections(itemSelections);
			if (i == 1) {
				paramObj.setPopulated(true);
			}
			flexParamDTOList.add(paramObj);
		}
	}
	
	/**
	 * Mock data for parameter code values
	 * 
	 * @param paramCodeList List<String[]>
	 */
	private void mockSelectTabParamCodeList(List<String[]> paramCodeList) {
		for (int i=1; i<=50; i++) {
			String[] paramCode = new String[2];
			paramCode[0] = String.valueOf(i);
			paramCode[1] = String.valueOf("Admission Source " + i);
			paramCodeList.add(paramCode);
		}
	}
	
	@Override
	public void runFlexReport(Long reportTemplateId, Long reportInstanceId, String reportInstanceName,
			List<FlexGlobalSettingsParamItemDTO> globalSettingParamDTOs, List<FlexSelectionParamItemDTO> selectParamDTOs,
			List<FlexGeneralParamItemDTO> generalParamDTOs, List<FlexSortParamItemDTO> sortParamDTOs) {
		voidSessionCloseDocument();
		List<FlexGlobalSettingsParamDTO> globalSettingsList = new ArrayList<FlexGlobalSettingsParamDTO>();
		List<FlexGeneralParamDTO> generalSettingsList = new ArrayList<FlexGeneralParamDTO>();
		List<FlexSelectParamDTO> selectTabSettingsList = new ArrayList<FlexSelectParamDTO>();
		
		for (FlexGlobalSettingsParamItemDTO globalDTO : globalSettingParamDTOs) {
			globalSettingsList.add(toDTO(globalDTO));
		}
		
		for (FlexGeneralParamItemDTO generalDTO : generalParamDTOs) {
			generalSettingsList.add(toDTO(generalDTO));
		}
		
		for (FlexSelectionParamItemDTO selectionTabDTO : selectParamDTOs) {
			selectTabSettingsList.add(toFlexSelectDomainDTO(selectionTabDTO));
		}
		
		//
		List<FlexSortParamDTO> sortParamList = new ArrayList<FlexSortParamDTO>();
		
		
			ReportClientDocument reportDoc = flexReportServiceDAO.runFlexReportSynchronous(reportTemplateId, reportInstanceId, reportInstanceName, globalSettingsList, selectTabSettingsList, 
					generalSettingsList, sortParamList);
			this.getThreadLocalRequest().getSession().setAttribute("clientdoc", reportDoc);
		 
	}
	
    public void voidSessionCloseDocument() {
        //To change body of implemented methods use File | Settings | File Templates.
        ReportClientDocument rdc = (ReportClientDocument) this.getThreadLocalRequest().getSession().getAttribute("clientdoc");
        try {
            if (rdc != null) {
                rdc.close();
            }
            this.getThreadLocalRequest().getSession().removeAttribute("clientdoc");
        } catch (ReportSDKException e) {
//        	 LOGGER.log(Level.ERROR, e.getMessage(), e);
        }

    }
}
