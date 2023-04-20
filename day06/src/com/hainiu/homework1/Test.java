package com.hainiu.homework1;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("tom",20);
        Student s2 = new Student("tom",20);
        System.out.println(s1);
        System.out.println(s1.toString());
        System.out.println(s2);
        System.out.println(s2.toString());
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
