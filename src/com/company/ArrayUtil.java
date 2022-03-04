package com.company;

import java.util.Scanner;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] arr = new int[]{8, 9, 6, 2, 1};
        System.out.println("In the given int Array " + arr.toString());
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index position number of the array");
        int x = sc.nextInt();
        indexOf(x, arr);
        System.out.println("Enter the character at the index position of the array");
        int y = sc.nextInt();
        charAt(y, arr);
        System.out.println("The length of array is");
        length(arr);
        System.out.println("The result value is");
        int z = sc.nextInt();
        boolean value = contains(z, arr);
        System.out.println(value);



    }

    public static boolean contains(int z, int[] arr) {
        boolean yes = false;
        for (int i= 0; i<arr.length; i++){
            if (arr[i]==z){
                return yes = true;
            }
        }
        return yes;
    }

    public static void length(int[] arr) {
        System.out.println(arr.length);
    }

    public static void charAt(int y,  int[] a) {
        System.out.println(a[y]);
    }



    public static void indexOf(int x, int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]== x){
                System.out.println(i);
            }
        }
    }
}
