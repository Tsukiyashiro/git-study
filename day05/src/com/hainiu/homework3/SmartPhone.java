package com.hainiu.homework3;

public class SmartPhone extends Phone implements Shopping{
    public SmartPhone(String brand, double price) {
        super(brand, price);
    }

    public SmartPhone() {
    }

    @Override
    public void call() {
        System.out.println("可以拨打视频电话");
    }

    @Override
    public void buy() {
        System.out.println("可以在网上买各种东西");
    }
}
