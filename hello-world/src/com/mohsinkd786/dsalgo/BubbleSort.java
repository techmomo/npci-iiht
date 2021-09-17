package com.mohsinkd786.dsalgo;

public class BubbleSort {
    static void sort(int items[]){
        int size = items.length;

        // traverse via all the elements in the array
        for(int i=0;i<(size -1);i++){

            boolean swapped = false;

            // compare with the adjacent element
            for(int j=0;j<(size - i -1);j++){
                if(items[j] > items[j+1]){

                    // swapping
                    int temp = items[j];
                    items[j] = items[j+1];
                    items[j+1] = temp;

                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
