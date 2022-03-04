package com.company;

import Oops.concept.Family;
import Oops.concept.Person;

public class main {
    public static void main(String[] args) {
        Family f=new Family("Shashi","Keerthi","Rishik","Saisha");
        System.out.println(f.displayNames());







        int age=20;
        System.out.println(age);

        Person y=new Person("Yagna","Kothapalli","Canada",20);
        System.out.println(y.getFullName());
        Person x=new Person();
        System.out.println("Before address change"+" "+y.getAddress());
        y.changeAddress("Vancouver");
        System.out.println("After change address"+" "+y.getAddress());





//       int a =10;
//        System.out.println(a);
//
//       Employee emp1= new Employee();
//        System.out.println(emp1.getID());
//        System.out.println(emp1.getAddress());
//
//
//        Employee emp2= new Employee(222,"Yagna","vancouver");//parameterized constructor
//        System.out.println(emp2.getAddress());
//        System.out.println(emp2.getAddress()+emp1.getName());
//        System.out.println(emp2);
////        Employee emp3= new Employee(5454,"renu","Canada");


    }

}
