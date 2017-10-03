package en14;

/**
 * Created by C0116289 on 2017/07/17.
 */
public class Ex02 {
    public static void main(String[] args) {
        Box b = new Box(5, 12);
        System.out.println(b);
        System.out.println(b.getDiagonal());
        b.changeSize(2, 12);
        System.out.println(b);
        System.out.println(b.getDiagonal());
    }
}
