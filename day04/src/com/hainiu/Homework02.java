package com.hainiu;

public class Homework02 {
    public static void main(String[] args) {
        int[] arr = {1, 6, 9, 8, 4, 6, 5};
        reverse(arr);
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i<arr.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (end > start) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
