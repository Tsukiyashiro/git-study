package com.test;

import java.util.Arrays;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        //先将红色的33个球赋值，可以使用循环赋值
        int[] arrRed = new int[33];
        for (int i = 0; i < 33; i++) {
            arrRed[i] = i + 1;
        }
        //红色双色球33个抽取六个我们可以调用方法来实现
        red(arrRed, arrRed.length);
        //使用随机数抽取1-16的一个作为蓝色球
        Random r1 = new Random();
        int i = r1.nextInt(15) + 1;
        System.out.println("蓝球：" + i);
    }

    public static void red(int[] arr, int n) {
        //首先定义一个方法来执行在一个数组里面截取一部分元素的操作
        //定义一个长度为6的新数组
        int[] newArr = new int[6];
        //使用随机数来随机数组里面的六个数
        Random r = new Random();
        //使用循环组成一个新的数组
        for (int i = 0; i < 6; i++) {
            int x = r.nextInt(n - 1) + 1;
            newArr[i] = arr[x];
        }
        System.out.println("红球：" + Arrays.toString(newArr));
    }
}
