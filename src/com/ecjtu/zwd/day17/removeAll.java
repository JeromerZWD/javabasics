package com.ecjtu.zwd.day17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class removeAll {
    public static void main(String[] args) {
        ArrayList s1=new ArrayList();
        s1.add("a");
        s1.add("b");
        s1.add("c");
        s1.add("d");
        s1.add("e");
        ArrayList s2=new ArrayList();
        s2.add("d");
        s2.add("e");
        s2.add("f");
        s2.add("g");
        s2.add("h");
        s1.removeAll(s2);
        for (int i=0;i<s1.size();i++) {
            s2.add(s1.get(i));
        }
        Iterator it=s2.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
