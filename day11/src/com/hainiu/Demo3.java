package com.hainiu;

import java.lang.reflect.Field;

public class Demo3 {
    public static void main(String[] args) throws Exception {
        Class<Student> clazz = (Class<Student>) Class.forName("com.hainiu.Student");

        Student student = clazz.getDeclaredConstructor().newInstance();

        Field nameField = clazz.getDeclaredField("name");

        nameField.setAccessible(true);
        
        nameField.set(student, "hainiu");

        Object value = nameField.get(student);

        System.out.println(value);
        System.out.println("--------------------------------");

        Field ageField = clazz.getDeclaredField("age");

        ageField.setAccessible(true);

        ageField.set(student, 23);

        Object v2 = ageField.get(student);

        System.out.println(v2);

        System.out.println(student);
    }
}
