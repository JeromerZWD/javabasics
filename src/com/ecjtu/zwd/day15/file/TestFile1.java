package com.ecjtu.zwd.day15.file;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

/**
 * ����ĳ��Ŀ¼�����.java
 */
public class TestFile1 {

    public static void main(String[] args)throws IOException {
       File dir=new File("src\\com\\ecjtu\\file");
       File[]files=dir.listFiles(new MyFileFilter("java"));
       for(File f:files){
           System.out.println(f.getName());
           System.out.println(f.getCanonicalPath());
           System.out.println(f.getAbsolutePath());
       }

    }
}

class MyFileFilter  implements FilenameFilter{
   private String suffix; //suffix---java,txt,exe
    public MyFileFilter(String str){
        this.suffix="."+str;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(suffix);
    }
}