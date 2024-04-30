package com.example.practice.problems.arrays;

public class MaxProductSubArray {
    public static void main(String[] args) {
        int max = maxProdSubArray(new int[]{2, 3, -2, 4});
        System.out.println("Max prod " + max);
    }

    private static int maxProdSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int result = maxSoFar;

        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];

            int temp = Math.max(curr, Math.max(curr * minSoFar, curr * maxSoFar));
            minSoFar = Math.min(curr, Math.min(curr * minSoFar, curr * maxSoFar));
            maxSoFar = temp;

            result = Math.max(maxSoFar, result);
        }
        return result;
    }
}
