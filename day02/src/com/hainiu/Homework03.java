package com.hainiu;

public class Homework03 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i < 1000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;
            if (Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3) == i) {
                System.out.println(i+"为水仙花数");
                count++;
            }
        }
        System.out.println("水仙花数共有" + count + "个");
    }
}
