package com.hainiu;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {9, 5, 7, 1, 2, 3, 6, 4, 5, 6, 1, 7};
        bubbleSort(arr);
        String s = Arrays.toString(arr);
        System.out.println(s);
    }


    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
