package com.example.practice.problems.arrays;

public class MissingNumber {

    public int find(int[] nums) {
        for (int i=1; i<nums.length; i++) {
            if(nums[i] - nums[i-1] != 1) {
                return nums[i] - 1;
            }
        }
        return 0;
    }

    public int findUsingFormula(int[] nums) {
        int n = nums.length + 1;
        int sumOfNNumbers = n * (n + 1)/2;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sumOfNNumbers-sum;
    }
}
