package com.hainiu.homework2;

public class Homework7 {
    public static void main(String[] args) {
        int i = 13;
        Integer i1 = new Integer(i);
        System.out.println(i1);
        Integer i2 = new Integer("13");
        System.out.println(i2);
        String s1 = i1.toString();
        System.out.println(s1);
        Integer num = 150;
        System.out.println(num);
        num += 150;
        System.out.println(num);
        int x = Integer.parseInt(s1);
        System.out.println(x);
        String s2 = String.valueOf(100);
        System.out.println(s2);



    }
}
