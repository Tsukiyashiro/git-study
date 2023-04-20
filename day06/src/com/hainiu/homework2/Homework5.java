package com.hainiu.homework2;

import java.util.Random;
import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("生成验证码:");
            String code = code();
            System.out.println(code);
            System.out.println("请输入验证码");
            String input = sc.nextLine();
            if (code.equalsIgnoreCase(input)) {
                System.out.println("验证码正确");
                break;
            } else {
                System.out.println("验证码错误,刷新验证码");
            }
        }

    }

    public  static String  code(){
        String str = "";
        for (int i = 0; i <= 9; i++) {
            str += i;
        }
        for (char i = 'a'; i <= 'z'; i++) {
            str += i;
        }
        for (char i = 'A'; i <= 'Z'; i++) {
            str += i;
        }
        String code = "";
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int nextInt = r.nextInt(str.length());
            char c = str.charAt(nextInt);
            code += c;
        }
        return code;
    }
}
