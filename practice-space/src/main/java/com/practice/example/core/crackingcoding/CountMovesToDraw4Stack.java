package com.practice.example.core.crackingcoding;

import com.practice.example.core.datastructure.MyStack;

/**
 * Get the highest element on top of stack.
 */
public class CountMovesToDraw4Stack {

    public static void main(String[] args) throws Exception {
        int[] arr = {2, 5, 1, 3, 9, 8};
        MyStack stack = new MyStack();

        for (int i = 1; i < arr.length; i++) {
            stack.push(arr[i]);
        }

        while (!stack.isEmpty()) {
            int current = stack.pop();
            if(current < stack.peek()){

                stack.push(current);
            }
        }
    }
}
