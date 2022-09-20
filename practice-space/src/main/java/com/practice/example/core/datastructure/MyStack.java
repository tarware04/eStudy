package com.practice.example.core.datastructure;

public class MyStack {
    StackNode top;
    int count;

    class StackNode {
        StackNode next;
        int data;

        StackNode(int data) {
            this.data = data;
        }
    }

    public int pop() throws Exception {
        if (top == null) throw new Exception("Empty stack");
        int data = top.data;
        top = top.next;
        count++;
        return data;
    }

    public void push(int data) {
        StackNode node = new StackNode(data);
        node.next = top;
        top = node;
    }

    public int peek() {
        count++;
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int getMinCountRequired(){
        return count;
    }
}
