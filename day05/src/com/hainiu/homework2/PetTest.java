package com.hainiu.homework2;

public class PetTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("spark");
        dog.setAge(5);
        System.out.println(dog.getAge());
        dog.eat();
        dog.sleep();
        System.out.println(dog);

        Cat cat = new Cat();
        cat.setName("tom");
        cat.setAge(2);
        System.out.println(cat.getAge());
        cat.eat();
        cat.sleep();
        System.out.println(cat);
    }
}
