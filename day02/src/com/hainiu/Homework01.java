package com.hainiu;

import java.util.Random;

public class Homework01 {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(100);
        System.out.println(i);
        int x = random.nextInt(100);
        System.out.println(x);
        int y = random.nextInt(100);
        System.out.println(y);
        int temp = x > y ? x : y;
        int max = temp > i ? temp : i;
        System.out.println(max);
    }
}
