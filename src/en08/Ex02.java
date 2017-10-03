package en08;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by C0116289 on 2017/06/12.
 */
public class Ex02 {
    public static void main(String[] args) {

        List date=new ArrayList();

        String s1="Tokyo";
        String s2="Kanagawa";
        String s3="Saitama";

        date.add(s1);
        date.add(s2);
        date.add(s3);

        System.out.println("===Items===");
        for (int i=0;i<date.size();i++){
            String str=(String)date.get(i);
            System.out.println(str);
        }

        System.out.println("===Checking Kanagawa===");
        if(date.contains("Kanagawa")){
            System.out.println("Found");
        }else {
            System.out.println("Not Found");
        }

        System.out.println("===Checking Chiba===");
        if(date.contains("Chiba")){
            System.out.println("Found");
        }else {
            System.out.println("Not Found");
        }

        System.out.println("===Replacing an item===");
        date.set(1,"Gunma");
        for (int i=0;i<date.size();i++){
            String str=(String)date.get(i);
            System.out.println(str);
        }
    }
}
