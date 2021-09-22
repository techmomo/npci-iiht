package com.mohsinkd786.basics;

public class Sample {

    int i;

    Sample(int k){
        i = k;
    }
    void callMe(){
        int a = 1;
        System.out.println("I is "+i);
    }

    void tryMe(){
        // i

        int b = 2;
        callMe();

        if(i > 10){
            // b
            int abc = 12;
            // do something
        }
    }
}
