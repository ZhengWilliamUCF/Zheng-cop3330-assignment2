package ex32;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 William Zheng
 */

import java.util.Scanner;

public class GuessingGame {
    static Scanner in = new Scanner(System.in);
    int difficulty;
    int hiddenNumber;

    public static void main(String[] args) {
        GuessingGame myApp = new GuessingGame();
        ChooseDifficulty ad = new ChooseDifficulty();
        CheckNumber ae = new CheckNumber();
        myApp.userInput(ad);
        myApp.playGame(ae);
    }

    public void userInput(ChooseDifficulty ad) {
        System.out.print("Let's play Guess the Number!\n\n");
        String num;
        while (true) {
            System.out.print("Enter the difficulty level (1, 2, or 3): ");
            num = in.nextLine();
            try{
                if (num.equals("1") || num.equals("2") || num.equals("3")) {
                    difficulty = Integer.parseInt(num);
                    break;
                }
                else {
                    System.out.print("That is not a valid difficulty level.\n");
                }
            } catch (NumberFormatException e) {
                System.out.print("That is not a valid difficulty level.\n");
            }
        }
        hiddenNumber = ad.generateRandomNumber(difficulty);
    }

    public void playGame(CheckNumber ae){
        int guesses = 0;
        int guess = 0;
        System.out.print("I have my number. What's your guess? ");
        while (guess != hiddenNumber) {
            while (!in.hasNextInt()) {
                System.out.print("Sorry. That's not a valid input.\nWhat's your guess? ");
                guesses++;
                in.next();
            }
            guess = in.nextInt();
            guesses++;
            System.out.print(ae.CompareNumbers(hiddenNumber, guess));
        }
        System.out.printf("You got it in %d guesses!", guesses);
    }
}
