package en07;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by C0116289 on 2017/06/05.
 */
public class en04 {
    public static void main(String[] args) {
        Calendar cal=Calendar.getInstance();
        Date date =new Date();
        DateFormat dft =DateFormat.getDateInstance();
        String output;


        dft=new SimpleDateFormat("yyyy/MM/dd/(E) HH;mm:ss");

        output=dft.format(date);

        long a=cal.getTimeInMillis();

        System.out.println(output+", "+cal.getTimeInMillis());

        cal.set(2020,06,24,20,00,000);

        long b=cal.getTimeInMillis();

        System.out.println(dft.format(cal.getTime())+", "+cal.getTimeInMillis());

        /*long c=b-a;
        long s=c/1000;
        long t=(s*1000)/86400;
        //long h=(t*86400*)/3600;
        long d=h*86400*3600/60;
        long k=h%60;

        System.out.println("東京オリンピックまであと"+d+"日と"+h+"時間"+t+"分"+s+"秒");
*/
    }
}
