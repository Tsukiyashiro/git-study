package com.test;

import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[10];
        for (int j = 0; j < 10; j++) {
            int i = r.nextInt(100) + 1;
            arr[j] = i;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int max = max(arr);
        System.out.println(max);
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
