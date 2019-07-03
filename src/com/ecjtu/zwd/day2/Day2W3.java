package com.ecjtu.zwd.day2;

public class Day2W3 {
    public static void main(String[] args) {
        int [] arr=new int[]{12,23,11,56,23,78,34,123,343,1,3,4,32,23,67};
        int max=arr[0]; int min=arr[0]; int index1=0; int index2=0;
        for (int a=1;a<arr.length;a++){
            if (arr[a]>max){
                max=arr[a];
                index1=a;
            }
        }
        for (int a=1;a<arr.length;a++){
            if (arr[a]<min){
                min=arr[a];
                index2=a;
            }
        }
        System.out.println("最小:"+min+"最大:"+max);
        System.out.println("最小:"+index2+"最大:"+index1);
        System.out.print("逆序输出为：");
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        System.out.print("交换后:");
        int temp=0;
        temp=arr[0];
        arr[0]=arr[index1];
        arr[index1]=temp;
        temp=arr[arr.length-1];
        arr[arr.length-1]=arr[index2];
        arr[index2]=temp;
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }
}
