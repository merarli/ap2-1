package en09;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by C0116289 on 2017/06/19.
 */
public class Ex03 {
    public static void main(String[] args) {
        Set<String> set1=new HashSet<>();
        Set<String> set2=new HashSet<>();
        Set<String> set3=new TreeSet<>();

        set1.add("Python");
        set1.add("Ruby");
        set1.add("Java");

        set2.add("Java");
        set2.add("Ruby");
        set2.add("Rust");

        set3.addAll(set1);
        set3.addAll(set2);

        for (String string:set3) {
            System.out.println(string);
        }



    }
}
