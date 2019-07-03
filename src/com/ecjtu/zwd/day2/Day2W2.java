package com.ecjtu.zwd.day2;

import java.util.Arrays;
import java.util.Scanner;

public class Day2W2 {
    public static void main(String[] args) {
        char [] arr=new char[9];
        arr[1]='a';arr[2]='c';arr[3]='u';arr[4]='b';arr[5]='e';arr[6]='p';arr[7]='f';arr[8]='z';
        System.out.print("原字符序列：");
        for (int iii=0;iii<arr.length;iii++){
            System.out.print(arr[iii]+"\t");
        }
        System.out.println();
        Arrays.sort(arr);
        System.out.print("升字符序列：");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        char s1='m';
        int index=0;
        System.out.println();
        System.out.print("待插入的字符为："+"m");
        for (int i=0;i<arr.length;i++){
            if (s1<arr[i]){
                index=i;
                break;
            }
        }
        System.out.println();
        System.out.println("插入字符的下标是："+index);
        for (int c=arr.length-1;c>index;c--){
            arr[c]=arr[c-1];
        }
        System.out.print("插入后：");
        arr[index]=s1;
        for (int ii=0;ii<arr.length;ii++){
            System.out.print(arr[ii]+"\t");
        }


    }
}
