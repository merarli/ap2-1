package kg13;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by C0116289 on 2017/07/10.
 */
public class Ex06 {
    public static void main(String[] args) {
        int num = 10;
        String output;
        Date date = new Date();
        DateFormat dft = DateFormat.getDateInstance();
        DateFormat dft2;
        dft2 = new SimpleDateFormat("H;mm:ss,");
        output = dft2.format(date);

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        cal.add(Calendar.MONTH, num);
        cal.add(Calendar.DATE, num);
        System.out.println(dft.format(cal.getTime())+" "+output);
    }
}
