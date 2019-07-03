package com.ecjtu.zwd.day16;

import java.io.*;

public class w3 {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader=new BufferedReader(new FileReader(new File("D:\\aa\\b.txt")));
        String s;
        while ((s=bufferedReader.readLine())!=null){
            System.out.println(s);
        }
        bufferedReader.close();
    }
}
