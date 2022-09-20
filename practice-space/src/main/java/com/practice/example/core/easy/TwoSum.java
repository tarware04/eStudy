package com.practice.example.core.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 4};
        int target = 6;
        System.out.println(Arrays.toString(findTargetSumInArray(nums, target)));
    }

    private static int[] findTargetSumInArray(int[] nums, int target) {
        Map<Integer, Integer> myMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int r = target - nums[i];
            if (myMap.containsKey(r)) {
                return new int[]{myMap.get(r), i};
            }
            myMap.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
