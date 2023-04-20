package homework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<String>  list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("--------------------------------");
        for (String s : list){
            System.out.println(s);
        }
        System.out.println("--------------------------------");

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
