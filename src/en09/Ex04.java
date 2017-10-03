package en09;

import java.util.HashSet;
import java.util.Set;


/**
 * Created by C0116289 on 2017/06/19.
 */
public class Ex04 {
    public static void main(String[] args) {
        Set<String> set1=new HashSet<>();
        Set<String> set2=new HashSet<>();

        set1.add("Python");
        set1.add("Ruby");
        set1.add("Java");

        set2.add("Java");
        set2.add("Ruby");
        set2.add("Rust");

        for (String str:set1){
            if(set2.contains(str)){
                System.out.println(str);
            }
        }


    }
}
