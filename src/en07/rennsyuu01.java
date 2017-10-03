package en07;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by C0116289 on 2017/06/05.
 */
public class rennsyuu01 {
    public static void main(String[] args) {
        int num=3;

        Date date =new Date();
        DateFormat dft =DateFormat.getDateInstance();
        System.out.println(dft.format(date));

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        cal.add(Calendar.MONTH, num);
        cal.add(Calendar.DATE, num);
        System.out.println(dft.format(cal.getTime()));


    }
}
