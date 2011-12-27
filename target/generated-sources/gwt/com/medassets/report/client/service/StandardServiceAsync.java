package com.medassets.report.client.service;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

public interface StandardServiceAsync
{

    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.medassets.report.client.service.StandardService
     */
    void getStandardParamDTOList( java.lang.Long reportId, boolean isInstance, AsyncCallback<java.util.List<com.medassets.report.shared.StandardParamItemDTO>> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.medassets.report.client.service.StandardService
     */
    void getAvailableValuesForCBOorLIST( com.medassets.report.shared.StandardParamItemDTO dto, AsyncCallback<com.medassets.report.shared.ParamAvailableItems> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.medassets.report.client.service.StandardService
     */
    void saveStandardReportInstance( java.lang.String reportInstanceName, java.util.List<com.medassets.report.shared.StandardParamItemDTO> standardParamDTOList, com.medassets.report.shared.StandardRptInstanceSupportItemDTO supportDTO, AsyncCallback<Void> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.medassets.report.client.service.StandardService
     */
    void runStandardReport( com.medassets.report.shared.ReportItemDTO reportItemDTO, java.util.List<com.medassets.report.shared.StandardParamItemDTO> dtoList, AsyncCallback<Void> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.medassets.report.client.service.StandardService
     */
    void voidSessionCloseDocument( AsyncCallback<Void> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.medassets.report.client.service.StandardService
     */
    void updateStandardReportInstance( java.util.List<com.medassets.report.shared.StandardParamItemDTO> standardParamDTOList, com.medassets.report.shared.StandardRptInstanceSupportItemDTO supportDTO, AsyncCallback<Void> callback );


    /**
     * Utility class to get the RPC Async interface from client-side code
     */
    public static final class Util 
    { 
        private static StandardServiceAsync instance;

        public static final StandardServiceAsync getInstance()
        {
            if ( instance == null )
            {
                instance = (StandardServiceAsync) GWT.create( StandardService.class );
                ServiceDefTarget target = (ServiceDefTarget) instance;
                target.setServiceEntryPoint( GWT.getModuleBaseURL() + "standardService" );
            }
            return instance;
        }

        private Util()
        {
            // Utility class should not be instanciated
        }
    }
}
