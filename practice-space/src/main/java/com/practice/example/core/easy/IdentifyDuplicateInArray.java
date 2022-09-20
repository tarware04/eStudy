package com.practice.example.core.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array nums, return true if any value
 * appears at least twice in the array, and return false
 * if every element is distinct.
 */
public class IdentifyDuplicateInArray {

    public static void main(String[] args) {
        int[] nums = new int[]{0, 4, 5, 0, 3, 6};
        // int[] nums = new int[]{1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set set = new HashSet<>();
        boolean result = false;
        for (int i = 0; i < nums.length; i++) {
            if (set.add(nums[i])) {
                result = false;
            } else {
                result = true;
                return result;
            }
        }
        return result;
    }
}
