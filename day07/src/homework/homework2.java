package homework;

import java.util.LinkedList;

public class homework2 {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList();
        for (int i = 1; i <= 108 ; i++) {
            l.add(i);
        }
        while (l.size()>1){
            l.removeFirst();
            l.add(l.removeFirst());
        }
        Integer i = l.get(0);
        System.out.println(i);
    }
}
