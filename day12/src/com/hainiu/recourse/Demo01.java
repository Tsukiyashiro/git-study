package com.hainiu.recourse;

public class Demo01 {
    public static void main(String[] args) {
        System.out.println(fb(12));

    }

    public static int fb(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fb(n - 1) + fb(n - 2);
    }
}
