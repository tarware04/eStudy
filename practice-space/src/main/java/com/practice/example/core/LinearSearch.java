package com.practice.example.core;

public class LinearSearch {

    public static void main(String[] args) {
        int ary[] = new int[]{70, 59, 31, 41, 59, 0, 26, 41, 90, 58, 70};
        int searchKey = 90;

        int result = searchMyKey(ary, searchKey);
        System.out.println(result);
    }

    private static int searchMyKey(int[] ary, int searchKey) {

        for(int i=0; i< ary.length ; i++) {

            if(ary[i] == searchKey) {
                return i;
            }
        }
        return -1;
    }
}
