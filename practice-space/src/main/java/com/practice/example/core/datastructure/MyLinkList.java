package com.practice.example.core.datastructure;

public class MyLinkList {

    Node root;

    MyLinkList() {
        this.root = new Node();
    }

    public void add(int data) {
        this.root.appendToTheTail(data);
    }

    public Node delete(int data) {
        return root.deleteANode(this.root, data);
    }

    private class Node {
        Node nextNode = null;
        int data;
        Node() { }
        Node(int data) {            this.data = data;        }
        void appendToTheTail(int data) {
            Node newNode = new Node(data);
            Node myNode = this;
            while (myNode.nextNode != null) {
                continue;
            }
            myNode.nextNode = newNode;
        }
        Node deleteANode(Node root, int data) {
            Node n = root;
            if (root.data == data) {
                return root.nextNode;
            }

            while (n.nextNode != null) {
                if (n.data == data) {
                    n.nextNode = n.nextNode.nextNode;
                    return root;
                }
                n = n.nextNode;
            }
            return root;
        }
    }
}
