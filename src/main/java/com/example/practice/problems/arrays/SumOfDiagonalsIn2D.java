package com.example.practice.problems.arrays;

public class SumOfDiagonalsIn2D {
    public int sumOfDiagonals(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
        }
        return sum;
    }
}
