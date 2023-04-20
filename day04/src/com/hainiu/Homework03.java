package com.hainiu;

public class Homework03 {
    public static void main(String[] args) {
        int[] arr = {10, 60, 50, 40, 23, 26, 34};
        int search = search(arr, 6);
        System.out.println(search);
    }

    public static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
