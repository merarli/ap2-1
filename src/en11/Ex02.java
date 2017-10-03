package en11;

/**
 * Created by C0116289 on 2017/07/03.
 */
public class Ex02 {
    public static void main(String[] args) {
        Student s1 = new Student("C0116901", 58);
        Student s2 = new Student("C0116902", 64);

        System.out.println("===RAW SCORE===");
        System.out.println(s1.getStudentId() + ", " + s1.getScore() + ", " + s1.isPass());
        System.out.println(s2.getStudentId() + ", " + s2.getScore() + ", " + s2.isPass());

        s1.adisut(5);
        s2.adisut(-5);

        System.out.println("===TUNED SCORE===");
        System.out.println(s1.getStudentId() + ", " + s1.getScore() + ", " + s1.isPass());
        System.out.println(s2.getStudentId() + ", " + s2.getScore() + ", " + s2.isPass());
    }

}
