package com.example.practice.problems.arrays;

public class BuyAndSellStock {

    public static void main(String[] args) {
        int profit = findProfit(new int[]{7, 1, 5, 3, 6, 4});
        System.out.println("Maximum profit " + profit);
        profit = findProfit(new int[]{7, 6, 4, 3, 1});
        System.out.println("Maximum profit " + profit);
    }

    private static int findProfit(int[] stock) {
        int m = 0;
        int n = 1;
        int maxProfit = 0;
        while (n < stock.length) {
            if (stock[m] < stock[n]) {
                int profit = stock[n] - stock[m];
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            } else {
                m = n;
            }
            n++;
        }
        return maxProfit;
    }
}
