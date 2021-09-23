package com.mohsinkd786.basics;

interface Operation {
    //int id=10;
    void execute(int i,int j);

    default void tryMe(){
        System.out.println("Operation ");
    }
}


// before Java 8
// interface was only abstract

// can have static methods
// can have default methods
