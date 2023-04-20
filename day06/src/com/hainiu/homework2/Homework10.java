package com.hainiu.homework2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Homework10 {
    public static void main(String[] args) {
        System.out.println(add(1.6, 2.6));
        System.out.println(div(1.4, 0.3));

    }

    public static double add(double x, double y){
        BigDecimal b1 = new BigDecimal(x);
        BigDecimal b2 = new BigDecimal(y);
        return b1.add(b2).doubleValue();
    }

    public static double div(double x, double y){
        BigDecimal b1 = new BigDecimal(x);
        BigDecimal b2 = new BigDecimal(y);
        return b1.divide(b2,5, RoundingMode.HALF_UP).doubleValue();
    }
}
