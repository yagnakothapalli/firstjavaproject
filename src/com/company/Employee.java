package com.company;

public class Employee {
    private int id;
    private String name;
    private String address;


    public Employee(int id,String name,String address) {
        System.out.println("parameterized constructor was invoked");
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Employee() {
        System.out.println("default constructor is called");
    }

    public int getID() {
    return id;
    }

    public void setID(int i) {
        this.id=id;
    }
    public String getName(){
        return name;
    }

    public String getAddress() {
        return null;
    }
}
