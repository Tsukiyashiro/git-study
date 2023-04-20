package com.hainiu.homework2;

public class Cat extends Pet{
    @Override
    public void eat() {
        System.out.println(getName() + "正在享受鱼");
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {
    }
}
