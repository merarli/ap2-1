package en05;

import jdk.nashorn.internal.runtime.OptimisticReturnFilters;

/**
 * Created by C0116289 on 2017/05/15.
 */
public class Kadai01 {
    public static void main(String[] args) {
        String istr="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String ostr;
        int aaa=1234567890;
        ostr= String.format("%+d",aaa);
        System.out.println(ostr);

        System.out.println(istr);

        ostr=istr.replaceAll("[This]","*");
        System.out.println(ostr);

        ostr=istr.replaceAll("[^This]","*");
        System.out.println(ostr);

        ostr=istr.replaceAll("[K-Zk-z]+","*");
        System.out.println(ostr);

        ostr=istr.replaceAll("[A-DP-T]","*");
        System.out.println(ostr);
    }
}
