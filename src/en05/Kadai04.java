package en05;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

/**
 * Created by C0116289 on 2017/05/15.
 */
public class Kadai04 {
    public static void main(String[] args) {

        String istr1 = "192-0982";
        String istr2 = "<100%>Let's Java!</100%> <small>It's fun!</small>";
        String ostr;

        System.out.println(istr1);

        ostr = istr1.replaceAll("(\\d{3})-(\\d{4})", "$2-$1");
        System.out.println(ostr);

        System.out.println(istr2);

        ostr=istr2.replaceAll("<(.+)>(.+)</\\1>","$2");
        System.out.println(ostr);

        ostr=istr2.replaceAll("<(.+)>(.+)</\\1>","($2)");
        System.out.println(ostr);

    }

}
