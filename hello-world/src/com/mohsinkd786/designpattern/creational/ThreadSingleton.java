package com.mohsinkd786.designpattern.creational;

public class ThreadSingleton {
    private static ThreadSingleton singleton;
    private ThreadSingleton(){

    }
    public static synchronized ThreadSingleton getInstance(){
        if(singleton == null){
            singleton = new ThreadSingleton();
        }
        return singleton;
    }
}


// t1, t2
