package com.hainiu.recourse;

public class Demo02 {
    public static void main(String[] args) {
        System.out.println(hnt(5));

    }

    public static int hnt(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 3;
        }
        return 2 * hnt(n - 1) + 1;

    }
}
