package com.practice.example.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collector;

public class Search {
    public static void main(String[] args) {
        Integer[] arr = {2,43,6,80,100, 40};
        Integer target = 6;
        System.out.println(exponentialSearch(arr, target));
        System.out.println("---------");
        System.out.println(
                //Collections.binarySearch(
                // Arrays.stream(arr).collect(Collector.toList(), target, Collections.reverseOrder())
                );
    }

    private static int exponentialSearch(Integer[] arr, int target) {

        // If x is present at first location itself
        if (arr[0] == target)
            return 0;

        // Find range for binary search by
        // repeated doubling
        int i = 1;
        while (i < arr.length && arr[i] <= target)
            i = i*2;

        // Call binary search for the found range.
        return Arrays.binarySearch(arr, i/2,
                Math.min(i, arr.length-1), target);

    }
}
