package kg13;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by C0116289 on 2017/07/10.
 */
public class Ex05 {
    public static void main(String[] args) {
        Date date = new Date();
        String output;
        DateFormat dft;
        dft = new SimpleDateFormat("今日はyyyy年MM月dd日 H;mm:ss,");
        output = dft.format(date);
        Calendar cal = Calendar.getInstance();
        System.out.println(output + "1月1日から" + cal.get(Calendar.DAY_OF_YEAR) + "日");
    }
}
