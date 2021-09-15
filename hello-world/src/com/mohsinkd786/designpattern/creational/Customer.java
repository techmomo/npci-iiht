package com.mohsinkd786.designpattern.creational;

public class Customer {
    private int id;
    private String name;
    private String email;
    private int phone;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getPhone() {
        return phone;
    }

    private Customer(CustomerBuilder customerBuilder){
        this.id = customerBuilder.id;
        this.email = customerBuilder.email;
        this.name = customerBuilder.name;
        this.phone = customerBuilder.phone;
    }

    public static class CustomerBuilder{
        private int id;
        private String name;
        private String email;
        private int phone;

        public CustomerBuilder setId(int id){
            this.id = id;
            return this;
        }

        public CustomerBuilder setName(String name){
            this.name = name;
            return this;
        }

        public CustomerBuilder setEmail(String email){
            this.email = email;
            return this;
        }
        public CustomerBuilder setPhone(int phone){
            this.phone = phone;
            return this;
        }

        public Customer build(){
            // pass the customer builder reference
            return new Customer(this);
        }
    }
}
