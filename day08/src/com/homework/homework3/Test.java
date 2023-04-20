package com.homework.homework3;

import java.io.*;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day08\\src\\com\\test.txt"));
        ArrayList<Student> list = new ArrayList<Student>();
        Student s1 = new Student("tom",20,"beijing");
        Student s2 = new Student("jerry",21,"shanghai");
        Student s3 = new Student("morty",22,"shenzhen");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        oos.writeObject(list);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day08\\src\\com\\test.txt"));
        Object obj = ois.readObject();
        ArrayList<Student> stu = (ArrayList<Student>) obj;
        ois.close();
        for (Student s : stu) {
            System.out.println(s.getName()+","+s.getAge()+","+s.getAddress());
        }
    }
}
