package FileServer01;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class FileClient {
    public static void main(String[] args) throws Exception {
        FileInputStream in = new FileInputStream("D:\\javaproject\\Javaproject\\day08\\dante.jpg");
        Socket  socket = new Socket(InetAddress.getByName("127.0.0.1"), 10456);

        OutputStream out =socket.getOutputStream();
        byte[] bytes = new byte[8192];
        int len;
        while ((len = in.read(bytes))!= -1) {
            out.write(bytes, 0, len);
            out.flush();
        }
        socket.shutdownOutput();

        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String result = reader.readLine();
        System.out.println(result);
        out.close();
    }
}
