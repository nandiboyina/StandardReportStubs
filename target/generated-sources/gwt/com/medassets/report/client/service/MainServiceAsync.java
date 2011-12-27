package com.medassets.report.client.service;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

public interface MainServiceAsync
{

    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.medassets.report.client.service.MainService
     */
    void getAllTreeData( AsyncCallback<java.util.List<com.medassets.report.shared.TreeItemDTO>> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.medassets.report.client.service.MainService
     */
    void getTopNodeFolder( AsyncCallback<com.medassets.report.shared.TreeItemDTO> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.medassets.report.client.service.MainService
     */
    void getReports( AsyncCallback<java.util.List<com.medassets.report.shared.ReportItemDTO>> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.medassets.report.client.service.MainService
     */
    void deleteReport( com.medassets.report.shared.ReportItemDTO report, AsyncCallback<java.lang.String> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.medassets.report.client.service.MainService
     */
    void deleteFolder( com.medassets.report.shared.TreeItemDTO folder, AsyncCallback<java.lang.String> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.medassets.report.client.service.MainService
     */
    void getUserDisplayName( AsyncCallback<java.lang.String> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.medassets.report.client.service.MainService
     */
    void newFolder( com.medassets.report.shared.TreeItemDTO parentFolder, java.lang.String folderName, AsyncCallback<java.lang.String> callback );


    /**
     * GWT-RPC service  asynchronous (client-side) interface
     * @see com.medassets.report.client.service.MainService
     */
    void renameFolder( com.medassets.report.shared.TreeItemDTO folder, AsyncCallback<Void> callback );


    /**
     * Utility class to get the RPC Async interface from client-side code
     */
    public static final class Util 
    { 
        private static MainServiceAsync instance;

        public static final MainServiceAsync getInstance()
        {
            if ( instance == null )
            {
                instance = (MainServiceAsync) GWT.create( MainService.class );
                ServiceDefTarget target = (ServiceDefTarget) instance;
                target.setServiceEntryPoint( GWT.getModuleBaseURL() + "mainService" );
            }
            return instance;
        }

        private Util()
        {
            // Utility class should not be instanciated
        }
    }
}
