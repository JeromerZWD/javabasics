package com.ecjtu.zwd.day18.homework;

import java.util.*;

public class w15 {
    public static void main(String[] args) {
        List<Student15> list=new ArrayList();
        list.add(new Student15("Tom",18,100,"class05"));
        list.add(new Student15("Jerry",22,70,"class04"));
        list.add(new Student15("Owen",25,90,"class05"));
        list.add(new Student15("Jim",30,80,"class05"));
        list.add(new Student15("Steve",28,66,"class06"));
        list.add(new Student15("Kevin",24,100,"class04"));
        int sum=0;
        for (Student15 s:list){
            sum+=s.getAge();
        }
        System.out.println("平均年龄:"+sum/list.size());

       /* Map.Entry<String,List<Integer>>;*/
        Map<String,List<Double>> map=new HashMap();
        for (Student15 s:list) {
            if (s.getClassNum().equals("class05")){
                if(!map.containsKey("class05")){
                    List<Double> list2=new ArrayList<Double>();
                    list2.add(s.getScore());
                    map.put("class05",list2);
                }else{
                    List<Double>list2=map.get("class05");
                    list2.add(s.getScore());
                }
            }
            if (s.getClassNum().equals("class04")){
                if(!map.containsKey("class04")){
                    List<Double> list2=new ArrayList<Double>();
                    list2.add(s.getScore());
                    map.put("class04",list2);
                }else{
                    List<Double>list2=map.get("class04");
                    list2.add(s.getScore());
                }
            }
            if (s.getClassNum().equals("class06")){
                if(!map.containsKey("class06")){
                    List<Double> list2=new ArrayList<Double>();
                    list2.add(s.getScore());
                    map.put("class06",list2);
                }else{
                    List<Double>list2=map.get("class06");
                    list2.add(s.getScore());
                }
            }
        }
        List<Double> l1=map.get("class04");
        List<Double> l2=map.get("class05");
        List<Double> l3=map.get("class06");
        double sum2=0;
        for (int i=0;i<l1.size();i++){
            sum2+= l1.get(i);
        }
        double sum3=0;
        for (int i=0;i<l2.size();i++){
            sum3+= l2.get(i);
        }
        double sum4=0;
        for (int i=0;i<l3.size();i++){
            sum4+= l3.get(i);
        }
        System.out.println(sum2/l1.size());
        System.out.println(sum3/l2.size());
        System.out.println(sum4/l3.size());
    }
}
