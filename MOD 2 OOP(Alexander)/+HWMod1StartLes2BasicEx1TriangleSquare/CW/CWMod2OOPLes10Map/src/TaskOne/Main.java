package TaskOne;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<>();
        map1.put("j", "Java");
        map1.put("t", "The ");
        map1.put("b", "Best");
        System.out.println(map1);
        String temp = map1.get("j");
        System.out.println(temp);

        Set<String> keys = map1.keySet();
        for (String k : keys) {
            System.out.println(k + " " + map1.get(k));
        }
        map1.remove("t");
        System.out.println(map1);
    }
}