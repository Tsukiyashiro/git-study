package com.thread;

public class Test {
    public static void main(String[] args) {
        Thread01 thread01 = new Thread01();
        Thread t1 = new Thread(thread01,"窗口1");
        Thread t2 = new Thread(thread01,"窗口2");
        t1.start();
        t2.start();


    }
}
