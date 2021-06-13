package ex29;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 William Zheng
 */

import java.util.Scanner;

public class BadInput {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        BadInput myApp = new BadInput();
        double finalRate = myApp.userInput();
        myApp.printOutput(finalRate);
    }

    public double userInput() {
        String rate;
        while (true) {
            System.out.print("What is the rate of return? ");
            rate = in.nextLine();
            try{
                if (rate.equals("0")) {
                    System.out.print("Error: Interest rate cannot be equal to 0.\n");
                }
                else {
                    Double.parseDouble(rate);
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.print("That is not a valid input.\n");
            }
        }
        return calcReturn(Double.parseDouble(rate));
    }

    public double calcReturn(double rate){
        return 72/rate;
    }

    public void printOutput(double finalRate){
        System.out.printf("It will take %s years to double your initial investment.", finalRate);
    }
}
