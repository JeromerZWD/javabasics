package com.ecjtu.zwd.day18.map;

import java.util.*;


public class TestLinkedHashMap1 {
    public static void main(String[] args) {
        LinkedHashMap map=new LinkedHashMap();
        map.put(1,new Person("张三",22));
        map.put(2,new Person("李四",21));
        map.put(3,new Person("王五",26));
        //遍历map
        Set keys=map.keySet();
        for(Object key:keys){
            System.out.println(map.get(key));
        }
        Set<Map.Entry<Integer, Person>> set = map.entrySet();
        List<Map.Entry<Integer, Person>> list = new ArrayList<Map.Entry<Integer, Person>>(set);

        //
        Collections.sort(list, new Comparator<Map.Entry<Integer, Person>>() {
            @Override
            public int compare(Map.Entry<Integer, Person> o1, Map.Entry<Integer, Person> o2) {
                //按照年龄的逆序
                return o2.getValue().getAge() - o1.getValue().getAge();
            }
        });
        map.clear();
        for(Map.Entry<Integer, Person> entry : list){
            map.put(entry.getKey(),entry.getValue());
        }

        System.out.println(map);
    }
}
