package com.hainiu.recourse;

import java.io.File;

public class Demo05 {



    public static void main(String[] args) {
        File file = new File("C:\\Users\\Tsuki\\Desktop\\CloudMusic");
        System.out.println(fl(file));


    }

    public static long fl(File dir) {
        long sum = 0;
        if (!dir.exists()) {
            return 0;
        }
        if (dir.isFile()) {
            return dir.length();
        }
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    long length = file.length();
                    sum += length;
                } else {
                    sum += fl(file);
                }
            }
        }
        return sum;
    }
}
