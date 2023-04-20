package com.hainiu;

public class Homework08 {
    public static void main(String[] args) {
        int x = 1543;
        int count = 0;
        while (x > 0) {
            if (x % 2 != 0) {
                System.out.println(x);
                x = (x - 1) / 2;
                count++;
            } else {
                x = x / 2;
            }
        }
        System.out.println("它一共要丢掉"+count+"个核桃");
    }
}
