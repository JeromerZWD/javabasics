package com.ecjtu.zwd.day18.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
    public static void main(String[] args) {

          Map map=new HashMap();
          map.put("name","张三");
          map.put("age",21);
          map.put("sex","男");

          //遍历map
       /* Set set=map.keySet();
        for(Object key:set){
            System.out.println(map.get(key));
        }*/
       Set<Map.Entry<Object,Object>>entries=map.entrySet();
       for(Map.Entry<Object,Object> entry:entries){
           System.out.println(entry.getKey()+":"+entry.getValue()
           );
       }

    }
}
