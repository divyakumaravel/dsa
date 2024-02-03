package com.example.practice.problems.twoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public ThreeSum() {
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while (k > j) {
                int threeSum = nums[i] + nums[j] + nums[k];
                if (threeSum == 0) {
                    List<Integer> found = new ArrayList<>();
                    found.add(nums[i]);
                    found.add(nums[j]);
                    found.add(nums[k]);
                    result.add(found);

                    j++;
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                }
                if (threeSum > 0) {
                    k--;
                }
                if (threeSum < 0) {
                    j++;
                }
            }
        }
        return result;
    }
}
