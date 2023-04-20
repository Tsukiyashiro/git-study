package com.hainiu.homework3;

public class DumbPhone extends Phone implements SOS{
    @Override
    public void call() {
        System.out.println("拨打语音电话");
    }

    public DumbPhone(String brand, double price) {
        super(brand, price);
    }

    public DumbPhone() {
    }

    @Override
    public void help() {
        System.out.println("一键求救");
    }
}
