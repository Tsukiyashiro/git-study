package homework.homework4;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class WorkerTest {
    public static void main(String[] args) {
        TreeSet<Worker> ts = new TreeSet<>(new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                int result = o2.getSalary() - o1.getSalary();
                if (result == 0) {
                    result = o1.getAge() - o2.getAge();
                    if (result == 0) {
                        result = o1.getName().compareTo(o2.getName());
                    }
                }
                return result;
            }
        });

        Worker w1 = new Worker("tom", 40, 8000);
        Worker w2 = new Worker("tom", 21, 7000);
        Worker w3 = new Worker("jack", 19, 8000);
        Worker w4 = new Worker("jerry", 20, 9000);
        Worker w5 = new Worker("morty", 18, 8000);
        Worker w6 = new Worker("rick", 40, 12000);
        Worker w7 = new Worker("summer", 18, 8000);

        ts.add(w1);
        ts.add(w2);
        ts.add(w3);
        ts.add(w4);
        ts.add(w5);
        ts.add(w6);
        ts.add(w7);

        for(Worker w : ts){
            System.out.println(w);
        }
    }
}
