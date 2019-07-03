package com.ecjtu.zwd.day7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Date2 {
    public static void main(String[] args) {
        System.out.println("请输入工作的日期");
        Scanner scanner=new Scanner(System.in);
        String workday=scanner.nextLine();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date d1=simpleDateFormat.parse(workday);
            long t1=d1.getTime();
            long t2=System.currentTimeMillis();
            int day=(int)((t1-t2)/1000/24/60/60);
            System.out.println("还需"+day+"天");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
