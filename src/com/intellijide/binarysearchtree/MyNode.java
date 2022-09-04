package com.intellijide.binarysearchtree;

class MyNode {
    int data;
    MyNode left;
    MyNode right;

    public MyNode(int data) {
        this.data = data;
        MyNode left = null;
        MyNode right = null;
    }

    @Override
    public String toString() {
        return "MyNode [data=" + data + ", left=" + left + ", right=" + right + "]";
    }

}