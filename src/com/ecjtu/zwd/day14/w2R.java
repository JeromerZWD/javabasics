package com.ecjtu.zwd.day14;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class w2R {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket=new DatagramSocket(8084);
        byte[] bytes=new byte[1024];
        DatagramPacket packet=new DatagramPacket(bytes,bytes.length);
        socket.receive(packet);
        System.out.println("数据："+new String(bytes,0,packet.getLength()));
        socket.close();


    }
}
