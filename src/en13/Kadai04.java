package en13;

/**
 * Created by C0116289 on 2017/07/10.
 */
public class Kadai04 {
    public static void main(String[] args) {
        int i = 2048;
        double d = 8.3144598;
        String str;

        str = String.format("%,d", i);
        System.out.println(str);

        str = String.format("%8d", i);
        System.out.println(str);

        str = String.format("%,08d", i);
        System.out.println(str);

        str = String.format("%.4f", d);
        System.out.println(str);

        str = String.format("%010.2f", d);
        System.out.println(str);
    }
}
