package FileServer02;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.*;

public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(10456);

        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,
                8,
                20,
                TimeUnit.SECONDS,
                 new ArrayBlockingQueue<>(5),
                 Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );
        while (true) {
            Socket socket = serverSocket.accept();
            pool.submit(new FileThread(socket));
        }
    }
}
