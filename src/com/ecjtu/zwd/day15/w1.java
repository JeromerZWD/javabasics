package com.ecjtu.zwd.day15;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class w1 {
    public static void main(String[] args) {
        String s=read();
        String[]s1=s.split("");
        Arrays.sort(s1);
        StringBuffer sb=new StringBuffer();
       for (int i=0;i<s1.length;i++){
           sb.append(s1[i]);
       }
       String s3=sb.toString();
        String s4=s3.replaceAll("(.)\\1+","$1");
        System.out.println(s4);

    }
    public static String read(){
        InputStream in=null;
        StringBuffer sb=new StringBuffer();
        try{
            File file=new File("D:\\aa\\a.txt");
           in=new FileInputStream(file);
            byte[]bytes=new byte[1024];
            int len=0;
            while ((len=in.read(bytes))!=-1){
                sb.append(new String(bytes,0,len));
            }
            String s=sb.toString();
            return s;
        }catch (IOException e){
            e.printStackTrace();
        }
        return "";
    }


}
