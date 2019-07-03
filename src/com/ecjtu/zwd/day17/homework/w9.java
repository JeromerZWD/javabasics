package com.ecjtu.zwd.day17.homework;

import java.util.ArrayList;
import java.util.Iterator;

public class w9 {
    public static void main(String[] args) {
        ArrayList<User910> l1=new ArrayList<User910>();
        l1.add(new User910("张三",22));
        l1.add(new User910("李四",20));
        l1.add(new User910("王二",24));
        l1.add(new User910("麻子",21));
        for (int i=0;i<l1.size();i++){
            for (int j=0;j<i;j++){
                if (l1.get(i).age>=l1.get(j).age){
                    int age1=l1.get(i).age;
                    int age2=l1.get(j).age;
                    String name1=l1.get(i).name;
                    String name2=l1.get(j).name;
                    l1.set(i,new User910(name2,age2));
                    l1.set(j,new User910(name1,age1));
                }
            }
        }
        Iterator it=l1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
