package com.company;

public class TwoDArray {
    public static void main(String[] args) {
        int arr[][] = new int[][]{
                {10, 2, 3},
                {40, 5, 6},
                {70, 8, 9},
                {100, 11, 12},
                {130, 14, 15},
        };
        for (int i = 0; i < 5; i++) {
            int s = 0;int avg=0;
            int j;
            for (j = 0; j < 3; j++){
                s=s+arr[i][j];

            }
            avg=s/3;
                System.out.println(avg);
            }

        for (int i = 0; i <= arr.length-1; i++) {
            for (int j = 0; j <= arr[i].length-1; j++){
                if((i==0&&j<=arr[i].length-1)||(i<= arr.length-1&&j==0)||(i==arr.length-1&&j<=arr[i].length-1)||(i<= arr.length-1&&j==arr[i].length-1)){
                    System.out.print(arr[i][j]+"\t");
                }else{
                    System.out.print("\t ");
                }

            }
            System.out.print("\n");
        }

        }
    }
