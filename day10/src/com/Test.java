package com;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Test {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
//        while (true) {
            String data = "你白银觉得是我的锅，那就是我的锅";
            byte[] bytes = data.getBytes();
            InetAddress address = InetAddress.getByName("192.168.62.33");
            int port  = 10555;
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length,address,port);
            socket.send(packet);
//        }
        socket.close();
    }
}
