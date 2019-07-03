package com.ecjtu.zwd.day7;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

//计算任意一年的二月有多少天
public class Date3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();
        GregorianCalendar gc = new GregorianCalendar(year,3 - 1,1);
        //将日期 -1
        gc.add(Calendar.DAY_OF_MONTH, -1);
        //获取日期
        int day = gc.get(Calendar.DAY_OF_MONTH);
        System.out.println(year + " 年的二月份有："  + day + " 天");
    }


}
