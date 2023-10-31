package com.example.practice.problems.arrays;

public class MiddleQuestion {

    public int[] middle(int[] array) {
        int[] middle = new int[array.length-2];

        if (array.length<3) {
            return new int[]{0};
        }
        for (int i=1; i<array.length-1; i++) {
            middle[i-1] = array[i];
        }

        return middle;
    }
}
