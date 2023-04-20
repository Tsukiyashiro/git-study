package com.hainiu.homework2;

public class Dog extends Pet{
    @Override
    public void eat() {
        System.out.println("年仅"+getAge()+"岁的"+getName()+"在吃狗粮");
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }
}
