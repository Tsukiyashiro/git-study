package com.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //引用键盘录入的方法
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一段纯英文文本");
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (char j = 'a'; j <= 'z'; j++) {
                if (c == j) {
                    count++;
                    System.out.println(j + "=" + count);
                }
            }
        }
    }
}

