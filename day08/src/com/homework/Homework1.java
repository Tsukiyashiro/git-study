package com.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Homework1 {
    public static void main(String[] args) {
        /*File file = new File("D:\\javaproject\\Javaproject\\day08\\src\\com\\bg.jpg");
        System.out.println(file.delete());*/
        try {
            FileInputStream fis = new FileInputStream("D:\\javaproject\\Javaproject\\day08\\bg.jpg");
            FileOutputStream fos = new FileOutputStream("day08\\src\\com\\bg.jpg");
            byte[] buffer = new byte[8192];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
