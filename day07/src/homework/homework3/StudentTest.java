package homework.homework3;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class StudentTest {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet();
//        LinkedHashSet<Student> lhs = new LinkedHashSet<Student>();
        Student s1 = new Student("tom",19);
        Student s2 = new Student("tony",18);
        Student s3 = new Student("taki",17);
        Student s4 = new Student("jerry",19);
        Student s5 = new Student("tom",19);

        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);
        hs.add(s5);


        /*lhs.add(s1);
        lhs.add(s2);
        lhs.add(s3);
        lhs.add(s4);
        lhs.add(s5);*/

        for (Student s : hs) {
            System.out.println(s);
        }
    }
}
