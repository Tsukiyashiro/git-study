package com.thread;

public class Produce extends Thread {
    private Object lock;

    public Produce(Object lock) {
        this.lock = lock;
    }
    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if (!"".equals(ProducerAndConsumer.product)){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                ProducerAndConsumer.product = "game";
                System.out.println("生产者" + Thread.currentThread().getName()+"生产了一个产品"+ProducerAndConsumer.product);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                lock.notifyAll();
            }
        }
    }
}
