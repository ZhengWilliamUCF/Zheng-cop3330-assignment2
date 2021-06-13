package ex24;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 William Zheng
 */

import java.util.Scanner;

public class AnagramCheck {
    static Scanner in = new Scanner(System.in);
    String firstString;
    String secondString;

    public static void main(String[] args) {
        AnagramCheck myApp = new AnagramCheck();
        AnagramDetector Ad = new AnagramDetector();
        myApp.userInput();
        boolean output = Ad.isAnagram(myApp.firstString, myApp.secondString);
        myApp.printResult(output, myApp.firstString, myApp.secondString);
    }

    public void userInput() {
        System.out.print("Enter two strings and I'll tell you if they are anagrams:\nEnter the first string: ");
        firstString = in.nextLine().toLowerCase();
        System.out.print("Enter the second string: ");
        secondString = in.nextLine().toLowerCase();
    }

    public void printResult(boolean output, String firstString, String secondString){
        if (output){
            System.out.printf("\"%s\" and \"%s\" are anagrams.", firstString, secondString);
        }
        else {
            System.out.printf("\"%s\" and \"%s\" are not anagrams.", firstString, secondString);
        }
    }
}
