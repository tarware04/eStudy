package com.practice.example.core.crackingcoding;

import java.util.*;

public class CheckPermutation {

    public static void main(String[] args) {
        String one1 = "abc";
        String two2 = "acb";
        System.out.println(checkIfStringsAreIdentical(one1, two2));

        String one = "abbc";
        String two = "cbabadcbbabbcbabaabccbabc";

        // Implement sliding window of 4 character
        int result = findNumberOfPermutationOfStringOneInStringTwo(one, two);

        System.out.println(result);
    }

    static int findNumberOfPermutationOfStringOneInStringTwo(String s1, String s2) {
        int result = 0;
        int to = s1.length();

        char[] s1Char = s1.toCharArray();
        Arrays.sort(s1Char);
        for (int i = 0; i < s2.length(); i++) {

            if (i + to < s2.length()) {
                String comparable = s2.substring(i, i + to);
                char[] s2Char = comparable.toCharArray();

                Arrays.sort(s2Char);

                if (Arrays.equals(s1Char, s2Char)) {
                    ++result;
                }
            }
            i = i + s1.length();
        }
        return result;
    }

    private static boolean checkIfStringsAreIdentical(String one1, String two2) {
        char[] c1 = one1.toCharArray();
        char[] c2 = two2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if (Arrays.equals(c1, c2)) {
            return true;
        }
        return false;
    }

}
