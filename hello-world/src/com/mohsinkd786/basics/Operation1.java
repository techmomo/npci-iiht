package com.mohsinkd786.basics;

public interface Operation1 {
    void execute(int x,int y);

    // concrete method
    default void tryMe(){
        System.out.println("Operation 1");
    }
}
