package com.ecjtu.zwd.day2;

public class Day2W6 {
    public static void main(String[] args) {
        int[][] arr = new int[10][10];
        int i, j = 0;
        for (i = 0; i < 10; i++) {
            for (j = 0; j <= i; j++) {
                if (j == i ||j==0) {
                    arr[i][j]=1;
                    System.out.print(1+"\t");
                } else {
                    arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                    System.out.print(arr[i-1][j-1]+arr[i-1][j]+"\t");
                }
            }
            System.out.println();
        }
    }
}
