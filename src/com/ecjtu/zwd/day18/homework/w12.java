package com.ecjtu.zwd.day18.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class w12 {
    public static void main(String[] args) {
        Map map=new HashMap();
        map.put("tom","corejava");
        map.put("john","oracle");
        map.put("susan","oracle");
        map.put("jerry","jdbc");
        map.put("jim","unix");
        map.put("kevin","jsp");
        map.put("lucy","jsp");

        map.put("allen","jdbc");
        map.put("lucy","jdbc");
        Set<Map.Entry<String,String>> set=map.entrySet();
        for (Map.Entry<String,String> m:set) {
            System.out.println(m.getKey()+":"+m.getValue());
        }
        for (Map.Entry<String,String> m:set) {
            if ("jsp".equals(m.getValue()))
            System.out.println(m.getKey());
        }
    }
}
