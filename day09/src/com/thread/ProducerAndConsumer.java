package com.thread;

public class ProducerAndConsumer {
    public static String product = "";

    public static void main(String[] args) {
        Object obj = new Object();
        new Produce(obj).start();
        new Consumer(obj).start();
    }
}
