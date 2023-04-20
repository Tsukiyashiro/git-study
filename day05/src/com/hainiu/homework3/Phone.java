package com.hainiu.homework3;

public abstract class Phone {
    private String brand;
    private double price;

    public abstract void call();

    public static void powerOn() {
        System.out.println("启动设备");
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public Phone() {
    }
}
