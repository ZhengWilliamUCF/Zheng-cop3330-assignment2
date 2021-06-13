package ex36;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 William Zheng
 */

//import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class ComputerStatistics {
    //DecimalFormat format = new DecimalFormat("0.#");
    static Scanner in = new Scanner(System.in);
    double average;
    double max;
    double min;
    double std;

    public static void main(String[] args) {
        ComputerStatistics myApp = new ComputerStatistics();
        Calculations ad = new Calculations();
        ArrayList<Double> responseTimes = new ArrayList<>();
        myApp.userInput(responseTimes);
        myApp.calcFunctions(responseTimes, ad);
        myApp.printOutput(responseTimes);
    }

    public void userInput(ArrayList<Double> responseTimes){
        while (true) {
            System.out.print("Enter a number: ");
            String time = in.nextLine();
            if (time.equalsIgnoreCase("done")) {
                break;
            }
            try{
                if (Double.parseDouble(time) < 0){
                    System.out.print("That is not a valid input.\n");
                }
                responseTimes.add(Double.parseDouble(time));
            } catch (NumberFormatException e) {
                System.out.print("That is not a valid input.\n");
            }
        }
    }

    public void calcFunctions(ArrayList<Double> responseTimes, Calculations ad) {
        average = ad.average(responseTimes);
        max = ad.maximum(responseTimes);
        min = ad.minimum(responseTimes);
        std = ad.std(responseTimes);
    }

    public void printOutput(ArrayList<Double> responseTimes){
        System.out.print("Numbers: ");
        for (Double responseTime : responseTimes) {
            System.out.print(responseTime + " ");
        }
        System.out.printf("\nThe average is %s\nThe minimum is %s\nThe maximum is %s\nThe standard deviation is %s", average,min, max, std);
    }
}
