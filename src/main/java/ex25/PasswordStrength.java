package ex25;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 William Zheng
 */

import java.util.Scanner;

public class PasswordStrength {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        PasswordStrength myApp = new PasswordStrength();
        Validator ad = new Validator();
        String password = myApp.userInput();
        int strength = ad.passwordValidator(password);
        myApp.switchStatement(strength, password);
    }

    public String userInput() {
        System.out.print("Enter your password and I'll tell you how strong it is: ");
        return in.nextLine().toLowerCase();
    }

    public void switchStatement(int strength, String password){
        String outputText;

        outputText = switch (strength) {
            case 0 -> "' is a very weak password.";
            case 1 -> "' is a slightly weak password.";
            case 2 -> "' is a weak password.";
            case 3 -> "' is a slightly strong password.";
            case 4 -> "' is a strong password";
            case 5 -> "' is a very strong password";
            default -> "' This should not be possible.";
        };
        System.out.println("The password '" + password + outputText);
    }
}
