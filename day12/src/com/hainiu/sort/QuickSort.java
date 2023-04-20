package com.hainiu.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 6, 9, 4, 53, 32, 23, 11, 12, 156};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int i = start;
            int j = end;
            int pivot = arr[i];
            while (i < j) {
                while (arr[j] >= pivot && i < j) {
                    j--;
                }
                if (i < j) {
                    arr[i] = arr[j];
                    i++;
                }
                while (arr[i] <= pivot && i < j) {
                    i++;
                }
                if (i < j) {
                    arr[j] = arr[i];
                    j--;
                }
            }
            arr[i] = pivot;
            quickSort(arr, start, i - 1);
            quickSort(arr, i + 1, end);
        }
    }

}
