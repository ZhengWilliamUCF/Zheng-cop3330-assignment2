package ex26;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {
    // Rounding of variables is done upon input.
    // I will be using said values for the tests.
    @Test
    void calculateMonthsUntilPaidOff() {
        PaymentCalculator myApp = new PaymentCalculator();
        int actual = myApp.calculateMonthsUntilPaidOff(0.12, 5000 ,100);
        assertEquals(70 ,actual);
    }

    @Test
    void calculateMonthsUntilPaidOff2() {
        PaymentCalculator myApp = new PaymentCalculator();
        int actual = myApp.calculateMonthsUntilPaidOff(0.05, 10000 ,235);
        assertEquals(47 ,actual);
    }
}