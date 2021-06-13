package ex38;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 William Zheng
 */

import java.util.Arrays;
import java.util.Scanner;

public class ValueFilter {
    static Scanner in = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        ValueFilter myApp = new ValueFilter();
        NumberFilter ad = new NumberFilter();
        int[] userInput = myApp.userInput();
        int[]returnArray = ad.filterEvenNumbers(userInput);
        myApp.printOutputArray(returnArray);
    }

    public int[] userInput(){
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String numbers = in.next();

        return Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    public String printOutputArray(int[] returnArray){
        int count = 0;
        String combined = "";
        combined = combined.concat("The even numbers are");
        for (int j = 0; j < returnArray.length; j++) {
            if (returnArray[j] % 2 == 0) {
                count++;
                combined = combined.concat(" " + returnArray[j]);
            }
        } combined = combined.concat(".");

        if (count == 0){
            combined = "There are no even numbers.";
        }

        // Doesn't actually do anything. Used for testing.
        return combined;
    }
}
