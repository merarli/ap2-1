package en03;

/**
 * Created by C0116289 on 2017/04/24.
 */
public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;

    }

    public boolean isTriangle(){
        if(a<b+c&&b<c+a&&c<a+b){
            return true;
        }else {
            return false;
        }
    }

    public double getArea(){
        double s=(a+b+c)/2;
        double area=Math.sqrt((s*(s-a)*(s-b)*(s-c)));
        return area;
    }
}
