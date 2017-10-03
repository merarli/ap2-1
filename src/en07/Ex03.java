package en07;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by C0116289 on 2017/06/05.
 */
public class Ex03 {
    public static void main(String[] args) {
        Date date =new Date();
        DateFormat dft =DateFormat.getDateInstance();

        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        cal.add(Calendar.MONTH,2);
        cal.add(Calendar.DAY_OF_MONTH,27);

        System.out.println("今日は"+dft.format(date)+"です");
        System.out.println("今日から2ヶ月と27日後は"+dft.format(cal.getTime())+"です");

    }
}
