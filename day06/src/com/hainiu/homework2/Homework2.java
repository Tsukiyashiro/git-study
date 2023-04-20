package com.hainiu.homework2;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= 'a' && c <= 'z')||(c >= 'A' && c <= 'z')) {
                count++;
            }
        }
        System.out.println(count);
    }
}
