package com.ecjtu.zwd.day17.homework;

import java.util.HashSet;

public class w8 {
    public static void main(String[] args) {
        HashSet<Worker> set=new HashSet();
        set.add(new Worker("zhang3",18,3000));
        set.add(new Worker("zhang4",18,3000));
        set.add(new Worker("zhang5",18,3000));
        set.add(new Worker("zhang3",18,3000));
        for (Worker worker:set) {
            System.out.println(worker);
        }

    }
}
