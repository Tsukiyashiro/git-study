package com;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Receive {
    public static void main(String[] args) throws Exception {
        int port = 20489;
        DatagramSocket socket = new DatagramSocket(port);

        byte[] buffer = new byte[2048];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        while (true) {
            socket.receive(packet);
            int len = packet.getLength();
            String s = new String(buffer, 0, len);
            String ip = packet.getAddress().getHostAddress();
            System.out.println(ip + "说：" + s);
        }
    }
}
