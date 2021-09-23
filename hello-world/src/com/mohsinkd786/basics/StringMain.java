package com.mohsinkd786.basics;

public class StringMain {
    public static void main(String[] args) {

        // String datatype


        // string literal
        String str1 = "Hello"; // it will be stored in string pool ["Hello","Test","Welcome","Welcome01",""]
        String str02 = "Hello";

        // new string object

//        String str2 = new String("Hello");
//        String str4 = new String("Hello");
//
//        // string pool
//        String str3 =  str2.intern();

        System.out.println("Str-02 "+str02);

        str02 = "Test";
        str1 = "Welcome";

        System.out.println("Str "+str1);
        System.out.println("Str-02 New "+str02);

        str1.concat("01"); // this is a method of string class
        str1.substring(1);

        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();

        stringBuffer
                .append("Hello") // this is a method of string buffer
                .append("Hi")
                .toString();

        char strs[] ={'C','D'};

        String charSequence = new String(strs);
    }
}
