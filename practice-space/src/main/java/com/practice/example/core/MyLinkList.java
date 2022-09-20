package com.practice.example.core;

import java.util.LinkedList;
import java.util.List;

public class MyLinkList {

    public static void main(String[] args) {
        LinkedList linkedList1 = new LinkedList();
        linkedList1.add("hi");
        linkedList1.add("Bonjour");
        linkedList1.add("Namaste");
        linkedList1.add("Ola");
        linkedList1.add("Liberate");

        LinkedList linkedList2 = (LinkedList) linkedList1.clone();

        System.out.println(linkedList2);

    }
}
