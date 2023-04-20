package FileServer01;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10456);

        Socket socket = serverSocket.accept();
        InputStream in = socket.getInputStream();
        FileOutputStream out  =  new FileOutputStream("day10\\upload\\bg.jpg");
        byte[] bytes = new byte[8192];
        int len;
        while ((len = in.read(bytes))!= -1) {
            out.write(bytes, 0, len);
        }

        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        writer.write("成功上传");
        writer.newLine();
        writer.flush();
        out.close();
        socket.close();
    }
}
