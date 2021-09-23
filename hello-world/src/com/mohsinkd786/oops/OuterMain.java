package com.mohsinkd786.oops;

public class OuterMain {
    public static void main(String[] args) {

        Outer.StaticInner staticInner = new Outer.StaticInner();
        staticInner.message();
        // access static method via class name

        Outer.StaticInner.sayHello();

        // outer class
        Outer outer = new Outer();

        // inner class object using outer class
        Outer.Inner inner = outer.new Inner();
        inner.message();

        // anonymous classes
        Service service = new Service() {
            @Override
            public void add() {
                System.out.println("Add..");
            }

            @Override
            public void process() {
                System.out.println("Process..");
            }
        };

        // call the methods
        service.add();
        service.process();

        // anonymous classes
        Service service1 = new Service() {
            @Override
            public void add() {
                System.out.println("Sub..");
            }

            @Override
            public void process() {
                System.out.println("No Process..");
            }
        };

        service1.process();
        service1.add();

        Sport sport = new Sport() {
            @Override
            void noOfParticipants() {
                noOfParticipants = 11;
            }
        };
        int num = sport.noOfParticipants;
        System.out.println("NUM "+num);
    }
}
