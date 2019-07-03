package com.ecjtu.zwd.day17.homework;

import java.util.ArrayList;
import java.util.Iterator;

public class w5 {
    public static void main(String[] args) {
        ArrayList<Worker> list=new ArrayList();
        list.add(new Worker("zhang3",18,3000));
        list.add(new Worker("li4",25,3500));
        list.add(new Worker("wang5",22,3200));
        list.add(1,new Worker("zhao6",24,3300));
        list.remove(3);
        for (Worker w:list) {
            System.out.println(w);
        }
        Iterator it=list.iterator();
        while(it.hasNext()){
            Worker w= (Worker) it.next();
            w.work();
        }
    }
}
