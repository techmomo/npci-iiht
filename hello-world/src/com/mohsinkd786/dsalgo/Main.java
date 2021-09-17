package com.mohsinkd786.dsalgo;

public class Main {
    public static void main(String[] args) {


        // Our Custom Stack

        Stack stack = new Stack(3);
        stack.push(1);
        stack.push(3);
        stack.push(2);

        stack.printStack();
        // remove
        stack.pop();

        // Custom Queue

        Queue queue = new Queue(3);
        queue.enQueue(1);
        queue.enQueue(3);
        queue.enQueue(6);

        // remove
        queue.deQueue();

        queue.printQueue();


        // Linked List

        LinkedList linkedList = new LinkedList();
        linkedList.insertAtEnd(1);
        linkedList.insertAtFront(3);
        linkedList.insertAtFront(10);
        linkedList.insert(linkedList.head.next,9);

        linkedList.printList();


        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new Node(1);
        binaryTree.root.left = new Node(2);
        binaryTree.root.right = new Node(3);
        binaryTree.root.left.left = new Node(4);

        // traversals
        System.out.println("Pre Order Traversal");
        binaryTree.preOrder(binaryTree.root);

        System.out.println("In Order Traversal");
        binaryTree.inOrder(binaryTree.root);

        System.out.println("Post Order Traversal");
        binaryTree.postOrder(binaryTree.root);


        // Binary Search Tree
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(1);
        binarySearchTree.insert(3);
        binarySearchTree.insert(11);
        binarySearchTree.insert(14);
        binarySearchTree.insert(4);
        binarySearchTree.insert(5);

        System.out.println("Inorder Traversal");
        binarySearchTree.inorder();

        System.out.println("Deletion ");
        binarySearchTree.delete(14);

        System.out.println("Inorder Traversal");
        binarySearchTree.inorder();
    }
}



/*
* Data Structures:
*
*   1. Linear
*           a. Array
*           b. Stack
*           c. Queue
*           d. LinkedList
*   2. Non Linear
*           a. Graph
*           b. Tree
*
*
*
*   Operations in a Data Structure:
*
*   Asymptotic Notations:
*   1. Big O - Upper Bound - worst case complexity / performance
*           a. constant time - order of 1 = O(1)
*           b. linear time - order of n = O(n)
*           c. quadratic time - order of n times = O(n2)
*           d. log time - O(log n)
*           e. linear log time - O(n log n)
*
*   2. Theta - Middle / Average Bound - average
*   3. Omega - Lower Bound - best case
*
*
*   if(){
*
* }
* n = 2
* O(2)
* n = 100
* O(100)
* O(n)
* O(n) * O(m) = O(n * n)
*
* for(int i=0;i<n;i++){
*    for(int j =0;j<m ; j++){
*
*   }
* }
*
*   find(){
*
*       while(low <= high){
*
*           mid = (low + high) / 2
*           if(){
*               high = ?
*           }else if(){
*               low = ?
*           }
*           else{
*           break;
*           }
*       }
*   }
*
*   find(){
*       find();
*       find();
* }
*
*
* 1. Assignment : Write a Program that arranges the elements in an array in ascending order.
*
* 2. Assignment : Write a Program to identify the position of an element in an array.
*
*
* 3. Assignment : Write a Program to demonstrate Circular Queue
*
* 4. Assignment : Write a Program to transform the elements from a Stack to the Queue
*
*
*   calculateQueueElemPositions(int[] stack){
*       return newQueueArr;
* }
*
* calculateQueueElemPositions([6,12,2,15,17,3,9]);
*
*       e.g. Stack REAR[6,12,2,15,17,3,9] FRONT
* Identify the 2 smallest values & find their multiples
* 2 -> 6,12
* 3 -> 6,12,15,9
*
*       expected Queue REAR [ 6,12,6,12,15,9] FRONT
*
*           e.g. [1,4,5,9,10]
*           give me a position for 9
*           answer: 3
*
*            incase of duplicates :
*            CASE 1:
*                     e.g [1,5,5,8,9]
*           give me a position for 5
*           answer: 1 (first occurrence)
*
*          CASE 2:
*                    e.g [1,5,5,8,9]
 *           give me a position for 5
 *           answer: 1,2 (all the occurrences)
 *
*   5. Assignment : Write a Program to sort the elements in a Linkedlist & push them into a Queue (ASC / Desc),
*                   ensure optimal time complexity
*
*   Stack :
*
*   Push : Add a new element at the top - O(1)
*   Pop : Remove an element from the top - O(1)
*   Peek : Get the element from the top - O(1)
*   Search :
*
*
*
*   Queue:
*
*   Enqueue: Add a new element at the rear (TAIL) - O(1)
*   Dequeue: Remove an element at the front (HEAD) - O(1)
*
*
*
*   LinkedList:
*
*   combination of nodes : Node [ data , ref of next node]
*
*   Singly LinkedList:
*       Read : O(N)
*       Add/ Insertion : O(1)
*       Deletion: O(1)
*       Search: O(N)
*   Doubly LinkedList
*
*   Circular LinkedList
*
*
*  NO LINEAR DS:
*
*   Tree:
*
*   Node: [data, child nodes]
*
*   Edge : ref / link between the nodes
*   Root: parent node / topmost node
*
*
*
* BST :
*
* 1. All nodes of left subtree are less than the root node
* 2. All nodes of right subtree are more than the root node
* 3. Both subtrees follow the BST expectations.
*
*
* Read : O(n)
* Write: O(n)
* Delete: O(n)
*
*
*
* Algorithms :
*
*   Sorting :
*       1. Bubble Sort : [1,3,9,15,45] - O(n2)
*
*       2. Selection Sort
*       3. Insertion Sort
*       4. Merge Sort:  - O(n logn)
*               Divide & Conquer
*               [1,3,9,15,45]
*               a. Divide: in between 9
*                       [1,3] [9,15,45]
*               b. Conquer :
*                       Sort the sub arrays else go to step a.
*               c. Combine: Merge the sorted sub arrays
*
*       5. Heap Sort
*       6. Quick Sort : find the pivot element - compare all the elements with it, divide & conquer based on it - O(n2)
*       7. Bucket Sort
*   Searching:
*       1. Linear Search
*       2. Binary Search
* */





