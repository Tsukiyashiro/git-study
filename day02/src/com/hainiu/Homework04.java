package com.hainiu;

public class Homework04 {
    public static void main(String[] args) {
        double zf = 8844430;
        double paper = 0.1;
        int count = 0;
        while (paper <= zf) {
            paper += paper;
            count++;
        }
        System.out.println(count);
    }
}
