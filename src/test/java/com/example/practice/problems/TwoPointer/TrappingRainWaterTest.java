package com.example.practice.problems.twoPointer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class TrappingRainWaterTest {

    TrappingRainWater trappingRainWater = new TrappingRainWater();

    @Test
    void shouldReturn6Traps() {
        int traps = trappingRainWater.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1});

        Assertions.assertThat(traps).isEqualTo(6);
    }

    @Test
    void shouldReturn9Traps() {
        int traps = trappingRainWater.trap(new int[]{4, 2, 0, 3, 2, 5});

        Assertions.assertThat(traps).isEqualTo(9);
    }
}