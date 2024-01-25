package com.example.practice.problems.TwoPointer;

import java.util.Arrays;

public class ContainerWithMostWater {
    public ContainerWithMostWater() {
    }

    public int maxArea(int[] height) {
        int width = height.length - 1;
        int maxArea = 0;
        int left = 0;
        int right = width;

        while (left != right) {
            maxArea = Math.max(width * Math.min(height[left], height[right]), maxArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
            width--;
        }

        return maxArea;
    }
}
