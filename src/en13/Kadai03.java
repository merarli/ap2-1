package en13;

/**
 * Created by C0116289 on 2017/07/10.
 */
public class Kadai03 {
    public static void main(String[] args) {
        String input = "School of Computer Science";

        System.out.println(input.length());

        System.out.println(input.substring(12, 15));

        System.out.println(input.lastIndexOf("e", 24));

        System.out.println(input.matches(".*put.*"));

        String[] strings = input.split("e");
        System.out.println("要素数 " + strings.length);

        for (String s : strings) {
            System.out.print(s + ", ");
        }

    }
}
