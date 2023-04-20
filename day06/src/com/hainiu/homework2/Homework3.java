package com.hainiu.homework2;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        String id = "admin";
        String pwd = "123456";
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("请输入用户名");
            String s1 = sc.nextLine();
            System.out.println("请输入密码");
            String s2 = sc.nextLine();
            if (s1.equals(id) && s2.equals(pwd)) {
                System.out.println("欢迎");
                break;
            }else {
                System.out.println("用户名或密码错误,请重新输入。您还有"+(5-i)+"次机会");
            }
        }
    }
}
