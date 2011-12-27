package com.medassets.report.client.service;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.medassets.report.shared.ParamAvailableItems;
import com.medassets.report.shared.ReportItemDTO;
import com.medassets.report.shared.StandardParamItemDTO;
import com.medassets.report.shared.StandardRptInstanceSupportItemDTO;

public interface StandardServiceAsync {

	void getAvailableValuesForCBOorLIST(StandardParamItemDTO dto,
			AsyncCallback<ParamAvailableItems> callback);

	void getStandardParamDTOList(Long reportId, boolean isInstance,
			AsyncCallback<List<StandardParamItemDTO>> callback);

	void runStandardReport(ReportItemDTO reportItemDTO,
			List<StandardParamItemDTO> dtoList, AsyncCallback<Void> callback);

	void saveStandardReportInstance(String reportInstanceName,
			List<StandardParamItemDTO> standardParamDTOList,
			StandardRptInstanceSupportItemDTO supportDTO,
			AsyncCallback<Void> callback);

	void updateStandardReportInstance(
			List<StandardParamItemDTO> standardParamDTOList,
			StandardRptInstanceSupportItemDTO supportDTO,
			AsyncCallback<Void> callback);

	void voidSessionCloseDocument(AsyncCallback<Void> callback);

}
