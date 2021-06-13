package ex26;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 William Zheng
 */

import java.lang.Math;

public class PaymentCalculator {
    public int calculateMonthsUntilPaidOff(double i, double b, double p){
        double daily = i/365.0;
        return (int) Math.ceil((-1.0/30) * Math.log(1 + b/p * (1 - Math.pow(1 + daily,30))) / Math.log(1+daily));
    }
}
