package en03;

/**
 * Created by C0116289 on 2017/04/24.
 */
public class Kadai04 {
    public static void main(String[] args) {
        Triangle[]ts =new Triangle[3];
        ts[0]=new Triangle(7.0,24.0,25.0);
        ts[1]=new Triangle(6.0,25.0,35.0);
        ts[2]=new Triangle(5.0,12.0,13.0);

        for (int i=0;i<ts.length;i++){
            if(ts[i].isTriangle()){
                System.out.println(ts[i].getArea());
            }else {
                System.out.println("not a triangle");
            }
        }

    }
}
