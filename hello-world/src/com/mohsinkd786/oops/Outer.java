package com.mohsinkd786.oops;

public class Outer {

    private static int count = 0;

    // nested class
    static class StaticInner{
        void message(){
            count = 1;
            System.out.println("Static Inner - Message()..."+count);
        }
        static void sayHello(){
            System.out.println("Static Inner - sayHello()");
        }
    }

    // inner class
    class Inner{
        public void message(){
            count++;
            System.out.println("Inner - Message()..."+count);
        }
        // not allowed in inner classes
//        static void sayHello(){
//            System.out.println("Static Inner - Message()..."+count);
//        }
    }

    public void process(){
        final int counter = 11;

        // method local inner class

        class MethodLocal{
            void message(){
                System.out.println("Method Local "+counter);
            }
        }

        MethodLocal methodLocal = new MethodLocal();
        methodLocal.message();
    }

    public void helpMe(){

        StaticInner staticInner = new StaticInner();
        staticInner.message();

        //
        Inner inner = new Inner();
        inner.message();

    }
}

interface Service{
    void add();
    void process();
}

abstract class Sport{
    public int noOfParticipants;
    abstract void noOfParticipants();

    public void procurement(){
        System.out.println("Sports Method...");
    }
}

/*
* Inner classes :
* 1. Static Nested Class
* 2. Inner class
* 3. Local Inner class
* 4. Anonymous class
*
* */
