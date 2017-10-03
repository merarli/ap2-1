package en10;

import java.util.*;

/**
 * Created by C0116289 on 2017/06/26.
 */
public class Ex05 {
    public static void main(String[] args) {
        String str = "There is strong shadow where there is much light.";

        Map<String, Integer> map = new TreeMap<>();

        String str1 = str.toLowerCase();
        String str2 = str1.replace(".", "");
        String[] str3 = str2.split(" ");

        for (String count : str3) {
            if (map.containsKey(count)) {
                map.put(count, map.get(count) + 1);
            } else {
                map.put(count, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }
}
