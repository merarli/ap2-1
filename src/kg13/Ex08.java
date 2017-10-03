package kg13;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by C0116289 on 2017/07/10.
 */
public class Ex08 {
    public static void main(String[] args) {
        Set<Integer> s = new TreeSet();
        for (int i = 0; i < 10; i++) {
            //s.add(Math.random());
        }

        System.out.println("発生した乱数は" + s.size() + "種類");

        for (Integer b : s
                ) {
            System.out.println(s);
        }
    }
}
