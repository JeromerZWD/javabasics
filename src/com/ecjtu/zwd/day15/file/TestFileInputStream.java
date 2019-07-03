package com.ecjtu.zwd.day15.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class TestFileInputStream {

    public static void main(String[] args)  {
        readByArray();
        //readByByte();

    }

    private static void readByByte(){
       long start=System.currentTimeMillis();
        //�����ֽ�����������
        InputStream is= null;
        StringBuffer sb=new StringBuffer();
        try {
            is = new FileInputStream("a.txt");
            int len=0;
            //û�ж�ȡ���ļ�ĩβ
            //ÿ�ζ�ȡһ���ֽ�
            while((len=is.read())!=-1){
               System.out.println((char)len);
            }
            //System.out.println(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            long end=System.currentTimeMillis();
            System.out.println("�ܹ����˶���ʱ��"+(end-start));
            try {
                is.close();//�ر�������
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private static void readByArray() {
        long start=System.currentTimeMillis();
        //�����ֽ�����������
        InputStream is= null;
        StringBuffer sb=new StringBuffer();
        try {
            is = new FileInputStream("a.txt");
            int len=0;
            //û�ж�ȡ���ļ�ĩβ
            byte[]buf=new byte[1024];
            while((len=is.read(buf))!=-1){
              String str=new String(buf,0,len);
              sb.append(str);
            }
            System.out.println(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            long end=System.currentTimeMillis();
            System.out.println("�ܹ����˶���ʱ��"+(end-start));
        }
    }

}
