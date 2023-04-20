package com.homework.threads;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class BlockQueue {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue(1);

        ThreadPoolExecutor pool = new ThreadPoolExecutor(2,
                2,
                20,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(1),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
                );
        pool.execute(()->{
            while (true) {
                try {
                    queue.put("汉堡包");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "生产了一个【汉堡包】，" + "目前剩余" + queue.size());
            }
        });

        pool.execute(()->{
            while (true) {
                String s = null;
                try {
                   s = queue.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "消费了一个【" + s + "】，目前剩余" + queue.size());
            }
        });


        /*new Thread(() -> {
            while (true) {
                try {
                    queue.put("汉堡包");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "生产了一个【汉堡包】，" + "目前剩余" + queue.size());
            }
        }).start();

        new Thread(() -> {
            while (true) {
                String s = null;
                try {
                    s = queue.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "消费了一个【" + s + "】，目前剩余" + queue.size());
            }
        }).start();*/
    }
}
