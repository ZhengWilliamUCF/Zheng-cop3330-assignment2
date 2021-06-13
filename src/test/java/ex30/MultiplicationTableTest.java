package ex30;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTableTest {
    //The only function that I could really test

    @Test
    void productPositive() {
        MultiplicationTable myApp = new MultiplicationTable();
        int actual = myApp.product(5,5);
        assertEquals(25, actual);
    }

    @Test
    void productNegative() {
        MultiplicationTable myApp = new MultiplicationTable();
        int actual = myApp.product(-5,-5);
        assertEquals(25, actual);
    }
}