package en07;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by C0116289 on 2017/06/05.
 */
public class sample01 {
    public static void main(String[] args) {
        Date date =new Date();
        String output;
        DateFormat dft;

        dft=DateFormat.getDateInstance();
        output=dft.format(date);
        System.out.println(output);

        dft=new SimpleDateFormat("yyyy年MM月dd日");
        output=dft.format(date);
        System.out.println(output);
    }
}
