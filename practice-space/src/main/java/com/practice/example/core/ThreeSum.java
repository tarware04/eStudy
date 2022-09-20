package com.practice.example.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an array S of n integers, are there elements a, b, c in S
 * such that a + b + c = 0? Find all unique triplets in the
 * array which gives the sum of zero.
 * <p>
 * Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c)
 * The solution set must not contain duplicate triplets.
 * <p>
 * For example, given array S = {-1 0 1 2 -1 -4},
 * <p>
 * A solution set is:
 * (-1, 0, 1)
 * (-1, -1, 2)
 */
public class ThreeSum {
    public static void main(String[] args) {
        int[] input = {-1, 0, 1, 2, -1, -4};
        int target = 28;

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(input);

        for (int i = 0; i < input.length; i++) {
            int j = i + 1;
            int k = input.length - 1;

            if (i > 0 && input[i] == input[i - 1]) {
                continue;
            }

            while (j < k) {
                if (input[i] + input[j] + input[k] < 0) {
                    j++;
                } else if (input[i] + input[j] + input[k] > 0) {
                    k--;
                } else {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(input[i]);
                    triplet.add(input[j]);
                    triplet.add(input[k]);

                    result.add(triplet);

                    j++;
                    k--;
                }
            }
        }
        System.out.println(result);
    }
}
