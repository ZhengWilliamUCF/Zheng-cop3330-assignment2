package ex35;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 William Zheng
 */

public class GenerateRandomOutput {
    public int GenerateOutput(int arraySize){
        return (int)(Math.floor(Math.random()*((arraySize-1)-+1)+0));
    }
}
