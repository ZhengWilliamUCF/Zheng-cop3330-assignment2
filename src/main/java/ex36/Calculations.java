package ex36;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 William Zheng
 */

import java.util.ArrayList;

public class Calculations {
    public double average(ArrayList<Double> responseTimes){
        double total = 0.0;
        for (Double responseTime : responseTimes) {
            total = total + responseTime;
        }
        return (total/responseTimes.size());
    }

    public double minimum(ArrayList<Double> responseTimes){
        double minimum = responseTimes.get(0);
        for (Double responseTime : responseTimes) {
            if (responseTime < minimum) {
                minimum = responseTime;
            }
        }
        return minimum;
    }

    public double maximum(ArrayList<Double> responseTimes){
        double maximum = responseTimes.get(0);
        for (Double responseTime : responseTimes) {
            if (responseTime > maximum) {
                maximum = responseTime;
            }
        }
        return maximum;
    }

    public double std(ArrayList<Double> responseTimes) {
        int count = responseTimes.size();
        double mean = average(responseTimes);
        double variance = 0;

        for (Double responseTime : responseTimes) {
            variance = variance + Math.pow((responseTime - mean), 2);
        }
        variance =  variance/count;
        return Math.sqrt(variance);
    }
}
