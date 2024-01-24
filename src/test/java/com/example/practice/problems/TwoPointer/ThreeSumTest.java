package com.example.practice.problems.TwoPointer;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class ThreeSumTest {

    ThreeSum threeSum = new ThreeSum();

    @Test
    void shouldReturnListOfThreeSum() {
        List<List<Integer>> result = threeSum.threeSum(new int[]{-1, 0, 1, 2, -1, -4});

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<Integer>() {
            {
                add(-1);
                add(-1);
                add(2);
            }
        });
        expected.add(new ArrayList<Integer>() {
            {
                add(-1);
                add(0);
                add(1);
            }
        });
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void shouldReturnListOfThreeSum1() {
        List<List<Integer>> result = threeSum.threeSum(new int[]{-1, 0, 1, 0});

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<Integer>() {
            {
                add(-1);
                add(0);
                add(1);
            }
        });
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void shouldReturnListOfThreeSum2() {
        List<List<Integer>> result = threeSum.threeSum(new int[]{-2, 0, 0, 2, 2});

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<Integer>() {
            {
                add(-2);
                add(0);
                add(2);
            }
        });
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void shouldReturnListOfThreeSum3() {
        List<List<Integer>> result = threeSum.threeSum(new int[]{1, -1, -1, 0});

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<Integer>() {
            {
                add(-1);
                add(0);
                add(1);
            }
        });
        assertThat(result).isEqualTo(expected);
    }
}