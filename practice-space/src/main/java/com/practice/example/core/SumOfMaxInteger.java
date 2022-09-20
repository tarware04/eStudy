package com.practice.example.core;

import java.util.Arrays;

/**
 * Given an integer array nums, find the contiguous subarray
 * (containing at least one number) which has the largest sum and return its sum.
 */
public class SumOfMaxInteger {
    public static void main(String[] args) {
        System.out.println(getSumOfMaximumInteger());
    }

    private static Integer getSumOfMaximumInteger() {
        Integer[] arr =  new Integer[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}; //{20, 11, 3, 8, 7, 9};
        int current = arr[0];
        int max = arr[0];
        Integer[] desiredArr = new Integer[arr.length];
        for (int i = 1; i < arr.length; i++) {
            current = current + arr[i];
            if(max < arr[i]){
                max = arr[i];
                desiredArr[i]=arr[i];
            }
            max = Math.max(max, current);
        }
        System.out.println(desiredArr);
        return max;
        /*Arrays.sort(arr);
        int lastIndex = arr.length-1;
        int lastSecondIndex= lastIndex -1;
        return arr[lastIndex] + arr[lastSecondIndex];*/
    }
}
