package en14;

/**
 * Created by C0116289 on 2017/07/17.
 */
public class Box {
    private int width;
    private int height;

    public Box(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /**
     * 四角形の対角線の長さを返す
     * @return 対角線の長さ
     */
    public double getDiagonal() {
        return Math.sqrt((Math.pow(width, 2)) + Math.pow(height, 2));
    }

    /**
     * サイズを変える
     * @param dw widthに足す
     * @param dh heightに足す
     */
    public void changeSize(int dw, int dh) {
        width += dw;
        height += dh;
    }

    @Override
    public String toString() {
        return width + " x " + height;
    }


}
