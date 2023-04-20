package com.hainiu.sort;

import java.util.Arrays;

public class BubbleSort1 {
    public static void main(String[] args) {
        int[] arr = {5, 6, 9, 4, 53, 32, 23, 11, 12, 156};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
