package com.mohsinkd786.designpattern.behavioral;

public class UnixFsReceiver implements FsReceiver {

    @Override
    public void open() {
        System.out.println("Unix : Open File");
    }

    @Override
    public void write() {
        System.out.println("Unix : Write File");
    }

    @Override
    public void close() {
        System.out.println("Unix : Close File");
    }
}
