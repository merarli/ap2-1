package en00a;

import java.util.ArrayList;
import java.util.List;

public class Q04 {
    public static void main(String[] args) {
        List<String>alist=new ArrayList<>();

        alist.add("Apple");
        alist.add("Orange");
        alist.remove("Orange");
        alist.add("Banana");

        for (String a:alist
             ) {
            System.out.println(a);

        }
    }
}
