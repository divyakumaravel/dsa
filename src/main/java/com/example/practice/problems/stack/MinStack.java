package com.example.practice.problems.stack;

import java.util.Stack;

public class MinStack {

    Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        int min = stack.peek();
        for (Integer next : stack) {
            if (min > next) {
                min = next;
            }
        }
        return min;
    }
}
