package com.example.practice.problems.blind75;

public class MinOfSortedRotatedArray {
    public static void main(String[] args) {
        int min = findMin(new int[]{2, 3, 4, 5, 1});
        System.out.println("Minimum value " + min);
    }

    public static int findMin(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int mid;
        int result = nums[left];
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] < result) {
                result = nums[mid];
            } else if (nums[left] < nums[mid]) {
                // left is sorted
                if(nums[mid] < nums[right])
                    right = mid - 1;
                else
                    left = mid + 1;
            } else {
                if (nums[mid] < nums[right])
                    right = mid - 1;
                else
                    left = mid + 1;
            }
        }
        return result;
    }

}
