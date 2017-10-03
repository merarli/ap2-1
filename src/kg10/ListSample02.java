package kg10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by C0116289 on 2017/06/19.
 */
public class ListSample02 {
    public static void main(String[] args) {

        List<Person> date = new ArrayList<>();

        //String str = "Pirst String";
        //Person psn = new Person("Taro", 20);

        //date.add(str);
        //date.add(psn);

        date.add(new Person("taro",23));
        date.add(new Person("jiro",19));
        date.add(new Person("saburo",16));

        for (Person p:date) {
            System.out.println(p);

        }

        /*for (Iterator<String> i = data.iterator(); i.hasNext(); ) {
            String str = i.next();
            System.out.println(str);

        }*/
    }
}