package en04;

/**
 * Created by C0116289 on 2017/05/08.
 */
public class Kadai03 {
    public static void main(String[] args) {

        String str="Tokyo University of Technology";
        String result;


        System.out.println(str);

        result=str.replaceAll("T","t");
        System.out.println(result);

        result=str.replaceAll(" ","");
        System.out.println(result);

        result=str.replaceAll("[oi]","+");
        System.out.println(result);

        result=str.replaceAll("[^oi]","-");
        System.out.println(result);


    }
}
