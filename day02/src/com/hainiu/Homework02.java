package com.hainiu;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩");
        int i = sc.nextInt();
        if (i > 100 || i < 0) {
            System.out.println("输入成绩有误");
        } else if (i > 90) {
            System.out.println("等级为A");
        } else if (i >= 80) {
            System.out.println("等级为B");
        } else if (i >= 60) {
            System.out.println("等级为C");
        } else {
            System.out.println("等级为D");
        }
    }
}
