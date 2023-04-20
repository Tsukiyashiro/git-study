package com.hainiu;

import java.util.Scanner;

public class Homework08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
        int x = sc.nextInt();
        int[] arr = {11, 22, 33, 44, 55};
        int[] newArr = newArr(arr, x);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    public static int[] newArr(int[] arr, int x) {
        /*int[] newArr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        for (int i = newArr.length - 2; i >= 0; i--) {
            if (x < newArr[i]) {
                newArr[i + 1] = newArr[i];
                newArr[i] = x;
            } else {
                newArr[i + 1] = x;
                break;
            }
        }
        return newArr;*/
        int index = 0;
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            if (x > arr[i]) {
                newArr[i] = arr[i];
                index++;
            } else {
                newArr[i + 1] = arr[i];
            }
        }
        newArr[index] = x;
        return newArr;
    }

}

