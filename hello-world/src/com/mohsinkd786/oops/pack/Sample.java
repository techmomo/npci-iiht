package com.mohsinkd786.oops.pack;

public class Sample {
    public int id;
    char c; // default scope
    protected boolean isParent;
    private int[] nums;

    public boolean isFather(){
        return isParent;
    }
}


// Parent - Sample : package name : com.mohsinkd786.oops.pack

// Child - Consumer: package name : com.mohsinkd786.oops.pack

// Child - Test : package name : com.mohsinkd786.oops.unpack

// Plain Class - NoInherit : package name : com.mohsinkd786.oops.unpack




/*
* public : can be accessed from anywhere
* default : can be accessed only from within the same package
* protected: can be accessed from within the package & by any subclass(within the package or outside the package)
* private : cannot be accessed outside the class, always local to the class
*
*
* */


/*
* Assignment : Write a program to calculate the inventory of a set of products , for a seller
*
* */
