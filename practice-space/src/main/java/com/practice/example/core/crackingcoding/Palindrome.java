package com.practice.example.core.crackingcoding;

public class Palindrome {
    public static void main(String[] args) {
        String string = "racecar";
        boolean result = isPalindrome(string);
        System.out.println(result);
    }

    private static boolean isPalindrome(String input) {

        StringBuffer stringBuffer = new StringBuffer(input);
        stringBuffer.reverse();

        return  stringBuffer.toString().equals(input);
    }
}
