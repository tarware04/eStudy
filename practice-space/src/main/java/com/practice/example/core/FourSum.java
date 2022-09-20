package com.practice.example.core;

import java.util.*;

/**
 * Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target?
 * <p>
 * Find all unique quadruplets in the array which gives the sum of target.
 * <p>
 * Note:
 * Elements in a quadruplet (a,b,c,d) must be in non-descending order. (ie, a ≤ b ≤ c ≤ d)
 * The solution set must not contain duplicate quadruplets.
 * <p>
 * k-sum problem
 */
public class FourSum {
    public static void main(String[] args) {

        List<List<Integer>> result = new ArrayList<>();

        Integer[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;

        if (nums == null || nums.length < 4)
            System.out.println(result);

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            if (i != 0 && nums[i] == nums[i - 1])
                continue;

            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j != i + 1 && nums[j] == nums[j - 1])
                    continue;
                int k = j + 1;
                int l = nums.length - 1;

                while (k < l) {
                    if (nums[i] + nums[j] + nums[k] + nums[l] < target) {
                        k++;
                    } else if (nums[i] + nums[j] + nums[k] + nums[l] > target) {
                        l--;
                    } else {
                        List<Integer> t = new ArrayList<Integer>();
                        t.add(nums[i]);
                        t.add(nums[j]);
                        t.add(nums[k]);
                        t.add(nums[l]);
                        result.add(t);

                        k++;
                        l--;

                        while (k < l && nums[l] == nums[l + 1]) {
                            l--;
                        }
                        while (k < l && nums[k] == nums[k - 1]) {
                            k++;
                        }
                    }
                }
            }

        }

        System.out.println(result);

        //System.out.println(forSumByHashSet(nums, target));
    }

    public static List<List<HashSet>> forSumByHashSet(Integer[] input, int target) {
        List<List<HashSet>> result = new ArrayList<>();

        Arrays.sort(input);
        Map<Integer, List<HashSet>> map = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            List<HashSet> listSet = new ArrayList<>();

            for (int j = 0; j < input.length; j++) {

                int k = j + 1;
                int l = input.length - 1;

                while (k < l) {
                    if (map.containsKey(target - input[i])) {
                        HashSet set = new HashSet();
                        set.add(input[i]);
                        set.add(input[i + 1]);
                        set.add(input[i + 2]);
                        set.add(input[i + 3]);

                        listSet.add(set);
                        result.add(listSet);
                    }
                    HashSet set1 = new HashSet();
                    set1.add(input[i]);
                    set1.add(input[i + 1]);
                    set1.add(input[i + 2]);
                    set1.add(input[i + 3]);
                    listSet.add(set1);

                    map.put(input[i], listSet);
                }
            }
        }
        return result;
    }
}
