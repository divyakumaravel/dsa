package com.example.practice.problems.arrays;

public class RotateArray {
    public int[] rotate(int[] a, int k) {
        for (int i = 0; i<k; i++) {
            int[] copyOfA = a.clone();
            a[0] = copyOfA[a.length-1];
            for (int j = 1; j<a.length; j++) {
                a[j] = copyOfA[j-1];
            }
        }
        return a;
    }
}
