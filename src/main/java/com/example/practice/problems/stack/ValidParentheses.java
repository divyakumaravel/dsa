package com.example.practice.problems.stack;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

    public ValidParentheses() {
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int topOfStack = -1;
        int index = 0;
        HashMap<Character, Character> openToCloseBraces = new HashMap<>();
        openToCloseBraces.put(')', '(');
        openToCloseBraces.put('}', '{');
        openToCloseBraces.put(']', '[');
        while (index < s.length()) {
            char c = s.charAt(index);
            if (openToCloseBraces.containsKey(c)) {
                if (topOfStack == -1) {
                    return false;
                } else {
                    Character popped = stack.pop();
                    topOfStack--;
                    if (openToCloseBraces.get(c) != popped) {
                        return false;
                    }
                    index++;
                }
            } else {
                stack.push(c);
                topOfStack++;
                index++;
            }
        }
        return topOfStack == -1;
    }
}
