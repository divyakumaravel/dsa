package com.example.practice.problems.arrays;

import java.math.BigInteger;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i < digits.length; i++) {
            BigInteger multiplyValue = BigInteger.valueOf(10).pow(digits.length - 1 - i);
            sum = sum.add(BigInteger.valueOf(digits[i]).multiply(multiplyValue));
        }
        sum = sum.add(BigInteger.ONE);

        String temp = sum.toString();
        int[] result = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            result[i] = temp.charAt(i) - '0';
        }

        return result;
    }
}
