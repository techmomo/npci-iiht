package com.mohsinkd786.oops.unpack;

import com.mohsinkd786.oops.pack.Sample;

public class Test extends Sample {

    Test(int val){
        id = val;
        if(id > 10){
            isParent = true;
        }else{
            isParent = false;
        }
    }
    void test(){
        //Sample sample = new Sample();
        id = 1;
       // c = 'D'; // no accessible outside the package
        isParent = false;
    }
}


/*
*  Encapsulation: is
*
*   access specifiers :
*
*  1. public
*  2. default
*  3. protected
*  4. private
*
*
*
* */
