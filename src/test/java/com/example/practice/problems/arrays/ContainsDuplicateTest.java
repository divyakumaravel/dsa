package com.example.practice.problems.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    ContainsDuplicate containsDuplicate = new ContainsDuplicate();

    @Test
    void shouldReturnTrue() {
        boolean result = containsDuplicate.containsDuplicate(new int[]{1, 2, 3, 1});

        assertTrue(result);
    }

    @Test
    void shouldReturnFalse() {
        boolean result = containsDuplicate.containsDuplicate(new int[]{1, 2, 3, 4});

        assertFalse(result);
    }
}