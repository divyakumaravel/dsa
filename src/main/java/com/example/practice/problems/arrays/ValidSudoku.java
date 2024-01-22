package com.example.practice.problems.arrays;

import java.util.HashMap;
import java.util.Map;

public class ValidSudoku {
    public ValidSudoku() {
    }

    public boolean isValidSudoku(char[][] board) {

        boolean areRowsValid = checkRows(board);
        boolean areColumnsValid = checkColumns(board);
        boolean areGridsValid = checkGrids(board);

        return areRowsValid && areColumnsValid && areGridsValid;
    }

    private boolean checkGrids(char[][] board) {
        Map<String, Map<Character, Integer>> map = new HashMap<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                char c = board[j][i];
                if (c != '.') {
                    String category = i / 3 + "" + j / 3;
                    if (map.containsKey(category)) {
                        Map<Character, Integer> characterIntegerMap = map.get(category);
                        if (characterIntegerMap.containsKey(c)) {
                            return false;
                        }
                        characterIntegerMap.put(c, 1);
                    } else {
                        Map<Character, Integer> characterIntegerMap = new HashMap<>();
                        characterIntegerMap.put(c, 1);
                        map.put(category, characterIntegerMap);
                    }
                }
            }
        }
        return true;
    }

    private boolean checkColumns(char[][] board) {
        int rows = board[0].length;
        int columns = board[0].length;
        int column = 0;
        while (column < columns) {
            Map<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < rows; i++) {
                char c = board[i][column];
                if (c != '.') {
                    if (map.containsKey(c)) {
                        return false;
                    }
                }
                map.put(c, 1);
            }
            column++;
        }
        return true;
    }

    private boolean checkRows(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            char[] chars = board[i];
            Map<Character, Integer> map = new HashMap<>();
            for (int j = 0; j < chars.length; j++) {
                char aChar = chars[j];
                if (aChar != '.') {
                    if (map.containsKey(aChar)) {
                        return false;
                    }
                    map.put(aChar, 1);
                }
            }
        }
        return true;
    }

}
