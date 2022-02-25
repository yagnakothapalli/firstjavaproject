package com.company;

public class Arrayconcept {
public static void main(String[] args) {
    int arr[][] = new int[][]{
            {1, 2, 3, 5},
            {3, 5, 5, 6},
            {6, 5, 4, 5},
    };

    for (int i = 0; i < 4; i++) {
        int s=0;
        for (int j = 0; j < 3; j++) {
            s=s+arr[j][i];
            //System.out.println([i][j]+" ");
        }
        System.out.println(s);
        }
    }
}

