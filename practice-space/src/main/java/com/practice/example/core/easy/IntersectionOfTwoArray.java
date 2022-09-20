package com.practice.example.core.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {

        int[] nums1 = {0, 1, 2, 2, 1};
        int[] nums2 = {0, 2, 2};
        int result[] = getCommonElements(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }

    private static int[] getCommonElements(int[] nums1, int[] nums2) {

        Map<Integer, Integer> myMap = new HashMap();

        for (int num: nums1){
            myMap.put(num, myMap.getOrDefault(num, 0) + 1);
        }

        int k = 0;
        for (int num: nums2){
            int cnt = myMap.getOrDefault(num, 0);
            if(cnt > 0){
                nums1[k++] = num;
                //myMap.put(num, cnt-1);
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);
    }

   /* private static int[] getCommonElements(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0, k = 0;

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] < nums2[j]) {
                ++i;
            } else if (nums1[i] > nums2[j]) {
                ++j;
            } else {
                nums1[k++] = nums1[i++];
                ++j;
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);
    }*/
}
