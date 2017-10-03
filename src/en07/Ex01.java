package en07;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by C0116289 on 2017/06/05.
 */
public class Ex01 {
    public static void main(String[] args) {
        Date date =new Date();
        String output;
        DateFormat dft;

        System.out.println(date);

        dft=DateFormat.getDateInstance();
        output=dft.format(date);
        System.out.println(output);

        dft=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        output=dft.format(date);
        System.out.println(output);

        dft=new SimpleDateFormat("HH:mm:ss");
        output=dft.format(date);
        System.out.println(output);

    }
}
