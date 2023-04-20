package com.homework.threads;

import java.util.concurrent.locks.ReentrantLock;

public class MyTickets implements Runnable {
    private int ticket = 100;

    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
//            synchronized (this) {
            lock.lock();
            try {
                if (ticket <= 0) {
                    break;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"正在售出第" + ticket-- + "张票");
            } finally {
                lock.unlock();
            }
//            }
        }
    }
}
