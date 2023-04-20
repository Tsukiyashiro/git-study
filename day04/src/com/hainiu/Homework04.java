package com.hainiu;

public class Homework04 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6, 7, 9, 10, 31};
        int i = binarySearch(arr, 6);
        System.out.println(i);
    }

    private static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (end >= start) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else if (arr[mid] < key) {
                start = mid + 1;
            }
        }
        return -1;
    }
}
