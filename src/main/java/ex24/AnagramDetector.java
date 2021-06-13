package ex24;

/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solutions
 *  Copyright 2021 William Zheng
 */

import java.util.Arrays;

public class AnagramDetector {
    public Boolean isAnagram(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        // Converts strings to character arrays
        char[] word1 = first.toCharArray();
        char[] word2 = second.toCharArray();
        // Sorts the arrays
        Arrays.sort(word1);
        Arrays.sort(word2);

        return Arrays.equals(word1, word2);
    }
}
