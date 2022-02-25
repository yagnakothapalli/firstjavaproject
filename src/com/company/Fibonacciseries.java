package com.company;

public class Fibonacciseries {
    public static void main(String[] args) {
        int n = 10;
        int n1 = 0;
        int n2 = 1;
        int n3 = 2;
        for (int i = 1; i <= n; i++) {
            if(i==1) {
                System.out.println(n1);
            }
            if(i==2){
                System.out.println(n2);
            }
            if(i>2){
                n3=n1+n2;
                System.out.println("i  "+ i);

                System.out.println("n3  "+ n3);
                System.out.println("n1  "+ n1);
                System.out.println("n2  "+ n2);


                n1=n2;
                n2=n3;
                System.out.println(n3);
            }
        }
    }
}
