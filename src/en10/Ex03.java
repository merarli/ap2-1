package en10;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by C0116289 on 2017/06/26.
 */
public class Ex03 {
    public static void main(String[] args) {
        Map<String ,Integer> map=new TreeMap<>();

        map.put("Cheeseburger",130);
        map.put("Teriyaki",320);
        map.put("B.L.T.",350);
        map.put("Humburger",100);
        map.put("Bigburger",380);
        map.put("French fries",270);

        Set<String> keys=map.keySet();

        for (String key:keys
             ) {
            Integer value=map.get(key);
            System.out.println(key+", "+value);

        }
    }
}
