package en14;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by C0116289 on 2017/07/17.
 */
public class Ex03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("Ruby");

        System.out.println("---- STEP 1 ----");
        System.out.println("リストの大きさ" + list.size());

        for (String lis : list) {
            System.out.println(lis);
        }

        list.add(1, "perl");
        list.remove("Ruby");
        list.add(0, "Go");

        System.out.println("---- STEP 2 ----");
        System.out.println("リストの大きさ" + list.size());
        for (String lis : list) {
            System.out.println(lis);
        }
    }
}
