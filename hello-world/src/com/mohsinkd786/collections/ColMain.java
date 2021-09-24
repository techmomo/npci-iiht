package com.mohsinkd786.collections;

import java.util.*;

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

        Collections.sort(arrayList, Comparator.reverseOrder());

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
        User user = new User(1,"");

        System.out.println(user);

        User user1 = new User(1,"Test1");

        User user2 = new User(1,"Test1");

        System.out.println("U1 "+user1.hashCode());
        System.out.println("U2 "+user2.hashCode());

        if(user2.equals(user1)){
            System.out.println("Objects are Identical");
        }

        System.out.println("Users.....");
        List<User> users = new ArrayList<>();

        //users.add();

        users.add(new User(1,"Bob"));

        users.add(new User(11,"Jackson"));
        users.add(new User(11,"Adam"));
        users.add(new User(12,"Steve"));
        users.add(new User(5,"James"));


        // apply comparator based on Id
        //Collections.sort(users,new SortById());
        // leverage comparable
        Collections.sort(users);

        for(User usr: users){
            System.out.println(usr);
        }
        System.out.println("Sort By Name");
        // sort by name
        //Collections.sort(users,new SortByName());
//        for(User usr: users){
//            System.out.println(usr);
//        }



        // LinkedList

        LinkedList<Integer> nums = new LinkedList<Integer>();
        nums.add(4);
        nums.add(12);
        nums.add(8);

        // traverse
        for(int i: nums){
            System.out.println(i);
        }

//        public E getFirst() {
////            final Node<E> f = first;
////            if (f == null)
////                throw new NoSuchElementException();
////            return f.item;
////        }


        // get the first element
        nums.getFirst();

        // get the last element
        nums.getLast();

        // get the first element
        nums.peek();

        // get & remove the first element
        nums.poll();

        // delete the last element e.g. in case of stack
        nums.pop();

        Object arr[] =  nums.toArray();


        // Set

        HashSet<String> messageSet = new HashSet();

        messageSet.add("Hello");
        messageSet.add("Welcome");
        messageSet.add("Test");
        messageSet.add("Test");

        for(String msg : messageSet){
            System.out.println("Msg "+msg);
        }

        //create list from set
        List<String> cleanMsgs = new ArrayList<>(messageSet);


        Set<User> userSet = new HashSet<>();
        userSet.add(user1);
        userSet.add(user2);

        for (User u:
             userSet) {
            System.out.println("User Set "+u.name);
        }

        // LinkedList //
//        class LinkedList{
//            Node node;
//
//            static class Node{
//                String value;
//                Node nextRef;
//            }
//        }
        // [1,nextRef]-> [2,null]


        //
        Service<User,Integer> service = new Service();

        service.add(user1);
        service.delete(user1);

        List<User> usrs =  service.getAll();

        //

        Service<Integer,Integer> service1 = new Service<>();
        service1.add(1);
        service1.add(54);

        service1.delete(1);

        List<Integer> integers = service1.getAll();

        service.print("Hello");
        service1.print(12);

        HashMap<Integer,String> _map = new HashMap();

        _map.put(1,"One");
        _map.put(2,"Two");
        _map.put(3,"Three");
        _map.put(5,"One");

        HashMap<Customer,String> customerMap = new HashMap<>();

        Customer customer1 = new Customer(1,"Cust-1");
        System.out.println("customer 1 : hashcode "+customer1.hashCode());

        customerMap.put(customer1,"One");
        customerMap.put(new Customer(2,"Cust-2"),"Two");
        customerMap.put(new Customer(1,"Cust-1"),"Five");

        Customer customer2 = new Customer(1,"Cust-1","mm@gg.co.uk");
        System.out.println("customer 2 : hashcode "+customer2.hashCode());

        String val = customerMap.get(customer2);
        System.out.println("VAL ::"+val);

        //
        for (Customer customer: customerMap.keySet()) {
            System.out.println(customer.name);
        }

        // traverse via the map
        Set<Map.Entry<Customer,String>> entrySet =  customerMap.entrySet();

        for(Map.Entry<Customer,String> entry: entrySet){
            System.out.print("KEY : "+entry.getKey());
            System.out.print(" ");
            System.out.print("VALUE : "+entry.getValue());
            System.out.print("\n");
        }

        // Hashtable
        // Properties
    }

    // Hashmap
    // Tree map
    // LinkedHashMap
    // ConcurrentHashMap


}


class Customer{
    int id;
    String name;
    String email;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Customer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id &&
                name.equals(customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}



class User implements Comparable<User>{

    /*
    * Object class methods, that should be overriden:
    * 1. toString()
    * 2. equals()
    * 3. hashCode()
    *
    * */
    int userId;
    String name;

    User(int id,String uName){
        userId = id;
        name = uName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, name);
    }

    @Override
    public boolean equals(Object o) {

        super.hashCode();
        if (this == o){
            return true;
        }
        if (o == null ){
            return false;
        }
        User user = (User) o; // type cast the object into our class type
        return userId == user.userId && name.equals(user.name);
    }

    @Override
    public String toString() {
        return "User => Id =" + userId +", Name = "+name;
    }

    @Override
    public int compareTo(User u) {
        if(userId > u.userId){
            return 1;
        }else if(userId < u.userId){
            return -1;
        }else{
            //return 0;
            return name.compareTo(u.name);
        }
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
* Assignment 1: Build a Shopping Cart for a customer , ensure to allow adding items to the cart only when they are in stock
*
* Assignment 2: Sort elements based on Id , in case id is sample then sort based on name for the user
*
* Assignment 3: Create your custom implementation for linkedlist -
*                  create singly linked list , with add , get , remove & to Array() methods
* */
