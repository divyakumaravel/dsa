package com.example.practice.problems.stack;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidParenthesesTest {

    ValidParentheses validParentheses = new ValidParentheses();

    @Test
    void shouldReturnTrue() {
        boolean isValid = validParentheses.isValid("({[]})");
        Assertions.assertThat(isValid).isTrue();
    }

    @Test
    void shouldReturnTrue1() {
        boolean isValid = validParentheses.isValid("()");
        Assertions.assertThat(isValid).isTrue();
    }

    @Test
    void shouldReturnFalse() {
        boolean isValid = validParentheses.isValid(")[][]");
        Assertions.assertThat(isValid).isFalse();
    }

    @Test
    void shouldReturnFalse1() {
        boolean isValid = validParentheses.isValid("(]");
        Assertions.assertThat(isValid).isFalse();
    }
}