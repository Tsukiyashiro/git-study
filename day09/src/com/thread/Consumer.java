package com.thread;

public class Consumer extends Thread {
    private Object lock;

    public Consumer(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if ("".equals(ProducerAndConsumer.product)) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("消费者" + Thread.currentThread().getName() + "消费了一份产品" + ProducerAndConsumer.product);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ProducerAndConsumer.product = "";
                lock.notifyAll();
            }
        }
    }
}
