package kg12;

/**
 * Created by C0116289 on 2017/07/03.
 */
public class DocSample {
    public static void main(String[] args) {
        Person n = new Person("teu", 1.70, 65.0);

        System.out.println(n + " ,BMI, " + n.getBMI());

        n.diet(12.3);

        System.out.println(n + " ,BMI, " + n.getBMI());
    }

}
