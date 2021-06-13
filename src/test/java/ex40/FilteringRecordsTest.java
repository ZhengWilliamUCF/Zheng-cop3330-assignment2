package ex40;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilteringRecordsTest {

    @Test
    void convertToLower() {
        FilteringRecords myApp = new FilteringRecords();
        String actual = myApp.convertToLower("Jac");
        assertEquals("jac", actual);
    }

    @Test
    void convertToUpperToLower() {
        FilteringRecords myApp = new FilteringRecords();
        String actual = myApp.convertToLower("JAC");
        assertEquals("jac", actual);
    }
}