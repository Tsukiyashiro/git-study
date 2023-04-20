package homework.homework5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        HashMap<String, String> hs = new HashMap<String, String>();
        hs.put("许仙", "白娘子");
        hs.put("牛郎", "织女");
        hs.put("梁山伯", "祝英台");
        hs.put("范喜良", "孟姜女");
        Set<String> set = hs.keySet();
        for (String key : set) {
            String value = hs.get(key);
            System.out.println(key + "=" + value);
        }
        System.out.println("--------------------------------");
        Set<Map.Entry<String, String>> entries = hs.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
