package en05;

/**
 * Created by C0116289 on 2017/05/15.
 */
public class Kadai02 {
    public static void main(String[] args) {
        String istr="TEL: 042-637-2111, TEL: 03-6424-2111";
        String ostr;

        System.out.println(istr);

        ostr=istr.replaceAll("[\\d]+","x");
        System.out.println(ostr);

        ostr=istr.replaceAll("^TEL","tel");
        System.out.println(ostr);

        ostr=istr.replaceAll("2111$","*");
        System.out.println(ostr);

    }
}
