package com.example.practice.problems.TwoPointer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidPalindromeTest {

    ValidPalindrome validPalindrome = new ValidPalindrome();

    @Test
    void shouldReturnTrueForAValidPalindrome() {
        boolean isValid = validPalindrome.isPalindrome("A man, a plan, a canal: Panama");

        Assertions.assertThat(isValid).isTrue();
    }

    @Test
    void shouldReturnTrueForAValidPalindrome1() {

        boolean isValid = validPalindrome.isPalindrome(" ");

        Assertions.assertThat(isValid).isTrue();
    }

    @Test
    void shouldReturnFalseForAnInValidPalindrome() {
        boolean isValid = validPalindrome.isPalindrome("race a car");

        Assertions.assertThat(isValid).isFalse();
    }

    @Test
    void shouldReturnFalseForAnInValidPalindrome1() {
        boolean isValid = validPalindrome.isPalindrome("0P");

        Assertions.assertThat(isValid).isFalse();
    }


}