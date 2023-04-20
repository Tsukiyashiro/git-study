package com.hainiu;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "位评委的打分");
            int j = sc.nextInt();
            if (j >= 0 && j <= 10) {
                arr[i] = j;
            } else {
                System.out.println("您输入的有误，请重新输入");
                i--;
            }
        }
        int sum = sum(arr);
        int max = max(arr);
        int min = min(arr);
        double ave = (sum - max - min) * 1.0 / (arr.length - 2);
        System.out.println("评委打分最终为" + ave);

    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}


