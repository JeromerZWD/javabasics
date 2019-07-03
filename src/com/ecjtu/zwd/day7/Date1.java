package com.ecjtu.zwd.day7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Date1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入生日 格式：yyyy-MM-dd");
        String day2=scanner.nextLine();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date d=simpleDateFormat.parse(day2);
            long d3=d.getTime();

            long d2=System.currentTimeMillis();//获取当前时间

            int day=(int)((d2-d3)/1000/60/60/24);//毫秒转换为天数
            System.out.println("来世界"+day+"天");
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
}
