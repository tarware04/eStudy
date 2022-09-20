package com.practice.example.core;

import java.util.HashMap;
import java.util.Map;

public class LeetcodeTwoSum {

    public static void main(String[] args) {
        int[] result = twoSum(new int[]{3,2,4}, 6);
        System.out.println(result[0] +","+ result[1]);
    }

    private static int[] twoSum(int[] nums, int target) {
        // [8, 2, 7, 11, 15] // target = 9
        Map<Integer, Integer> twoSum = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {

            if (twoSum.containsValue(target - nums[i])) {
                result[0] = twoSum.get(target - nums[i]);
                result[1] = i;
                return result;
            }
            twoSum.put(nums[i], i);
        }
        return result;
    }
}

