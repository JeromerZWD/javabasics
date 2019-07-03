package com.ecjtu.zwd.day17;

import java.util.ArrayList;
import java.util.Random;

public class Random1 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList=new ArrayList<>();
        while(true){
            boolean b=true;
            java.util.Random random=new java.util.Random();
            int a=(random.nextInt(25)+1)*2;
            for (int i=0;i<arrayList.size();i++){
                if (arrayList.get(i)==a){
                    b=false;
                }
            }
            if (b){
                arrayList.add(a);
            }
            if (arrayList.size()>=10){
                break;
            }

        }
        System.out.println(arrayList);
    }
}
