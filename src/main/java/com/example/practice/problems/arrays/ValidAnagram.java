package com.example.practice.problems.arrays;

import java.util.Arrays;

public class ValidAnagram {

    public ValidAnagram() {
    }

    public boolean isValidAnagram(String string, String anagram) {
        if (string.length() == anagram.length()) {
            String[] split = anagram.split("");
            for (String s : split) {
                if (!string.contains(s)) {
                    return false;
                }
                string = string.replaceFirst(s, "");
            }
            return true;
        }
        return false;
    }

    public boolean checkAnagramUsingHash(String string, String anagram) {
        if (string.length() != anagram.length()) {
            return false;
        }
        int[] map = new int[26];
        for (char x: string.toCharArray()) {
            int i = x - 'a';
            map[i]++;
        }
        for (char x: anagram.toCharArray()) {
            int i = x - 'a';
            map[i]--;
        }
        for(int i: map) {
            if (i !=0 ){
                return false;
            }
        }
        return true;
    }
}
