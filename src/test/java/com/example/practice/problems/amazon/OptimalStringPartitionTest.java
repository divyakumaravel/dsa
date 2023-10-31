package com.example.practice.problems.amazon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OptimalStringPartitionTest {

    OptimalStringPartition optimalStringPartition = new OptimalStringPartition();

    @Test
    void shouldReturn4() {
        int result = optimalStringPartition.partitionString("abacaba");

        assertEquals(4, result);
    }

    @Test
    void shouldReturn1() {
        int result = optimalStringPartition.partitionString("cuieokbs");

        assertEquals(1, result);
    }

    @Test
    void shouldReturn6() {
        int result = optimalStringPartition.partitionString("ssssss");

        assertEquals(6, result);
    }

    @Test
    void shouldReturn2() {
        int result = optimalStringPartition.partitionString("gizfdfri");

        assertEquals(2, result);
    }
}