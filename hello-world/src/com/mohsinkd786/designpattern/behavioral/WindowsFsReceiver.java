package com.mohsinkd786.designpattern.behavioral;

public class WindowsFsReceiver implements FsReceiver {
    @Override
    public void open() {
        System.out.println("Windows : Open File");
    }

    @Override
    public void write() {
        System.out.println("Windows : Write File");
    }

    @Override
    public void close() {
        System.out.println("Windows : Close File");
    }
}

