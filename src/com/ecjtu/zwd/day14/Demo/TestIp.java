package com.ecjtu.zwd.day14.Demo;

import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestIp {
    @Test
    public void testGetLocalHost() throws UnknownHostException {
        InetAddress ip=InetAddress.getLocalHost();
        String s=ip.getHostAddress();
        System.out.println(s);
        System.out.println(ip.getHostName());

    }


}
