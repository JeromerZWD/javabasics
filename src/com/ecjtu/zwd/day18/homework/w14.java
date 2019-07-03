package com.ecjtu.zwd.day18.homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class w14 {
    public static void main(String[] args) {
        List<String> list=new ArrayList();
        list.add(new String("科特迪瓦"));
        list.add(new String("阿根廷"));
        list.add(new String("澳大利亚"));
        list.add(new String("塞尔维亚"));
        list.add(new String("荷兰"));
        list.add(new String("尼日利亚"));
        list.add(new String("日本"));
        list.add(new String("美国"));
        list.add(new String("中国"));
        list.add(new String("新西兰"));
        list.add(new String("巴西"));
        list.add(new String("比利时"));
        list.add(new String("韩国"));
        list.add(new String("柯麦隆"));
        list.add(new String("洪都拉新"));
        list.add(new String("意大利"));
        Random random=new Random();
       for (int i=1;i<=4;i++){
           System.out.println(i+"组");
           for (int j=1;j<=4;j++){
               String str;
               str=list.get(random.nextInt(list.size()));
               list.remove(str);
               System.out.println(str);
           }
       }
    }
}
