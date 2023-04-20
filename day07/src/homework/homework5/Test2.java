package homework.homework5;

import java.security.Key;
import java.util.TreeMap;

public class Test2 {
    public static void main(String[] args) {
        String str = "java world java javase    big big data data data java hello world hello";
        String[] arr = str.split("\\s+");
        TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
        for (String s : arr) {
            /*if (!tm.containsKey(s)) {
                tm.put(s,1);
            }else {
                tm.put(s,tm.get(s)+1);
            }*/
            tm.put(s, tm.containsKey(s) ? tm.get(s) + 1 : 1);
        }
        tm.forEach((key, value) -> {
            System.out.println(key + "=" + value);
        });
    }
}
