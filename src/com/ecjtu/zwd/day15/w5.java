package com.ecjtu.zwd.day15;

import java.io.*;

public class w5 {
    public static void main(String[] args) throws IOException {
        StringBuffer sb=new StringBuffer();
        Reader reader=new FileReader(new File("D:\\aa\\wo.txt"));
        BufferedReader bufferedReader=new BufferedReader(reader);
        int index=0;
        String a;
        while ((a=bufferedReader.readLine())!=null){
            sb.append(a);
        }
        a=sb.toString();
        System.out.println(a);
        char[] chars= a.toCharArray();
        for(int i=0;i<chars.length;i++){
            if (chars[i]=='我'){
                index++;
            }
        }
        System.out.println(index);
    }
}
