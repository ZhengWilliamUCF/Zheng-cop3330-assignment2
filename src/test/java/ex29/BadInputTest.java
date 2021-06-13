package ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadInputTest {

    @Test
    void calcReturnWholeNumber() {
        BadInput myApp = new BadInput();
        double actual = myApp.calcReturn(4);
        assertEquals(18, actual);
    }

    @Test
    void calcReturnDecimalNumber() {
        BadInput myApp = new BadInput();
        double actual = myApp.calcReturn(4.5);
        assertEquals(16, actual);
    }

    @Test
    void calcReturnDecimalNumberII() {
        BadInput myApp = new BadInput();
        double actual = myApp.calcReturn(5);
        assertEquals(14.4, actual);
    }
}