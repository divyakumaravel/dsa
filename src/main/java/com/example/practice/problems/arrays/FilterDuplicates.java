package com.example.practice.problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterDuplicates {

    public int[] filter(int[] a) {
        Arrays.sort(a);

        List<Integer> res = new ArrayList<>();

        int temp = a[0];
        res.add(temp);

        for(int i = 1; i<a.length; i++) {
            if(temp != a[i]) {
                res.add(a[i]);
                temp = a[i];
            }
        }

        int[] result = new int[res.size()];

        for (int i=0; i<res.size(); i++) {
            result[i] = res.get(i);
        }

        return result;
    }
}
