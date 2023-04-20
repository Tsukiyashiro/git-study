package com.hainiu;

import java.util.Random;
import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {
        Random r = new Random();
        int i = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个1-100的数字");
            int j = sc.nextInt();
            if (j < i) {
                System.out.println("猜的有点小了捏");
            } else if (j > i) {
                System.out.println("猜的有点大了哦");
            } else {
                System.out.println("恭喜你猜对了喵");
                break;
            }
        }
    }
}
