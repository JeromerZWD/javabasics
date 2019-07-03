package com.ecjtu.zwd.day17.homework;

import java.util.HashSet;
import java.util.Set;

public class w6 {
    public static void main(String[] args) {
        Set set=new HashSet();
        set.add(new Worker("tom",18,2000));
        set.add(new Worker("tom",18,2000));
        set.add(new Worker("jerry",18,2000));
        System.out.println(set.size());

    }
}
