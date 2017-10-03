package kg13;

/**
 * Created by C0116289 on 2017/07/10.
 */
public class Triangle {
    int base;
    int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public double toArea() {
        return ((double) (base * height) / 2);
    }

    public void enlarge(int n) {
        base *= n;
        height *= n;
    }
}
