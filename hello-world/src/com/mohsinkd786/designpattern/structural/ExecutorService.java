package com.mohsinkd786.designpattern.structural;

public class ExecutorService  implements Executor {
    @Override
    public void run(String msg) {
        System.out.println("Executor Service..");
    }
}
