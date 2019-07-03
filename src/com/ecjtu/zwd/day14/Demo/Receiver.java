package com.ecjtu.zwd.day14.Demo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receiver {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket=new DatagramSocket(8084);
        byte[]bytes=new byte[1024];
        DatagramPacket packet=new DatagramPacket(bytes,bytes.length);
        socket.receive(packet);
        int port=packet.getPort();
        String data=new String(bytes,0,packet.getLength());
        String ip=packet.getAddress().getHostAddress();
        System.out.println("接收到的端口"+port+"接收的数据"+data);
        System.out.println("ip地址"+ip);
        socket.close();
    }
}
