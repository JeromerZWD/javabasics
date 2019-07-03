package com.ecjtu.zwd.day16;

import java.io.File;
import java.lang.reflect.Array;
import java.util.Arrays;

public class w7 {
    public static void main(String[] args) {
        File file=new File("D:\\aa");
        File[] files=file.listFiles();
        Arrays.sort(files);
        for (File f:files) {
            if (f.isDirectory()){
                System.out.println(f.getName());
            }
        }
        for (File f:files) {
            if (f.isFile()){
                System.out.println(f.getName());
            }
        }
    }
}
