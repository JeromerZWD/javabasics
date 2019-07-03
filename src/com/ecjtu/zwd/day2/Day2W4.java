package com.ecjtu.zwd.day2;

public class Day2W4 {
    public static void main(String[] args) {
        int [][] arr=new int[][]{{17,23,1,5},{8,9},{34,35,56}};
        int index1=arr[0].length;
        int index2=arr[1].length;
        int index3=arr[2].length;
        int index=index1+index2+index3+3;
        int []arr1=new int[index];
        arr1[0]=index1;
        arr1[index1+1]=index2;
        arr1[index1+index2+2]=index3;
        for (int a=0;a<index1;a++){
            arr1[a+1]=arr[0][a];
        }
        for (int a=0;a<index2;a++){
            arr1[a+index1+2]=arr[1][a];
        }
        for (int a=0;a<index3;a++){
            arr1[a+index1+index2+3]=arr[2][a];
        }
        for (int a=0;a<arr1.length;a++){
            System.out.print(arr1[a]+"\t");
        }
    }
}
