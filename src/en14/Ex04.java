package en14;

import java.util.*;

/**
 * Created by C0116289 on 2017/07/17.
 */
public class Ex04 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Random random = new Random();
        int r;

        System.out.println("乱数を20回出力します");
        for (int i = 0; i < 20; i++) {
            r = random.nextInt(20);
            System.out.print(r + ", ");
            set.add(r);
        }

        System.out.println();
        System.out.println("乱数の種類: " + set.size());
        for (Integer o : set) {
            System.out.print(o + ", ");
        }


    }
}
