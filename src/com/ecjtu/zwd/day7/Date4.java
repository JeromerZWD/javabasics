package com.ecjtu.zwd.day7;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Date4 {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Calendar calendar=Calendar.getInstance();
        calendar.add(Calendar.DATE,-1);
        String time=simpleDateFormat.format(calendar.getTime());
        System.out.println(time);
    }
}
