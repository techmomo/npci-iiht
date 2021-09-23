package com.mohsinkd786.oops.unpack;

public class MainInherit {
    public static void main(String[] args) {
        Test test = new Test(9);
        //test.id = 12;

        boolean status = test.isFather();

        System.out.println(status);
    }
}
