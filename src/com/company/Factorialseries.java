package com.company;

public class Factorialseries {
    public static void main(String[] args) {
        //program to find out factorial of number 100
        int n=10;
        long factorial=1;
        for(int i=n;i>=1;i--){
            factorial=i*factorial;
        }
        System.out.println(factorial);
    }
    public static void whileLoop(String[] args) {
        int n=1, product =1;
        while(n<=10){
            product=product*n;
            n++;
        }
        System.out.println(product);

    }
}
