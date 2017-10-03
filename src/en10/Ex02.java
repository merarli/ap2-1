package en10;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by C0116289 on 2017/06/26.
 */
public class Ex02 {
    public static void main(String[] args) {
        Map<String ,Integer>map=new HashMap<>();

        map.put("Cheeseburger",130);
        map.put("Teriyaki",320);
        map.put("B.L.T.",350);
        map.put("Humburger",100);
        map.put("Bigburger",380);
        map.put("French fries",270);

        Integer result1=map.get("B.L.T.");
        Integer result2=map.get("French fries");

        System.out.println("B.L.T.: "+result1);
        System.out.println("French fries: "+result2);

    }
}
