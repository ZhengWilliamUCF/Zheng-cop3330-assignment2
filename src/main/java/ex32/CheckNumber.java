package ex32;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 William Zheng
 */

public class CheckNumber {
    public String CompareNumbers(int hiddenNumber, int guess){
        if (guess > hiddenNumber){
            return ("Too high. Guess again: ");
        }
        else if (guess < hiddenNumber){
            return ("Too low. Guess again: ");
        }
        return "";
    }
}
