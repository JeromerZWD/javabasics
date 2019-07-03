package com.ecjtu.zwd.day15.file;

import java.io.File;
import java.io.IOException;

public class TextExe {
    public static void main(String[] args)throws IOException {
        Runtime runtime=Runtime.getRuntime();
        File file=new File("C:/WINDOWS", "regedit.exe");
        //�����ǽ���
        //Process process=runtime.exec(file.getAbsolutePath());
        File f=new File("aa.exe");
        runtime.exec(f.toString());
        //System.out.println();
    }
}
