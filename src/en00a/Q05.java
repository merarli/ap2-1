package en00a;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q05 {
    public static void main(String[] args) {
        String output;
        Date date = new Date();
        DateFormat dft2;
        dft2 = new SimpleDateFormat("yyyy年M月d日(E)H時mm分ss秒");
        output = dft2.format(date);
        System.out.println(output);
    }
}
