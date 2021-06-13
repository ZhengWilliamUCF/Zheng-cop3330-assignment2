package ex31;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 William Zheng
 */

import java.util.Scanner;

public class KarvonenHeartRate {
    static Scanner in = new Scanner(System.in);
    double restPulse;
    double age;

    public static void main(String[] args) {
        KarvonenHeartRate myApp = new KarvonenHeartRate();
        CalcHeartRate ad = new CalcHeartRate();
        myApp.userInputPulse();
        myApp.userInputAge();
        myApp.displayTable(myApp.restPulse, myApp.age, ad);
    }

    public void userInputPulse() {
        System.out.print("What is the resting pulse? ");
        while (!in.hasNextDouble()) {
            System.out.print("Sorry. That's not a valid input.\nWhat is the age? ");
            in.next();
        }
        restPulse = in.nextDouble();
        if (restPulse <=0) {
            userInputPulse();
            return;
        }
    }

    public void userInputAge(){
        System.out.print("What is the age? ");
        while (!in.hasNextDouble()) {
            System.out.print("Sorry. That's not a valid input.\nWhat is the age? ");
            in.next();
        }
        age = in.nextDouble();
        if (age <=0) {
            userInputAge();
            return;
        }
    }

    public void displayTable(double restPulse, double age, CalcHeartRate ad){
        System.out.printf("\nResting Pulse: %s\tAge: %s\n\nIntensity\t| Rate\n", restPulse, age);
        System.out.print("------------|--------\n");
        for (int i = 55; i <= 95;i += 5){
            double rate = ad.TargetHeartRate(restPulse,i, age);
            System.out.printf("%s%%\t\t\t|%s\n", i, rate);
        }
    }
}
