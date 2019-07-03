package com.ecjtu.zwd.day17.homework;

import java.util.TreeSet;

public class w7 {
    public static void main(String[] args) {
        TreeSet<Worker> set=new TreeSet();
        System.out.println(set.add(new Worker("zhang3",18,1500)));
        System.out.println(set.add(new Worker("li4",19,1500)));
        System.out.println(set.add(new Worker("wang5",18,1600)));
        System.out.println(set.add(new Worker("zhao6",17,2000)));
        for (Worker w:set) {
            System.out.println(w);
        }
    }
}
