package com.intellijide.binarysearchtree;

public class BinarySearchMain {
    public static void main(String[] args) {
        BinarySearchTree binarySearch = new BinarySearchTree();
        MyNode root = null;
        root = binarySearch.insert(root,56);
        root = binarySearch.insert(root,30);
        root = binarySearch.insert(root,70);
        root = binarySearch.insert(root,22);
        root = binarySearch.insert(root,40);
        root = binarySearch.insert(root,60);
        root = binarySearch.insert(root,95);
        root = binarySearch.insert(root,11);
        root = binarySearch.insert(root,3);
        root = binarySearch.insert(root,16);
        root = binarySearch.insert(root,65);
        root = binarySearch.insert(root,63);
        root = binarySearch.insert(root,67);

        binarySearch.printInorder(root);
        System.out.println(root);
        System.out.println(binarySearch.search(root,63));
    }
}
