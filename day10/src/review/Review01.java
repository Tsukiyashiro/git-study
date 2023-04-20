package review;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Review01 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:\\javaproject\\Javaproject\\day10\\upload\\bg.jpg");
            FileOutputStream fos = new FileOutputStream("day10\\src\\review\\bg.jpg");
            byte[] bytes = new byte[8192];
            int len;
            while ((len = fis.read(bytes)) != -1){
                fos.write(bytes, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
