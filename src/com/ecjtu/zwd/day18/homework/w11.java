package com.ecjtu.zwd.day18.homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class w11 {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<Integer, String>();
        map.put(1930,"乌拉圭");
        map.put(1934,"意大利");
        map.put(1938,"意大利");
        map.put(1950,"乌拉圭");
        map.put(1954,"德国");
        map.put(1958,"巴西");
        map.put(1962,"巴西");
        map.put(1966,"英格兰");
        map.put(1970,"巴西");
        map.put(1974,"德国");
        map.put(1978,"阿根廷");
        map.put(1982,"意大利");
        map.put(1986,"阿根廷");
        map.put(1990,"德国");
        map.put(1994,"巴西");
        map.put(1998,"法国");
        map.put(2002,"巴西");
        map.put(2006,"意大利");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入年份:");
        int year=scanner.nextInt();
        if (map.containsKey(year)){
            System.out.println(year+"年世界杯冠军是:"+map.get(year));
        }else{
            System.out.println("没有举办世界杯");
        }
        System.out.println("请输入球队的名称:");
        String name=scanner.next();
        Set<Map.Entry<Integer,String>> set=map.entrySet();
        Boolean f=false;
        for (Map.Entry<Integer,String> entry: set) {
                if (name.equals(entry.getValue())){
                    f=true;
                    System.out.println(entry.getKey());
                }
        }
        if (f==false){
            System.out.println("没有获得过世界杯");
        }
    }
}
