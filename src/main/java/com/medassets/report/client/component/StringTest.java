package com.medassets.report.client.component;

import org.nfunk.jep.function.Str;

/**
 * Created by IntelliJ IDEA.
 * User: lkumili
 * Date: 12/12/11
 * Time: 2:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringTest {
    public static void main(String args[]){
           String query="SELECT distinct Dpt.deptcode,Dpt.deptcode || '  ' || Dpt.Name\n" +
              "FROM Department Dpt, DepartmentNode DptN, DepartmentHierarchy DptH\n" +
              "WHERE DptH.name = 'Department Hierarchy' and\n" +
              "Dpt.deptMastCode = DptN.deptMastCode and\n" +
              "Dpt.deptCode =  DptN.deptCode and\n" +
              "DptN.hierarchyId = DptH.objectId\n" +
              "order by Dpt.deptcode"       ;

   query= query.replace("Department Hierarchy", "ALLDEPTS");

        String sqlstring="MHS OH and Depn Only"  ;

       sqlstring= sqlstring.replace("'","''")     ;

     System.out.println(sqlstring);
         String delims = "[:]";
        String placeName="Template:Costing";
        String[] tokens = null;
        String parent="";
        String child="";
        if (placeName != null) {
            tokens = placeName.split(delims);
            parent=tokens[0];
            child=tokens[1];
            System.out.println(parent + child);
        }
    }

}
