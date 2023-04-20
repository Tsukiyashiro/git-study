package com.homework.threads;

public class MyTicketsTest {
    public static void main(String[] args) {
        MyTickets myTickets = new MyTickets();
        new Thread(myTickets,"窗口一").start();
        new Thread(myTickets,"窗口二").start();
    }
}
