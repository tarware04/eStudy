package com.practice.example.core;

import java.util.Arrays;

public class BinarySum {

    public static void main(String[] args) {
        int A[] = new int[]{1, 1, 0, 1, 0, 0};
        int B[] = new int[]{1, 0, 0, 1, 1};

        int C[] = sumOfBinaryNumbers(A, B);
        System.out.println(Arrays.toString(C));
    }

    private static int[] sumOfBinaryNumbers(int[] A, int[] B) {

        int n = Math.max(A.length, B.length);
        int C[] = new int[n+1];
        int carry = 0;

        for (int i = 0; i < n; i++) {

            int a = i< A.length ? A[i] : 0;
            int b = i< B.length ? B[i] : 0;

            C[i] = (a + b + carry) % 2;
            carry = (a + b + carry) / 2;
        }
        C[n] = carry;
        return C;
    }
}
