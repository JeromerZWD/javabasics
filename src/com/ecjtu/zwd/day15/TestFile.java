package com.ecjtu.zwd.day15;

import java.io.File;
import java.io.IOException;

public class TestFile {
    public static void main(String[] args) throws IOException {
        String path="D:"+File.separator+"aa"+File.separator+"aaa.txt";
        File file=new File(path);
        System.out.println("文件名"+file.getName());
        System.out.println("父目录"+file.getParent());
        System.out.println("路径"+file.getPath());
        System.out.println("绝对路径"+file.getAbsolutePath());
        System.out.println(""+file.getCanonicalPath());
    }
}
