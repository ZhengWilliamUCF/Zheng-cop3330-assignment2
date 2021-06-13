package ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatingInputsTest {

    @Test
    void provideShortfName() {
        ValidatingInputs myApp = new ValidatingInputs();
        String actual = myApp.fnameValid("J");
        assertEquals("\"J\" is not a valid first name. It is too short.\n", actual);
    }

    @Test
    void provideBlankfName() {
        ValidatingInputs myApp = new ValidatingInputs();
        String actual = myApp.fnameValid("");
        assertEquals("The first name must be filled in.\n", actual);
    }

    @Test
    void provideLength2fName() {
        ValidatingInputs myApp = new ValidatingInputs();
        String actual = myApp.fnameValid("JJ");
        assertEquals("", actual);
    }

    @Test
    void providePerfectfName() {
        ValidatingInputs myApp = new ValidatingInputs();
        String actual = myApp.fnameValid("John");
        assertEquals("", actual);
    }

    @Test
    void provideShortlName() {
        ValidatingInputs myApp = new ValidatingInputs();
        String actual = myApp.lnameValid("J");
        assertEquals("\"J\" is not a valid last name. It is too short.\n", actual);
    }

    @Test
    void provideBlanklName() {
        ValidatingInputs myApp = new ValidatingInputs();
        String actual = myApp.lnameValid("");
        assertEquals("The last name must be filled in.\n", actual);
    }

    @Test
    void provideLength2lName() {
        ValidatingInputs myApp = new ValidatingInputs();
        String actual = myApp.lnameValid("JJ");
        assertEquals("", actual);
    }

    @Test
    void providePerfectlName() {
        ValidatingInputs myApp = new ValidatingInputs();
        String actual = myApp.lnameValid("Johnson");
        assertEquals("", actual);
    }

    @Test
    void zipWithOnlyLetters() {
        ValidatingInputs myApp = new ValidatingInputs();
        String actual = myApp.zipValid("ABCDE");
        assertEquals("The ZIP code must be numeric.\n", actual);
    }

    @Test
    void zipWithOnlyNumbers() {
        ValidatingInputs myApp = new ValidatingInputs();
        String actual = myApp.zipValid("55555");
        assertEquals("", actual);
    }

    @Test
    void zipWithLettersAndNumbers() {
        ValidatingInputs myApp = new ValidatingInputs();
        String actual = myApp.zipValid("45gwad");
        assertEquals("The ZIP code must be numeric.\n", actual);
    }

    @Test
    void zipBlank() {
        ValidatingInputs myApp = new ValidatingInputs();
        String actual = myApp.zipValid("");
        assertEquals("The ZIP code must be filled in.\n", actual);
    }

    @Test
    void iDLong() {
        ValidatingInputs myApp = new ValidatingInputs();
        String actual = myApp.iDValid("A12-1234");
        assertEquals("The employee ID must be in the format of AA-1234.\n", actual);
    }

    @Test
    void iDShort() {
        ValidatingInputs myApp = new ValidatingInputs();
        String actual = myApp.iDValid("A-1234");
        assertEquals("The employee ID must be in the format of AA-1234.\n", actual);
    }

    @Test
    void iDPerfect() {
        ValidatingInputs myApp = new ValidatingInputs();
        String actual = myApp.iDValid("TK-4321");
        assertEquals("There were no errors found.", actual);
    }
}