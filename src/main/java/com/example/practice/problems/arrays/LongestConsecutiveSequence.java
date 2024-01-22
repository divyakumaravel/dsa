package com.example.practice.problems.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public LongestConsecutiveSequence() {
    }

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int longestConsecutive = 1;
        int start = 0;
        int end = 1;
        int counter = 1;

        while (end < nums.length) {
            if (nums[end] != nums[start]) {
                if (nums[end] - nums[start] == 1) {
                    counter++;
                } else {
                    counter = 1;
                }
                if (counter > longestConsecutive) {
                    longestConsecutive = counter;
                }
            }
            start++;
            end++;
        }

        return longestConsecutive;
    }
}
