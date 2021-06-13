package ex28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddingNumbersTest {

    @Test
    void addWholeNumbers() {
        AddingNumbers myApp = new AddingNumbers();
        double actual = myApp.AddNumbers(0, 2);
        assertEquals(2.0, actual);
    }

    @Test
    void addDecimals() {
        AddingNumbers myApp = new AddingNumbers();
        double actual = myApp.AddNumbers(0.2, 2.9);
        assertEquals(3.1, actual);
    }

    @Test
    void addDecimalsII() {
        AddingNumbers myApp = new AddingNumbers();
        double actual = myApp.AddNumbers(5.0, 2.0);
        assertEquals(7.0, actual);
    }
}