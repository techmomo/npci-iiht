package com.mohsinkd786.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ColMain {
    public static void main(String[] args) {


        // generics cannot be primitive types
        // they can only be classes

        // default capacity = 10
        // resizable
        // load factor = the ratio to decide the size of the list
        //
        List<Integer> arrayList = new ArrayList();


        // Collection - interface - that defines the framework
        // Collections - class - that defines utility methods

        // wrapper classes :
        /*
        * int - Integer
        * float - Float
        * double - Double
        * boolean - Boolean
        * */
        //List list = new LinkedList();

        // preserves insertion order
        // allows access based on index
        // stored data in the form on arrays

        Integer integer = new Integer(1);
        int ijk = integer;

        String strInt = String.valueOf(integer);

        ijk = Integer.parseInt(strInt);

        arrayList.add(1); // 0  // 0
        arrayList.add(11); // 1 // 1
        arrayList.add(4); // 2  // 2
        //arrayList.add("Hello");
        arrayList.add(4); // 3 //

        // comparable - natural sort
        // comparator - custom / un natural sort

        Collections.sort(arrayList);

        // access an element in array list

        System.out.println(arrayList.get(0));

        //
        for (int i: arrayList) {
            System.out.println(i);
        }

        // remove based on index
        arrayList.remove(2);

        //arrayList.forEach();


        // User
        User user = new User(1);

        System.out.println(user);

        User user1 = new User(1);

        User user2 = new User(2);

        if(user2.equals(user1)){
            System.out.println("Objects are Identical");
        }

        System.out.println("Users.....");
        List<User> users = new ArrayList<>();

        users.add(new User(1));
        users.add(new User(11));
        users.add(new User(12));
        users.add(new User(5));

        for(User usr: users){
            System.out.println(usr);
        }
    }
}


class User{

    /*
    * Object class methods, that should be overriden:
    * 1. toString()
    * 2. equals()
    * 3. hashCode()
    *
    * */
    int userId;

    User(int id){
        userId = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null ){
            return false;
        }
        User user = (User) o; // type cast the object into our class type
        return userId == user.userId;
    }

    @Override
    public String toString() {
        return "User => Id =" + userId;
    }
}

/*
*
*           Collection (I)
*
*   i.List(I)    Set (I)   Queue (I)  Deque(I)  Map(I)
*
*   ArrayList (c)
*   LinkedList (c)
*   Vector  (c)
*   CopyOnWriteArrayList (c)
*   Stack (c)
*
*
*   ii. Set(I)
*
*   HashSet (c)
*
*   SortedSet
*   TreeSet (c)
*   LinkedHashSet (c)
*
*
*   iii.Queue (I)
*
*   PriorityQueue (c)
*   BlockingQueue (c)
*
*
*   iv. Dequeue (I)
*
*   ArrayDeque (c)
*
*
*   v. Map (I)
*
*   HashMap
*   TreeMap
*   LinkedHashMap
*   ConcurrentHashMap
*
*
* */


/*
* Assignment : Build a Shopping Cart for a customer , ensure to allow adding items to the cart only when they are in stock
*
* */
