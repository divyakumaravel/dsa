package com.example.practice.problems.amazon;

import java.util.ArrayList;
import java.util.List;

public class OptimalStringPartition {

    public int partitionString(String s) {
        int result = 0;
        String tempString = s.toLowerCase();
        int i = 0;
        int traversed = 0;
        while (!tempString.isEmpty() && traversed <= s.length()) {
            if (tempString.length() == 1) {
                result++;
                break;
            }
            List<Character> tempChars = new ArrayList<>();
            for (int j = 1; j < tempString.length(); j++) {
                if (traversed > s.length()) {
                    break;
                }
                traversed++;
                if (tempString.charAt(i) == tempString.charAt(j) || tempChars.contains(tempString.charAt(j))) {
                    result++;
                    tempString = tempString.substring(j);
                    break;
                } else {
                    tempChars.add(tempString.charAt(j));
                }
            }
        }
        if (!tempString.isEmpty() && traversed >= s.length()) {
            result++;
        }
        return result;
    }
}
