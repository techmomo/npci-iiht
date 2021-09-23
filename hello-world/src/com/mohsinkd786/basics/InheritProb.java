package com.mohsinkd786.basics;

public class InheritProb {
    public static void main(String[] args) {

        C cc = new C();
        cc.sub();
        System.out.println("Inherit ....");
        cc.add();
    }
}


class A {
    void add(){
        System.out.println("A");
    }
}

class B extends A {
    void add(){
        super.add();
        //System.out.println("B");
    }
}

class C extends B {
    void sub(){
        add();
    }
}
