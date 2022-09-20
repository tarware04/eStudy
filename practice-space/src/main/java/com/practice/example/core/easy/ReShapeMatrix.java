package com.practice.example.core.easy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ReShapeMatrix {

    public static void main(String[] args) {

        int[][] mat = new int[][]{{1, 2, 3, 4}};
        int r = 2;
        int c = 2;
        int[][] result = matrixReshape(mat, 2, 2);
        System.out.println(Arrays.toString(result[0]) + Arrays.toString(result[1]));
    }

       public static int[][] matrixReshape(int[][] nums, int r, int c) {
        int[][] res = new int[r][c];
        if (nums.length == 0 || r * c != nums.length * nums[0].length)
            return nums;
        Queue<Integer> queue = new LinkedList();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                queue.add(nums[i][j]);
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = queue.remove();
            }
        }
        return res;
    }


    public static int[][] matrixReshape1(int[][] nums, int r, int c) {
        int[][] res = new int[r][c];
        if (nums.length == 0 || r * c != nums.length * nums[0].length)
            return nums;
        int rows = 0, cols = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                res[rows][cols] = nums[i][j];
                cols++;
                if (cols == c) {
                    rows++;
                    cols = 0;
                }
            }
        }
        return res;
    }
}
