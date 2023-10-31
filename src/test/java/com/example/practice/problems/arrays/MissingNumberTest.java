package com.example.practice.problems.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumberTest {

    MissingNumber missingNumber = new MissingNumber();

    @Test
    void shouldReturn5() {
        int number = missingNumber.find(new int[]{1, 2, 3, 4, 6});

        assertEquals(5, number);
    }

    @Test
    void shouldReturn5Again() {
        int number = missingNumber.findUsingFormula(new int[]{1, 2, 3, 4, 6});

        assertEquals(5, number);
    }
}