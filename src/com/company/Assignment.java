package com.company;

public class Assignment {
    public static void getFullName(String firstName , String lastName){
        System.out.println(firstName +" "+ lastName);


    }
    public static int square(int a){
        return a*a;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static int areaofRectangle(int l, int b){
        return l*b;
    }
    public static double areaofaCircle(float r){
        return 3.14*r*r;
    }
    public static void printTable(int n){
        System.out.println(n + "*1=" + (n*1));
        System.out.println(n + "*2=" + (n*2));
        System.out.println(n + "*3=" + (n*3));
    }
}
