package com.medassets.report.client.mvp;

import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.activity.shared.CachingActivityMapper;

/**
 * Created by IntelliJ IDEA.
 * User: lkumili
 * Date: 12/19/11
 * Time: 3:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class ReportCachingActivityMapper extends CachingActivityMapper{


    public ReportCachingActivityMapper(ActivityMapper activityMapper) {
        super(activityMapper);
    }

}
