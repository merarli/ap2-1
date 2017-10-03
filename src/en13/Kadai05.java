package en13;

/**
 * Created by C0116289 on 2017/07/10.
 */
public class Kadai05 {
    public static void main(String[] args) {
        String input = "http://www.teu.ac.jp/gakubu/cs/006333.html";
        String output;

        output = input.replaceAll("[\\d]", "*");
        System.out.println(output);

        output = input.replaceAll("\\.", "*");
        System.out.println(output);

        output = input.replaceAll("[abc]", "*");
        System.out.println(output);

        output = input.replaceAll("^h", "*");
        System.out.println(output);

        output = input.replaceAll("[\\w]+", "*");
        System.out.println(output);

    }
}
