package com.hainiu;

public class Homework07 {
    public static void main(String[] args) {
        int week = 0;
        int sum = 0;
        for (int i = 1; i <= 52; i++) {
            week += 10;
            sum += week;
        }
        System.out.println(sum);
    }
}
