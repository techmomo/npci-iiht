package com.mohsinkd786.dsalgo;

public class Stack {
    private int arr[];
    private int top;
    private int capacity;

    Stack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;

        // stack values for top
        // top = -1 when empty stack
        // 0 when one value
        // N-1 when stack is full
        // N  overflow
    }

    public void push(int i){
        if (!isFull()){
            arr[++top] = i;
        }
    }

    public int pop(){
        if(isEmpty()){
            System.exit(1);
        }
        return arr[top--];
    }


    public int size(){
        return top + 1;
    }

    public void printStack(){
        for (int i = 0; i < top; i++) {
            System.out.println(arr[i]);
        }
    }
    // check if empty
    public boolean isEmpty(){
        return top == -1;
    }
    // check if full
    public boolean isFull(){
        return top == capacity - 1;
    }
}
