package ex26;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 William Zheng
 */

import java.util.Scanner;

public class CreditCardPayment {
    static Scanner in = new Scanner(System.in);
    double balance;
    double apr;
    double mPay;

    public static void main(String[] args) {
        CreditCardPayment myApp = new CreditCardPayment();
        myApp.userInput();
        PaymentCalculator ad = new PaymentCalculator();
        int totalMonths = ad.calculateMonthsUntilPaidOff(myApp.apr, myApp.balance, myApp.mPay);
        myApp.printResult(totalMonths);
    }

    public void userInput() {
        System.out.print("What is your balance? ");
        // Rounds balance to nearest cent
        balance = Math.round(in.nextDouble() * 100.0) / 100.0;
        System.out.print("What is the APR on the card (as a percent)? ");
        apr = in.nextDouble()/100.0;
        // Rounds balance to nearest cent
        System.out.print("What is the monthly payment you can make? ");
        mPay = Math.round(in.nextDouble() * 100.0) / 100.0;
    }

    public void printResult(int totalMonths){
        System.out.printf("It will take you %d months to pay off this card.", totalMonths);
    }
}
