package com.hainiu.homework2;

public abstract class Pet {
    private String name;
    private int age;

    public abstract void eat();
    public void sleep(){
        System.out.println(getName()+"正在睡觉");
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Pet() {
    }
}
