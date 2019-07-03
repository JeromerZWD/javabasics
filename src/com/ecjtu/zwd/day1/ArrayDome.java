package com.ecjtu.zwd.day1;

import java.util.Scanner;

public class ArrayDome {
    public static void main(String[] args) {
        int [] arr=new int[]{8,4,2,1,23,344,12};
        int num=0;
        boolean b=false;
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
            num+=arr[i];
        }
        System.out.println("总和："+num);
            System.out.println("请任意输入一个数据：");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == a) {
                    b = true;
                }
            }
            if (b) {
                System.out.println("存在");
            } else {
                System.out.println("不存在");
            }
    }
}
