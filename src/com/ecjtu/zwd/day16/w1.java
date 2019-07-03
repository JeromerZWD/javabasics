package com.ecjtu.zwd.day16;

import java.io.*;

public class w1 {
    public static void main(String[] args) throws IOException {
       /* InputStream in=new FileInputStream(new File("D:\\aa\\HelloWorld.txt"));*/
        File file=new File("D:\\aa\\HelloWorld.txt");
        File file2=new File("D:\\aa\\IoTest");
        if (file.isFile()) {
            File file1 = new File(file2, file.getName());
            FileInputStream fis = new FileInputStream(file);
            FileOutputStream fos = new FileOutputStream(file1);
            byte[] bytes = new byte[1024];
            int len;
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }

            fos.close();
            fis.close();
        }
            file.delete();
            File[] files=file2.listFiles();
        for (File f:files) {
            System.out.println(f.getName());
        }
        }
    }

