package ex32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckNumberTest {

    @Test
    void compareNumbersLower() {
        CheckNumber myApp = new CheckNumber();
        String actual = myApp.CompareNumbers(100, 5);
        assertEquals("Too low. Guess again: ", actual);
    }

    @Test
    void compareNumbersHigher() {
        CheckNumber myApp = new CheckNumber();
        String actual = myApp.CompareNumbers(5, 100);
        assertEquals("Too high. Guess again: ", actual);
    }

    @Test
    void compareNumbersExact() {
        CheckNumber myApp = new CheckNumber();
        String actual = myApp.CompareNumbers(50, 50);
        // When the numbers are the same
        // while loop inside playGame function will end in main class
        // and print corresponding output
        assertEquals("", actual);
    }
}