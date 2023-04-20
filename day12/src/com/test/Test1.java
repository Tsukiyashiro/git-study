package com.test;

public class Test1 {
    public static void main(String[] args) {
        //根据题意需要十天的总钱数
        //引用方法并输出
        System.out.println("洪乞丐干十天总收入为" + yao(10));
    }

    //写一个方法
    public static int yao(int n) {
        /*判断天数与要的金额联系
         * 可以很明显的知道他们之间的联系是天数在n的情况下每天可以获得二的n-1次方的钱*/
        //定义一个总钱数
        int sum = 0;
        //根据推导可以写一个关于两者之间总关系的循环
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(2, i - 1);
        }
        return sum;
    }
}
