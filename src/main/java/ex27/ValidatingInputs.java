package ex27;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 William Zheng
 */

import java.util.Scanner;

public class ValidatingInputs {
    static Scanner in = new Scanner(System.in);
    String fName;
    String lName;
    String zipCode;
    String iD;
    String output = "";

    public static void main(String[] args) {
        ValidatingInputs myApp = new ValidatingInputs();
        myApp.userInput();
        myApp.validateInput();
        myApp.printResult();
    }

    public void userInput() {
        System.out.print("Enter the first name: ");
        fName = in.nextLine();
        System.out.print("Enter the last name: ");
        lName = in.nextLine();
        System.out.print("Enter the ZIP code: ");
        zipCode = in.nextLine();
        System.out.print("Enter an employee ID: ");
        iD = in.nextLine();
    }

    public void validateInput(){
        fnameValid(fName);
        lnameValid(lName);
        zipValid(zipCode);
        iDValid(iD);
    }

    public String fnameValid(String fName){
        if (fName.isEmpty())
            output = "The first name must be filled in.\n";
        else if (fName.length() < 2){
            output = "\"" + fName + ("\" is not a valid first name. It is too short.\n");
        }
        return output;
    }

    public String lnameValid(String lName){
        if (lName.isEmpty())
            output = output.concat("The last name must be filled in.\n");
        else if (lName.length() < 2){
            output = output.concat("\"" + lName + ("\" is not a valid last name. It is too short.\n"));
        }
        return output;
    }

    public String zipValid(String zipCode){
        if (zipCode.isEmpty()) {
            return output.concat("The ZIP code must be filled in.\n");
        }
        try {
            Integer.parseInt(zipCode);
        } catch (NumberFormatException e) {
            output = output.concat("The ZIP code must be numeric.\n");
        }
        return output;
    }

    public String iDValid(String iD){
        char[] ch = iD.toCharArray();
        if (iD.length() != 7)
            return output.concat("The employee ID must be in the format of AA-1234.\n");

        for (int i = 0; i <= 1; i++){
            if (!Character.isLetter(ch[i])){
                return output.concat("The employee ID must be in the format of AA-1234.\n");
            }
        }
        if (ch[2] != '-'){
            return output.concat("The employee ID must be in the format of AA-1234.\n");
        }
        for (int i = 3; i < 7; i++){
            if (!Character.isDigit(ch[i])){
                return output.concat("The employee ID must be in the format of AA-1234.\n");
            }
        }
        return output;
    }
    public void printResult(){
        if (output.equals("")){
            output = "There were no errors found.";
        }
        System.out.print(output);
    }
}
