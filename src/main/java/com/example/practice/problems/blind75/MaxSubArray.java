package com.example.practice.problems.blind75;

public class MaxSubArray {

    public static void main(String[] args) {
        int max = maxSubArray(new int[]{-2, 1});
        System.out.println("Max " + max);
    }

    private static int maxSubArray(int[] nums) {
        int sum = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (sum >= 0) {
                sum += nums[i];
            } else {
                sum = nums[i];
            }
            if (sum > max) {
                max = sum;
            }
        }
        return max;
    }
}
