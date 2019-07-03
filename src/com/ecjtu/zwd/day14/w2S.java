package com.ecjtu.zwd.day14;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class w2S {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket=new DatagramSocket();
       byte[] bytes="10000".getBytes();
        DatagramPacket packet=new DatagramPacket(bytes,bytes.length, InetAddress.getLocalHost(),8084);
        socket.send(packet);
        System.out.println("发送成功");
        socket.close();
    }
}
