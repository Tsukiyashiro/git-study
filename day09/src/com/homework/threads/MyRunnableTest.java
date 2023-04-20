package com.homework.threads;

public class MyRunnableTest {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        t1.join();
        t1.start();
        t2.start();
    }
}
