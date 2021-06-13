package ex30;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 William Zheng
 */

public class MultiplicationTable {
    public static void main(String[] args) {
        MultiplicationTable myApp = new MultiplicationTable();
        int size = 12;
        myApp.createTable(size);
    }

    public void createTable(int size){
        for (int i = 1; i <= size; i ++){
            for (int j = 1; j <= size; j++){
                System.out.printf("%5d", product(i, j));
            }
            System.out.println();
        }
    }

    public int product(int i, int j){
        return i*j;
    }
}
