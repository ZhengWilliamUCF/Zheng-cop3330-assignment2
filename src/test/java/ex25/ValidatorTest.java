package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @Test
    void passwordValidator_returns_0_for_12345() {
        Validator myApp = new Validator();
        int actual  = myApp.passwordValidator("12345");
        assertEquals(0, actual);
    }

    @Test
    void passwordValidator_returns_1_for_password_with_only_numbers_but_more_than_eight_characters() {
        Validator myApp = new Validator();
        int actual  = myApp.passwordValidator("123456789");
        assertEquals(1, actual);
    }

    @Test
    void passwordValidator_returns_2_for_password_with_only_characters() {
        Validator myApp = new Validator();
        int actual  = myApp.passwordValidator("abcdef");
        assertEquals(2, actual);
    }

    @Test
    void passwordValidator_returns_3_for_password_with_only_characters_but_with_more_than_eight_characters() {
        Validator myApp = new Validator();
        int actual  = myApp.passwordValidator("abcdefghi");
        assertEquals(3, actual);
    }

    @Test
    void passwordValidator_returns_4_for_password_with_characters_and_numbers_but_with_more_than_eight_characters() {
        Validator myApp = new Validator();
        int actual  = myApp.passwordValidator("abc123xyz");
        assertEquals(4, actual);
    }

    @Test
    void passwordValidator_returns_5_for_password_with_characters_and_numbers_but_with_more_than_eight_characters() {
        Validator myApp = new Validator();
        int actual  = myApp.passwordValidator("1337h@xor!");
        assertEquals(5, actual);
    }
}