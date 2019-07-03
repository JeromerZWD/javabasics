package com.ecjtu.zwd.day2;

public class Day2W5 {
    public static void main(String[] args) {
            int b=35;
            int[] a=new int[30];
            for (int i=0;i<a.length;i++){
                a[i]=b%2;
                b/=2;
            }
            for (int i=a.length-1;i>=0;i--){
                System.out.print(a[i]);
            }

    }
}
