package en05;

/**
 * Created by C0116289 on 2017/05/15.
 */
public class Kadai03 {
    public static void main(String[] args) {
        String istr="error404, Mar 13 00:21:10 2017, 254651203 bytes 11.22.33 aa?  a#";
        String ostr;

        System.out.println(istr);

        ostr=istr.replaceAll("[\\d]{9}","*");
        System.out.println(ostr);

        ostr=istr.replaceAll("[\\d]{2,4}","*");
        System.out.println(ostr);

        ostr=istr.replaceAll("[\\d]{4,}","*");
        System.out.println(ostr);
        ostr=istr.replaceAll("#","?");
        System.out.println(ostr);

    }
}
