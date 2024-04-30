package com.example.practice.problems.blind75;

public class ProductExceptSelf {
    public ProductExceptSelf() {
    }

    public int[] findProduct(int[] nums) {
        int length = nums.length;
        int[] result = new int[length];
        int product = 1;
        result[0] = product;
        for (int i = 1; i < length; i++) {
            product = product * nums[i - 1];
            result[i] = product;
        }
        product = 1;
        for (int i = length - 2; i >= 0; i--) {
            product = product * nums[i + 1];
            result[i] = result[i] * product;
        }
        return result;
    }
}
