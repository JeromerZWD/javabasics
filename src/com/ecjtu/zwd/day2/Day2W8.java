package com.ecjtu.zwd.day2;

import java.util.Arrays;

public class Day2W8 {
    public static void main(String[] args) {
        int [] arr1={1,7,9,11,13,15,17,19};
        int [] arr2={2,4,6,8,10};
        int index=arr1.length+arr2.length;
        int[] arr=new int [index];
        for (int i=0;i<arr1.length;i++){
            arr[i]=arr1[i];
        }
        for (int i=0;i<arr2.length;i++){
            arr[i+arr1.length]=arr2[i];
        }
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
