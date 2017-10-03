package en04;

/**
 * Created by C0116289 on 2017/05/08.
 */
public class Kadai02 {
    public static void main(String[] args) {
        double b=-271828.1828459;
        String str;

        str=String.valueOf(b);
        System.out.println(str);

        str=String .format("%.3f",b);
        System.out.println(str);

        str=String.format("%10.1f",b);
        System.out.println(str);

        str=String .format("%0,15.4f",b);
        System.out.println(str);

        str=String.format("%12.4e",b);
        System.out.println(str);




    }
}
