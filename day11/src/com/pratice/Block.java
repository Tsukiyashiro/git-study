package com.pratice;

import java.util.concurrent.ArrayBlockingQueue;

public class Block {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);

        new Thread((()->{
            while (true){
                try {
                    queue.put("hello");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"hello还有"+queue.size()+"次");
            }
        })).start();

        new Thread((()->{
            while (true){
                try {
                    String take = queue.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"hello还有"+queue.size()+"次");
            }
        })).start();
    }
}
