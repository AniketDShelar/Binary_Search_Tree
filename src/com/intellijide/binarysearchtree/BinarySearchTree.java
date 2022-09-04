package com.intellijide.binarysearchtree;

public class BinarySearchTree {
    public MyNode insert(MyNode node,int data) {
        if (node == null) {
            node = createNewNode(data);
        }
        if(data < node.data) {
            node.left = insert(node.left, data);
        }else if(data > node.data) {
            node.right = insert(node.right, data);
        }
        return node;
    }
    public MyNode createNewNode(int data) {
        MyNode mynode = new MyNode(data);
        return mynode;
    }
    public void printInorder(MyNode node) {
        if(node == null) {
            return;
        }
        printInorder(node.left);
        System.out.print(node.data + "->");
        printInorder(node.right);
    }
}