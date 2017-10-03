package en07;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by C0116289 on 2017/06/05.
 */
public class Ex02 {
    public static void main(String[] args) {

        Date date =new Date();
        String output;
        DateFormat dft;
        dft=new SimpleDateFormat("yyyy/MM/dd/(E) 午後 h;mm:ss.SSS z");
        output=dft.format(date);
        System.out.println(output);



        Calendar cal= Calendar.getInstance();
        System.out.println("2017/1/1から数えて"+cal.get(Calendar.DAY_OF_YEAR)+"日目");



    }

}
