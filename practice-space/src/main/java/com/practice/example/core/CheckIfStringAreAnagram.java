package com.practice.example.core;

import java.util.Arrays;

public class CheckIfStringAreAnagram {

    /*public static void main(String[] args) {

        String input = "ABCD";
        String input1 = "DABC";

        boolean result = isAnagram(input, input1);

        System.out.println(result);
    }*/

    public boolean isAnagram(String input, String input1) {

        char[] c1 = input.toCharArray();
        char[] c2 = input1.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);

    }
}
