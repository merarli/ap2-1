package kg13;

/**
 * Created by C0116289 on 2017/07/10.
 */
public class Ex04 {
    public static void main(String[] args) {
        int[] a = {50, 40, 30, 20, 10, 0};


        for (int i = 0; i < 10; i++) {
            try {
                int val = 100 / a[i];
                System.out.println("val= " + val);
            } catch (ArithmeticException e) {
                System.out.println("divided by zero");
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("ArrayIndexOutofBounds");
            }
        }

    }
}
