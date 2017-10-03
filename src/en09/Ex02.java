package en09;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by C0116289 on 2017/06/19.
 */
public class Ex02 {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();

        set.add("Tokyo");
        set.add("Kanagawa");
        set.add("Saitama");
        set.add("Tokyo");
        set.add("Saitama");

        Iterator<String>itr=set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
