package en13;

/**
 * Created by C0116289 on 2017/07/10.
 */
public class Student {
    private String id;
    private int score;

    public Student(String id, int score) {
        this.id = id;
        this.score = score;
    }

    private String getGrade() {
        if (score >= 80) {
            return "A";
        } else if (score <= 79 && score >= 70) {
            return "B";
        } else if (score <= 69 && score >= 60) {
            return "C";
        } else {
            return "D";
        }
    }

    public void add(int n){
        score+=n;
    }

    @Override
    public String toString() {
        return "ID=" + id  +
                ", score=" + score +", "+
                getGrade();
    }
}
