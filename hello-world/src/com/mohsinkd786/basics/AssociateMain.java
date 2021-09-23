package com.mohsinkd786.basics;

public class AssociateMain {
    public static void main(String[] args) {

        Monitor monitor = new Monitor();
        monitor.price = 100;

        Keyboard keyboard = new Keyboard();
        keyboard.length = 10;
        keyboard.width = 5;
        keyboard.price = 35;

        // approach 1
        Computer computer = new Computer(monitor,keyboard);

        // approach 2
        Computer computer1 = new Computer();

        // approach 3
        Computer computer2 = new Computer(120,44,6,23);

        computer.computerInfo();
        System.out.println("Approach 2.......");
        computer1.computerInfo();
        System.out.println("Approach 3.......");
        computer2.computerInfo();

    }
}
