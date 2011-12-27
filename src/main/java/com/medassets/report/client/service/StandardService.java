package com.medassets.report.client.service;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.medassets.report.shared.ParamAvailableItems;
import com.medassets.report.shared.ReportItemDTO;
import com.medassets.report.shared.StandardParamItemDTO;
import com.medassets.report.shared.StandardRptInstanceSupportItemDTO;

@RemoteServiceRelativePath("standardService")
public interface StandardService extends RemoteService {

    public List<StandardParamItemDTO> getStandardParamDTOList(Long reportId, boolean isInstance);

    public ParamAvailableItems getAvailableValuesForCBOorLIST(StandardParamItemDTO dto);

    public void saveStandardReportInstance(String reportInstanceName,List<StandardParamItemDTO> standardParamDTOList,
        StandardRptInstanceSupportItemDTO supportDTO);

    public void runStandardReport( ReportItemDTO reportItemDTO, List<StandardParamItemDTO> dtoList);
    public void voidSessionCloseDocument();

    /**
     * This method is used to update the existing standard report instance.
     * @param standardParamDTOList : List of the parameters belong with the standard report with modified flag set to true for updated params.
     * @param supportDTO         : Standard report instance details.
     */
   public void updateStandardReportInstance(List<StandardParamItemDTO> standardParamDTOList,
                                           StandardRptInstanceSupportItemDTO supportDTO);

    /**
     * GWT-RPC service  asynchronous (client-side) interface
     *
     * @see StandardService
     */

}
