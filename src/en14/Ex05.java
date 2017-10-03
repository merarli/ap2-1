package en14;

import com.sun.javafx.collections.MappingChange;

import java.security.Key;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by C0116289 on 2017/07/17.
 */
public class Ex05 {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();

        map.put("MILK", 1);
        map.put("TOMATO", 3);
        map.put("YOGURT", 4);

        Set<String> keyset = map.keySet();
        System.out.println("--- STEP 1 ---");
        for (String key : keyset) {
            int v = map.get(key);
            System.out.println(key + "," + v);
        }

        map.replace("MILK", map.get("MILK") - 1);
        map.replace("TOMATO", map.get("TOMATO") - 1);
        map.replace("YOGURT", map.get("YOGURT") - 1);
        System.out.println("--- STEP 2 ---");
        Set<String> keyset2 = map.keySet();
        for (String key : keyset2) {
            int a = map.get(key);
            System.out.println(key + "," + a);
        }
    }
}
