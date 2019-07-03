package com.ecjtu.zwd.day16;

import java.io.File;

public class w2 {
    public static void main(String[] args) {
            File file=new File("C:\\Users\\17270\\IdeaProjects\\javabasics\\src\\com\\ecjtu\\zwd");
            print(file);
    }
    public static void print(File s){
        File[]files=s.listFiles();
        for (File f:files) {
            if (f.isFile()){
               if (f.getName().endsWith(".java")){
                   System.out.println(f.getName());
               }
            }else if (f.isDirectory()){
                print(f);
            }
        }

    }
}
