package en00a;


public class Q03 {
    public static void main(String[] args) {

        String str;
        String input = "Hello, world";

        str = input.toUpperCase();
        System.out.println(str);

        str = input.substring(1, 5);
        System.out.println(str);

        String[] astr = input.split("o");

        for (String output : astr
                )
            System.out.println(output);
    }
}
