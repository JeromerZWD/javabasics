package com.ecjtu.zwd.day17.homework;


import java.util.Comparator;
import java.util.TreeMap;

public class w11 {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap=new TreeMap<Integer, String>(new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        Student11 s1=new Student11(1,"张三");
        Student11 s2=new Student11(6,"李四");
        Student11 s3=new Student11(7,"王二");
        Student11 s4=new Student11(4,"麻子");
        treeMap.put(s1.getId(),s1.getName());
        treeMap.put(s2.getId(),s2.getName());
        treeMap.put(s3.getId(),s3.getName());
        treeMap.put(s4.getId(),s4.getName());
        System.out.println(treeMap);



    }
}
