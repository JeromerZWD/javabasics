package com.ecjtu.zwd.day7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class zhengze {
    public static void main(String[] args) {
        String s="我我....我...我.要...要要...要学....学学..学.编..编.编.编.程.程.程..程";
       String s1=s.replaceAll("\\.","");
       String s2=s1.replaceAll("(.)\\1+","$1");
        System.out.println(s2);

    }
}
