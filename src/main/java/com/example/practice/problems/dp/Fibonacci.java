package com.example.practice.problems.dp;

public class Fibonacci {
    public static void main(String[] args) {
        int answer = usingDP(50);
        System.out.println("DP " + answer);
        answer = usingRecursion(50);
        System.out.println("Recursion " + answer);
    }

    private static int usingDP(int n) {
        int[] series = new int[n];
        series[0] = 1;
        series[1] = 1;
        for (int i = 2; i < n; i++) {
            series[i] = series[i - 1] + series[i - 2];
        }
        return series[n - 1];
    }

    private static int usingRecursion(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return usingRecursion(n - 1) + usingRecursion(n - 2);
    }
}
