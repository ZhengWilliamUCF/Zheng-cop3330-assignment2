package ex25;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 William Zheng
 */

public class Validator {
    public int passwordValidator(String password){
        int strength = 0;
        strength += checkLength(password);
        strength += numbersOnly(password);
        strength += lettersOnly(password);
        strength += specialCharacters(password);
        return strength;
    }

    // Checks if password has more than 8 characters
    public int checkLength(String password){
        if (password.length() < 8){
            return 0;
        }
        return 1;
    }

    // Checks if password is only comprised of numbers
    public int numbersOnly(String password){
        try {
            Integer.parseInt(password);
        } catch (NumberFormatException e) {
            return 1;
        }
        return 0;
    }

    public int lettersOnly(String password){
        if (password.matches("^[a-zA-Z]+$")) {
            return 1;
        } else if (!password.matches("^[a-zA-Z]+$") && !password.matches("^[0-9]+$")){
            return 2;
        }
        return 0;
    }

    public int specialCharacters(String password){
        if (password.matches("^[a-zA-Z0-9 ]*")){
            return 0;
        }
        return 1;
    }
}
