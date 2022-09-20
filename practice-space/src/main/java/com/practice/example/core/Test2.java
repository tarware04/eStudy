package com.practice.example.core;

import java.util.*;
import java.util.stream.Collectors;

public class Test2 {

    public static void main(String[] args) {
        int[] Arr =  {1, 3, 2, 1, 2, 1, 5, 3, 3, 4, 2};
        System.out.println(solution(Arr));
    }

    public static int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);

        int sum = 0;
        int last = A[A.length - 1];

        TreeSet h1 = new TreeSet();
        HashSet h2 = new HashSet();
        for (int i = 0; i < A.length; i++) {
            if (!h1.add(A[i])) {
                h2.add(A[i]);
            }
        }
        int lenghtOfWall;
        if( h1.size()%2 == 0){
            lenghtOfWall = h2.size();
        }else {
            lenghtOfWall = h1.size() - 1;
        }

        sum = last + lenghtOfWall;
        return sum;
    }
}
