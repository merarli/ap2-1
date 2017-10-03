package kg13;

/**
 * Created by C0116289 on 2017/07/10.
 */
public class Ex01 {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(2, 5);
        Triangle t2 = new Triangle(3, 7);

        System.out.println("t1の面積 : " + t1.toArea());
        System.out.println("t2の面積 : " + t2.toArea());

        System.out.println("t1の底辺と高さを2倍にします");
        System.out.println("t2の底辺と高さを3倍にします");

        t1.enlarge(2);
        t2.enlarge(3);

        System.out.println("t1の面積 : " + t1.toArea());
        System.out.println("t2の面積 : " + t2.toArea());
    }
}
