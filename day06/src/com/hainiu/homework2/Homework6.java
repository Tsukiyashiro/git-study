package com.hainiu.homework2;

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一段字符串");
        String s = sc.nextLine();
        System.out.println(isHui(s));

    }

    public static boolean isHui(String str){
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
