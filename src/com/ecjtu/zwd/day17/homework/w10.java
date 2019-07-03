package com.ecjtu.zwd.day17.homework;

import java.util.HashSet;
import java.util.Iterator;

public class w10 {
    public static void main(String[] args) {
        HashSet<User910> hashSet =new HashSet<>();
        hashSet.add(new User910("张三",18));
        hashSet.add(new User910("李四",18));
        hashSet.add(new User910("王二",18));
        System.out.println( hashSet.add(new User910("张三",18)));
        Iterator it=hashSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        for (User910 u:hashSet) {
            System.out.println(u);
        }
    }
}
