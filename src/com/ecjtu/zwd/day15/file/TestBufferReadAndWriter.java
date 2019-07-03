package com.ecjtu.zwd.day15.file;

import java.io.*;

public class TestBufferReadAndWriter {

    public static void main(String[] args) {
        try {
            Reader reader=new FileReader("a.txt");
            BufferedReader br=new BufferedReader(reader);
            Writer writer=new FileWriter("c.txt");
            BufferedWriter bw=new BufferedWriter(writer);
            String line=null;//����ÿ�ζ�ȡ��һ��
            //��ȡû�ж�ȡ���κ��ַ����÷�������null
            while((line=br.readLine())!=null) {
                bw.write(line);
            }
            bw.close();
            writer.close();
            br.close();
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
