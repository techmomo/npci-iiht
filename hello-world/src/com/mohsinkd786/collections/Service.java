package com.mohsinkd786.collections;

import java.util.ArrayList;
import java.util.List;

// class level generics
public class Service<T,X> {

    private List<T> values;

    Service(){
        values = new ArrayList<>();
    }

    public T add(T msg){
        return values.add(msg)? msg: null;
    }

    public boolean delete(T msg){
        return values.remove(msg);
    }
    public List<T> getAll(){
        return values;
    }

    // method level generics
    public <E> void print(E e){
        System.out.println(e.getClass().getName() + " : "+e);
    }
}
