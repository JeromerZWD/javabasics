package com.ecjtu.zwd.day16;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class w6 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new FileReader(new File("D:\\aa\\b.txt")));
        int i=1;
        String s;
        while((s=bufferedReader.readLine())!=null){
            System.out.println(i+" "+s);
            i++;
        }
    }
}
