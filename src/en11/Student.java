package en11;

/**
 * 学生を表すクラスです。
 * <p>
 * このクラスは学籍番号 studentId と得点 score をフィールドとして持ちます。
 * Created by C0116289 on 2017/07/03.
 */
public class Student {

    private String studentId;
    private int score;

    public Student(String studentId, int score) {
        this.studentId = studentId;
        this.score = score;
    }

    public String getStudentId() {
        return studentId;
    }

    public int getScore() {
        return score;
    }



    /**
     * この学生が合格か不合格化を判断します。
     *
     * @return このインスタンスのscoreが60以上の場合trueを返します。そうでない場合falseを返します。
     */
    public boolean isPass() {
        if (score >= 60) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * この学生の得点を調整します。引数の値がこのインスタンスのscoreに足します。引数に負の値を入れることもできます。
     *
     * @param diff scoreに足す値
     */
    public void adisut(int diff) {
        this.score += diff;
    }
}

