package com.practice.example.core.crackingcoding;

import java.util.HashSet;
import java.util.Set;

public class IdentifyIfStringHasUniqueChar {

    public static void main(String[] args) {
        String input = "abcda";
        System.out.println(isStringHasUniqueChar(input));
    }

    private static boolean isStringHasUniqueChar(String input) {
        char[] in = input.toCharArray();
        Set<Character> myset = new HashSet<>();
        for (char c : in) {
            if(!myset.add(c)){
               return false;
            }
        }
        return true;
    }
}
