package en10;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by C0116289 on 2017/06/26.
 */
public class MapSample01 {
    public static void main(String[] args) {
        Map<String ,String> map=new HashMap<>();

        map.put("apple","red");
        map.put("lemon","yellow");
        map.put("banana","yellow");
        map.put("grape","violet");

        map.put("banana","green");
        //同じkeyを追加すると上書きされる

        map.put("banana","red");
        //上書き

        String result=map.get("banana");
        System.out.println(result);

        String  result2=map.get("wiki");
        System.out.println(result2);
        //ないものを呼ぶとnullがでる

        Set<Map.Entry<String ,String>> entries=map.entrySet();

        for (Map.Entry<String ,String >entry:entries
             ) {
            String key=entry.getKey();
            String value=entry.getValue();
            System.out.println("KEY: "+key+", VALUE: "+value);

        }

        System.out.println("==========================");

        Set<String >keys=map.keySet();

        for (String key:keys
             ) {
            String value=map.get(key);
            System.out.println("KEY: "+key+", VALUE: "+value);
        }

    }
}
