package com.medassets.report.client.service;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.medassets.report.shared.FlexGeneralParamItemDTO;
import com.medassets.report.shared.FlexGlobalSettingsParamItemDTO;
import com.medassets.report.shared.FlexSelectionParamItemDTO;
import com.medassets.report.shared.FlexSortParamItemDTO;
import com.medassets.report.shared.ParamAvailableItemValue;
import com.medassets.report.shared.ReportItemDTO;

public interface FlexServiceAsync {

	void fetchSavedSelections(Long reportTemplateId, Long reportInstanceId,
			AsyncCallback<List<FlexSelectionParamItemDTO>> callback);

	void getFlexGlobalSettingsData(ReportItemDTO report,
			AsyncCallback<List<FlexGlobalSettingsParamItemDTO>> callback);

	void getGeneralData(ReportItemDTO report,
			AsyncCallback<List<FlexGeneralParamItemDTO>> callback);

	void getReportTemplateName(Long reportTemplateId,
			AsyncCallback<String> callback);

	void getSelectTabAvailableParamList(Long reportTemplateId,
			AsyncCallback<List<FlexSelectionParamItemDTO>> callback);

	void getSelectTabParamCodeList(FlexSelectionParamItemDTO selectedParamDTO,
			List<FlexGlobalSettingsParamItemDTO> globalSettingsTabDtoList,
			String[] statusMsg,
			AsyncCallback<List<ParamAvailableItemValue>> callback);

	void populateGlobalSettingsTabParametersByType(Long reportTemplateId,
			Long reportInstanceId,
			AsyncCallback<List<FlexGlobalSettingsParamItemDTO>> callback);

	void runFlexReport(Long reportTemplateId, Long reportInstanceId,
			String templateName,
			List<FlexGlobalSettingsParamItemDTO> fieldList,
			List<FlexSelectionParamItemDTO> flexSelectionParamList,
			List<FlexGeneralParamItemDTO> fieldList2,
			List<FlexSortParamItemDTO> sortParamList,
			AsyncCallback<Void> runflexReportCallback);

}
