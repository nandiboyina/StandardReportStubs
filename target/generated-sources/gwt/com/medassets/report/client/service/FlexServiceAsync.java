package com.medassets.report.client.service;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

public interface FlexServiceAsync
{

    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.medassets.report.client.service.FlexService
     */
    void getGeneralData( com.medassets.report.shared.ReportItemDTO report, AsyncCallback<java.util.List<com.medassets.report.shared.FlexGeneralParamItemDTO>> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.medassets.report.client.service.FlexService
     */
    void getFlexGlobalSettingsData( com.medassets.report.shared.ReportItemDTO report, AsyncCallback<java.util.List<com.medassets.report.shared.FlexGlobalSettingsParamItemDTO>> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.medassets.report.client.service.FlexService
     */
    void getReportTemplateName( java.lang.Long reportTemplateId, AsyncCallback<java.lang.String> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.medassets.report.client.service.FlexService
     */
    void populateGlobalSettingsTabParametersByType( java.lang.Long reportTemplateId, java.lang.Long reportInstanceId, AsyncCallback<java.util.List<com.medassets.report.shared.FlexGlobalSettingsParamItemDTO>> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.medassets.report.client.service.FlexService
     */
    void getSelectTabAvailableParamList( java.lang.Long reportTemplateId, AsyncCallback<java.util.List<com.medassets.report.shared.FlexSelectionParamItemDTO>> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.medassets.report.client.service.FlexService
     */
    void getSelectTabParamCodeList( com.medassets.report.shared.FlexSelectionParamItemDTO selectedParamDTO, java.util.List<com.medassets.report.shared.FlexGlobalSettingsParamItemDTO> globalSettingsTabDtoList, java.lang.String[] statusMsg, AsyncCallback<java.util.List<com.medassets.report.shared.ParamAvailableItemValue>> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.medassets.report.client.service.FlexService
     */
    void fetchSavedSelections( java.lang.Long reportTemplateId, java.lang.Long reportInstanceId, AsyncCallback<java.util.List<com.medassets.report.shared.FlexSelectionParamItemDTO>> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.medassets.report.client.service.FlexService
     */
    void runFlexReport( java.lang.Long reportTemplateId, java.lang.Long reportInstanceId, java.lang.String reportInstanceName, java.util.List<com.medassets.report.shared.FlexGlobalSettingsParamItemDTO> globalSettingParamDTOs, java.util.List<com.medassets.report.shared.FlexSelectionParamItemDTO> selectParamDTOs, java.util.List<com.medassets.report.shared.FlexGeneralParamItemDTO> generalParamDTOs, java.util.List<com.medassets.report.shared.FlexSortParamItemDTO> sortParamDTOs, AsyncCallback<Void> callback );


    /**
     * Utility class to get the RPC Async interface from client-side code
     */
    public static final class Util 
    { 
        private static FlexServiceAsync instance;

        public static final FlexServiceAsync getInstance()
        {
            if ( instance == null )
            {
                instance = (FlexServiceAsync) GWT.create( FlexService.class );
                ServiceDefTarget target = (ServiceDefTarget) instance;
                target.setServiceEntryPoint( GWT.getModuleBaseURL() + "flexService" );
            }
            return instance;
        }

        private Util()
        {
            // Utility class should not be instanciated
        }
    }
}
