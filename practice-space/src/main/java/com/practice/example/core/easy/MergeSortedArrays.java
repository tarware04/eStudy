package com.practice.example.core.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * You are given two integer arrays nums1 and nums2, sorted in
 * non-decreasing order, and two integers m and n, representing
 * the number of elements in nums1 and nums2 respectively.
 * <p>
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * <p>
 * The final sorted array should not be returned by the function,
 * but instead be stored inside the array nums1. To accommodate this,
 * nums1 has a length of m + n, where the first m elements denote the
 * elements that should be merged, and the last n elements are set to 0
 * and should be ignored. nums2 has a length of n.
 */
public class MergeSortedArrays {

    public static void main(String[] args) {
        int[] num1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] num2 = new int[]{2, 5, 6};
        int m = 3, n=3;
        int[] result = mergeSortedArrays(num1, m,  num2, n);
        System.out.println(Arrays.toString(result));
    }

    private static int[] mergeSortedArrays(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        Arrays.sort(nums1);

        return  nums1;
        /*int size = num1.length + num2.length;
        int[] result = new int[size - 1];
        int k = 0;
        for (int i = 0; i < num1.length; i++) {
            int num = 0;
            for (int j = i; j < num2.length; j++) {
                if (num1[i] < num2[j]) {
                    result[j] = num1[i];
                    num = num1[j];
                    num1[j] = num;
                } else {
                    num = num1[j];
                    result[j] = num2[j];
                    result[j + 1] = num;
                }
            }
        }
        return result;*/
    }
}
