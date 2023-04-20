package com.hainiu.recourse;

public class Demo03 {
    public static void main(String[] args) {
        System.out.println(mg(0, 0));

    }

    public static int mg(int x, int y) {
        if (x == 4 || y == 4) {
            return 1;
        }
        return mg(x + 1, y) + mg(x, y + 1);
    }
}
