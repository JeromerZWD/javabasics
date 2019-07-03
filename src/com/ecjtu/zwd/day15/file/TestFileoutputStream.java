package com.ecjtu.zwd.day15.file;

import java.io.*;

public class TestFileoutputStream {
    public static void main(String[] args) {
       /* try {
            //д����������ļ�������
            OutputStream os=new FileOutputStream("copy.txt");
            os.write("hello outputstream".getBytes());
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
*/
        copy("��������Ҫ����.mp3","copy.mp3");


    }
    private static void copy(String src,String dest){
        try {
            InputStream is=new FileInputStream(src);
            OutputStream os=new FileOutputStream(dest);
            int len=0;//����ÿ�ζ�ȡ���ֽ���
            byte[]buf=new byte[1024];
            while((len=is.read(buf))!=-1){
                os.write(buf,0,len);
            }
            is.close();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return;
    }
}
