package com.hainiu.homework2;

import java.util.Arrays;

public class Regex3 {
    public static void main(String[] args) {
        String str = "11 22   33  44     55";
        String[] s = str.split("\\s+");
        System.out.println(Arrays.toString(s));
    }
}
