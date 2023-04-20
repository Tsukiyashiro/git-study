package com.hainiu;

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<Student> clazz = (Class<Student>) Class.forName("com.hainiu.Student");
        System.out.println(clazz);

        Class<Student> clazz2 = Student.class;
        System.out.println(clazz2);

        Student s = new Student();
        Class<Student> clazz3 = (Class<Student>) s.getClass();
        System.out.println(clazz3);

        System.out.println(clazz == clazz3);
        System.out.println(clazz == clazz2);


    }
}
