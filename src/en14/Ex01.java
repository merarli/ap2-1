package en14;

/**
 * Created by C0116289 on 2017/07/17.
 */
public class Ex01 {
    public static void main(String[] args) {
        Coffee[] cups = new Coffee[3];
        System.out.println("Total Vol: " + Coffee.getTotalVol());
        cups[0] = new Coffee(200);
        cups[1] = new Coffee(150);
        cups[2] = new Coffee(240);
        System.out.println("Total Vol: " + Coffee.getTotalVol());
    }
}
