package ex36;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CalculationsTest {

    @Test
    void average() {
        Calculations myApp = new Calculations();
        ArrayList<Double> responseTimes = new ArrayList<>();
        populateArrayList(responseTimes);
        double actual = myApp.average(responseTimes);
        assertEquals(400.0, actual);
    }

    @Test
    void minimum() {
        Calculations myApp = new Calculations();
        ArrayList<Double> responseTimes = new ArrayList<>();
        populateArrayList(responseTimes);
        double actual = myApp.minimum(responseTimes);
        assertEquals(100.0, actual);
    }

    @Test
    void maximum() {
        Calculations myApp = new Calculations();
        ArrayList<Double> responseTimes = new ArrayList<>();
        populateArrayList(responseTimes);
        double actual = myApp.maximum(responseTimes);
        assertEquals(1000.0, actual);
    }

    @Test
    void std() {
        Calculations myApp = new Calculations();
        ArrayList<Double> responseTimes = new ArrayList<>();
        populateArrayList(responseTimes);
        double actual = myApp.std(responseTimes);
        assertEquals(353.5533905932738, actual);
    }

    void populateArrayList(ArrayList<Double> responseTimes){
        responseTimes.add(100.0);
        responseTimes.add(200.0);
        responseTimes.add(1000.0);
        responseTimes.add(300.0);
    }
}