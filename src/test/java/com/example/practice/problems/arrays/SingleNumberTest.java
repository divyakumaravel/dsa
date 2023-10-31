package com.example.practice.problems.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {

    SingleNumber singleNumber = new SingleNumber();

    @Test
    void shouldReturn1() {
        int result = singleNumber.singleNumber(new int[]{2, 2, 1});

        assertEquals(1, result);
    }

    @Test
    void shouldReturn4() {
        int result = singleNumber.singleNumber(new int[]{4 , 1, 2, 1, 2});

        assertEquals(4, result);
    }

    @Test
    void shouldReturn1Again() {
        int result = singleNumber.singleNumber(new int[]{1});

        assertEquals(1, result);
    }
}