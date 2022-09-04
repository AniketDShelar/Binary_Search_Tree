package com.intellijide.binarysearchtree;

public class BinarySearchMain {
    public static void main(String[] args) {
        BinarySearchTree binarySearch = new BinarySearchTree();
        MyNode root = null;
        root = binarySearch.insert(root,56);
        root = binarySearch.insert(root,30);
        root = binarySearch.insert(root,70);

        binarySearch.printInorder(root);
        System.out.println(root);
    }
}
