package com.example.practice.problems.arrays;

import java.util.Arrays;

public class FindTopTwoScores {

    public int[] findUsingSort(int[] scores) {
        Arrays.sort(scores);

        return new int[]{scores[scores.length - 1], scores[scores.length - 2]};
    }

    public int[] findWithoutSort(int[] scores) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int score : scores) {
            if (score > first) {
                second = first;
                first = score;
            } else if (score > second && score<first) {
                second = score;
            }
        }

        return new int[]{first, second};
    }
}
