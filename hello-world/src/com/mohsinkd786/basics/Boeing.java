package com.mohsinkd786.basics;

import com.mohsinkd786.designpattern.behavioral.Book;

public class Boeing extends Plane {

    Boeing(int id){
        // call parent class constructor
        super(id);
        System.out.println("Boeing...");

        // super to access parent class attributes
        // this to access parent class attributes
    }
    @Override
    int calculateWidth(int x, int y) {
        return x + y;
    }

    // over riding
    @Override
    void sayHello() {
        Book book = new Book(100,"");

       System.out.println("sayHello Boeing");
    }
}


// packages - folder structure to arrange our code base

//class A {
//    void add(){
//
//    }
//}
//
//class B extends A {
//    void add(){
//
//    }
//}
//
//class C extends B {
//    void sub(){
//
//    }
//}


// C cc = new C();
// cc.add(); - from A & from B


// A aa = new C(); = aa.add();

// B bb = new C();
