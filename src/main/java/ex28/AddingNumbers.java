package ex28;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 William Zheng
 */

import java.util.Scanner;

public class AddingNumbers {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        AddingNumbers myApp = new AddingNumbers();
        myApp.userInput();
    }

    public void userInput(){
        double total = 0;
        for (int i = 0; i < 5; i++){
            System.out.print("Enter a number: ");
            while (!in.hasNextDouble()) {
                System.out.print("Sorry. That's not a valid input.\nPlease enter a number: ");
                in.next();
            }
            double num = in.nextDouble();
            total = AddNumbers(total, num);
        }
        System.out.printf("The total is %s.", total);
    }
    public double AddNumbers(double total, double num){
        return total + num;
    }
}
