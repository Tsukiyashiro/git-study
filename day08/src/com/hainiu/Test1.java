package com.hainiu;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("D:\\javaproject\\Javaproject\\day08\\bg.jpg");
        FileOutputStream fos = new FileOutputStream("day08\\src\\com\\bg.jpg");
        ) {
            byte[] buffer = new byte[8192];
            int len;
            while ((len = fis.read(buffer))!= -1) {
            fos.write(buffer, 0, len);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
