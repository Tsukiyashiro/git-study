package com.hainiu;

import java.lang.reflect.Constructor;

public class Demo2 {
    public static void main(String[] args) throws Exception {
        Class<Student> clazz = (Class<Student>) Class.forName("com.hainiu.Student");

        Constructor<Student> constructor = clazz.getConstructor(String.class, int.class);
        System.out.println(constructor);

        Student student = constructor.newInstance("hainiu", 18);
        System.out.println(student);

        Constructor<Student> constructor1 = clazz.getDeclaredConstructor(String.class);
        System.out.println(constructor1);

        constructor1.setAccessible(true);
        Student s = constructor1.newInstance("tom");
        System.out.println(s);
    }
}
