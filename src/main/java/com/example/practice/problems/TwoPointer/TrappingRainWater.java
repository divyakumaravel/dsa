package com.example.practice.problems.TwoPointer;

public class TrappingRainWater {
    public TrappingRainWater() {
    }

    public int trap(int[] height) {
        int traps = 0;
        int maxLeft = height[0];
        int length = height.length - 1;
        int maxRight = height[length];
        int l = 0;
        int r = length;

        while (l < r) {
            if (maxLeft <= maxRight) {
                l++;
                int container = maxLeft - height[l];
                if (container > 0) {
                    traps += container;
                }
                if (maxLeft < height[l]) {
                    maxLeft = height[l];
                }
            } else {
                r--;
                int container = maxRight - height[r];
                if (container > 0) {
                    traps += container;
                }
                if (maxRight < height[r]) {
                    maxRight = height[r];
                }
            }
        }
        return traps;
    }
}
