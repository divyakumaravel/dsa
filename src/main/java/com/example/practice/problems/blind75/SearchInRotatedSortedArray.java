package com.example.practice.problems.blind75;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int targetIndex = search(new int[]{4, 5, 6, 7, 0, 1, 2}, 2);
        System.out.println("Target index " + targetIndex);
    }

    public static int search(int[] nums, int target) {
        int l = 0;
        int h = nums.length - 1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[l] <= nums[mid]) {
                if (target >= nums[l] && target < nums[mid]) {
                    h = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[h]) {
                    l = mid + 1;
                } else {
                    h = mid - 1;
                }
            }
        }
        return -1;
    }
}
