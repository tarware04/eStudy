package com.practice.example.core.easy;

public class ContiguousSubarray {

    public static void main(String[] args) {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int maxSumArray = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int currentSubarray = 0;
            for (int j = i; j < nums.length; j++) {
                currentSubarray = currentSubarray + nums[j];
                maxSumArray = Math.max(maxSumArray, currentSubarray);
            }
        }
        return maxSumArray;
    }
}
