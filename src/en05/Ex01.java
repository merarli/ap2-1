package en05;

/**
 * Created by C0116289 on 2017/05/15.
 */
public class Ex01 {
    public static void main(String[] args) {
        String istr="School of Computer Science.";
        String ostr;

        ostr = istr.replaceAll("oo","-");
        System.out.println(ostr);

        ostr= istr.replaceAll("[o ]","*");
        System.out.println(ostr);

        ostr= istr.replaceAll("\\.","?");
        System.out.println(ostr);

        String istr2="[30/Apr/2014:21:37:38 +0900] GET /favicon.ico HTTP/1.1";

        ostr=istr2.replaceAll("\\d","");
        System.out.println(ostr);

        ostr=istr2.replaceAll("[\\w/]","?");
        System.out.println(ostr);

        ostr= istr2.replaceAll("\\s.","--");
        System.out.println(ostr);

        String istr3="ac, abc, abbc, abbbc, abbbbc, abbbbbc";

        ostr=istr3.replaceAll(".+c","@");
        System.out.println(ostr);

        ostr=istr3.replaceAll(".+?c","#");
        System.out.println(ostr);

        String  istr4="    Hello!!    Hello!!";

        ostr=istr4.replaceAll("^    ","");
        System.out.println(ostr);

        ostr=istr4.replaceAll("$Hello!!","World   ");
        System.out.println(ostr);



    }
}
