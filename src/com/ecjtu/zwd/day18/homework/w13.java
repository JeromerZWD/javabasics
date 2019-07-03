package com.ecjtu.zwd.day18.homework;

import banking.Account;

import java.util.*;

public class w13 {
    public static void main(String[] args) {
        List<Account13> list=new ArrayList();
        list.add(new Account13(10.00,"1234"));
        list.add(new Account13(15.00,"5678"));
        list.add(new Account13(0,"1010"));
        Map<Long,Account13> map=new HashMap<Long,Account13>();
        long i=1;
        for (Account13 a:list) {
            map.put(i,a);
            i++;
        }
        Set<Map.Entry<Long,Account13>>entries=map.entrySet();
        for (Map.Entry<Long,Account13> entry:entries) {
            System.out.println(entry.getKey()+":"+entry.getValue().getBalance());
        }
    }
}
