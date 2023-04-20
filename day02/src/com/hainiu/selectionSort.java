package com.hainiu;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {9, 526, 48, 16, 78948, 121, 1112, 123, 54, 99};
        selectionSort(arr);
        String s = Arrays.toString(arr);
        System.out.println(s);

    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (i != min) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }
}
