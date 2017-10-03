package en13;

import java.text.DateFormat;
import java.util.Calendar;

/**
 * Created by C0116289 on 2017/07/10.
 */
public class Kadai06 {
    public static void main(String[] args) {
        int numM = -5;
        int numD = -22;
        DateFormat dft = DateFormat.getDateInstance();

        Calendar cal = Calendar.getInstance();
        cal.set(2017, 0, 1);

        cal.add(Calendar.MONTH, numM);
        cal.add(Calendar.DATE, numD);
        System.out.println(dft.format(cal.getTime()));
    }
}
