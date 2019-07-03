package com.ecjtu.zwd.day7;

public class Email {
    public static void main(String[] args) {
        String s="dasdasd@ads.aa";
        String reg = "[a-zA-Z_0-9]+@[a-zA-Z_0-9]+(\\.[a-zA-Z]+)+";
        System.out.println(s.matches(reg)?"邮箱合法":"不合法");
    }
}
