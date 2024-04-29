package com.example.practice.problems.dp;

public class GridTraveller {
    public static void main(String[] args) {
        int ways = travelUsingDP(3, 3);
        System.out.println("Travel using DP " + ways);
        ways = travelUsingRecursion(3, 3);
        System.out.println("Travel using recursion " + ways);
    }

    private static int travelUsingRecursion(int m, int n) {
        if (m == 1 && n == 1) {
            return 1;
        }
        if (m == 0 || n == 0) {
            return 0;
        }
        return travelUsingRecursion(m - 1, n) + travelUsingRecursion(m, n - 1);
    }

    private static int travelUsingDP(int m, int n) {
        int[][] dp = new int[m][n];
        dp[0][0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i + 1 < m) {
                    dp[i + 1][j] += dp[i][j];
                }
                if (j + 1 < n) {
                    dp[i][j + 1] += dp[i][j];
                }
            }
        }
        return dp[m - 1][n - 1];
    }
}
