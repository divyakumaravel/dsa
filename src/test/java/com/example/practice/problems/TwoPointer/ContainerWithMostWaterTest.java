package com.example.practice.problems.twoPointer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ContainerWithMostWaterTest {
    ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();

    @Test
    void shouldReturn49() {
        int maxArea = containerWithMostWater.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});

        Assertions.assertThat(maxArea).isEqualTo(49);
    }

    @Test
    void shouldReturn1() {
        int maxArea = containerWithMostWater.maxArea(new int[]{1, 1});

        Assertions.assertThat(maxArea).isEqualTo(1);
    }
}