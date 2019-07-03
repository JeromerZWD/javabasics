package com.ecjtu.zwd.day16;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class w5 {
    public static void main(String[] args) {


        /*
         * 使用随机文件流类RandomAccessFile将一个文本文件倒置读出。
         */
                File file = new File("D:\\aa\\b.txt");
                try {
                    RandomAccessFile raf = new RandomAccessFile(file, "r");//指定一个 mode 参数r
                    System.out.println(raf.length());
                    long length = raf.length();
                    StringBuffer sb = new StringBuffer();
                    while (length > 0) {
                        length--;
                        raf.seek(length);
                        int c = (char) raf.readByte();
                        if (c >= 0 && c <= 255) {
                            sb.append((char) c);
                        } else {
                            length-=2;
                            raf.seek(length);
                            //GBK:汉字占两个字节；utf-8：汉字占3个字节
                            byte[] cc = new byte[3];
                            raf.readFully(cc);
                            sb.append(new String(cc));
                        }
                    }
                    System.out.println(sb);
                    raf.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


