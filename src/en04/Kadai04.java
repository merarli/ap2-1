package en04;

/**
 * Created by C0116289 on 2017/05/08.
 */
public class Kadai04 {
    public static void main(String[] args) {

        String str="ADDR: 1404-1, Katakuramachi, Hachioji, Tokyo 192-0982, JAPAN";
        String result;

        System.out.println(str);

        result=str.replaceAll("chi","*");
        System.out.println(result);

        result=str.replaceAll("[0-9]","?");
        System.out.println(result);

        result=str.replaceAll("[^-, :]","x");
        System.out.println(result);

        result=str.replaceAll("[A-Z]+","!");
        System.out.println(result);

        result=str.replaceAll("[0-9]{4}","?");
        System.out.println(result);


    }
}
