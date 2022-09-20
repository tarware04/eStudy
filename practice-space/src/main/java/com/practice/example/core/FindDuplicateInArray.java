package com.practice.example.core;

import java.util.HashSet;

public class FindDuplicateInArray {
    public static void main(String[] args) {
        int[] input = {2, 4, 7, 10, 14, 2, 7};

        HashSet h = new HashSet();
        HashSet result = new HashSet();

        for (int i = 0; i < input.length; i++) {
            if (!h.add(input[i])){
                result.add(input[i]);
            }
        }

        System.out.println(result);

    }
}
