package com.example.practice.problems.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TopKFrequentTest {

    TopKFrequent topKFrequent = new TopKFrequent();

    @Test
    void shouldReturnTop2Frequent() {
        int[] ints = topKFrequent.topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);

        Assertions.assertArrayEquals(new int[]{1, 2}, ints);
    }

    @Test
    void shouldReturnTop1Frequent() {
        int[] ints = topKFrequent.topKFrequent(new int[]{1}, 1);

        Assertions.assertArrayEquals(new int[]{1}, ints);
    }
}