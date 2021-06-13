package ex39;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class PopulateData {
    public void populateHashes(ArrayList<LinkedHashMap<Integer, String>> employeeList) {
        //-------------------------------------
        LinkedHashMap<Integer, String> employee1Info = new LinkedHashMap<>();
        employee1Info.put(1, "Johnson-John");
        employee1Info.put(2, "Manager");
        employee1Info.put(3, "2016-12-31");
        //-------------------------------------
        LinkedHashMap<Integer, String> employee2Info = new LinkedHashMap<>();
        employee2Info.put(1, "Xiong-Tou");
        employee2Info.put(2, "Software Engineer");
        employee2Info.put(3, "2016-10-05");
        //-------------------------------------
        LinkedHashMap<Integer, String> employee3Info = new LinkedHashMap<>();
        employee3Info.put(1, "Michaelson-Michaela");
        employee3Info.put(2, "District Manager");
        employee3Info.put(3, "2015-12-19");
        //-------------------------------------
        LinkedHashMap<Integer, String> employee4Info = new LinkedHashMap<>();
        employee4Info.put(1, "Jacobson-Jake");
        employee4Info.put(2, "Programmer");
        employee4Info.put(3, "");
        //-------------------------------------
        LinkedHashMap<Integer, String> employee5Info = new LinkedHashMap<>();
        employee5Info.put(1, "Jackson-Jacquelyn");
        employee5Info.put(2, "DBA");
        employee5Info.put(3, "");
        //-------------------------------------
        LinkedHashMap<Integer, String> employee6Info = new LinkedHashMap<>();
        employee6Info.put(1, "Webber-Sally");
        employee6Info.put(2, "Web Developer");
        employee6Info.put(3, "2015-12-18");
        //-------------------------------------
        populateArrayList(employee1Info, employee2Info, employee3Info, employee4Info, employee5Info, employee6Info, employeeList);
    }
    public void populateArrayList(LinkedHashMap<Integer, String> employee1Info, LinkedHashMap<Integer, String> employee2Info, LinkedHashMap<Integer, String> employee3Info, LinkedHashMap<Integer, String> employee4Info, LinkedHashMap<Integer, String> employee5Info, LinkedHashMap<Integer, String> employee6Info, ArrayList<LinkedHashMap<Integer, String>> employeeList) {
        employeeList.add(employee1Info);
        employeeList.add(employee2Info);
        employeeList.add(employee3Info);
        employeeList.add(employee4Info);
        employeeList.add(employee5Info);
        employeeList.add(employee6Info);
    }
}
