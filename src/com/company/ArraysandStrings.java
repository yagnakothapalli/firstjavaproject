package com.company;

public class ArraysandStrings {
    public static void main(String[] args) {


        int marks[] = new int[6];
        System.out.println("length= " + marks.length);

        //filling array
        for (int i = 0; i <= 6; i++) ;
        {
            int i = 5;
            marks[i] = 50;
        }

        int s = 0;
        int i;
        for (i = 0; i < 6; i++) {

            s = s + marks[i];
        }
        System.out.println(s);
    }


    public static void printSum(int[] arr) {
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i];
        }
    }
}


