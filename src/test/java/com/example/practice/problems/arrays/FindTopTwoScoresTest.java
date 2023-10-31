package com.example.practice.problems.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTopTwoScoresTest {

    FindTopTwoScores findTopTwoScores = new FindTopTwoScores();

    @Test
    void shouldReturnScoreWithSort() {
        int[] result = findTopTwoScores.findUsingSort(new int[]{1, 2, 3, 4, 5, 6});

        assertArrayEquals(new int[]{6,5}, result);
    }

    @Test
    void shouldReturnScoreWithoutSort() {
        int[] result = findTopTwoScores.findWithoutSort(new int[]{1, 2, 3, 4, 5, 6});

        assertArrayEquals(new int[]{6,5}, result);
    }
}