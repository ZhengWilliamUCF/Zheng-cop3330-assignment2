package ex37;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 William Zheng
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class PasswordFunctions {
    public String[] generatePassword(int length, ArrayList<Integer> SpecialCharacterIndex, ArrayList<Integer> NumberCharacterIndex, String combinedLetters, String specialCharacters, String numbers) {
        // Creates password string array
        String[] password = new String[length];

        for (int i = 0; i < length; i++) {
            // Checks if i is occupied by a special character or number
            if (NumberCharacterIndex.contains(i)) {
                // gets random number character from string
                Random random = new Random();
                int index = random.nextInt(numbers.length());
                char c = numbers.charAt(index);

                password[i] = String.valueOf(c);
            } else if (SpecialCharacterIndex.contains(i)) {
                // gets random special character from string
                Random random = new Random();
                int index = random.nextInt(specialCharacters.length());
                char c = specialCharacters.charAt(index);

                password[i] = String.valueOf(c);
            } else {
                // gets random letter from string
                Random random = new Random();
                int index = random.nextInt(combinedLetters.length());
                char c = combinedLetters.charAt(index);

                password[i] = String.valueOf(c);
            }
        }
        return password;
    }

    public String formatPassword(String[] password){
        // Turn password to string and formats it
        String output = Arrays.toString(password)
                .replace(",", "")
                .replace("[", "")
                .replace("]", "")
                .replace(" ", "");

        System.out.print("Your password is " + output);
        // Doesn't really do anything, just used for testing.
        return output;
    }
    public void generateSpecialIndex(int length, ArrayList<Integer> SpecialCharacterIndex, int specialAmount) {
        // Chooses index for where to add special characters
        for (int i = 0; i < specialAmount; i++) {
            int generated;
            generated = GenerateIndex(length);
            while (SpecialCharacterIndex.contains(generated))
                generated = GenerateIndex(length);
            SpecialCharacterIndex.add(generated);
        }
    }

    public void generateNumberIndex(int length, ArrayList<Integer> NumberCharacterIndex, ArrayList<Integer> SpecialCharacterIndex, int numberAmount) {
        // Chooses index for where to add number characters
        for (int i = 0; i < numberAmount; i++) {
            int generated;
            generated = GenerateIndex(length);
            while (NumberCharacterIndex.contains(generated) || SpecialCharacterIndex.contains(generated))
                generated = GenerateIndex(length);
            NumberCharacterIndex.add(generated);
        }
    }

    public int GenerateIndex(int arraySize){
        return (int)(Math.floor(Math.random()*((arraySize-1)-+1)+0));
    }
}
