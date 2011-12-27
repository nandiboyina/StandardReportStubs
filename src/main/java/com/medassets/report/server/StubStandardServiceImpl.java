package com.medassets.report.server;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.medassets.report.library.domain.ReportDTO;

import com.medassets.report.shared.StandardParamItemDTO;
import com.medassets.report.shared.StandardRptInstanceSupportItemDTO;

public class StubStandardServiceImpl {
	static int c = 0,i=0;
	static ReportDTO[] reports = new ReportDTO[20];
	Map<Long, List<StandardParamItemDTO>> map = new HashMap<Long, List<StandardParamItemDTO>>();
	StandardParamItemDTO dto;
	ArrayList<StandardParamItemDTO> list;

	public StubStandardServiceImpl() {
		for (int j = 0; j < 16; j++) {
			list = new ArrayList<StandardParamItemDTO>();
			for (int i = 0; i < 7; i++) {

				dto = new StandardParamItemDTO();
				dto.setPromptDescription("Parameter " + i);
				if (i == 0) {
					dto.setDefaultParamCodeValueInCrystalReport("ALL");
					dto.setPromptDescription("Consumer Id or ALL");
					dto.setWizStyle(StandardParamItemDTO.WizStyleEnum.TEXT);
				}
				if (i == 1) {
					dto.setDefaultParamCodeValueInCrystalReport("ALL");
					dto.setPromptDescription("Zip codes");
					dto.setWizStyle(StandardParamItemDTO.WizStyleEnum.LIST);
				}
				if (i == 2) {
					dto.setDefaultParamCodeValueInCrystalReport("0.0");
					dto.setPromptDescription("Age Range");
					dto.setWizStyle(StandardParamItemDTO.WizStyleEnum.TEXT);
				}
				if (i == 3) {
					dto.setDefaultParamCodeValueInCrystalReport("12.0");
					dto.setPromptDescription("to");
					dto.setWizStyle(StandardParamItemDTO.WizStyleEnum.TEXT);
				}
				if (i == 4) {
					dto.setDefaultParamCodeValueInCrystalReport("ALL");
					dto.setPromptDescription("Gender");
					dto.setWizStyle(StandardParamItemDTO.WizStyleEnum.LIST);
				}
				if (i == 5) {
					dto.setDefaultParamCodeValueInCrystalReport("ALL");
					dto.setPromptDescription("Ethnicity");
					dto.setWizStyle(StandardParamItemDTO.WizStyleEnum.LIST);
				}
				if (i == 6) {
					dto.setDefaultParamCodeValueInCrystalReport("18-May-1987");
					dto.setPromptDescription("Consumer History Refrence Date");
					dto.setWizStyle(StandardParamItemDTO.WizStyleEnum.TEXT);
				}
				dto.setParamSQLBased(true);
				dto.setParamSelAll(true);

				list.add(dto);
			}
			map.put((long) j, list);
		}
	}

	List<StandardParamItemDTO> getParams(Long instanceId) {
		return map.get(instanceId);
	}

	public static void saveReport(String reportInstanceName,
			List<StandardParamItemDTO> standardParamDTOList,
			StandardRptInstanceSupportItemDTO supportDTO) {
		c = 1;
		reports[i]=new ReportDTO(); 
		if (supportDTO.getTemplateID() < 16)
			reports[i].setCategory("Consumers and Encounters");

		reports[i].setFolderName("Tom");
		reports[i].setName(reportInstanceName);

		reports[i].setReportType("Report");

		reports[i].setTemplateName(reportInstanceName);
		reports[i].setReportTemplateId(0L);
		reports[i].setCreatedCode("nisum");
		reports[i].setCreatedDate(new Date());
		reports[i].setModifiedCode("Smith");
		reports[i].setModifiedDate(new Date());
		i++;

	}
	

}
