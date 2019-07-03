package com.ecjtu.zwd.day15.file;

import java.io.*;

public class TestBufferedStream {
    public static void main(String[] args) {
       String str;
        try {
            InputStream is=new FileInputStream("��������Ҫ����.mp3");
            OutputStream os=new FileOutputStream("��������Ҫ����1.mp3");
            BufferedInputStream bis=new BufferedInputStream(is);
            BufferedOutputStream bos=new BufferedOutputStream(os);
            int len=0;
            byte[]buf=new byte[1024];
            while((len=bis.read(buf))!=-1){
                bos.write(buf,0,len);
            }
            bos.close();
            os.close();
            bis.close();
            is.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
