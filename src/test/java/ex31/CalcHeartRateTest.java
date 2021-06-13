package ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcHeartRateTest {

    @Test
    void targetHeartRate55Intensity() {
        CalcHeartRate myApp = new CalcHeartRate();
        double actual = myApp.TargetHeartRate(65, 55,22);
        assertEquals(138, actual);
    }

    @Test
    void targetHeartRate60Intensity() {
        CalcHeartRate myApp = new CalcHeartRate();
        double actual = myApp.TargetHeartRate(65, 60,22);
        assertEquals(145, actual);
    }

    @Test
    void targetHeartRate50Intensity() {
        CalcHeartRate myApp = new CalcHeartRate();
        double actual = myApp.TargetHeartRate(65, 50,22);
        assertEquals(132, actual);
    }

    @Test
    void targetHeartRate25Age() {
        CalcHeartRate myApp = new CalcHeartRate();
        double actual = myApp.TargetHeartRate(65, 55,25);
        assertEquals(137, actual);
    }
}