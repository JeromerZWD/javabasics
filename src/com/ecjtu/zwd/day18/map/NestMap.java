package com.ecjtu.zwd.day18.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class NestMap {
    public static void main(String[] args) {
        // 创建集合对象
        List<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
        // 创建元素对象
        HashMap<String, String> one = new HashMap<String, String>();
        one.put("kimy", "林志颖");
        one.put("石头", "郭涛");
        one.put("cindy", "田亮");

        HashMap<String, String> two = new HashMap<String, String>();
        two.put("多多", "黄磊");
        two.put("贝儿", "陆毅");
        two.put("杨阳洋", "杨威");

        HashMap<String, String> three = new HashMap<String, String>();
        three.put("莫一", "刘烨");
        three.put("明星甲的孩子", "明星甲");
        three.put("明星乙的孩子", "明星乙");

        // 将元素放到集合中
        list.add(one);
        list.add(two);
        list.add(three);

        System.out.println(list);

        // 遍历外层list,依次拿到每一个内层Map
        for (HashMap<String, String> hashMap : list) {
            // 遍历内层map集合
            // 返回该map中的所有键的set集合
            Set<String> keySet = hashMap.keySet();

            // 迭代键的集合，依次获取到每一个键
            for (String key : keySet) {
                // 根据map中的键获取map中的值
                String value = hashMap.get(key);
                System.out.println("孩子:" + key + " 爸爸：" + value);
            }
        }
    }
}
