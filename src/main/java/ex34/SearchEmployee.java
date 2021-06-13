package ex34;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 William Zheng
 */

import java.util.ArrayList;

public class SearchEmployee {
    public String findEmployee(ArrayList<String> employees, String name){
        if (employees.contains(name)){
            employees.remove(name);
        } else {
            System.out.printf("\nThere is no employee named %s", name);
            return ("There is no employee named " + name);
        }
        return "";
    }

    public void printEmployees(ArrayList<String> employees){
        System.out.printf("\nThere are %d employees:\n", employees.size());
        for (String employee : employees) {
            System.out.println(employee);
        }
    }

    public void AddEmployees(ArrayList<String> employees){
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");
    }
}
