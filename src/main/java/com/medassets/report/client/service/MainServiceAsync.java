package com.medassets.report.client.service;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.medassets.report.shared.ReportItemDTO;
import com.medassets.report.shared.TreeItemDTO;

public interface MainServiceAsync {

	void deleteFolder(TreeItemDTO folder, AsyncCallback<String> callback);

	void deleteReport(ReportItemDTO report, AsyncCallback<String> callback);

	void getAllTreeData(AsyncCallback<List<TreeItemDTO>> callback);

	void getReports(AsyncCallback<List<ReportItemDTO>> callback);

	void getTopNodeFolder(AsyncCallback<TreeItemDTO> callback);

	void getUserDisplayName(AsyncCallback<String> callback);

	void newFolder(TreeItemDTO parentFolder, String folderName,
			AsyncCallback<String> callback);

	void renameFolder(TreeItemDTO folder, AsyncCallback<Void> callback);

}
