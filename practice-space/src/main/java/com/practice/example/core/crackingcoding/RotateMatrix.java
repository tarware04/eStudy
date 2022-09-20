package com.practice.example.core.crackingcoding;

import java.util.Arrays;

public class RotateMatrix {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}};

        int row = matrix.length;
        int col = matrix[0].length;
        System.out.println("Previous row count: " + row + " and column count: " + col);

        int[][] result = rotateMatrix(row, col, matrix);

        // expected no. col =2, row=4
        System.out.println(Arrays.toString(result[0]) + Arrays.toString(result[1]));
    }

    private static int[][] rotateMatrix(int row, int col, int[][] matrix) {

        int[][] result = new int[col][row];
        int r = 0;
        int c = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result[r][c] = matrix[i][j];
                c++;
                if(c==col) {
                    row++;
                    c=0;
                }
            }
        }
        return result;
    }

}
