package com.mohsinkd786.basics;

public class InheritMain {
    public static void main(String[] args) {

        Operation add = new Addition();
        add.execute(10,2);

        Operation1 add1 = new Addition();
        add1.execute(9,8);


        add.tryMe();
        add1.tryMe();

//        Plane plane;

       // plane = new Plane();


        I1 ii = new Calculate();

        ii.add(10,2);

        I2 i2= new Calculate();

        i2.add(10,3);
        i2.sub(9,3);

        //

    }
}
