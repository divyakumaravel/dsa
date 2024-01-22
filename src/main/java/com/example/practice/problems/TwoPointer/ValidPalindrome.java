package com.example.practice.problems.TwoPointer;

public class ValidPalindrome {

    public ValidPalindrome() {
    }

    public boolean isPalindrome(String s) {
        String formatted = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start = 0;
        int end = formatted.length() - 1;
        while (end > start) {
            if (formatted.charAt(start) == formatted.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }

}
