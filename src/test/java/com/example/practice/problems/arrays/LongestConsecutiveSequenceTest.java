package com.example.practice.problems.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestConsecutiveSequenceTest {

    LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();

    @Test
    void shouldReturn4() {
        int result = longestConsecutiveSequence.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2});

        Assertions.assertThat(result).isEqualTo(4);
    }

    @Test
    void shouldReturn9() {
        int result = longestConsecutiveSequence.longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1});

        Assertions.assertThat(result).isEqualTo(9);
    }

    @Test
    void shouldReturn7() {
        int result = longestConsecutiveSequence.longestConsecutive(new int[]{9,1,4,7,3,-1,0,5,8,-1,6});

        Assertions.assertThat(result).isEqualTo(7);
    }

    @Test
    void shouldReturn3() {
        int result = longestConsecutiveSequence.longestConsecutive(new int[]{1,2,0,1});

        Assertions.assertThat(result).isEqualTo(3);
    }
}