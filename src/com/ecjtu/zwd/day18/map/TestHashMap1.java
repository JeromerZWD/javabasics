package com.ecjtu.zwd.day18.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMap1 {
    public static void main(String[] args) {
        Map map=new HashMap();
        map.put("name","张三");
        map.put("age",22);
        map.put("sex","男");
        //map允许Key为null,value为null
        map.put(null,"深圳龙岗");//获取不到
        map.put("phone",null);
        map.put(null,null);
        System.out.println(map.size());
        map.remove("sex");//根据Key删除某一项
        //遍历Map
        Set keys=map.keySet();
        for(Object key:keys){
         System.out.println(key+":"+map.get(key));
        }
        //查找Map是否包含某个Key
       boolean flag= map.containsKey("age");
        System.out.println(flag);

       /* Collection collection =map.values();
        for(Object obj:collection){
            System.out.print(obj+" ");

        }*/
        /*map.clear();//清空map
        System.out.println(map.size());*/

    }
}
