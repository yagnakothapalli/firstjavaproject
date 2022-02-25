package com.company;

import java.util.Scanner;

public class Demo2 {
 //Q1 Number guessing game
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("I have thought a number (1-100)");
            int computerNum = (int) (Math.random())*100;
            System.out.println(computerNum);
            System.out.println("guess my number :");

            do {
                int userInput = sc.nextInt();
                if (userInput == computerNum) {
                    System.out.println("you won, guess was right");
                    break;
                }
                System.out.println("sorry,guess was wrong..guess again...");
            } while (true);


    }


    public static void printGrade(int[] a) {

        float percentage = (a[0] + a[1] + a[2] + a[3] + a[4]) / 5;

        System.out.println("Percentage" + percentage);
        if (percentage > 80) {
            System.out.println("Grade A");
        } else if (percentage >= 70 && percentage <= 80) {
            System.out.println("Grade B");
        } else if (percentage >= 60 && percentage < 70) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade D");
        }

    }

    public int diff21(int n) {
        if (n <= 21) {
            return (21 - n);
        } else {
            return 2 * (21 - n);
        }
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking && (hour < 7 || hour > 20)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean makes10(int a, int b) {
        return (a == 10 || b == 10 || a + b == 10);
    }

    public boolean nearHundred(int n) {
        return ((n >= 90 && n <= 110) || (n >= 190 && n <= 210));
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        } else {
            return ((a < 0 && b >= 0) || (b < 0 && a >= 0));
        }
    }

    public String notString(String str) {
        if (str.startsWith("not")) {
            return str;
        }

        return "not " + str;

    }

    public String missingChar(String str, int n) {
        String f = str.substring(0, n);
        String l = str.substring(n + 1);
        String r = f + l;
        return r;
    }

    public String frontBack(String str) {
        //Java
        if (str.length() == 0) {
            return str;
        } else if (str.length() == 1) {
            return str;
        } else if (str.length() == 2) {
            String f = str.substring(0, 1); //
            String m = str.substring(1);
            return m + f; //
        } else {
            String f = str.substring(0, 1);
            String l = str.substring(str.length() - 1); //
            String m = str.substring(1, str.length() - 1);// hocolat
            return l + m + f;  // ehocolatC
        }

    }

}
