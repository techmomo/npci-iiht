package com.mohsinkd786.dsalgo;

public class QuickSort {

    static int divide(int arr[], int low, int high){

        // select the pivot element
        int pivot = arr[high];
        int i = low - 1;

        // traverse via the array
        // compare with pivot
        for(int j=low;i< high;j++){
            if(arr[j] <= pivot){
                //
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // swap the pivot with greater element
        int temp = arr[i+1];
        arr[i+ 1] = arr[high];
        arr[high] = temp;

        // return the division position
        return (i+1);
    }

    static void quickSort(int arr[],int low,int high){
        if(low < high){

            // find the pivot element
            int pivot = divide(arr,low,high);

            // perform the sort - left side of pivot
            quickSort(arr,low, pivot - 1);

            // perform the sort - right side of pivot
            quickSort(arr,pivot + 1,high);
        }
    }
}
