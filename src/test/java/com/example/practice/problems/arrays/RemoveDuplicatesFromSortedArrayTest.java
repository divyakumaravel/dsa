package com.example.practice.problems.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest {

    RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();

    @Test
    void shouldReturn2() {
        int result = removeDuplicatesFromSortedArray.removeDuplicates(new int[]{1, 1, 2});

        assertEquals(2, result);
    }

    @Test
    void shouldReturn5() {
        int result = removeDuplicatesFromSortedArray.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});

        assertEquals(5, result);
    }
}