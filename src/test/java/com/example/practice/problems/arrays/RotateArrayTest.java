package com.example.practice.problems.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RotateArrayTest {

    RotateArray rotateArray = new RotateArray();

    @Test
    void shouldRotateArray() {
        int[] result = rotateArray.rotate(new int[]{1, 2}, 3);

        assertArrayEquals(new int[]{2, 1}, result);
    }

    @Test
    void shouldRotateArray1() {
        int[] result = rotateArray.rotate(new int[]{1, 2, 3, 4}, 4);

        assertArrayEquals(new int[]{1, 2, 3, 4}, result);
    }

    @Test
    void shouldRotateArray2() {
        int[] result = rotateArray.rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);

        assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, result);
    }

    @Test
    void shouldRotateArray3() {
        int[] result = rotateArray.rotate(new int[]{1, 2}, 2);

        assertArrayEquals(new int[]{1, 2}, result);
    }

    @Test
    void shouldRotateArray4() {
        int[] result = rotateArray.rotate(new int[]{1, 2, 3}, 4);

        assertArrayEquals(new int[]{3, 1, 2}, result);
    }
}