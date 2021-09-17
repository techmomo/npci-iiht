package com.mohsinkd786.dsalgo;

import java.awt.*;

public class BinaryTree {

    Node root;

    BinaryTree(int data){
        root = new Node(data);
    }

    BinaryTree(){
        root = null;
    }

    public void inOrder(Node node){
        if(node !=null){
            inOrder(node.left);
            System.out.print(" "+node.data);
            inOrder(node.right);
        }
    }

    public void postOrder(Node node){
        if(node !=null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(" "+node.data);
        }
    }

    public void preOrder(Node node){
        if(node !=null){
            System.out.print(" "+ node.data);
            preOrder(node.left);
            preOrder(node.right);
        }
    }
}

class Node{
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}
