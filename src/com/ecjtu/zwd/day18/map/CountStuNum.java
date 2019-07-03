package com.ecjtu.zwd.day18.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/**
 * 一个点名程序。有五个同学，程序随机产生5个随机数，分别代表每个同学。产生1000次，
 * 要求输出每个同学的点到的总次数。选择合适的集合类完成。 根据次数排序
 */
public class CountStuNum {
    public static void main(String[] args) {
        Map map1 = new HashMap();
        map1.put(0, "tom");
        map1.put(1, "jack");
        map1.put(2, "mary");
        map1.put(3, "bob");
        map1.put(4, "jerry");
        Map map2 = new HashMap();
        map2.put("tom", 0);//value准备存放的是次数
        map2.put("jack", 0);
        map2.put("mary", 0);
        map2.put("bob", 0);
        map2.put("jerry", 0);
        for (int i = 0; i < 1000; i++) {
            Random random = new Random();
            int num = random.nextInt(5); //0-4
            if (map1.containsKey(num)) {
                int value = (int) map2.get(map1.get(num));
                value++;
                map2.put(map1.get(num), value);
            }
        }
        System.out.println(map2);
        int sum = 0;
        Set set = map2.keySet();
        for (Object object : set) {
            Integer value = (Integer) map2.get(object);
            sum += value;
        }
        System.out.println(sum);
    }
}
