package com.company;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        System.out.println("vivek code");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter month (1-12)");
//        int month = sc.nextInt();
//        System.out.println("Enter number between 1-100");
//        int nextInt = sc.nextInt();
//        System.out.println("Enter three number");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        System.out.println("Enter the five subject marks");
//        int s1 = sc.nextInt();
//        int s2 = sc.nextInt();
//        int s3 = sc.nextInt();
//        int s4 = sc.nextInt();
//        int s5 = sc.nextInt();
//        int x = 10;
//        printDaysInMonth(month);
//        printCongrats(nextInt);
//        printNumberAreEqual(a, b, c);
//        printGrade(s1, s2, s3, s4, s5);

//        if (x > 10) {
//            System.out.println("positive");
//        } else if (x < 0) {
//            System.out.println("negative");
//        } else {
//            System.out.println("zero");
//        }

        for (int g = 1; g<=5;g++ ){

            for(int k=1;k<=10;k++ ){
                System.out.print(g);
            }
            int j=1;
            while(j<10){
                System.out.print(j);
                j++;
    }
            int k=1;
            do{
                System.out.println(k);
                k++;
        }while(k<=10);
        }
    }



    public static void printGrade(int s1, int s2, int s3, int s4, int s5) {
        float percentage= ((s1+s2+s3+s4+s5)/5)  ;
        System.out.println("Percentage"+ percentage);
        if(percentage>80){
            System.out.println("Grade A");
        }else if (percentage >=70 && percentage <=80){
            System.out.println("Grade B");
        }else if (percentage >=60 && percentage <70){
            System.out.println("Grade C");
        }else {
            System.out.println("Grade D");
        }
    }

    public static void printNumberAreEqual(int a, int b, int c) {
        if (a == b && b == c && a == c) {
            System.out.println("Numbers are Equal");
        } else {
            System.out.println("Numbers are not Equal");
        }
    }

    public static void printCongrats(int nextInt) {
        if (nextInt >= 1 && nextInt <= 100) {
            System.out.println("congrats");
        } else {
            System.out.println("Invalid entry");
        }
    }

    public static void printDaysInMonth(int month) {
        if (month > 12 || month < 1) {
            System.out.println("Invalid month");
            return;
        }
        if (month == 2) {
            System.out.println("28 days");
        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("31 days");
        } else {
            System.out.println("30 days");
        }

    }


}