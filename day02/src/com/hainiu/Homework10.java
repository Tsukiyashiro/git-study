package com.hainiu;

public class Homework10 {
    public static void main(String[] args) {
        int x = 20;
        int y = 3;
        int sum1 = 0;
        int sum2 = 0;
        while (x >= y) {
            sum1 = x / y;
            sum2 += sum1;
            x = x % y + sum1;
        }
        System.out.println(sum2);
    }
}
