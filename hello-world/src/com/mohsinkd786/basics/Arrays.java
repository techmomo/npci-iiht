package com.mohsinkd786.basics;

public class Arrays {
    private int arr[];
    public static void main(String[] args) {

        //int arr[] = new int[2];

        Arrays arrays = new Arrays(10);
        for(int i=0;i<arrays.arr.length;i++){
            arrays.arr[i] = i;
        }

        for(int i=0;i<arrays.arr.length;i++){
            System.out.println(arrays.arr[i]);
        }

        // default class Arrays in Java
        java.util.Arrays.sort(arrays.arr);

        //java.util.Arrays.toString(arrays.arr);


        // n dimentional array
        int tdarr[][] = new int[2][2];

        //int tdarr[][] = {{0},{1},{2},{3}};
        //int tdarr[][] = {0,1,2,3};


        // col 0    col1
    // row0 [0][0]   [0][1]
    // row1 [1][0]   [1][1]


        tdarr[0][0] = 1;
        tdarr[0][1] = 2;
        tdarr[1][0] = 3;
        tdarr[1][1] = 4;
        //tdarr[1][2] = 5;

        System.out.println("2 D Arrays");
        // foreach
        for(int[] nums : tdarr){
                for(int num : nums){
                    System.out.println(num);
                }
        }

    }

    public Arrays(int length){
        // declare the array with size
        arr = new int[length];
    }
}


// Assignment : Write a Program to construct a matrix based upon the size of 2 dimentional array
//             1  2  3
//             6  5  4
