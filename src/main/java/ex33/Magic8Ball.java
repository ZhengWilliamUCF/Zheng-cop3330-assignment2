package ex33;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 William Zheng
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Magic8Ball {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Magic8Ball myApp = new Magic8Ball();
        GenerateRandomOutput ad = new GenerateRandomOutput();
        ArrayList<String> responses = new ArrayList<>();
        myApp.generateResponses(responses);
        myApp.userInput();
        int choice  = myApp.generateChoice(responses, ad);
        myApp.printOutput(choice, responses);
    }

    public void userInput() {
        System.out.print("What's your question?\n> ");
        in.next();
    }

    public void generateResponses(ArrayList<String> responses){
        responses.add("Yes.");
        responses.add("No.");
        responses.add("Maybe.");
        responses.add("Ask again later.");
    }

    public int generateChoice(ArrayList<String> responses, GenerateRandomOutput ad){
       return ad.GenerateOutput(responses.size());
    }

    public String printOutput(int choice, ArrayList<String> responses){
        return ("\n" + responses.get(choice));
    }
}
