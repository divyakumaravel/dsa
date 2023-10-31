package com.example.practice.problems.amazon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorFinderTest {
    FactorFinder factorFInder = new FactorFinder();

    @Test
    void shouldReturn3() {
        int result = factorFInder.kthFactor(12, 3);

        assertEquals(3, result);

    }

    @Test
    void shouldReturn7() {
        int result = factorFInder.kthFactor(7, 2);

        assertEquals(7, result);
    }

    @Test
    void shouldReturnNegetive1() {
        int result = factorFInder.kthFactor(4, 4);

        assertEquals(-1, result);
    }
}