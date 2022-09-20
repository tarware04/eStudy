package com.practice.example.core;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] input = {2, 4, 7, 10, 14};
        int target = 17;

        int result[] = {};
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < input.length; i++) {
            if (map.containsKey(target - input[i])) {
                result = new int[]{map.get(target - input[i]), i};
            }
            map.put(input[i], i);
        }
        System.out.println(result[0] + "," + result[1]);
    }
}
