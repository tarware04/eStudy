package com.practice.example.core.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static void main(String[] args) {

        int numRows = 5;
        List<List<Integer>> result = getPascalTriangle(numRows);

        System.out.println("Answer: " + result);
    }

    private static List<List<Integer>> getPascalTriangle(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();

        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> previousRow = triangle.get(rowNum - 1);

            row.add(1);
            for (int j = 1; j < rowNum; j++) {

                row.add(previousRow.get(j - 1) + previousRow.get(j));
            }
            row.add(1);
            triangle.add(row);
        }

        return triangle;

    }
}
