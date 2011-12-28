package com.medassets.report.server;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.medassets.report.library.domain.ReportDTO;
import com.medassets.report.shared.StandardParamItemDTO;
import com.medassets.report.shared.StandardRptInstanceSupportItemDTO;
import com.medassets.report.standard.domain.ParamAvailableValue;
import com.medassets.report.standard.domain.StandardParamDTO;

public class StubStandardServiceImpl {
	 List<ParamAvailableValue> result = new ArrayList<ParamAvailableValue>();
	static int c = 0,i=0;
	static ReportDTO[] reports = new ReportDTO[20];
	Map<Long, List<StandardParamItemDTO>> map = new HashMap<Long, List<StandardParamItemDTO>>();
	static Map<Long, List<StandardParamItemDTO>> updateMap = new HashMap<Long, List<StandardParamItemDTO>>();
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
					//dto.setaValueList("aValueList");
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
					//dto.setaValueList("aValueList");
				}
				if (i == 5) {
					dto.setDefaultParamCodeValueInCrystalReport("ALL");
					dto.setPromptDescription("Ethnicity");
					dto.setWizStyle(StandardParamItemDTO.WizStyleEnum.LIST);
					//dto.setaValueList("aValueList");
				}
				if (i == 6) {
					dto.setDefaultParamCodeValueInCrystalReport("18-May-1987");
					dto.setPromptDescription("Consumer History Refrence Date");
					dto.setWizStyle(StandardParamItemDTO.WizStyleEnum.TEXT);
				}
				dto.setParamSQLBased(false);
				dto.setParamSelAll(true);

				list.add(dto);
			}
			map.put((long) j, list);
		}
	}
	List<StandardParamItemDTO> getUpdatedParams(Long instanceId) {
		return updateMap.get(instanceId);
		
	}

	List<StandardParamItemDTO> getParams(Long instanceId) {
		return map.get(instanceId);
	}
	public static void saveUpdatedMap(List<StandardParamItemDTO> standardParamDTOList){
		/*List<StandardParamItemDTO> dto2=standardParamDTOList.subList(0, standardParamDTOList.size());
		updateMap.put(0l, dto2);*/
		StandardParamItemDTO dto;
		ArrayList<StandardParamItemDTO> list=new ArrayList<StandardParamItemDTO>();
		Iterator<StandardParamItemDTO> set=standardParamDTOList.iterator();
		//System.out.println(set.next().toString());
		while(set.hasNext()){
			//System.out.println(set.next().toString());
		/*for (int i = 0; i < 7; i++) {*/

			dto = set.next();
			/*dto.setPromptDescription(set.next().getPromptDescription());
			
				dto.setDefaultParamCodeValueInCrystalReport(set.next().getDefaultParamCodeValueInCrystalReport());
				dto.setPromptDescription(set.next().getPromptDescription());
				dto.setWizStyle(set.next().getWizStyle());*/
			/*}
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
				dto.setDefaultParamCodeValueInCrystalReport("78");
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
			}*/
			/*dto.setParamSQLBased(true);
			dto.setParamSelAll(true);
*/      dto.setReportInstanceID(0l);
			list.add(dto);
		}
		updateMap.put(0l,list);
	}

	public static void saveReport(String reportInstanceName,
			List<StandardParamItemDTO> standardParamDTOList,
			StandardRptInstanceSupportItemDTO supportDTO) {
		c = 1;
		saveUpdatedMap(standardParamDTOList);
		//List<StandardParamItemDTO> dto2=standardParamDTOList.subList(0, standardParamDTOList.size());
		
		/*StandardParamItemDTO dto1=new StandardParamItemDTO();
		for (int i = 0; i < 7; i++) {

			dto1 = new StandardParamItemDTO();
			dto1.setPromptDescription("Parameter " + i);
			if (i == 0) {
				dto1.setDefaultParamCodeValueInCrystalReport("ALL");
				dto1.setPromptDescription("Consumer Id or ALL");
				dto1.setWizStyle(StandardParamItemDTO.WizStyleEnum.TEXT);
			}
			if (i == 1) {
				dto1.setDefaultParamCodeValueInCrystalReport("ALL");
				dto1.setPromptDescription("Zip codes");
				dto1.setWizStyle(StandardParamItemDTO.WizStyleEnum.LIST);
			}
			if (i == 2) {
				dto1.setDefaultParamCodeValueInCrystalReport("0.0");
				dto1.setPromptDescription("Age Range");
				dto1.setWizStyle(StandardParamItemDTO.WizStyleEnum.TEXT);
			}
			if (i == 3) {
				dto1.setDefaultParamCodeValueInCrystalReport("12.0");
				dto1.setPromptDescription("to");
				dto1.setWizStyle(StandardParamItemDTO.WizStyleEnum.TEXT);
			}
			if (i == 4) {
				dto1.setDefaultParamCodeValueInCrystalReport("ALL");
				dto1.setPromptDescription("Gender");
				dto1.setWizStyle(StandardParamItemDTO.WizStyleEnum.LIST);
			}
			if (i == 5) {
				dto1.setDefaultParamCodeValueInCrystalReport("ALL");
				dto1.setPromptDescription("Ethnicity");
				dto1.setWizStyle(StandardParamItemDTO.WizStyleEnum.LIST);
			}
			if (i == 6) {
				dto1.setDefaultParamCodeValueInCrystalReport("18-May-1987");
				dto1.setPromptDescription("Consumer History Refrence Date");
				dto1.setWizStyle(StandardParamItemDTO.WizStyleEnum.TEXT);
			}
			dto1.setParamSQLBased(true);
			dto1.setParamSelAll(true);
			dto2.add(dto1);
			}*/

		
		
		reports[i]=new ReportDTO(); 
		if (supportDTO.getTemplateID() < 16)
			reports[i].setCategory("Consumers and Encounters");

		reports[i].setFolderName("Tom");
		reports[i].setName(reportInstanceName);

		reports[i].setReportType("Report");

		reports[i].setTemplateName(reportInstanceName);
		reports[i].setReportTemplateId(0L);
		reports[i].setReportInstanceId(0l);
		reports[i].setCreatedCode("nisum");
		reports[i].setCreatedDate(new Date());
		
		reports[i].setModifiedCode("Smith");
		reports[i].setModifiedDate(new Date());
		i++;

	}
	public  List<ParamAvailableValue> getAvailableValuesForCBOorLIST(
			StandardParamDTO sDto) {
		for(int i=0;i<11;i++){
		ParamAvailableValue param=new ParamAvailableValue();
		param.setCode("c"+i);
		param.setDescription("d"+i);
		param.setPrependCodeToDescription(true);
		result.add(param);
		}
		return result;
	}
	

	}
