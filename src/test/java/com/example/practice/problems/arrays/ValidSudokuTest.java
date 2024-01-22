package com.example.practice.problems.arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidSudokuTest {

    ValidSudoku validSudoku = new ValidSudoku();

    @Test
    void shouldReturnTrueIfValidSudoku() {
        boolean isValidSudoku = validSudoku.isValidSudoku(new char[][]{{'5', '3', '.', '.', '7', '.', '.', '.', '.'}, {
                '6', '.', '.', '1', '9', '5', '.', '.', '.'}, {'.', '9', '8', '.', '.', '.', '.', '6', '.'}, {
                '8', '.', '.', '.', '6', '.', '.', '.', '3'}, {'4', '.', '.', '8', '.', '3', '.', '.', '1'}, {
                '7', '.', '.', '.', '2', '.', '.', '.', '6'}, {'.', '6', '.', '.', '.', '.', '2', '8', '.'}, {
                '.', '.', '.', '4', '1', '9', '.', '.', '5'}, {'.', '.', '.', '.', '8', '.', '.', '7', '9'}});

        Assertions.assertThat(isValidSudoku).isTrue();
    }

    @Test
    void shouldReturnFalseIfInvalidSudoku() {
        boolean isValidSudoku = validSudoku.isValidSudoku(new char[][]{{'8', '3', '.', '.', '7', '.', '.', '.', '.'}, {
                '6', '.', '.', '1', '9', '5', '.', '.', '.'}, {'.', '9', '8', '.', '.', '.', '.', '6', '.'}, {
                '8', '.', '.', '.', '6', '.', '.', '.', '3'}, {'4', '.', '.', '8', '.', '3', '.', '.', '1'}, {
                '7', '.', '.', '.', '2', '.', '.', '.', '6'}, {'.', '6', '.', '.', '.', '.', '2', '8', '.'}, {
                '.', '.', '.', '4', '1', '9', '.', '.', '5'}, {'.', '.', '.', '.', '8', '.', '.', '7', '9'}});

        Assertions.assertThat(isValidSudoku).isFalse();
    }

    @Test
    void shouldReturnFalse() {
        boolean isValidSudoku = validSudoku.isValidSudoku(new char[][]{{'1', '2', '.', '.', '.', '.', '6', '.', '7'}, {
                '.', '.', '.', '.', '.', '.', '.', '.', '5'}, {'.', '.', '9', '.', '6', '.', '4', '.', '.'}, {
                '.', '6', '.', '.', '.', '.', '.', '.', '.'}, {'.', '.', '.', '.', '4', '.', '.', '7', '.'}, {
                '.', '.', '.', '.', '.', '.', '.', '.', '.'}, {'.', '.', '.', '5', '.', '.', '.', '.', '.'}, {
                '.', '.', '.', '.', '.', '.', '.', '.', '2'}, {'.', '9', '.', '.', '.', '.', '.', '.', '7'}});

        Assertions.assertThat(isValidSudoku).isFalse();
    }
}