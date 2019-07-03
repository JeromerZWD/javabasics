package com.ecjtu.zwd.day16;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class w4 {
    public static void main(String[] args) throws IOException {
        BufferedWriter writer=new BufferedWriter(new FileWriter(new File("D:\\aa\\hello.txt")));
        String s="HelloJavaWorld你好世界";
        writer.write(s,0,s.length());
        writer.close();
    }

}
