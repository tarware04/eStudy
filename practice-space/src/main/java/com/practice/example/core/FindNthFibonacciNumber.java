package com.practice.example.core;

public class FindNthFibonacciNumber {
    public static void main(String[] args) {
        //print nth number
        /*System.out.println(5);*/

        // print all series
        /*int n=5;
        for (int i = 0; i < n; i++) {
            System.out.println(i + ": " + fib(i));
        }*/

        // better runtime when storing in an array
        int n = 5;
        int[] arr = new int[n + 1];

        for (int i = 0; i < n; i++)
            System.out.println(i + ":" + fib1(i, arr));

    }

    private static int fib1(int n, int[] arr) {
        if (n <= 0) return 0;
        else if (n == 1) return 1;
        else if (arr[n] > 0) return arr[n];
        else {
            arr[n] = fib1(n - 1, arr) + fib1(n - 2, arr);
            return arr[n];
        }
    }

    public static int fib(int n) {
        if (n <= 0) return 0;
        else if (n == 1) return 1;
        else if (n == 1) return 1;
        int output = fib(n - 1) + fib(n - 2);
        return output;
    }
}
