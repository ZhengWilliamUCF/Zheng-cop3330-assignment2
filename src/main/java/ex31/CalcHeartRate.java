package ex31;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 William Zheng
 */

public class CalcHeartRate {
    public double TargetHeartRate(double RHR, double intensity, double age) {
        return Math.round((((220.0 - age) - RHR) * (intensity/100.0)) + RHR);
    }
}
