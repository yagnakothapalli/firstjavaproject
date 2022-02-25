package com.company;

public class Assignmentforloop {
    public static void main(String[] args) {
        printNumAscending();
        printNumDescending();
        printEvenNum();
        printOddNum();
        printByAdding2();

    }

    public static void printNumAscending() {
        System.out.println("Printing numbers from 1-100 in Ascending");
        for (int i = 1; i < 100; i++) {
            System.out.print(i+"\t");
        }
    }

    public static void printNumDescending() {
        System.out.println("\nPrinting numbers from 100-1 in Descending");

        for (int i = 100; i > 1; i--) {
            System.out.print(i+"\t");
        }
    }

    public static void printEvenNum() {
        System.out.println("\nPrinting even numbers from 1-100");

        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i+"\t");
            }
        }
    }

    public static void printOddNum() {
        System.out.println("\nPrinting odd numbers from 1-100");

        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i+"\t");
            }
        }
    }

    public static void printByAdding2() {
        System.out.println("\nPrinting by adding 2 from 1-100");

        for (int i = 1; i < 100; i = i + 2) {
            System.out.print(i+"\t");
        }
    }
}
