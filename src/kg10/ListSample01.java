package kg10;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by C0116289 on 2017/06/19.
 */
public class ListSample01 {
    public static void main(String[] args) {
        List date=new ArrayList();

        String str="Pirst String";
        Person psn=new Person("Taro",20);

        date.add(str);
        date.add(psn);

        String a=(String )date.get(0);
        System.out.println("0番目の要素:"+a);

        Person p=(Person)date.get(1);
        System.out.println("1番目の要素:"+p);
    }
}
