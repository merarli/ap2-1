package kg10;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by C0116289 on 2017/06/19.
 */
public class setSample {
    public static void main(String[] args) {
        Set<String >set=new TreeSet<>();

        set.add("grape");
        set.add("orange");
        set.add("apple");
        set.add("orange");

        for (String string: set) {
            System.out.println(string);
        }
    }
}
