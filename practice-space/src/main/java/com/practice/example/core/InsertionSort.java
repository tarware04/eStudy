package com.practice.example.core;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int ary[] = new int[]{70, 59, 31, 41, 59, 0, 26, 41, 90, 58, 70};
        int result1[] = getNonDecreasingOrder(ary);
        System.out.println(Arrays.toString(result1));

        int result2[] = getNonIncreasingOrder(ary);
        System.out.println(Arrays.toString(result2));
    }

    private static int[] getNonIncreasingOrder(int[] ary) {

        for(int i=0; i<ary.length; i++){
            for(int j=i; j<ary.length; j++){
                int key = ary[j];
                if(ary[i] < ary[j]) {
                    ary[j] = ary[i];
                    ary[i] = key;
                }
            }
        }
        return ary;
    }

    private static int[] getNonDecreasingOrder(int[] ary) {

        for (int i = 0; i < ary.length; i++) {
            for (int j = i + 1; j < ary.length; j++) {
                int key = ary[j];
                if (ary[i] > ary[j]) {
                    ary[j] = ary[i];
                    ary[i] = key;
                }
            }
        }
        return ary;
    }
}
