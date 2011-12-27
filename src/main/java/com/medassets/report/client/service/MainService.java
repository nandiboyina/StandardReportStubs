package com.medassets.report.client.service;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.medassets.report.shared.*;

import java.util.List;

@RemoteServiceRelativePath("mainService")
public interface MainService extends RemoteService {

	public List<TreeItemDTO> getAllTreeData();

	public TreeItemDTO getTopNodeFolder();

	public List<ReportItemDTO> getReports();

	public String deleteReport(ReportItemDTO report);

	public String deleteFolder(TreeItemDTO folder);

	public String getUserDisplayName();

	public String newFolder(TreeItemDTO parentFolder, String folderName);
	
	public void renameFolder(TreeItemDTO folder);
}