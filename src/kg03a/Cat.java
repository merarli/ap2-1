package kg03a;

public class Cat {
    private int no;
    private String name;
    private String kind;
    private String kenami;
    private String color;
    private String sex;
    private int age;
    private double weight;

    public void setNo(int no) {
        this.no = no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setKenami(String kenami) {
        this.kenami = kenami;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public String getKind() {
        return kind;
    }

    public String getKenami() {
        return kenami;
    }

    public String getColor() {
        return color;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void printCat() {
        System.out.println(no + ", " + name + " " + "(" + kind + ") : " + weight + " kg\n");

    }
}
