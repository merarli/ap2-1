package en08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by C0116289 on 2017/06/12.
 */
public class re1 {
    public static void main(String[] args) {

        List date = new ArrayList();

        String s1="Katakuramachi";
        String s2="Hachioji";
        String s3="Tokyo";

        date.add(s1);
        date.add(s2);
        date.add(s3);

        /*for (int i=0;i<date.size();i++){
            String str=(String)date.get(i);
            System.out.println(str);
            */

        for (Iterator it=date.iterator();it.hasNext();){
            String str=(String)it.next();
            System.out.println(str);

        }
    }
}
