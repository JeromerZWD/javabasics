package com.ecjtu.zwd.day15;

import java.io.*;

public class w2 {
    public static void main(String[] args) throws IOException {
        File src = new File("D:\\aa\\img");
        // 目的地
        File dest = new File("D:\\aa\\img2");
        copyFile(src, dest);
    }

    public static void copyFile(File src, File dest) throws IOException {
        File newFile =new File(dest,src.getName());
        if (!newFile.exists()){
            newFile.mkdirs();
        }
        File[] files=src.listFiles();
        for (File file:files) {
            if (file.isFile()){
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(newFile,file.getName()));
                byte[] bytes = new byte[1024];
                int len;
                while((len  = fis.read(bytes)) !=-1){
                    fos.write(bytes, 0, len);
                }
                fos.close();
                fis.close();
            }else if (file.isDirectory()){
                copyFile(file, newFile);
            }
        }

    }
}
