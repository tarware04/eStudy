package com.practice.example.core;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int arr[] = new int[]{3, 41, 52, 26, 38, 57, 9, 49};
        int first = 0;
        int last = arr.length - 1;

        int result[] = doRecursiveSort(arr, first, last);
        System.out.println(Arrays.toString(result));
    }

    private static int[] doRecursiveSort(int[] arr, int first, int last) {
        if (arr[first] < arr[last]) {
            int mid = (first + last) / 2;
            doRecursiveSort(arr, first, mid);
            doRecursiveSort(arr, mid + 1, last);
            return merge(arr, first, mid, last);
        }
        return null;
    }

    private static int[] merge(int[] arr, int first, int mid, int last) {
        int n1 = mid - first + 1;
        int n2 = last - mid;
        int L[] = new int[n1 + 1];
        int R[] = new int[n2 + 1];

        for (int i = 1; i < n1; i++) {
            L[i] = arr[first + i - 1];
        }

        for (int j = 1; j < n2; j++) {
            R[j] = arr[mid + j];
        }
        int i = 1;
        int j = 1;

        for (int k = first; k < last; k++) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
        }
        return arr;
    }
}
