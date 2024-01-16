package com.example.practice.problems.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidAnagramTest {

    ValidAnagram validAnagram = new ValidAnagram();

    @Test
    void shouldReturnTrueWhenValidAnagram() {
        boolean isValid = validAnagram.isValidAnagram("anagram", "nagaram");
        Assertions.assertTrue(isValid);
    }

    @Test
    void shouldReturnFalseWhenValidAnagram() {
        boolean isValid = validAnagram.isValidAnagram("rat", "cat");
        Assertions.assertFalse(isValid);
    }

    @Test
    void shouldReturnFalse() {
        boolean isValid = validAnagram.isValidAnagram("ccac", "aacc");
        Assertions.assertFalse(isValid);
    }

    @Test
    void shouldReturnFalse1() {
        boolean isValid = validAnagram.checkAnagramUsingHash("ccac", "aacc");
        Assertions.assertFalse(isValid);
    }
}