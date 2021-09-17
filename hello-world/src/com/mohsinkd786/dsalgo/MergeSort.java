package com.mohsinkd786.dsalgo;

public class MergeSort {

    static void sort(int arr[],int l , int r){
        if(l < r){

            // locate the middle point
            int m = (l + r) / 2;
            sort(arr,l,m); // left sub array
            sort(arr,m+ 1, r); // right sub array

            // merge the sorted arrays
            merge(arr,l,m,r);
        }
    }
    // L <- A[p..q] and M <- A[q+1..r]
    static void merge(int arr[], int p,int q, int r){

        int n1 = q - p + 1;
        int n2 = r - q;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i=0;i<n1 ;i++){
            L[i] = arr[p+ i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = arr[q+1 +i];
        }

        //maintain the correct index
        int i, j,k;
        i=0;
        j=0;
        k=p;

        while(i<n1 && j< n2){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        // in case we run out of elements in L & R
        while(i< n1){
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j< n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
