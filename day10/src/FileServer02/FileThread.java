package FileServer02;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class FileThread implements Runnable {
    private final Socket socket;

    public FileThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        FileOutputStream out = null;
        try {
            InputStream in = socket.getInputStream();
            String name = UUID.randomUUID().toString().replaceAll("-", "");
            out = new FileOutputStream("day10\\upload\\" + name + ".jpg");
            byte[] bytes = new byte[8192];
            int len;
            while ((len = in.read(bytes)) != -1) {
                out.write(bytes, 0, len);
            }
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            writer.write("成功上传");
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
