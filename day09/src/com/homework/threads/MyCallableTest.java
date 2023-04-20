package com.homework.threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MyCallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable mc = new MyCallable();
        FutureTask ft1 = new FutureTask(mc);
        FutureTask ft2 = new FutureTask(mc);
        Thread t1 = new Thread(ft1);
        Thread t2 = new Thread(ft2);
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        Object o1 = ft1.get();
        System.out.println("结果是" + o1);
        Object o2 = ft2.get();
        System.out.println("结果是" + o2);


    }
}
