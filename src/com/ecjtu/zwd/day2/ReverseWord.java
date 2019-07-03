package com.ecjtu.zwd.day2;

public class ReverseWord {

    public static void main(String[] args) {
        String str="test";
        StringBuffer sb=new StringBuffer(str);
        String str1= sb.reverse().toString();
        System.out.println(str1);
    }
}
