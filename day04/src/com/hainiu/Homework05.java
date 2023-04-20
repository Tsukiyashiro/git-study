package com.hainiu;

public class Homework05 {
    public static void main(String[] args) {
        int[][] arr = {{10, 20, 40}, {20, 25, 30}, {60, 70, 90}, {80, 100, 20}};
        int year = 0;
        for (int i = 0; i < arr.length; i++) {
            int quarter = 0;
            for (int j = 0; j < arr[i].length; j++) {
                quarter += arr[i][j];
            }
            System.out.println("第" + (i + 1) + "个季度的营业额为" + quarter);
            year += quarter;
        }
        System.out.println("年营业额为" + year);
    }
}
