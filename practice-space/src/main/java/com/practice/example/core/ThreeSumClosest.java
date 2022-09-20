package com.practice.example.core;

import java.util.Arrays;

/**
 * Sum of three elements in a given array is equal to the closest value of target.
 * input: {2, 4, 7, 10, 14}
 * closest target: 17
 */
public class ThreeSumClosest {

    public static void main(String[] args) {
        int[] input = {2, 4, 7, 10, 14};
        int closestTarget = 17;

        int min = Integer.MAX_VALUE;;
        int result = 0;
        Arrays.sort(input);

        for (int i = 0; i < input.length; i++) {
            int j = i + 1;
            int k = input.length - 1;
            while (j < k) {
                int sum = input[i] + input[j] + input[k];
                int diff = Math.abs(sum - closestTarget);

                if (diff == 0) System.out.println(sum);

                if (diff < min) {
                    min = diff;
                    result = sum;
                }

                if (sum <= closestTarget){
                    j++;
                }else{
                    k--;
                }
            }
        }
        System.out.println(min +","+ result);
    }
}
