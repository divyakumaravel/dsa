package com.example.practice.problems.twoPointer;

public class TwoSumForSortedArray {
    public TwoSumForSortedArray() {
    }

    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            int sum = numbers[start] + numbers[end];
            if (sum > target) {
                end--;
            } else if (sum < target) {
                start++;
            } else {
                return new int[]{start, end};
            }
        }
        return result;
    }
}
