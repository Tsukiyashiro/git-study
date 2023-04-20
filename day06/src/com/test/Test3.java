package com.test;

public class Test3 {
    public static void main(String[] args) {
        double x = 100;
        double high = high(x);
        System.out.println("小球第十次落地后达到的高度为" + high);
        double sum = sum(x);
        System.out.println("小球总路程有" + sum);

    }

    public static double high(double x) {
        for (int i = 0; i < 10; i++) {
            x /= 2;
            System.out.println(x);
        }
        return x;
    }

    public static double sum(double x) {
        double sum = x;
        for (int i = 0; i < 10; i++) {
            x /= 2;
            if (i < 9) {
                sum += (2 * x);
            } else {
                sum += x;
            }
            System.out.println(sum);
        }
        return sum;
    }
}
