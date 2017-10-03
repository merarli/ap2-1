package en13;

/**
 * Created by C0116289 on 2017/07/10.
 */
public class Kadai02 {
    public static void main(String[] args) {

        Student[] students = new Student[3];
        students[0] = new Student("C0115991", 83);
        students[1] = new Student("C0115992", 57);
        students[2] = new Student("C0115993", 70);

        for (Student s : students) {
            System.out.println(s.toString());
        }

        System.out.println("1番の学生の得点に5点加えます");

        students[1].add(5);

        for (Student s : students) {
            System.out.println(s.toString());
        }
    }
}
