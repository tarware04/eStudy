package com.practice.example.core.easy;

import java.util.HashSet;
import java.util.Set;

public class ValidateSudoku {

    public static void main(String[] args) {
        String[][] board = new String[][]{{"5", "3", ".", ".", "7", ".", ".", ".", "."}
                , {"6", ".", ".", "1", "9", "5", ".", ".", "."}
                , {".", "9", "8", ".", ".", ".", ".", "6", "."}
                , {"8", ".", ".", ".", "6", ".", ".", ".", "3"}
                , {"4", ".", ".", "8", ".", "3", ".", ".", "1"}
                , {"7", ".", ".", ".", "2", ".", ".", ".", "6"}
                , {".", "6", ".", ".", ".", ".", "2", "8", "."}
                , {".", ".", ".", "4", "1", "9", ".", ".", "5"}
                , {".", ".", ".", ".", "8", ".", ".", "7", "9"}};
        System.out.println(isValid(board));
    }

    private static boolean isValid(String[][] board) {
        int n = 9;
        Set<String>[] row = new HashSet[n];
        Set<String>[] col = new HashSet[n];
        Set<String>[] boxes = new HashSet[n];

        for (int r = 0; r < n; r++) {
            row[r] = new HashSet<String>();
            col[r] = new HashSet<String>();
            boxes[r] = new HashSet<String>();
        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                String val = board[i][j];
                if (val.equals(".")) continue;
                if (row[i].contains(val))
                return false;
                row[i].add(val);

                if (col[j].contains(val))
                return false;
                col[j].add(val);

                int indexInBox = (i / 3) * 3 + j / 3;
                if (boxes[indexInBox].contains(indexInBox))
                return false;
                boxes[indexInBox].add(val);
            }
        }

        return true;
    }
}
