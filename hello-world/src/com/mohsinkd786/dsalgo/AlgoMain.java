package com.mohsinkd786.dsalgo;

import java.util.Arrays;

public class AlgoMain {
    public static void main(String[] args) {

        int[] data = {10,8,22,0,-1};

        // sort
        //BubbleSort.sort(data);
        //System.out.println(Arrays.toString(data));

//        MergeSort.sort(data,0,data.length -1);


        QuickSort.quickSort(data,0,data.length - 1);
        System.out.println(Arrays.toString(data));

    }
}
