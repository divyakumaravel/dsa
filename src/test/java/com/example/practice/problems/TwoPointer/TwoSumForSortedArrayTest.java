package com.example.practice.problems.TwoPointer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumForSortedArrayTest {
    TwoSumForSortedArray twoSum = new TwoSumForSortedArray();

    @Test
    void shouldReturnArray() {
        int[] result = twoSum.twoSum(new int[]{2, 7, 11, 15}, 9);

        assertArrayEquals(new int[]{0, 1}, result);
    }

    @Test
    void shouldReturnArray1() {
        int[] result = twoSum.twoSum(new int[]{2, 3, 4}, 6);

        assertArrayEquals(new int[]{0, 2}, result);
    }

    @Test
    void shouldReturnArray2() {
        int[] result = twoSum.twoSum(new int[]{3, 3}, 6);

        assertArrayEquals(new int[]{0, 1}, result);
    }
}
