package en08;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by C0116289 on 2017/06/12.
 */
public class Ex01 {
    public static void main(String[] args) {
        List date=new ArrayList();

        String s1="School";
        String s2="Computer";

        date.add(s1);
        date.add(s2);

        System.out.println("===BEFORE===");
        System.out.println("Size: "+date.size());
        for (int i=0;i<date.size();i++){
            String str = (String)date.get(i);
            System.out.println(str);
        }

        date.add(1,"of");
        System.out.println("===AFTER===");
        System.out.println("Size: "+date.size());
        for (int i=0;i<date.size();i++){
            String str=(String)date.get(i);
            System.out.println(str);
        }


    }
}
