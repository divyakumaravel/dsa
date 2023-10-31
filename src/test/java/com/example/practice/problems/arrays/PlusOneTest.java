package com.example.practice.problems.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {

    PlusOne plusOne = new PlusOne();

    @Test
    void shouldReturnArray() {
        int[] result = plusOne.plusOne(new int[]{1, 2, 3});

        assertArrayEquals(new int[]{1,2,4}, result);
    }

    @Test
    void shouldReturnArray1() {
        int[] result = plusOne.plusOne(new int[]{9});

        assertArrayEquals(new int[]{1,0}, result);
    }

    @Test
    void shouldReturnArray2() {
        int[] result = plusOne.plusOne(new int[]{9,8,7,6,5,4,3,2,1,0});

        assertArrayEquals(new int[]{9,8,7,6,5,4,3,2,1,1}, result);
    }

    @Test
    void shouldReturnArray3() {
        int[] result = plusOne.plusOne(new int[]{7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6});

        assertArrayEquals(new int[]{7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,7}, result);
    }
}