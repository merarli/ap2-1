package en09;


import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by C0116289 on 2017/06/19.
 */
public class Ex05 {
    public static void main(String[] args) {
        String str="A friend of all is a friend to none";
        System.out.println("INPUT: "+str);

        Set<String >set=new TreeSet<>();
        String str1=str.toLowerCase();
        Scanner s=new Scanner(str1);

        while (s.hasNext()){
            set.add(s.next());
        }s.close();

        System.out.println("WORDS: "+set.size());

        for (String string:set) {
            System.out.print(string+", ");
        }
    }
}
