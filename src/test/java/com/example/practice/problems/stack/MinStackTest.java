package com.example.practice.problems.stack;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class MinStackTest {

    MinStack minStack;

    @Test
    void shouldReturnCorrectResult() {
        minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        int min = minStack.getMin();

        Assertions.assertThat(min).isEqualTo(-3);

        minStack.pop();
        int top = minStack.top();
        Assertions.assertThat(top).isEqualTo(0);

        int min1 = minStack.getMin();
        Assertions.assertThat(min1).isEqualTo(-2);
    }
}