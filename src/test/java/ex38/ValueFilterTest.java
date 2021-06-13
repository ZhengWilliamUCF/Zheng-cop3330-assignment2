package ex38;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValueFilterTest {

    @Test
    void printOutputArrayEvenIncluded() {
        ValueFilter myApp = new ValueFilter();
        int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
        String actual = myApp.printOutputArray(array);
        assertEquals("The even numbers are 2 4 6 8 10.", actual);
    }

    @Test
    void printOutputArrayNoEvens() {
        ValueFilter myApp = new ValueFilter();
        int[] array = new int[]{1,3,5,7,9,11};
        String actual = myApp.printOutputArray(array);
        assertEquals("There are no even numbers.", actual);
    }
}