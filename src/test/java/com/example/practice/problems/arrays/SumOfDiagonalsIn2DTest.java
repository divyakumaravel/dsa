package com.example.practice.problems.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfDiagonalsIn2DTest {

    SumOfDiagonalsIn2D sumOfDiagonalsIn2D = new SumOfDiagonalsIn2D();

    @Test
    void shouldReturn15() {
        int result = sumOfDiagonalsIn2D.sumOfDiagonals(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});

        assertEquals(15, result);
    }

    @Test
    void shouldReturn0() {
        int result = sumOfDiagonalsIn2D.sumOfDiagonals(new int[][]{{0}});

        assertEquals(0, result);
    }
}