package com.practice.example.core;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidateParentheses {

    public static void main(String[] args) {

        Map parenthesesMap = new HashMap();
        parenthesesMap.put('(', ')');
        parenthesesMap.put('{', '}');
        parenthesesMap.put('[', ']');

        String input = "()";

        boolean result = isValidateParenthesesString(input, parenthesesMap);

    }

    private static boolean isValidateParenthesesString(String input, Map parenthesesMap) {

        if (input.length() < 1) {
            return false;
        }

        if (input.length() % 2 != 0) {
            return false;
        }

        //()[]{}
        char[] c1 = input.toCharArray();
        Stack stack = new Stack();

        for (int i = 0; i < c1.length; i++) {
            if(c1[i]==')' || c1[i]=='}' || c1[i]==']' ){
                char openingBracket = (char) stack.pop();
                char closingBracket = (char) parenthesesMap.get(openingBracket);
                if(c1[i] != closingBracket){
                    return false;
                }
            }else {
                stack.push(input.charAt(i));
            }
        }

        return true;
    }
}
