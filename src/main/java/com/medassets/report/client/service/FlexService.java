package com.medassets.report.client.service;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.medassets.report.shared.FlexGeneralParamItemDTO;
import com.medassets.report.shared.FlexGlobalSettingsParamItemDTO;
import com.medassets.report.shared.FlexSelectionParamItemDTO;
import com.medassets.report.shared.FlexSortParamItemDTO;
import com.medassets.report.shared.ParamAvailableItemValue;
import com.medassets.report.shared.ReportItemDTO;
import com.medassets.report.viewgenerator.domain.ViewGeneratorParameterExeception;

@RemoteServiceRelativePath("flexService")
public interface FlexService extends RemoteService {

	public List<FlexGeneralParamItemDTO> getGeneralData(ReportItemDTO report);

	/**
	 * See populateGlobalSettingsTabParametersByType()
	 * 
	 * @param report
	 * @return
	 * @deprecated
	 */
	@Deprecated
	public List<FlexGlobalSettingsParamItemDTO> getFlexGlobalSettingsData(
			ReportItemDTO report);

	/**
	 * Return report template name.
	 * 
	 * @param reportTemplateId
	 * @return
	 */
	public String getReportTemplateName(Long reportTemplateId);

	/**
	 * Return fields for the Flex Report Global Settings tab. Three lists will
	 * be populated to correspond with the three sections in the UI. Since only
	 * 1 list can be returned, a <null> reference will be added to the list as a
	 * placeholder for a section break.
	 * 
	 * @param reportTemplateId
	 * @param reportInstanceId
	 * @return
	 */
	public List<FlexGlobalSettingsParamItemDTO> populateGlobalSettingsTabParametersByType(
			Long reportTemplateId, Long reportInstanceId);

	/**
	 * Retrieve the Flex Select Tab Available List
	 * 
	 * @param reportTemplateId
	 * @return List<FlexSelectTabParamDTO>
	 */
	List<FlexSelectionParamItemDTO> getSelectTabAvailableParamList(
			Long reportTemplateId);

	/**
     * Return parameter codes list to the flex selection tab.
     * 
     * @param reportTemplateId Long
     * @return List<FlexSelectTabParamDTO>
     */
	public List<ParamAvailableItemValue> getSelectTabParamCodeList(
			FlexSelectionParamItemDTO selectedParamDTO,
			List<FlexGlobalSettingsParamItemDTO> globalSettingsTabDtoList,
			String[] statusMsg);
	
	/**
	 * Return saved selections to the flex selection tab
	 * @param reportTemplateId Long
	 * @param reportInstanceId Long
	 * @return List<FlexSelectionParamItemDTO>
	 */
	public List<FlexSelectionParamItemDTO> fetchSavedSelections(Long reportTemplateId, Long reportInstanceId);
	
	/**
	 * Used For Interim Solution Only for UI usage
	 * 
	 * @param reportTemplateId
	 * @param reportInstanceId (Applicable if running a Report Instance, null otherwise)
	 * @param reportInstanceName (Applicable if running a Report Instance, null otherwise)
	 * @param globalSettingParamDTOs
	 * @param selectParamDTOs
	 * @param generalParamDTOs
	 * @param sortParamDTOs
	 * @return ReportClientDocument
	 * @throws ViewGeneratorParameterExeception
	 */
	public void runFlexReport(Long reportTemplateId, Long reportInstanceId, String reportInstanceName,
			List<FlexGlobalSettingsParamItemDTO> globalSettingParamDTOs,
			List<FlexSelectionParamItemDTO> selectParamDTOs,
			List<FlexGeneralParamItemDTO> generalParamDTOs,
			List<FlexSortParamItemDTO> sortParamDTOs);
}
