package kg13;

/**
 * Created by C0116289 on 2017/07/10.
 */
public class Ex03 {
    public static void main(String[] args) {
        String input = "2017/07/10 15:47:51 c0116999ab Ex03.java ok.";
        String output;

        output = input.replaceAll("[0-9]", "+");
        System.out.println(output);

        output = input.replaceAll("[^0-9]", "@");
        System.out.println(output);

        output = input.replaceAll("[a-z]+", "#");
        System.out.println(output);

        output = input.replaceAll("[\\W]", "=");
        System.out.println(output);

        output = input.replaceAll("\\.$", "?");
        System.out.println(output);


    }
}
