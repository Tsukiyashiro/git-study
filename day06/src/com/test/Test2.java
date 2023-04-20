package com.test;

public class Test2 {
    public static void main(String[] args) {
        String str = "abc/*-65466ss^&*kj";
        int count = cou(str);
        System.out.println(count);

    }

    public static int cou(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
                count++;
            }
        }
        return count;
    }

}
