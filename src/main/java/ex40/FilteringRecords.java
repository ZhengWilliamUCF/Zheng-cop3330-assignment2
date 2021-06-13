package ex40;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 William Zheng
 */

import ex39.PopulateData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class FilteringRecords {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        FilteringRecords myApp = new FilteringRecords();
        PopulateData ad = new PopulateData();
        ArrayList<LinkedHashMap<Integer, String>> employeeList = new ArrayList<>();
        String search = myApp.userInput();
        search = myApp.convertToLower(search);
        ad.populateHashes(employeeList);
        myApp.printOutput(employeeList, search);
    }
    public String userInput(){
        System.out.print("Enter a search string: ");
        while (in.hasNextDouble()) {
            System.out.print("Sorry, that's not a valid string.\nEnter an employee name to remove: ");
            in.next();
        }
        return in.next();
    }

    public String convertToLower(String search){
        return search.toLowerCase();
    }

    public void printOutput(ArrayList<LinkedHashMap<Integer, String>> employeeList, String searchString){
        System.out.print("\nResults:\n\n");
        //-------------------------------------
        String format = "%-20s| %-20s| %-20s%n";
        //-------------------------------------
        System.out.printf(format, "Name", " Position", "Separation Date");
        System.out.print("--------------------|---------------------|----------------\n");
        //-------------------------------------
        String[] namearray = new String[employeeList.size()];
        // Sort arraylist by last name
        for (int i = 0; i < employeeList.size(); i++){
            LinkedHashMap<Integer, String> hash = employeeList.get(i);
            namearray[i] =  hash.get(1) + "-" + hash.get(2) + "-" + hash.get(3);
        }
        Arrays.sort(namearray);
        //--------------------------------------
        for (int i = 0; i < employeeList.size(); i++){
            if (namearray[i].toLowerCase().contains(searchString)) {
                String output2 = namearray[i];
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
}
