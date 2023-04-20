package com.hainiu;

import java.io.File;
import java.io.IOException;

public class api {
    public static void main(String[] args) throws IOException {
        File f1 = new File("day08\\src\\test");
        System.out.println(f1.mkdirs());
        File f2 = new File("day08\\src\\test\\tes.txt");
        System.out.println(f2.createNewFile());
        System.out.println(f2.delete());
        System.out.println(f1.delete());

    }
}
