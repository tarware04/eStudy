package com.practice.example.core.crackingcoding;

import java.util.*;

public class LinkedListCURD {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 4, 2};
        LinkedList<Integer> mylist = new LinkedList();
        for (int a : arr) {
            mylist.add(a);
        }
        HashSet result = removeDuplicate4m(mylist);
        System.out.println(result);

        int k = 4;
        int resultIndex = findKthElement(mylist, k);
        System.out.println(resultIndex);
    }

    private static int findKthElement(LinkedList<Integer> mylist, int k) {

        for (int i = 0; i < mylist.size(); i++) {
            recursiveSearch(mylist, i, k);
        }
        return k;
    }

    private static int recursiveSearch(LinkedList<Integer> mylist, int i, int k) {
        if (mylist.get(i) == k) return i;

        return i;
    }

    private static HashSet removeDuplicate4m(LinkedList<Integer> mylist) {
        HashSet h = new HashSet();
        HashSet result = new HashSet();

        for (int i = 0; i < mylist.size(); i++) {
            if (!h.add(mylist.get(i))) {
                result.add(mylist.get(i));
            }
        }
        return result;
    }


}
