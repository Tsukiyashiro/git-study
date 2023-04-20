package com.homework.threads;

public class MyThreadTest {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread1.setPriority(10);
        myThread2.setPriority(1);
        myThread1.start();
        myThread2.start();
    }
}
