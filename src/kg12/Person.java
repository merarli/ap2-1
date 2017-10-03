package kg12;

/**
 * Created by C0116289 on 2017/07/03.
 */
public class Person {
    private String name;
    private double height;
    private double weight;

    /**
     * 人を表すクラス
     * 名前、身長、体重をもつ
     *
     * @author na
     */
    public Person(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    /**
     * 出力
     *
     * @return 名前、身長、体重の出力
     */
    public String toString() {
        return "Person " + "name, " + name + " ,height, " + height + " ,weight, " + weight;
    }

    public double getBMI() {
        return weight / (height * height);
    }

    public void diet(double a) {

        if (a < 0) {
            throw new IllegalArgumentException("error");
        } else {
            weight -= a;
        }

    }


}
