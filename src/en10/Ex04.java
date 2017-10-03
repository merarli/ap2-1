package en10;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by C0116289 on 2017/06/26.
 */
public class Ex04 {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();

        map.put("C0116773", "B");
        map.put("C0116777", "C");
        map.put("C0116771", "S");
        map.put("C0115881", "B");
        map.put("C0115889", "A");

        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (Map.Entry<String, String> entry : entries
                ) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ", " + value);
        }
    }
}
