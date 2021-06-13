package ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramDetectorTest {

    @Test
    void isAnagram_returns_true_for_same_words() {
        AnagramDetector myApp = new AnagramDetector();
        boolean actual = myApp.isAnagram("note", "note");
        assertEquals(true, actual);
    }
    @Test
    void isAnagram_returns_true_for_palindrome(){
        AnagramDetector myApp = new AnagramDetector();
        boolean actual = myApp.isAnagram("note", "eton");
        assertEquals(true, actual);
    }
    @Test
    void isAnagram_returns_true_for_same_but_scrambled_words(){
        AnagramDetector myApp = new AnagramDetector();
        boolean actual = myApp.isAnagram("tneo", "etno");
        assertEquals(true, actual);
    }
    @Test
    void isAnagram_returns_false_for_different_length_words(){
        AnagramDetector myApp = new AnagramDetector();
        boolean actual = myApp.isAnagram("note", "notee");
        assertEquals(false, actual);
    }
}