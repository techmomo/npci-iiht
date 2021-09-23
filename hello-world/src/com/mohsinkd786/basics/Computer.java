package com.mohsinkd786.basics;

public class Computer {

    // required
    // mandatory fields
    Monitor monitor;
    Keyboard keyboard;

    // optional
    Mouse mouse;

    Computer(Monitor monitor1,Keyboard keyboard1){
        monitor = monitor1;
        keyboard = keyboard1;
    }

    Computer(){

        monitor = new Monitor();
        keyboard = new Keyboard();
        // monitor
        monitor.price = 100;

        // keyboard
        keyboard.length = 10;
        keyboard.width = 5;
        keyboard.price = 35;
    }

    Computer(int monitorPrice,int keyPrice,int keyWidth,int keyLength){

        monitor = new Monitor();
        keyboard = new Keyboard();

        // monitor
        monitor.price = monitorPrice;

        // keyboard
        keyboard.length = keyLength;
        keyboard.width = keyWidth;
        keyboard.price = keyPrice;
    }


    void computerInfo(){
        System.out.println("Monitor Price: "+monitor.price);
        System.out.println("Keyboard Specs: "+keyboard.price +" Dimensions: "+keyboard.width +" x "+keyboard.length);
    }
}


// monitor
// mouse
// keyboard


