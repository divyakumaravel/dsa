package com.example.practice.problems.arrays;

import java.util.Arrays;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int temp = nums[0];
        for (int i = 1; i< nums.length; i++) {
            if (temp == nums[i]) {
                return true;
            }
            temp = nums[i];
        }
        return false;
    }
}
