package com.example.practice.problems.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiddleQuestionTest {

    MiddleQuestion middleQuestion = new MiddleQuestion();

    @Test
    void shouldReturnMiddleArray() {
        int[] result = middleQuestion.middle(new int[]{1, 2, 3, 4});

        assertArrayEquals(new int[]{2,3}, result);
    }

    @Test
    void shouldReturnMiddleArray1() {
        int[] result = middleQuestion.middle(new int[]{1, 2});

        assertArrayEquals(new int[]{0}, result);
    }
}