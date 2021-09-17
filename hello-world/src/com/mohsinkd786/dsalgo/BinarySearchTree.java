package com.mohsinkd786.dsalgo;

public class BinarySearchTree {

    Node root;
    class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data = data;
        }
    }

    BinarySearchTree(){
        root = null;
    }

    public void insert(int data){
        root = add(root,data);
    }

    public Node add(Node root,int data){
        if(root == null){
            root = new Node(data);
            return root;
        }
        // traverse via the nodes to reach the correct place
        if(data < root.data){
            root.left = add(root.left,data);
        }else if(data > root.data){
            root.right = add(root.right,data);
        }
        return root;
    }
    void inorder(){
        inorderTraversal(root);
    }

    void inorderTraversal(Node root){
        if(root !=null){
            inorderTraversal(root.left);
            System.out.println(root.data +"->");
            inorderTraversal(root.right);
        }
    }

    void delete(int data){
        root = remove(root,data);
    }
    Node remove(Node rootNode,int data){
        if(rootNode == null){
            return rootNode;
        }
        // Locate the Node entitled for deletion
        if(data < rootNode.data){
            rootNode.left = remove(rootNode.left,data);
        }else if(data > rootNode.data){
            rootNode.right = remove(rootNode.right,data);
        }else{
            // in case of no children or only 1 children
            if(rootNode.left == null){
                return rootNode.right;
            }else if(rootNode.right == null){
                return rootNode.left;
            }
            // in case the node has 2 children

            rootNode.data = minValue(root.right);
            // delete
            rootNode.right = remove(rootNode.right,rootNode.data);
        }
        return rootNode;
    }

    int minValue(Node root){
        int minV = root.data;
        while(root.left !=null){
            minV = root.left.data;
            root = root.left;
        }
        return minV;
    }
}
