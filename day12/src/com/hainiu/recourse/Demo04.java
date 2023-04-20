package com.hainiu.recourse;

import java.io.File;

public class Demo04 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Tsuki\\Desktop\\aaa");
        fd(file);

    }

    public static void fd(File dir){
        if (!dir.exists()){
            return;
        }
        if (dir.isFile()) {
            dir.delete();
            return;
        }
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    file.delete();
                }
                else {
                     fd(file);
                }
            }
            dir.delete();
        }
    }
}
