package com.ecjtu.zwd;

import java.util.Arrays;

public class Day2W1 {
    public static void main(String[] args) {
        char [] arr=new char[]{'a','c','u','b','e','p','f','z'};
        System.out.print("原字符序列：");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        Arrays.sort(arr);
        System.out.print("升序排序后：");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        System.out.print("逆序输出为：");
        for (int j=arr.length-1;j>=0;j--){
            System.out.print(arr[j]+"\t");
        }

    }
}
