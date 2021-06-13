package ex34;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 William Zheng
 */

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeList {
    static Scanner in = new Scanner(System.in).useDelimiter("\\n");

    public static void main(String[] args) {
        EmployeeList myApp = new EmployeeList();
        SearchEmployee ad = new SearchEmployee();
        ArrayList<String> employees = new ArrayList<>();
        ad.AddEmployees(employees);
        ad.printEmployees(employees);
        String fired = myApp.userInput();
        ad.findEmployee(employees, fired);
        ad.printEmployees(employees);
    }

    public String userInput(){
        System.out.print("\nEnter an employee name to remove: ");
        while (in.hasNextInt()) {
            System.out.print("Sorry, that's not a valid employee name.\nEnter an employee name to remove: ");
            in.next();
        }
        return in.next();
    }
}
