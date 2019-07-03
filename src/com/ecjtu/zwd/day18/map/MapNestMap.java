package com.ecjtu.zwd.day18.map;

import java.util.HashMap;
import java.util.Set;

public class MapNestMap {
    public static void main(String[] args) {
        //创建集合对象
        HashMap<String, HashMap<String, String>> map = new HashMap<String, HashMap<String, String>>();
        //创建元素对象
        String name = "第一期";
        HashMap<String, String> one = new HashMap<String, String>();
        one.put("kimy", "林志颖");
        one.put("石头", "郭涛");
        one.put("cindy", "田亮");
        String name2 = "第二期";
        HashMap<String, String> two = new HashMap<String, String>();
        two.put("多多", "黄磊");
        two.put("贝儿", "陆毅");
        two.put("杨阳洋", "杨威");

        String name3 = "第三期";
        HashMap<String, String> three = new HashMap<String, String>();
        three.put("莫一", "刘烨");
        three.put("明星甲的孩子", "明星甲");
        three.put("明星乙的孩子", "明星乙");

        //将元素放到集合中
        map.put(name, one);
        map.put(name2, two);
        map.put(name3, three);

        System.out.println(map);

        //遍历外层map
        //获取外层的key的set集合
        Set<String> keySet = map.keySet();

        //迭代外层key的集合，依次拿到每一期节目的名称
        for (String outKey : keySet) {
            //通过外层map的key找到外层map的value
            HashMap<String, String> outValue_Map = map.get(outKey);
    //			外层key：  outKey
            System.out.println(outKey);
//			外层value: outValue_Map
            //获取内层map的key的set集合
            Set<String> keySet2 = outValue_Map.keySet();

            //迭代内层key的set集合，依次拿到每一个内层key
            for (String inKey : keySet2) {
                //根据内层map的key找到内容map的value
                String inValue = outValue_Map.get(inKey);
//			内层key： inKey
//			内层value: inValue
                System.out.println("孩子："+inKey+" 爸爸："+inValue);
            }
        }
    }

}
