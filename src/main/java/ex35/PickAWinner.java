package ex35;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 William Zheng
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PickAWinner {
    static Scanner in = new Scanner(System.in).useDelimiter("\\n");

    public static void main(String[] args) {
        PickAWinner myApp = new PickAWinner();
        GenerateRandomOutput ad = new GenerateRandomOutput();
        ArrayList<String> contestants = new ArrayList<>();
        int index = myApp.userInput(contestants, ad);
        myApp.printWinner(index, contestants);
    }

    public int userInput(ArrayList<String> contestants, GenerateRandomOutput ad){
        while (true) {
            System.out.print("Enter a name: ");
            String participant = in.next();
            if (participant.equals("")){
                break;
            }
            contestants.add(participant);
        }
        return ad.GenerateOutput(contestants.size());
    }

    public String printWinner(int index, ArrayList<String> contestants){
        System.out.println("The winner is... " + contestants.get(index) + ".");
        // Line below used for testing. Does nothing.
        return ("The winner is... " + contestants.get(index) + ".");
    }
}
