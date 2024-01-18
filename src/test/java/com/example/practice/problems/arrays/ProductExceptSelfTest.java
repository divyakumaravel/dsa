package com.example.practice.problems.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ProductExceptSelfTest {

    ProductExceptSelf productExceptSelf;

    @Test
    void shouldReturnProductExceptSelf() {
        productExceptSelf = new ProductExceptSelf();

        int[] result = productExceptSelf.findProduct(new int[]{1, 2, 3, 4});

        Assertions.assertArrayEquals(new int[]{24, 12, 8, 6}, result);
    }

    @Test
    void shouldReturnProductExceptSelfWhenZeroExists() {
        productExceptSelf = new ProductExceptSelf();

        int[] result = productExceptSelf.findProduct(new int[]{-1, 1, 0, -3, 3});

        Assertions.assertArrayEquals(new int[]{0, 0, 9, 0, 0}, result);
    }

    @Test
    void shouldReturnProductExceptSelfWhenAllZeroExists() {
        productExceptSelf = new ProductExceptSelf();

        int[] result = productExceptSelf.findProduct(new int[]{0, 0});

        Assertions.assertArrayEquals(new int[]{0, 0}, result);
    }
}