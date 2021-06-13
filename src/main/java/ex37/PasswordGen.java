package ex37;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 William Zheng
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PasswordGen {
    static Scanner in = new Scanner(System.in);
    int minLength;
    int specialAmount;
    int numberAmount;

    public static void main(String[] args) {
        //---------------------------
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String combinedLetters = lowerCaseLetters.concat(capitalCaseLetters);
        String specialCharacters = "!@#$";
        String numbers = "1234567890";
        //---------------------------
        PasswordGen myApp = new PasswordGen();
        PasswordFunctions ad = new PasswordFunctions();
        ArrayList<Integer> SpecialCharacterIndex = new ArrayList<>();
        ArrayList<Integer> NumberCharacterIndex = new ArrayList<>();
        //---------------------------
        myApp.getConditions();
        int length = myApp.generateLength();
        ad.generateSpecialIndex(length, SpecialCharacterIndex, myApp.numberAmount);
        ad.generateNumberIndex(length, NumberCharacterIndex, SpecialCharacterIndex, myApp.specialAmount);
        String[] password = ad.generatePassword(length, SpecialCharacterIndex, NumberCharacterIndex, combinedLetters, specialCharacters, numbers);
        ad.formatPassword(password);
    }

    public int generateLength() {
        // Determines length of password to be created
        int length = (numberAmount + specialAmount) * 2;
        if (length < minLength)
            length = minLength;
        return length;
    }

    public void getConditions() {
        String lengthNum;
        while (true) {
            System.out.print("What's the minimum length? ");
            lengthNum = in.nextLine();
            try {
                if (!lengthNum.equals("0")) {
                    minLength = Integer.parseInt(lengthNum);
                    break;
                } else {
                    System.out.print("That is not a valid length.\n");
                }
            } catch (NumberFormatException e) {
                System.out.print("That is not a valid difficulty level.\n");
            }
        }
        String specialNum;
        while (true) {
            System.out.print("How many special characters? ");
            specialNum = in.nextLine();
            try {
                if (Integer.parseInt(specialNum) >= 0) {
                    specialAmount = Integer.parseInt(specialNum);
                    break;
                } else {
                    System.out.print("That is not a valid length.\n");
                }
            } catch (NumberFormatException e) {
                System.out.print("That is not a valid difficulty level.\n");
            }
        }
        String integerNum;
        while (true) {
            System.out.print("How many numbers? ");
            integerNum = in.nextLine();
            try {
                if (Integer.parseInt(specialNum) >= 0) {
                    numberAmount = Integer.parseInt(integerNum);
                    break;
                } else {
                    System.out.print("That is not a valid length.\n");
                }
            } catch (NumberFormatException e) {
                System.out.print("That is not a valid difficulty level.\n");
            }
        }
    }
}
