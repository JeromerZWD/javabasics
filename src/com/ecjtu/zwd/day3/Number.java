package com.ecjtu.zwd.day3;

public class Number {
    private int n1;
    private int n2;

    public Number(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public void add(){
        System.out.println("做加法,结果为："+(n1+n2));
    }
    public void sub(){
        System.out.println("做减法,结果为："+(n1-n2));
    }
    public void mul(){
        System.out.println("做乘法,结果为："+(n1*n2));
    }
    public void div(){
        System.out.println("做除法,结果为："+(n1/n2));
    }

}
