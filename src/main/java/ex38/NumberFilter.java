package ex38;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 William Zheng
 */

public class NumberFilter {
    public int[] filterEvenNumbers(int[] userInput){
        int size = 0;
        for (int j : userInput) {
            if (j % 2 == 0) {
                size++;
            }
        }
        int[] result = new int[size];
        int counter = 0;
        for (int j : userInput) {
            if (j % 2 == 0) {
                result[counter] = j;
                counter++;
            }
        }
        return result;
    }
}
