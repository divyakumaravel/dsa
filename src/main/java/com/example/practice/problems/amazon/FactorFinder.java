package com.example.practice.problems.amazon;

public class FactorFinder {
    public int kthFactor(int n, int k) {
        int result = -1;
        int iterator = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                iterator ++;
                if (iterator == k) {
                    result = i;
                    break;
                }
            }
        }
        return result;
    }
}
