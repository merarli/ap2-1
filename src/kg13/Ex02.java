package kg13;

/**
 * Created by C0116289 on 2017/07/10.
 */
public class Ex02 {
    public static void main(String[] args) {
        String str = "Tokyo University of Technology";

        System.out.println(str.charAt(15));

        System.out.println(str.toLowerCase());

        System.out.println(str.substring(6, 9));

        System.out.println(str.indexOf("o", 10));

        String[] strings = str.split(" ");
        System.out.println(strings[2]);
    }
}
