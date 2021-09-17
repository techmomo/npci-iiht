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
*
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
*
*
*
* */



