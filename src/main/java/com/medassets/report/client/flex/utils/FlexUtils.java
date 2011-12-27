package com.medassets.report.client.flex.utils;

import java.util.Iterator;

public class FlexUtils {
	
	public static String join(Iterator<?> iterator, String separator) {
        if (iterator == null) {
            return null;
        }
        StringBuffer buf = new StringBuffer(256); // Java default is 16, probably too small
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            if (obj != null) {
                buf.append(obj);
            }
            if ((separator != null) && iterator.hasNext()) {
                buf.append(separator);
            }
        }
        return buf.toString();
    }

}
