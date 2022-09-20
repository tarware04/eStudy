package com.practice.example.core.easy;

import java.util.Arrays;

public class Search2DMatrix {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int targetElement = 3;

        int[] resultIndex = searchIn2DMartix(matrix, targetElement);
        System.out.println(Arrays.toString(resultIndex));
    }

    private static int[] searchIn2DMartix(int[][] matrix, int targetElement) {

        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = 0; j < matrix[0].length / 2; j++) {
                int pivotIdx = ((matrix.length + matrix[0].length) - 1) / 2;
                int pivotElement = matrix[pivotIdx / matrix[0].length][pivotIdx % matrix[0].length];
                if (targetElement == pivotElement) {
                    return new int[]{i, j};
                } else if (targetElement < pivotElement) {
                    i = pivotIdx - 1;
                } else
                    j = pivotIdx + 1;
            }

        }
        return new int[]{-1, -1};
    }

}
