package kg03;

/**
 * Created by C0116289 on 2017/04/24.
 */
public class sample01
{
    public static void main(String[] args) {
        String istr ="Tokyo university of technology";

        String ostr;

        ostr=istr.concat(", school of ");

        System.out.println(ostr);
        System.out.println(istr);

        char c = istr.charAt(6);
        System.out.println(c);

        int i= istr.indexOf("o");
        System.out.println(i);

        ostr=istr.substring(5,8);
        System.out.println(ostr);


        String a="Tokyo";
        String b="Toky";
        b=b+"o";

        System.out.println("a="+a);
        System.out.println("b="+b);

        if(a==b){
            System.out.println("同じ");

        }else {
            System.out.println("違う");
        }

        if(a.equals(b)){
            System.out.println("同じ");

        }else {
            System.out.println("違う");
        }

    }
}
