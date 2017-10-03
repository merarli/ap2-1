package en08;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Created by C0116289 on 2017/06/12.
 */
public class Ex03 {
    public static void main(String[] args) {

        List date =new ArrayList();
        Random ram=new Random();
        int a=0;

        for(int i=0;i<10;i++){
            date.add(ram.nextInt(10));

        }

        for (Iterator it=date.iterator();it.hasNext();) {
            int rand = (int) it.next();
            System.out.print(rand + ", ");
            if(rand==7){
                a++;
            }
        }

        System.out.println();
        System.out.println("7は"+a+"個");

    }
}
