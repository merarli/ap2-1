package kg13;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by C0116289 on 2017/07/10.
 */
public class Ex07 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        System.out.println("Hino, Toyoda, hachioji のリストを作成します");

        list.add("Hino");
        list.add("Toyoda");
        list.add("Hachioji");

        for (String output : list
                ) {
            System.out.print(output + ", ");
        }

        System.out.println("先頭に Tachikawa を挿入します");

        list.add(0,"Tachikawa");

        for (String output : list
                ) {
            System.out.print(output + ", ");
        }

        System.out.println("Hino, Toyoda を葉駆除します");

       list.remove("Hino");
       list.remove("Toyoda");

        for (String output : list
                ) {
            System.out.print(output + ", ");
        }


    }
}
