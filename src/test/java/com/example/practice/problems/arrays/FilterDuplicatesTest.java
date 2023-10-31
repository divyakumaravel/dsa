package com.example.practice.problems.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilterDuplicatesTest {

    FilterDuplicates filterDuplicates = new FilterDuplicates();

    @Test
    void shouldFilter() {
        int[] filter = filterDuplicates.filter(new int[]{1, 2, 2, 3, 3, 4});
        assertArrayEquals(new int[]{1,2,3,4}, filter);
    }
}