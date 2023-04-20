package com.hainiu;

import java.util.Arrays;

public class insertSort {
    public static void main(String[] args) {
        int[] arr = {9, 526, 48, 16, 78948, 121, 1112, 123, 54, 99};
        insert(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insert(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            for (; j >= 0 ; j--) {
                if (arr[j] > temp) {
                    arr[j + 1] = arr[j];
                } else {
                    arr[j + 1] = temp;
                    break;
                }
            }
            arr[j + 1] = temp;
        }
    }
}
