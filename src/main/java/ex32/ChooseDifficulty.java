package ex32;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 William Zheng
 */

public class ChooseDifficulty {
    public int generateRandomNumber(int difficulty){
        return (int)Math.floor(Math.random()*(Math.pow(10, difficulty)-1+1)+1);
    }
}
