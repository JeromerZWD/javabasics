package com.ecjtu.zwd.day18.map;


import java.util.Comparator;
import java.util.TreeMap;

public class TestTreeMap1 {
    public static void main(String[] args) {
        TreeMap map=new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Person person=(Person)o1;
                Person person1=(Person)o2;

                return person.getAge()-person1.getAge();
            }
        });
        map.put(new Person("张三",22),1);
        map.put(new Person("李四",26),2);
        map.put(new Person("王五",21),3);
        System.out.println(map);

    }
}
