package com.example.practice.problems.arrays;

import java.util.Arrays;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int counter = 1;
        int temp = nums[0];
        for(int i=1; i<nums.length; i++) {
            if (counter == 2) {
                counter = 0;
            }
            if (counter == 1 && temp != nums[i]) {
                return temp;
            }
            temp = nums[i];
            counter ++;
        }
        return temp;
    }
}
