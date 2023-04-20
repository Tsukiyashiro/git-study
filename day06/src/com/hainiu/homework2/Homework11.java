package com.hainiu.homework2;

import java.util.Arrays;

public class Homework11 {
    public static void main(String[] args) {
        String s = "11 110   20  25  18  17  15  22";
        String[] str = s.split("\\s+");
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}
