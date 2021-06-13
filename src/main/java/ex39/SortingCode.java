package ex39;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 William Zheng
 */

import java.util.*;

public class SortingCode {
    public static void main(String[] args) {
        SortingCode myApp = new SortingCode();
        PopulateData ad = new PopulateData();
        ArrayList<LinkedHashMap<Integer, String>> employeeList = new ArrayList<>();
        ad.populateHashes(employeeList);
        myApp.printOutput(employeeList);
    }

    public void printOutput(ArrayList<LinkedHashMap<Integer, String>> employeeList){
        //-------------------------------------
        String format = "%-20s| %-20s| %-20s%n";
        //-------------------------------------
        System.out.printf(format, "Name", " Position", "Separation Date");
        System.out.print("--------------------|---------------------|----------------\n");
        //-------------------------------------
        String[] nameArray = new String[employeeList.size()];
        // Sort arraylist by last name
        for (int i = 0; i < employeeList.size(); i++){
            LinkedHashMap<Integer, String> hash = employeeList.get(i);
            nameArray[i] =  hash.get(1) + "-" + hash.get(2) + "-" + hash.get(3);
        }
        Arrays.sort(nameArray);
        //--------------------------------------
        for (int i = 0; i < employeeList.size(); i++){
            String output2 = nameArray[i];
            String[] split = output2.split("-", 4);
            String lname = split[0];
            String fname = split[1];
            String position = split[2];
            String date = split[3];
            String fullname = fname + " " + lname;

            System.out.printf(format, fullname, position, date);
        }
    }
}
