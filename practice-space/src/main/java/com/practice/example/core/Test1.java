package com.practice.example.core;

import java.util.HashMap;

public class Test1 {

    public static void main(String[] args) {
        int A[] = {1,2,5,9,9};
        System.out.println(solution(A, 9));
    }

    static int solution(int[] A, int X) {
        int N = A.length - 1;
        if (N == 0) {
            return -1;
        }
        HashMap map = new HashMap();
        for (int i=0; i<A.length; i++){
            map.put(A[i], i);
        }
        Integer position = (Integer) map.get(X);
        return position;
    }
}
