package com.ecjtu.zwd.day2;

public class Day2W7 {
    public static void main(String[] args) {
        int [] oldArr={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
        int a=0; int b=0;
        for (int i=0;i<oldArr.length;i++) {
            if (oldArr[i] != 0) {
                a++;
            }
        }
            int [] arr=new int[a];
            for (int i1=0;i1<oldArr.length;i1++){
                if (oldArr[i1]!=0){
                    arr[b]=oldArr[i1];
                    b++;
                }
            }
            for (int i2=0;i2<arr.length;i2++){
                System.out.print(arr[i2]+"\t");
            }
        }
}
