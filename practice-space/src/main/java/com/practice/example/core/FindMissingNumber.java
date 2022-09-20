package com.practice.example.core;

import java.util.Arrays;

public class FindMissingNumber {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{0, 1, 1, 2, 5}));
    }
    public static int solution(int[] A) {
        Arrays.sort(A);
        int i;
        for (i = 0; i < A.length; i++) { // -1, -3 // 0, 1, 1, 2, 5
            if (A[i] > 0
                    && A[i] < A.length
                    && A[i] != A[A[i] - 1]) {
                int index = A[i] - 1;
                int tmp = A[i];
                A[index] = A[index];
                A[index] = tmp;
            } else {
                ++i;
            }
        }

        for (i = 0; i < A.length; i++) { // -1, -3
            if (A[i] - 1 != i)
                return i + 1;
        }
        return A.length + 1;
    }
}
