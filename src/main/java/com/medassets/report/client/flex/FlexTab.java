package com.medassets.report.client.flex;

import com.medassets.report.client.component.MAComponent;
import com.medassets.report.shared.ReportItemDTO;
import java.util.List;

public interface FlexTab {
    void load(ReportItemDTO report);
    List<Object> getDTOs();
    List<MAComponent> getEmptyRequiredFields();
}
