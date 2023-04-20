package com.hainiu;

public class Homework07 {
    public static void main(String[] args) {
        int rabbit = rabbit(12);
        System.out.println(rabbit);

    }

    public static int rabbit(int x) {
        if (x == 1) {
            return 1;
        }
        if (x == 2) {
            return 1;
        }
        return rabbit(x - 1) + rabbit(x - 2);
    }
}
