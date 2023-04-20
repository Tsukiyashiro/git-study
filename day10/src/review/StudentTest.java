package review;

import java.io.*;
import java.util.ArrayList;

public class StudentTest  {
    public static void main(String[] args) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("day08\\src\\com\\test.txt"));
        ArrayList<Student> lis = new ArrayList<>();
        Student s1 = new Student("tom",20,"beijing");
        Student s2 = new Student("jerry",21,"shanghai");
        Student s3 = new Student("morty",22,"shenzhen");
        lis.add(s1);
        lis.add(s2);
        lis.add(s3);
        oos.writeObject(lis);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("day08\\src\\com\\test.txt"));
        Object obj = ois.readObject();
        ArrayList<Student> list = (ArrayList<Student>) obj;
        ois.close();
        for (Student s : list) {
            System.out.println(s.getName()+","+s.getAge()+","+s.getAddress());
            System.out.println(s);

        }
    }
}
