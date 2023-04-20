package com.hainiu;

public class Homework06 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 6, 2, 32, 65, 41, 20};
        int[] newArr = newArr(arr, 1, 6);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    public static int[] newArr(int[] arr, int fromIndex, int len) {
        int[] newArr = new int[len];
        for (int i = fromIndex; i < fromIndex + len; i++) {
            newArr[i-fromIndex] = arr[i];
        }return newArr;
    }
}

    /*public static int[] newArr(int[] arr, int fromIndex, int len) {
        int[] newArr = new int[len];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i >= fromIndex && i < (fromIndex + len)) {
                newArr[j] = arr[i];
                j++;
            }
        }return newArr;
    }*/

