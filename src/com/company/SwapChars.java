package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SwapChars {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String s= sc.nextLine();
        System.out.println("Enter index of i");
        int i= sc.nextInt();
        System.out.println("Enter index of j");
        int j= sc.nextInt();
        SwapChars(s,i,j);
    }

    public static void SwapChars(String s,int i,int j) {
        char array[]=s.toCharArray();
        System.out.println("before swapping the characters"+ Arrays.toString(array));
            char a= array[i];
            array[i]=array[j];
            array[j]=a;
        System.out.println("after swapping the characters"+Arrays.toString(array));

    }
}
