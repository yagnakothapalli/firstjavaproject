package com.company;


public class Arraydecimals {
    public static void main(String[] args) {
        float arr[] = new float[10];
        float sum = 0;
        System.out.println("Sum of 10 decimal values");
        for (int i =0 ; i<10; i++){
            arr[i] = i+0.7F;
        }
        for (int i = 0; i <= 9; i++) {
            sum = sum + arr[i];
            System.out.println(sum);
        }
        System.out.print(sum);
        System.out.println();
    }
}
