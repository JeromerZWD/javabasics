package com.ecjtu.zwd.day14.Demo;

import java.io.IOException;
import java.net.*;

public class Send {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket=new DatagramSocket();
        byte[] bytes="测试UDP".getBytes();
        DatagramPacket packet=new DatagramPacket(bytes,bytes.length, InetAddress.getLocalHost(),8084);
        socket.send(packet);
        System.out.println("发送成功");
        socket.close();
    }
}
