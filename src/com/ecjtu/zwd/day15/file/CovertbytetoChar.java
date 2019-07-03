package com.ecjtu.zwd.day15.file;

import java.io.*;

public class CovertbytetoChar {

    public static void main(String[] args) throws IOException {
        //��ȡ���������ת��Ϊ�ַ���
        InputStream in=System.in;
        //ʹ��ת�������ֽ���ת��Ϊ�ַ���
        BufferedReader br=new BufferedReader(new InputStreamReader(in));
        BufferedWriter bw=new BufferedWriter(new FileWriter("test.txt"));
        String line=br.readLine();
        //while((line=br.readLine())!=null){
           bw.write(line);
           bw.newLine();
       // }
        bw.close();
        br.close();
    }
}
